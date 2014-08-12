
/*
require "stdio" as io
require "./list" as list

val x = lam x y z => x * 1
val z = x y

val (++) infix = lam x y => x :: y
val z = x ++ y

*/
grammar LamLite;

@header { 
import java.util.Arrays; 
} 

//@parser::member { precedence map }


// Programs
program
    : (binding)+
    ;

// Bindings
binding
    : K_VAL pattern (LBRACK fixity RBRACK)? '=' term 
    ;

// Patterns
pattern
    : patternVariable
    | patternOperator //{this.getRuleContext() instanceof BindingOperatorContext}? 
    | patternConstant
    | patternAny
    | LPAREN pattern RPAREN 
    ;

patternOperator
    : IDOPERATOR
    ;

patternAny
    : '_'
    ;

patternVariable
    : IDNAME
    ;

patternConstant
    : literal
    ;

// Terms

term 
    : termInner
    | termInner+
    ;

termInner
    : termConstant              #constant
    | termVariable              #variable
    | termLambda                #lambda 
    | LPAREN term RPAREN        #nested
    ;

termConstant
    : literal
    ;
    
termVariable
    : IDNAME
    | IDOPERATOR
    ;

termLambda
    : K_LAM pattern+ '=>' term
    ;

// Fixity Definition
fixity
    : K_INFIXR
    | K_INFIXL
    | K_INFIX
    | K_POSTFIX
    | K_PREFIX
    ;


// Doc String

docstr
    : COMMENT_DOC+
    ;

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

K_INFIX: 'infix';
K_INFIXR: 'infixr';
K_INFIXL: 'infixl';
K_POSTFIX: 'postfix';
K_PREFIX: 'prefix';

        
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
// Literals

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
/*
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
UNDERSCORE      : '_';
BIGARROW	: '=>';
*/


// Identifier

IDNAME
    : LETTER (LETTER | DIGIT)*
    ;

IDOPERATOR
    : SYMBOL+ {!Arrays.asList("=>").contains(getText())}?
    ;

fragment SYMBOL
    : [`~!@#$%^&*\-_=+|\\:'"<>/?] // no separators
    ;

// Comments

COMMENT_DOC
    : '/**' .*? '**/'
    ;

COMMENT_BLOCK
    : 
    ( '/*' .*? '*/' 
    | '(*' .*? '*)'
    ) -> skip
    ;

COMMENT_LINE
    : 
    ( '//' ~[\r\n]* 
    | '#'  ~[\r\n]*
    ) -> skip
    ;

REST_COMMENT
    : '////' .*?
      -> skip
    ;

WS
    : [ \t\r\n\u000C]+ 
      -> skip
    ;

fragment LETTER
    : [a-zA-Z_] // these are the "java letters" below 0xFF
    | ~[\u0000-\u00FF\uD800-\uDBFF] {Character.isJavaIdentifierStart(_input.LA(-1))}?
    | [\uD800-\uDBFF] [\uDC00-\uDFFF] {Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;
