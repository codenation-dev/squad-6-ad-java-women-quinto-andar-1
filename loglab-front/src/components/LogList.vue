<template>
  <div id="loglist">
    <div class="title d-flex align-items-center default-padding">
      <div class="w-10">
        <input type="checkbox" />
      </div>
      <div class="w-25">Level</div>
      <div class="w-50">Log</div>
      <div class="w-25">Frequência</div>
    </div>
  <div
      class="log default-padding d-flex align-items-center justify-content-center"
      @click="logPage(log.id)"
      :key="log.id"
      v-for="log in logs"
    >
     <div class="w-10">
        <input type="checkbox" />
      </div>
      <div class="w-25 d-flex align-items-center justify-content-center">
        <div class="badge">{{log.level}}</div>
      </div>
      <div class="w-50 description">{{log.details}}</div>
      <div class="w-25">{{log.quantity}}</div>
  </div>
      
    </div>
   
</template>

<script>
import apiService from './../services/apiService'

export default {
  data() {
    return {
      logs: [],
      loggedUser: null,
    };
  },
  mounted() {
   this.load();
  },
  methods: {
    async load() {
      this.logs = await apiService.getLogs();
    },
    logPage(id) {
      this.$router.push(`/log/${id}`);
    },
  }
};
</script>

<style lang="scss">
@import "../assets/css/components";
@import "../assets/css/variables";

#loglist {
  width: 100%;
  .title {
    border-bottom: 1px solid $primaryGray;
  }
  .title,
  .log {
    
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
      transition: all 0.25s ease-in-out;
    }
    .description {
      font-size: 14px;
      line-height: 18px;
    }
  }
  .log {
    border-bottom: 1px solid $secondaryGray;
    cursor: pointer;
    transition: all 0.25s ease-in-out;
    &:hover{
      color: $primaryColor;
      border-bottom: 1px solid $primaryColor;
      transition: all 0.25s ease-in-out;
      .badge{
        background: $primaryColor;
        transition: all 0.25s ease-in-out;
      }
    }
  }
  input {
    margin: 0;
  }
}
</style>
