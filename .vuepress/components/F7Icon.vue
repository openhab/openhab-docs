<template>
  <i
    class="icon f7-icons f7-icon-inline"
    :style="iconStyle"
    :aria-hidden="label ? null : 'true'"
    :aria-label="label || null"
  >{{ f7 }}</i>
</template>

<script>
export default {
  props: {
    f7: {
      type: String,
      required: true
    },
    size: {
      type: [Number, String],
      default: null
    },
    color: {
      type: String,
      default: null
    },
    label: {
      type: String,
      default: null
    }
  },
  computed: {
    iconStyle () {
      const style = {}

      if (this.size !== null && this.size !== '') {
        style.fontSize = typeof this.size === 'number' ? `${this.size}px` : this.size
      }

      if (this.color) {
        style.color = this.color
      }

      return style
    }
  }
}
</script>

<style>
@import '~framework7-icons/css/framework7-icons.css';

.f7-icon-inline {
  display: inline-block;
  line-height: 1;
  vertical-align: text-bottom;
}
</style>
