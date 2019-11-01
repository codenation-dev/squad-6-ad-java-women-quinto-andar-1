<template>
  <div class="dashboard">
    <navbar></navbar>
    <SearchFilter></SearchFilter>
  </div>
</template>

<script>
// @ is an alias to /src
import Navbar from "@/components/Navbar.vue";
import SearchFilter from "@/components/Filter.vue";

export default {
  name: "home",
  components: {
    Navbar,
    SearchFilter
  },
  methods: {
    login(){
      console.log("login");
      window.location.assign('/#/about');
    }
  }
};
</script>

<style lang="scss">
@import "../assets/css/components";

input {
  margin-bottom: 5px;
}

#loginForm {
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
}
</style>