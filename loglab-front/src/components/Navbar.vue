<template>
  <nav id="nav">
    <span>Bem-vindo, usuário. Seu token é: 1234</span>
    <div class="user">
      <a href="/">Logout</a>
      <img class="profile" src="../assets/logo.png" />
    </div>
  </nav>
</template>

<script>
export default {
  methods: {
    logout() {
      
    }
  }
}
</script>

<style lang="scss">
@import "../assets/css/variables";
#nav {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
  padding: 10px 60px;
  box-sizing: border-box;
  -webkit-box-shadow: 2px 2px 12px -5px rgba(0, 0, 0, 0.5);
  -moz-box-shadow: 2px 2px 12px -5px rgba(0, 0, 0, 0.5);
  box-shadow: 2px 2px 12px -5px rgba(0, 0, 0, 0.5);

  a {
    text-decoration: none;
    color: $textColor;
    margin-right: 15px;
    &:visited{
      color: $textColor;
    }
  }

  img {
    height: 60px;
    &.profile {
      border-radius: 50%;
      border: 3px solid $secondaryGray;
      cursor: pointer;
    }
  }
}
</style>