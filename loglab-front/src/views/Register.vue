<template>
  <div class="register fullscreen">
    <img src="../assets/logo.png" />
    <form id="registerForm" @submit="register()">
      <h2>Cadastre-se para utilizar a plataforma!</h2>
      <input type="text" name="email" placeholder="youremail@yoursite.com" />
      <input type="password" name="passwors" placeholder="digite uma senha" />
      <input type="password" name="passwors" placeholder="confirme a senha" />
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
      window.location.assign('/');
    }
  }
};
</script>

<style lang="scss">
@import "../assets/css/components";

input {
  margin-bottom: 5px;
  width: 300px;
}

#registerForm {
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
}
</style>