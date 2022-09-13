import selectItems from "../component/selectItems.js";
import todoHeader from "../component/todoHeader.js";

export default new VueRouter({
  mode: "hash",

  routes: [
    // {
    //   path: "/",
    //   name: "todoHeader",
    //   component: todoHeader,
    //   props: true,
    // },
    {
      path: "/",
      name: "selectItems",
      component: selectItems,
      props: true,
    },
    {
      path: "*",
      redirect: "/",
    },
  ],
});
