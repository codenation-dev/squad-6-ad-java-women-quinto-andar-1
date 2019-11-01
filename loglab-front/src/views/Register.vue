<template>
  <div class="home fullscreen">
    <img src="../assets/logo.png" />
    <form id="registerForm" @submit="register()">
      <input type="text" name="email" placeholder="youremail@yoursite.com" />
      <input type="password" name="passwors" placeholder="senha" />
      <input type="password" name="passwors" placeholder="senha" />
      <button type="submit">Cadastrar</button>
    </form>
  </div>
</template>

<script>
// @ is an alias to /src

export default {
  name: "register",
  methods: {
    register(){
      console.log("login");
      window.location.assign('/');
    }
  }
};
</script>

<style lang="scss">
@import "../assets/css/components";

input {
  margin-bottom: 5px;
}

#registerForm {
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
}
</style>