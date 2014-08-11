/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
require "stdio" as io
require "./list" as list

val f = lam x => x + 1
public fun main(argc: int, argv: list string): void = let
    val _ = io.print "hello world";
    val _ = io.print f 3
in
end  
  
val z = 

*/
grammar LamLite;

program: module+;

module: module_doc* (require | binding)*;

require: K_REQUIRE STRING_LITERAL K_AS IDENTIFIER;

binding
    : MODIFIER binding_val
    | MODIFIER binding_fun 
    ;

binding_val
    : K_VAL pattern EQ expression
    ;

binding_fun
    : K_FUN IDENTIFIER LPAREN input_definition? RPAREN COLON output_definition EQ expression 
    ;

// Expression

expression
    : exp_let
    | exp_ite
    | exp_id
    | exp_app
    ;

// Expression - Id
exp_id: IDENTIFIER;

// Expression - If-Then-Else
exp_ite
    : K_IF expression K_THEN exp_ite_then (K_ELSE exp_ite_else)
    ;
exp_ite_then: expression;
exp_ite_else: expression;

// Expression - Let
exp_let: K_LET binding* K_IN expression K_END;

// Expression - Application
       

/*
definition
    : definition_type
    | definition_value
    ;

definitino_type
    : definition
*/                  
           

pattern
    : pattern_constant
    | pattern_any
    | pattern_id
    ;

pattern_any: UNDERSCORE;
pattern_constant: literal;
pattern_id: IDENTIFIER;

        
MODIFIER
    : K_PUBLIC
    ;

// Keywords
K_THIS: 'this';

K_REQUIRE: 'require';
K_MODULE: 'module';
K_PUBLIC: 'public';
K_AS: 'as';

K_LAM: 'lam';
K_FUN: 'fun';
K_VAL: 'val';

K_IF: 'if';
K_THEN: 'then';
K_ELSE: 'else';

K_LET: 'let';
K_IN: 'in';
K_END: 'end';
K_WHERE: 'where';

K_CASE: 'case';
K_OF: 'of';
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  

// Identifier
IDENTIFIER: LETTER (LETTER | DIGIT)*;

// literals
literal
    : INTEGER_LITERAL
    | STRING_LITERAL
    | BOOLEAN_LITERAL
    | NULL_LITERAL
    | VOID_LITERAL
    ;

// Tuple Literal


// Void Literal
VOID_LITERAL: LPAREN RPAREN;

// Integer Literals

fragment DIGIT: [0-9];
fragment XDIGIT: [0-9a-fA-F];
fragment ODIGIT: [0-7];
fragment BDIGIT: [01];
fragment INT_TYPE_SUFFIX: [lL];

fragment BINARY_NUMERAL:	'0' [bB] BDIGIT+;
fragment OCTAL_NUMERAK:	'0' ODIGIT+;
fragment HEX_NUMERAL: '0' [xX] XDIGIT+;
fragment DECIMAL_NUMERAL: [1-9] DIGIT+;

INTEGER_LITERAL
    : BINARY_NUMERAL INT_TYPE_SUFFIX?
    | OCTAL_NUMERAK INT_TYPE_SUFFIX?
    | OCTAL_NUMERAK INT_TYPE_SUFFIX?
    | DECIMAL_NUMERAL INT_TYPE_SUFFIX?
    ;


// Boolean Literals

BOOLEAN_LITERAL
    : 'true'
    | 'false'
    ;
      
// String Literals

STRING_LITERAL
    : '"' STRING_CHAR* '"'
    ;

fragment STRING_CHAR
    : ~["\\]
    | ESCAPE_CHAR
    ;

fragment ESCAPE_CHAR
    : '\\' [btnfr"\\]
    | OCTAL_ESCAPE
    | UNICODE_ESCAPE 
    ;

fragment OCTAL_ESCAPE
    : '\\' ODIGIT
    | '\\' ODIGIT ODIGIT
    | '\\' [0-3] ODIGIT ODIGIT
    ;

fragment UNICODE_ESCAPE: '\\u' XDIGIT XDIGIT XDIGIT XDIGIT;

// The Null Literal

NULL_LITERAL: 'null';         


// Separators

LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';
SEMI : ';';
COMMA : ',';
DOT : '.';

// Operators

EQ : '=';
GT : '>';
LT : '<';
BANG : '!';
TILDE : '~';
QUESTION : '?';
COLON : ':';
EQEQ : '==';
LE : '<=';
GE : '>=';
NOTEQUAL : '!=';
AND : '&&';
OR : '||';
INC : '++';
DEC : '--';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
BITAND : '&';
BITOR : '|';
CARET : '^';
MOD : '%';
ARROW : '->';
BIGARROW: '=>';
COLONCOLON : '::';
DOLLAR : '$';
UNDERSCORE: '_';


// Comments

DOC_COMMENT
    : '/**' .*? '**/'
    ;

BLOCK_COMMENT
    :   '/*' .*? '*/' -> channel(HIDDEN)
    |   '(*' .*? '*)' -> channel(HIDDEN)
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> channel(HIDDEN)
    |   '#'  ~[\r\n]* -> channel(HIDDEN)
    ;

REST_COMMENT: '////' .*? -> skip;

// Fragments




fragment WS:  [ \t\r\n\u000C]+ -> skip;
fragment LETTER
	:	[a-zA-Z_] // these are the "java letters" below 0xFF
	|	// covers all characters above 0xFF which are not a surrogate
		~[\u0000-\u00FF\uD800-\uDBFF]
		{Character.isJavaIdentifierStart(_input.LA(-1))}?
	|	// covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
		[\uD800-\uDBFF] [\uDC00-\uDFFF]
		{Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
	;
