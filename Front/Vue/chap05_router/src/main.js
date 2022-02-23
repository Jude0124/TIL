import Vue from 'vue'
import App from './App.vue'
import './../node_modules/bootstrap/dist/css/bootstrap.min.css'

//npm i vue-router@3
import VueRouter from 'vue-router'
Vue.use(VueRouter);

Vue.config.productionTip = false

new Vue({
  render: h => h(App),
}).$mount('#app')

