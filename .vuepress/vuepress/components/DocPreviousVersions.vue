<template>
  <div class="page-versions">
    <div class="dropdown-wrapper" :class="{ open }">
      <a class="dropdown-title" @click="toggle">
        <span class="title">Version: {{currentVersion}}</span>
        <span class="arrow" :class="open ? 'down' : 'right'"></span></span>
      </a>
      <ul class="nav-dropdown" v-show="open">
        <li v-for="version in versions" class="dropdown-item">
          <a class="current" v-if="version.number === currentVersion">{{version.number}}</a>
          <a v-else :href="version.url">{{version.number}}</a>
        </li>
      </ul>
    </div>
  </div>
</template>

<style lang="stylus">
.content:not(.custom)>h1:first-child
  margin-right 140px
.page-versions
  position absolute
  top 5rem
  white-space nowrap
  right 2rem
  font-size 9pt
  margin 5px
  padding 3px
  height 14px
  user-select none
  .dropdown-wrapper
    padding 2px
    position absolute
    right 0
  .dropdown-title
    border 1px solid #eee
    border-radius 2px
    padding 5px
    color black
    cursor pointer
    &:hover
      text-decoration none !important
      border 1px solid #ccc
  .nav-dropdown
    box-sizing border-box
    max-height calc(100vh - 2.7rem)
    overflow-y auto
    top 100%
    right 0
    background-color #fff
    padding 10px 0
    border 1px solid #ddd
    border-bottom-color #ccc
    text-align left
    border-radius 0.25rem
    white-space nowrap
    margin 0;
    position relative
    top 0
    .current
      color black
      font-weight bold !important
      &:hover
        text-decoration none
        color black !important
</style>

<script>
export default {
  data () {
    return {
      versionNumbers: ['latest', '2.4', '2.3', '2.2'], //, '2.1'],
      currentVersion: 'latest',
      open: false
    }
  },
  methods: {
    toggle () {
      this.open = !this.open
    }
  },
  created () {
    if (this.$site.base && this.$site.base.indexOf('v') > 0) {
      this.currentVersion = this.$site.base.replace('v', '').replace(/\//g, '')
      this.versionNumbers = ['latest', this.currentVersion] // to avoid having to regenerate previous sites
    }
  },
  computed: {
    versions () {
      return this.versionNumbers.map(version => {
        let url = this.$page.path
        if (version === '2.1') {
          url = url.replace('addons/integrations/', 'addons/ios/')
          if (url.indexOf('/addons') === 0) url += 'readme.html'
        }
        if (version === 'latest') {
          url = 'https://www.openhab.org' + url
        } else {
          url = `https://${(version === '2.1') ? 'docs.' : 'www.'}openhab.org${version === 'snapshot' ? '' : '/v' + version}${url}`
        }

        return {
          number: version,
          url: url
        }
      })
    }
  }
}
</script>
