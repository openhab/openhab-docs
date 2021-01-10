all

# Exclude first headline rule to avoid breaking of the introduction page for now
exclude_rule 'MD002'

# Expect dash usage for unorderd lists
rule 'MD004', :style => :dash

# Allow trailing spaces
exclude_rule 'MD009'

# Allow long line lengths
exclude_rule 'MD013'

# Allow duplicate headers for different nesting
rule 'MD024', :allow_different_nesting  => true

# Allow Multiple top level headers in the same document
exclude_rule 'MD025'

# Allow trailing punctuation in headers
exclude_rule 'MD026'

# Allow inline HTML
exclude_rule 'MD033'

# Allow bare urls (at least until they don't produce errors in source code blocks anymore)
exclude_rule 'MD034'

# Allow Frontmatter and exclude top level header on first line rule
exclude_rule 'MD041'
