<template>
  <img :style="{ height: imgHeight, 'vertical-align': imgVerticalAlign }" />
</template>

<script>
export default {
  props: ['height', 'verticalAlign'],
  computed: {
    imgHeight () {
      return this.height ? this.height : '1.5em'
    },
    imgVerticalAlign () {
      return this.verticalAlign ? this.verticalAlign : 'text-bottom'
    }
  }
}
</script>
