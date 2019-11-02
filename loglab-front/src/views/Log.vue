<template>
  <div id="logInfo" class="default-padding">
    <div id="options" class="d-flex align-items-center justify-content-left">
      <button @click="back()">Voltar</button>
    </div>
    <div id="logInfo">
      <div class="title w-100">
        <h2>Log Número 1</h2>
      </div>
      <div class="about d-flex justify-content-space-between">
        <div class="details w-50 text-align-left">
          <h3>Título</h3>
          <p>Log Número 1</p>

          <h3>Detalhes</h3>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis ac placerat dui, sed eleifend metus. Sed tempor consequat ante sed tempor. Cras porta, massa quis convallis fringilla, nunc mi luctus ipsum, a efficitur ipsum orci ut dolor. Nam facilisis ornare justo. Sed consequat ut sem eget rutrum. Proin a elementum ex. Quisque fermentum, metus in viverra convallis, leo sapien lobortis felis, in convallis felis nisl at nulla. Pellentesque viverra magna vitae odio ultrices vulputate. Nullam ullamcorper ipsum tortor, a ultricies risus aliquet vel. Maecenas sodales, tellus vitae facilisis sollicitudin, tortor turpis tincidunt ex, at malesuada enim magna in massa.</p>
        </div>

        <div class="more w-25">
          <span class="badge">Desenvolvimento</span>
          <h3>Eventos</h3>
          <p>10</p>

          <h3>Coletado por</h3>
          <p>1234</p>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
// @ is an alias to /src
export default {
  name: "home",
  methods: {
    back() {
      window.location.assign("/#/dashboard");
    },
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