module.exports = {
	'comment': [
		{
			pattern: /(^|[^\\])\/\*[\s\S]*?(?:\*\/|$)/,
			lookbehind: true
		},
		{
			pattern: /(^|[^\\:])\/\/.*/,
			lookbehind: true,
			greedy: true
		}
	],
	'string': {
		pattern: /(["'])(?:\\(?:\r\n|[\s\S])|(?!\1)[^\\\r\n])*\1/,
		greedy: true
	},
	'class-name': [
		{
			pattern: /((?:\b(?:instanceof|as|new|val|var)\s+)|(?:catch\s+\())[A-Z][\w.\\]+/,
			lookbehind: true,
			inside: {
				punctuation: /[.\\]/
			}
		},
		{
			pattern: /\b((?:import\s+[\w\.]+)\.)[\w.]+\b/,
			lookbehind: true
		},
	],
	'constant': /\b(?:INCREASE|DECREASE|NEXT|PREVIOUS|ON|OFF|OPEN|CLOSED|PLAY|PAUSE|REWIND|FASTFORWARD|STOP|MOVE|UP|DOWN|UNDEF|string|int|boolean|long|float|double|short|char|byte|NULL|null)\b/,
	'keyword': /\b(?:if|else|while|do|for|return|in|instanceof|import|function|new|try|throw|catch|finally|break|continue|switch|case|default|synchronized|rule|when|Item|Thing|Channel|changed|updated|Time cron|Time is midnight|Time is noon|System started|System shuts down|received update|received command|triggered|from|to|or|as|then|end|var|val)\b/,
	'boolean': /\b(?:true|false)\b/,
	'function': /(?:\w+(?=\()|toString|getInstance|intValue|doubleValue|floatValue)/,
	'function-name': /\b[A-Z][\w_]+(?=\.|:)/,
	'number': /\b0b[01]+\b|\b0x[\da-f]*\.?[\da-fp-]+\b|(?:\b\d+\.?\d*|\B\.\d+)(?:e[+-]?\d+)?[df]?/i,
	'operator': {
		pattern: /(^|[^.])(?:\+[+=]?|-[-=]?|!=?|<<?=?|>>?>?=?|==?|&[&=]?|\|[|=]?|\*=?|\/=?|%=?|\^=?|[?:~])/m,
		lookbehind: true
	},
	'punctuation': /[{}[\];(),.:]/
}
