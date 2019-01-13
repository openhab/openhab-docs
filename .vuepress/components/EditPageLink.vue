<template>
  <div class="editLink" v-if="editUrl">
    <em>Caught a mistake or want to contribute to the documentation? <a target="_blank" :href="editUrl">Edit this page on GitHub<OutboundLink /></a></em>
    <div v-if="isEsh" class="esh-note"><br />
      &#128712; This page comes from the Eclipse SmartHome project, which has specific
      <a target="_blank" href="https://github.com/eclipse/smarthome/blob/master/CONTRIBUTING.md">legal and technical<OutboundLink /></a>
      requirements for accepting contributions, please read them before submitting a change.
    </div>
  </div>
</template>

<style lang="stylus">
.editLink
  border-top 1px solid #eee
  padding 1rem
  font-size 10pt
  margin-bottom -3rem
.esh-note
  color #999
  font-size 8pt
  svg
    height: 10px !important
    width: 10px !important
</style>

<script>
export default {
  computed: {
    isEsh () {
      return (this.$page.frontmatter.source.indexOf('eclipse/smarthome') > 0)
    },
    editUrl () {
      if (!this.$page || !this.$page.frontmatter.source) return null
      return this.$page.frontmatter.source.replace('/blob/', '/edit/').replace('/developer/', '/developers/')
    }
  }
}
</script>
