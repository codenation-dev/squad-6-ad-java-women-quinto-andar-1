<template>
  <nav id="nav">
    <span class="welcome">
      Bem-vindo!
      <br />Seu token é:
      <span class="token">{{loggedUser.token}}</span>
    </span>
    <div class="user">
      <a href="#" @click.prevent="logout()">Logout</a>
      <img class="profile" src="../assets/logo.png" />
    </div>
  </nav>
</template>

<script>
export default {
  data() {
    return {
      loggedUser: {
        email: null,
        token: null
      }
    };
  },
  mounted() {
    (this.loggedUser.email = window.localStorage.getItem("user:email")),
      (this.loggedUser.token = window.localStorage.getItem("user:token"));
  },
  methods: {
    logout() {
      window.localStorage.clear();
      this.$router.push("/");
    }
  }
};
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
  text-align: left;
  line-height: 20px;
  @media screen and (max-width: $breakMedium) {
    flex-direction: column;
    .user {
      width: 100%;
      display: flex;
      align-items: center;
      flex-direction: row-reverse;
      justify-content: center;
      img {
        margin-right: 10px;
      }
    }

    .welcome {
      text-align: center;
      margin-bottom: 10px;
    }
    .token {
      white-space: nowrap;
      text-overflow: ellipsis;
      overflow: hidden;
    }
  }

  .token {
    font-size: 14px;
  }

  a {
    text-decoration: none;
    color: $textColor;
    margin-right: 15px;
    &:visited {
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