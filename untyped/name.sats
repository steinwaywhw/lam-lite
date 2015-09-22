staload "ats-utils/util.sats"

datatype name = 
	| Name of string
	| Index of int
	| None of ()

fun name_eq (name, name): bool
fun name_show (name): void

overload eq with name_eq
overload show with name_show