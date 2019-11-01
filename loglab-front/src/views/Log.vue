<template>
  <div class="home fullscreen">
    <img src="../assets/logo.png" />
    <form id="loginForm" @submit="login()">
      <input type="text" name="email" placeholder="youremail@yoursite.com" />
      <input type="password" name="passwors" placeholder="senha" />
      <button type="submit">Entrar</button>
    </form>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from "@/components/HelloWorld.vue";

export default {
  name: "home",
  components: {
    HelloWorld
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