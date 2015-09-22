#include "share/atspre_staload.hats"
#define ATS_DYNLOADFLAG 0
staload "name.sats"
staload "ats-utils/util.sats"

implement name_eq (a, b) = 
	case+ a of 
	| None () => (
		case+ b of 
		| None _ => true
		| _ => false
		)
	| Name (v1) => (
		case+ b of 
		| Name (v2) => if v1 = v2 then true else false
		| _ => false
		) 
	| Index (v1) =>
	 	case+ b of 
	 	| Index (v2) => if v1 = v2 then true else false 
	 	| _ => false


implement name_show (n) = 
	case+ n of 
	| Name v  => show v
	| Index v => show v
	| None _ => ()