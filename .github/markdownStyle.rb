all

# Expect dash usage for unorderd lists
rule 'MD004', :style => :dash

# Allow trailing spaces
exclude_rule 'MD009'

# Allow long line lengths
exclude_rule 'MD013'

# Allow Multiple top level headers in the same document
exclude_rule 'MD025'

# Allow inline HTML
exclude_rule 'MD033'

# Allow Frontmatter and exclude top level header on first line rule
exclude_rule 'MD041'
