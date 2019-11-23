<template>
  <div class="home fullscreen">
    <img src="../assets/logo.png" />
    <h2>Para começar, faça o login :)</h2>
    <form id="loginForm" @submit.prevent="login()">
      <input type="text" name="email" placeholder="youremail@yoursite.com" v-model="user.email" />
      <input type="password" name="password" placeholder="senha" v-model="user.password" />
      <button type="submit">Entrar</button>
    </form>
  </div>
</template>

<script>
// @ is an alias to /src
import apiService from './../services/apiService'

export default {
  data(){
    return{
      user: {
        email: "",
        password:"",
      },
      loggedUser: false,
    }
  }, 
  name: "home",
  methods: {
    async login(){
      let email = this.user.email;
      let password = this.user.password;
      console.log(email, password);
      this.loggedUser = await apiService.login(email, password);
      console.log(this.loggedUser);
      if (this.loggedUser.status == 'OK') {
        console.log(this.loggedUser);
        this.$router.push('dashboard');
        window.localStorage.setItem('user:token', this.loggedUser.token);
      } else {
        console.log("não rolou")
      }
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