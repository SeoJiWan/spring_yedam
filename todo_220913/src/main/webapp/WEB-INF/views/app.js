import router from "./router/router.js";
import todoHeader from "./component/todoHeader.js";
// <todo-header></todo-header>
// <router-view></router-view>
//<select-items></select-items>
let template = `<div>
                  <todo-header></todo-header>
                  <router-view></router-view>
                </div>`;
let app = new Vue({
  el: "#app",

  template,

  components: {
    "todo-header": todoHeader,
    // "select-items": selectItems,
  },

  router,
});
