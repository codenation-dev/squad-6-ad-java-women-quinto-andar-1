<template>
  <div class="home fullscreen">
    <img src="../assets/logo.png" />
    <h2>Para começar, faça o login :)</h2>
    <form id="loginForm" @submit="login()">
      <input type="text" name="email" placeholder="youremail@yoursite.com" />
      <input type="password" name="passwors" placeholder="senha" />
      <button type="submit">Entrar</button>
    </form>
  </div>
</template>

<script>
// @ is an alias to /src

export default {
  name: "home",
  methods: {
    login(){
      console.log("login");
      window.location.assign('/#/dashboard');
    }
  }
};
</script>

<style lang="scss">
@import "../assets/css/components";
@import "../assets/css/variables";
h2{
  font-size: 20px;
  font-weight: 600;
  margin-bottom: 30px;
}
input {
  margin-bottom: 5px;
  width: 300px;
}
button{
  margin-top: 20px;
}
#loginForm {
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
}
</style>