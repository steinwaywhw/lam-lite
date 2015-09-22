staload "env.sats"
staload "name.sats"
staload "ats-utils/util.sats"
staload "ats-utils/list.sats"
//staload "ats-utils/maybe.sats"

datatype term = 
	| TmVar of name
	| TmLam of (name, term)
	| TmApp of (term, term)

typedef path = list int 

fun term_size (term): int
fun term_subterm (term, path): term 
fun term_paths (term): list path 
fun term_alpha_normal_form (term): term 
fun term_shift (term, int): term 
fun term_substitute (term, int, term): term 

fun term_redexes (term): list path 

fun term_show (term): void

overload show with term_show



fun term_residual (term, path, path): list path 

fun term_get_path_list (term): list path 
fun term_get_redexes (term): list path 
fun term_residual (term, path, path): list path 
fun term_residuals (term, path, list path): (term, list path) 
