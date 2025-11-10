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
	'class-name': {
		pattern: /(\b(?:Color|Contact|DateTime|Dimmer|Group|Number|Player|Rollershutter|String|Switch|Location|Frame|Default|Text|Group|Selection|Setpoint|Slider|Colorpicker|Chart|Webview|Image|Video|Item|Thing|Bridge|Time|Type)[\w:\(,\)]*\s+)[\w.:\\]+/i,
		lookbehind: true,
		inside: {
			punctuation: /[.:\\]/
		}
	},
	'constant': /\b(?:label|icon|item|mappings|item|minValue|maxValue|step|switchSupport|height|url|refresh|encoding|visibility|period|service|begin|end|legend|labelcolor|valuecolor|AVG|MIN|MAX|SUM|AND|OR|NAND|NOR|EQUAL)\b/,
	'keyword': /\b(?:Color|Contact|DateTime|Dimmer|Group|Number|Player|Rollershutter|String|Switch|Location|Frame|Default|Text|Group|Selection|Setpoint|Slider|Colorpicker|Chart|Webview|Mapview|Image|Video|Item|Thing|Bridge|Channels|Time|Type|Sitemap|sitemap|Strategies|Items|Length|Temperature|Pressure|Speed|Intensity|Dimensionless|DimensionLess|Angle|Power|Energy|Illuminance)\b/,
	'boolean': /\b(?:true|false)\b/,
	'function': /\s<[a-z0-9_]+>/i,
  'tag': /\s\([a-z0-9_, ]+\)/i,
	'number': /\b0b[01]+\b|\b0x[\da-f]*\.?[\da-fp-]+\b|(?:\b\d+\.?\d*|\B\.\d+)(?:e[+-]?\d+)?[df]?/i,
	'operator': {
		pattern: /(^|[^.])(?:\+[+=]?|-[-=]?|!=?|<<?=?|>>?>?=?|==?|&[&=]?|\|[|=]?|\*=?|\/=?|%=?|\^=?|[?:~])/m,
		lookbehind: true
	},
	'punctuation': /[{}[\];(),.:]/
}
