#!/usr/bin/env bash
set -e

filesize () {
  stat -c%s "$1"
}

percent () {
  printf "(100/%d*%d)-100" "$1" "$2" | bc -l
}

scour_compression () {
  FILESIZE_BEFORE=$(filesize "$1")
  TMP_FILE="$1.tmp"
  printf "scour:\t\tlossless svg compression\t(%d bytes -> " "$FILESIZE_BEFORE"
  scour --quiet -i "$1" -o "$TMP_FILE" --enable-viewboxing --enable-id-stripping --enable-comment-stripping --shorten-ids --indent=space
  mv "$TMP_FILE" "$1"
  FILESIZE_AFTER=$(filesize "$1")
  REDUCTION=$(percent "$FILESIZE_BEFORE" "$FILESIZE_AFTER")
  printf "%d bytes, %.2f%%)\n" "$FILESIZE_AFTER" "$REDUCTION"
}

svg2png_conversion () {
  FILESIZE_BEFORE=$(filesize "$1")
  printf "rsvg-convert:\tconvert svg to png\t\t(%d bytes -> " "$FILESIZE_BEFORE"
  rsvg-convert "$1" -o "$2"
  FILESIZE_AFTER=$(filesize "$2")
  REDUCTION=$(percent "$FILESIZE_BEFORE" "$FILESIZE_AFTER")
  printf "%d bytes, %.2f%%)\n" "$FILESIZE_AFTER" "$REDUCTION"
}

optipng_conpression () {
  FILESIZE_BEFORE=$(filesize "$1")
  printf "optipng:\tlossless png compression\t(%d bytes -> " "$FILESIZE_BEFORE"
  optipng -o7 -f4 -strip all -quiet "$1"
  FILESIZE_AFTER=$(filesize "$1")
  REDUCTION=$(percent "$FILESIZE_BEFORE" "$FILESIZE_AFTER")
  printf "%d bytes, %.2f%%)\n" "$FILESIZE_AFTER" "$REDUCTION"
}

pngquant_compression () {
  FILESIZE_BEFORE=$(filesize "$1")
  printf "pngquant:\tlossy png compression\t\t(%d bytes -> " "$FILESIZE_BEFORE"
  pngquant --ext .png --force --quality 75-80 $1
  FILESIZE_AFTER=$(filesize $1)
  REDUCTION=$(percent "$FILESIZE_BEFORE" "$FILESIZE_AFTER")
  printf "%d bytes, %.2f%%)\n" "$FILESIZE_AFTER" "$REDUCTION"
}

print_separator () {
  printf "$1%.0s" {1..84}
  printf '\n'
}

I=0
FILES=(*.svg)
TOTAL=${#FILES[@]}
for SVG_FILE in "${FILES[@]}"; do
  I=$(( I + 1 ))
  PNG_FILE="${SVG_FILE%%.*}.png"
  printf "(%d/%d): %s\n" "$I" "$TOTAL" "$SVG_FILE"
  print_separator "="
  scour_compression "$SVG_FILE"
  # svg2png_conversion "$SVG_FILE" "$PNG_FILE"
  # optipng_conpression "$PNG_FILE"
  # pngquant_compression "$PNG_FILE"
  printf '\n'
done

print_separator "="
echo "done"
print_separator "="
