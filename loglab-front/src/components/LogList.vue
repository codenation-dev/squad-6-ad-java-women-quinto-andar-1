<template>
  <div id="loglist">
    <div class="title d-flex align-items-center default-padding">
      <div class="w-25">Level</div>
      <div class="w-75">Log</div>
      <div class="w-25">Frequência</div>
    </div>
    <div
      class="log default-padding d-flex align-items-center justify-content-center"
      @click="logPage(log.id)"
      :key="log.id"
      v-for="log in filteredLogs"
    >
     
      <div class="w-25 d-flex align-items-center justify-content-center">
        <div class="badge">{{log.level}}</div>
      </div>
      <div class="w-75 description">{{log.details}}</div>
      <div class="w-25">{{log.quantity}}</div>
    </div>
  </div>
</template>

<script>
import apiService from "./../services/apiService";

export default {
  data() {
    return {
      logs: [],
      filteredLogs: [],
      selectedLogs: [],
      loggedUser: null
    };
  },
  mounted() {
    this.load();
  },
  methods: {
    async load() {
      this.logs = await apiService.getLogs();
      this.populateFilteredLogs(this.logs);
    },
    populateFilteredLogs(logs) {
      for (let i = 0; i < logs.length; i++) {
        if (logs[i].filed == false) {
          this.filteredLogs.push(logs[i]);
        }
      }
    },
    logPage(id) {
      this.$router.push(`/log/${id}`);
    },
    async archiveLogs() {
      await apiService.archiveLogs(this.selectedLogs);
      console.log("arquivou");
    },
    showSelected() {
      console.log(this.selectedLogs);
    }
  }
};
</script>

<style lang="scss">
@import "../assets/css/components";
@import "../assets/css/variables";

#loglist {
  width: 100%;
  .title {
    background-color: $secondaryGray;
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
    &:hover {
      color: $primaryColor;
      border-bottom: 1px solid $primaryColor;
      transition: all 0.25s ease-in-out;
      .badge {
        background: $primaryColor;
        transition: all 0.25s ease-in-out;
      }
    }
  }
  #options {
    padding: 20px 60px !important;
    button {
      margin: 0 5px 0 0;
    }
  }
  input {
    margin: 0;
  }
}
</style>
