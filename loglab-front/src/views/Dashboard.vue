<template>
  <div id="dashboard">
    <navbar />
    <SearchFilter></SearchFilter>
    <div id="options" class="d-flex align-items-center justify-content-left">
      <button>Arquivar</button>
      <button>Apagar</button>
    </div>
    <LogList></LogList>
  </div>
</template>

<script>
// @ is an alias to /src
import Navbar from "@/components/Navbar.vue";
import SearchFilter from "@/components/Filter.vue";
import LogList from "@/components/LogList.vue";

export default {
  name: "home",
  components: {
    Navbar,
    SearchFilter,
    LogList
  },
  methods: {
    login(){
      console.log("login");
      window.location.assign('/#/about');
    }
  }
};
</script>

<style lang="scss" scoped>
@import "../assets/css/components";
@import "../assets/css/variables";

input {
  margin-bottom: 5px;
}

#loginForm {
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
}
#options{
  padding: 20px 60px !important;
  button{
    margin: 0 5px 0 0;
  }
}
</style>