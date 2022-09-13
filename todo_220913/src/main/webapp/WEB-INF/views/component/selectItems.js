let template = `
<ul id="myUL">
<template v-for="item in items">
  <li :key="item.no" :class="{ checked : item.todoyn == 1 ? true : false }" @click="checkedItem(item)">
    {{item.contents}}
    <span class="close" @click.stop="deleteItem(item)">X</span>
  </li>
</template>
</ul>
`;

export default {
  template: template,

  data: function () {
    return {
      items: [],
    };
  },

  computed: {
    itemList: function () {},
  },

  watch: {
    updateItem: function () {},
  },

  created: function () {
    const component = this; // 여기서 this 를 쓰면 js 객체를 가리킴
    console.log("created function");
    $.ajax({
      type: "get",

      url: "http://192.168.56.1:8080/java/",

      dataType: "json",

      data: {
        id: 0,
      },

      success: function (data) {
        if (data != null) {
          console.log(data);
          component.items = data; // 여기서 this.empList 를 쓰면 this 는 ajax 객체를 가리킴
        }
      },

      error: function (reject) {
        console.log(reject);
      },
    });
  },

  methods: {
    loadData: function () {},

    checkedItem: function (item) {
      const component = this;
      console.log(item.todoyn);

      $.ajax({
        type: "get",

        url: "http://192.168.56.1:8080/java/update",

        data: {
          id: 0,
          no: item.no,
          todoyn: item.todoyn == 1 ? 0 : 1,
        },

        success: function (data) {
          console.log(data);
          // alert("update complete");
          for (let i = 0; i < component.items.length; i++) {
            if (
              component.items[i].id == item.id &&
              component.items[i].no == item.no
            ) {
              if (component.items[i].todoyn == 0) {
                component.items[i].todoyn = 1;
              } else {
                component.items[i].todoyn = 0;
              }
            }
          }
        },

        error: function (reject) {
          console.log(reject);
        },
      });
    },

    deleteItem: function (item) {
      const component = this;
      $.ajax({
        type: "delete",

        url: "http://192.168.56.1:8080/java/todo/" + item.no,

        success: function (data) {
          if (data != null) {
            console.log(data);
            alert("delete complete");
            console.log(component.items.length);

            for (let i = 0; i < component.items.length; i++) {
              if (
                component.items[i].id == item.id &&
                component.items[i].no == item.no
              ) {
                component.items.splice(i, 1);
              }
            }
          }
        },

        error: function (reject) {
          console.log(reject);
        },
      });
    },
  },
};
