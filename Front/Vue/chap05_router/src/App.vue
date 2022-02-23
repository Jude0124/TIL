<template>
  <div class="card-body">
      <h1>Vue Router</h1>

      <div>
          <router-link></router-link>
      </div>

      <hr>

      <div>
          <!-- Link로 선택된 Component가 표시되는 위치 -->
          <router-view></router-view>
      </div>
  </div>
</template>

<script>
import VueRouter from 'vue-router'
import A01Bind from './components/A01Bind.vue'

const router = new VueRouter({
    routes: [
      { path: "/",            component: A01Bind}
    ]

})

export default {
  name: 'App',
  router
}
</script>

<style>

</style>
