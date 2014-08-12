
/*
require "stdio" as io
require "./list" as list

val x = lam x y z => x * 1
val z = x y


*/
grammar LamLite;

// Programs
program
    : (binding | term)+
    ;

// Bindings
binding
    : K_VAL pattern EQ term
    ;

// Patterns
pattern
    : patternName 
    | patternVoid
    | LPAREN pattern RPAREN
    ;

patternName
    : IDENTIFIER
    ;

patternVoid
    : LPAREN RPAREN
    ;

// Terms
term
    : termConstant
    | termVariable
    | termLambda
    | termApplication
    | LPAREN term RPAREN
    ;

termConstant
    : literal
    ;
    
termVariable
    : IDENTIFIER
    ;

termLambda
    : K_LAM pattern+ EQ term
    ;

termApplication
    : term+
    | term opInfix term 
    | term opPostfix
    ;

// Types
type
    : primitiveType
    | functionType
    | sumType
    | productType
    | LPAREN type RPAREN
    ;

primitiveType
    : K_INT
    | K_BOOL
    | K_STRING
    ;

functionType
    : type ARROW type 
    ;

sumType
    : type ('|' type)*
    ;

productType
    : LPAREN type (',' type)+ RPAREN
    ;



/*
program: module+; 

module
    : (docstr | require | binding | expression)+
    ;

docstr: COMMENT_DOC+;

require: K_REQUIRE STRING_LITERAL K_AS IDENTIFIER;

binding
    : MODIFIER? K_VAL IDENTIFIER EQ expression 
    ;

// Expression

expression
    : exp_constant
    | exp_lam
    | exp_app
    | expression ADD expression 
    | expression SUB expression
    | expression MUL expression 
    | expression DIV expression 
    | exp_id
    | exp_ite
    | exp_let
    | LPAREN expression RPAREN
    ;

// Expression - Id
exp_id: IDENTIFIER;

// Expression - If-Then-Else
exp_ite
    : K_IF expression K_THEN expression (K_ELSE expression)?
    ;

// Expression - Let
exp_let
    : K_LET binding* K_IN expression
    ;

// Expression - Constant
exp_constant
    : literal
    ;

// Expression - Lambda
exp_lam
    : K_LAM LPAREN? IDENTIFIER* RPAREN? BIGARROW expression
    ;

exp_app
    : IDENTIFIER LPAREN? expression* RPAREN?
    ;

        

      
       


definition
    : definition_type
    | definition_value
    ;

definitino_type
    : definition
               
           

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
*/
// Keywords

K_INT: 'int';
K_STRING: 'string';
K_BOOL: 'bool';

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




// Void Literal

VOID_LITERAL
    : LPAREN RPAREN
    ;

// Null Literal

NULL_LITERAL
    : 'null'
    ;  

// Boolean Literals

BOOLEAN_LITERAL
    : 'true'
    | 'false'
    ;

// Integer Literals

fragment DIGIT  : [0-9];
fragment XDIGIT : [0-9a-fA-F];
fragment ODIGIT : [0-7];
fragment BDIGIT : [01];

fragment INT_TYPE_SUFFIX: [lL];

fragment BINARY_NUMERAL     : '0' [bB] BDIGIT+;
fragment OCTAL_NUMERAK      : '0' ODIGIT+;
fragment HEX_NUMERAL        : '0' [xX] XDIGIT+;
fragment DECIMAL_NUMERAL    : [1-9] DIGIT*;

INTEGER_LITERAL
    : BINARY_NUMERAL INT_TYPE_SUFFIX?
    | OCTAL_NUMERAK INT_TYPE_SUFFIX?
    | OCTAL_NUMERAK INT_TYPE_SUFFIX?
    | DECIMAL_NUMERAL INT_TYPE_SUFFIX?
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

fragment UNICODE_ESCAPE
    : '\\u' XDIGIT XDIGIT XDIGIT XDIGIT
    ;
       


// Separators

LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';
SEMI   : ';';
COMMA  : ',';
DOT    : '.';

// Operators

EQ		: '=';
GT		: '>';
LT		: '<';
BANG		: '!';
TILDE		: '~';
QUESTION	: '?';
COLON		: ':';
EQEQ		: '==';
LE		: '<=';
GE		: '>=';
NOTEQUAL	: '!=';
AND		: '&&';
OR		: '||';
INC		: '++';
DEC		: '--';
ADD		: '+';
SUB		: '-';
MUL		: '*';
DIV		: '/';
BITAND		: '&';
BITOR		: '|';
CARET		: '^';
MOD		: '%';
ARROW		: '->';
BIGARROW	: '=>';
COLONCOLON	: '::';
DOLLAR		: '$';
UNDERSCORE	: '_';

// Comments

COMMENT_DOC
    : '/**' .*? '**/'
    ;

COMMENT_BLOCK
    : ('/*' .*? '*/' | '(*' .*? '*)') -> skip
    ;

COMMENT_LINE
    : ('//' ~[\r\n]* | '#'  ~[\r\n]*) -> skip
    ;

REST_COMMENT
    : '////' .*? -> skip
    ;

WS
    : [ \t\r\n\u000C]+ -> skip
    ;

LETTER
    : [a-zA-Z_] // these are the "java letters" below 0xFF
    | ~[\u0000-\u00FF\uD800-\uDBFF] {Character.isJavaIdentifierStart(_input.LA(-1))}?
    | [\uD800-\uDBFF] [\uDC00-\uDFFF] {Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;
