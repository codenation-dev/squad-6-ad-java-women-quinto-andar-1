<template>
  <div id="dashboard">
    <navbar />
    <LogList ></LogList>
  </div>
</template>

<script>
// @ is an alias to /src
import Navbar from "@/components/Navbar.vue";
import SearchFilter from "@/components/Filter.vue";
import LogList from "@/components/LogList.vue";
import apiService from './../services/apiService'

export default {
  name: "home",
  data() {
    return {
      loggedUser: null,
    }
  },
  components: {
    Navbar,
    SearchFilter,
    LogList
  },
  methods: {
    setLogsToArchive(values) {
      console.log(values);
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

</style>