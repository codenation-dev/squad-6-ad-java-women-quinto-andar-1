<template>
  <div id="logInfo">
    <Navbar />
    <div class="default-padding">
      <div id="options" class="d-flex align-items-center justify-content-left">
        <button @click="back()">Voltar</button>
      </div>
      <div id="logInfo">
        <div class="title w-100">
          <h2>{{log.titleError}}</h2>
        </div>
        <div class="about d-flex justify-content-space-between">
          <div class="details w-50 text-align-left">
            <h3>Título</h3>
            <p>{{log.titleError}}</p>

            <h3>Detalhes</h3>
            <p>{{log.details}}</p>
          </div>

          <div class="more w-25">
            <span class="badge">{{log.environment}}</span>
            <h3>Eventos</h3>
            <p>{{log.quantity}}</p>

            <h3>Coletado por</h3>
            <p>{{log.user.sourceIp}}</p>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import Navbar from './../components/Navbar'
import apiService from './../services/apiService'

export default {
  name: "home",
  data(){
    return {
      log: null,
    }
  },
  components: {
    Navbar,
  },
  mounted(){
    this.loadLogData();
  },
  methods: {
    back() {
      window.location.assign("/#/dashboard");
    },
    async loadLogData(){
      this.log = await apiService.getLog(parseInt(this.$route.params.id));
    }
  }
};
</script>

<style lang="scss" scoped>
@import "../assets/css/components";
@import "../assets/css/variables";

#logInfo {
  h2 {
    font-size: 40px;
  }
  h3 {
    font-size: 20px;
    font-weight: 600;
  }
  p {
    margin: 10px 0;
    line-height: 20px;
  }
  .badge {
    background-color: $primaryGray;
    color: white;
    font-size: 14px;
    border-radius: 4px;
    padding: 4px;
    box-sizing: border-box;
    width: fit-content;
    text-transform: uppercase;
    font-weight: 600;
    margin: 10px auto;
    display: block;
  }
  #options {
    padding: 12px 0;
    button {
      margin: 0 5px 0 0;
    }
  }
}
</style>