#include "share/atspre_staload.hats"
staload "ats-utils/util.sats"
staload "ats-utils/list.sats"
staload _ = "ats-utils/list.dats"
staload "ats-utils/maybe.sats"
staload _ = "ats-utils/maybe.dats"
staload "untyped.sats"
staload "name.sats"

#define :: Cons

implement term_show (t) = 
	case+ t of 
	| TmVar (n) => show n
	| TmLam (n, t) => () where {
			val () = show "(lam "
			val () = 
				case+ n of 
				| Name _ => show n 
				| None _ => show "\b"
				| Index _ => ()

			val () = show "."
			val () = show t
			val () = show ")"
		}
	| TmApp (n1, n2) => () where {
			val () = show n1
			val () = show "("
			val () = show n2
			val () = show ")"
		}


implement term_size (t) = 
	case+ t of 
	| TmVar _        => 0
	| TmLam (_, t)   => 1 + term_size t
	| TmApp (t1, t2) => 1 + term_size t1 + term_size t2


implement term_subterm (t, p) = 
	case+ p of 
	| Nil _ => t 
	| x :: p => 
		case+ t of 
		| TmVar _ => t
		| TmLam (_, t) => 
			if x = 0 
			then term_subterm (t, p)
			else t
		| TmApp (t1, t2) => 
			case+ x of 
			| 0 => term_subterm (t1, p) 
			| 1 => term_subterm (t2, p)
			| _ => t

implement term_paths (t) = 
	case+ t of 
	| TmVar _        => Nil () :: Nil ()
	| TmLam (_, t)   => 
		prepend (
			map (term_paths t, lam p => 0 :: p),
			0 :: Nil ())
	| TmApp (t1, t2) =>
		concat (
			(0 :: Nil ()) :: (1 :: Nil ()) :: Nil (), 
			concat (
				map (term_paths t1, lam p => 0 :: p),
				map (term_paths t2, lam p => 1 :: p)))

implement term_alpha_normal_form (t) = let 
	fun nf (t: term, env: list name): term =
		case+ t of 
		| TmLam (n, t) => TmLam (None (), nf (t, n :: env))
		| TmApp (t1, t2) => TmApp (nf (t1, env), nf (t2, env))
		| TmVar n => 
			case+ list_find (env, n, name_eq) of
			| Nothing _ => t 
			| Just index => TmVar (Index (1+index))
in 
	nf (t, Nil ())
end

implement term_shift (t, d) = let 
	fun shift (t:term, d:int, c:int): term =
		case+ t of 
		| TmVar (Index x) when x < c => t 
		| TmVar (Index x) when x >= c => TmVar (Index (x + d))
		| TmLam (x, t) => TmLam (x, shift (t, d, c + 1))
		| TmApp (t1, t2) => TmApp (shift (t1, d, c), shift (t2, d, c))
		| _ => t 
in 
	shift (t, d, 1)
end

implement term_substitute (t, j, s) = 
	case+ t of 
	| TmVar (Index x) when x = j => s
	| TmVar (Index x) when x != j => t 
	| TmLam (x, t) => TmLam (x, term_substitute (t, j+1, term_shift (s, 1)))
	| TmApp (t1, t2) => TmApp (term_substitute (t1, j, s), term_substitute (t2, j, s))
	| _ => t 

implement term_redexes (t) = 
	list_filter_clo (
		term_paths t,
		lam p => case+ term_subterm (t, p) of 
			| TmApp (TmLam (_, _), _) => true
			| _ => false 
	)

implement term_residual (t0, p0, p) = let 

	fun is_prefix (p1: path, p2: path): bool = 
		case+ (p1, p2) of 
		| (x :: p1, y :: p2) => if x = y then is_prefix (p1, p2) else false
		| (Nil (), _) => true 
		| (_, _) => false 

	fun remove_prefix (p: path, pre: path): path = 
		case+ (p, pre) of 
		| (x :: p, y :: pre) when x = y => remove_prefix (p, pre)
		| (_, Nil ()) => p 
		| (_, _) => Nil ()

in 	
	if is_prefix (p0, p) && is_prefix (p, p0) then Nil ()
	else if is_prefix (concat (p0, 0 :: Nil ()), p) then (concat (p0, remove_prefix (p, p0))) :: Nil ()
	else if is_prefix (concat (p0, 1 :: Nil ()), p) then (concat (p0, remove_prefix (p, p0))) :: Nil ()
	else Cons (p, Nil ())
end


implement main0 () = () where {

	val x = TmVar (Name "x")
	val y = TmVar (Name "y")
	val z = TmVar (Name "z")

	val I = TmLam (Name "x", x)
	val K = TmLam (Name "x", TmLam (Name "y", x))
	val S = 
		TmLam (Name "x", 
			TmLam (Name "y", 
				TmLam (Name "z", 
					TmApp (
						TmApp (x, z),
						TmApp (y, z)))))

	val X = TmLam (Name "x", TmApp (S, x))

	val p = 0 :: Nil () : path
	val test = term_subterm (term_alpha_normal_form S, p)

	val () = show test
	val () = show "\n"
	val _ = show (term_shift (test, 1))
	val () = show "\n"

	val () = show test 
	val () = show "\n"
	val () = show (term_substitute (test, 1, TmVar (Name "lalala")))

	val () = show "\n==============\n"
	val test = TmApp (S, TmApp (I, TmApp (I, x)))
	val () = show test 
	val () = show "\n"
	val () = list_foreach_clo (term_redexes test, lam p => () where {
//			val _ = show p
			val _ = show (term_subterm (test, p))
			val _ = show "\n"
		})
	val () = show "==============\n"
	val () = list_foreach_clo (term_residual (test, Nil (), 1 :: Nil ()), lam p => () where {
			val _ = show (term_subterm (test, p))
			val _ = show "\n"
		})
}