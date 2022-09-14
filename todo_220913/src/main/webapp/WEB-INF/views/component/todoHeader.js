let template = `
<div id="myDIV" class="header">
  <h2>My To Do List</h2>
  <input type="text" v-model="content" placeholder="Title...">
  <span @click="addItem()" class="addBtn">Add</span>
</div>
`;

export default {
  template: template,

  data: function () {
    return {
      content: "",
    };
  },

  methods: {
    addItem: function (e) {
      const component = this;
      console.log(this);

      $.ajax({
        type: "get",

        url: "http://192.168.56.1:8080/java/insert",

        data: {
          id: 0,
          contents: this.content,
        },

        success: function (data) {
          if (data != null) {
            console.log(data);
            alert("add success");
            component.$router.go(0);
            //location.reload();
          }
        },

        error: function (reject) {
          console.log(reject);
        },
      });
    },
  },
};
