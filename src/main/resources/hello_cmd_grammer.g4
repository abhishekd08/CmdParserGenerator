grammar hello_cmd_grammer;

command: ((option_key|SINGLE_SPACE) option_value?)+ EOF;

option_key: HYPHEN HYPHEN? (ALL_SMALL_CHARS|ALL_CAP_CHARS)+;
option_value
:
(
    (ALL_SMALL_CHARS|ALL_CAP_CHARS|ALL_SPECIAL_CHARS|NUMBERS|UNDERSCORE|HYPHEN)+
|   SINGLE_QUOTE (ALL_SMALL_CHARS|ALL_CAP_CHARS|ALL_SPECIAL_CHARS|NUMBERS|UNDERSCORE|HYPHEN|DOUBLE_QUOTE|SINGLE_SPACE)+ SINGLE_QUOTE
|   DOUBLE_QUOTE (ALL_SMALL_CHARS|ALL_CAP_CHARS|ALL_SPECIAL_CHARS|NUMBERS|UNDERSCORE|HYPHEN|SINGLE_QUOTE|SINGLE_SPACE)+ DOUBLE_QUOTE
)
(SINGLE_SPACE|EOF)
;

//WORD: (ALL_SMALL_CHARS|ALL_CAP_CHARS|ALL_SPECIAL_CHARS|NUMBERS|UNDERSCORE|HYPHEN)+;

NUMBERS: '0'..'9';
ALL_SMALL_CHARS: 'a'..'z';
ALL_CAP_CHARS: 'A'..'Z';
ALL_SPECIAL_CHARS: '~'|'!'|'@'|'#'|'$'|'%'|'^'|'&'|'('|')'|'='|':'|'<'|'>'|','|'/'|'?';

SINGLE_SPACE: ' ';
UNDERSCORE: '_';
SINGLE_QUOTE: '\'';
DOUBLE_QUOTE: '"';
HYPHEN: '-';
NOT_HYPHEN: ~['-'];




/*
command: (boolean_option (SINGLE_SPACE+|EOF))+;

option: (value_option|boolean_option);


value_option: option_key SINGLE_SPACE+ option_value;
boolean_option: option_key;

option_key: OPTION_KEY;
option_value: OPTION_VALUE;



OPTION_KEY
: OPTION_KEY_START WORD+;

OPTION_VALUE
: SINGLE_QUOTE (OPTION_VALUE_CONTENT|DOUBLE_QUOTE)+ SINGLE_QUOTE
| DOUBLE_QUOTE (OPTION_VALUE_CONTENT|SINGLE_QUOTE)+ DOUBLE_QUOTE
| OPTION_VALUE_CONTENT;

OPTION_KEY_START
: HYPHEN | HYPHEN HYPHEN;

OPTION_VALUE_CONTENT: (REGEX_WORD|SINGLE_SPACE)+;
*/



