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
        <div class="badge">{{log.environment}}</div>
      </div>
      <div class="w-50 description">{{log.description}}</div>
      <div class="w-25">{{log.frequency}}</div>
    </div>
  </div>
</template>

<script>
import apiService from './../services/apiService'

export default {
  data() {
    return {
      logs: [
        {
          id: 1,
          title: "Log Número 1",
          environment: "Produção",
          description:
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis ac placerat dui, sed eleifend metus. Sed tempor consequat ante sed tempor. Cras porta, massa quis convallis fringilla, nunc mi luctus ipsum, a efficitur ipsum orci ut dolor. Nam facilisis ornare justo. Sed consequat ut sem eget rutrum. Proin a elementum ex. Quisque fermentum, metus in viverra convallis, leo sapien lobortis felis, in convallis felis nisl at nulla. Pellentesque viverra magna vitae odio ultrices vulputate. Nullam ullamcorper ipsum tortor, a ultricies risus aliquet vel. Maecenas sodales, tellus vitae facilisis sollicitudin, tortor turpis tincidunt ex, at malesuada enim magna in massa.",
          frequency: 10
        },
        {
          id: 2,
          title: "Log Número 2",
          environment: "Homologação",
          description:
            "Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. In massa sapien, tempor eget fringilla sit amet, ullamcorper nec mi. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Phasellus id urna ornare, iaculis urna in, placerat erat. Sed felis quam, mattis a tortor id, egestas aliquam leo. Maecenas ullamcorper pharetra pellentesque. Integer bibendum, massa sed egestas egestas, orci ligula consequat nulla, luctus vestibulum sem lacus sodales elit. Aenean id dictum enim. Sed elementum ligula sed vestibulum gravida. Nulla gravida ultrices euismod. Quisque sagittis at eros non suscipit. Sed lobortis vulputate bibendum. Ut nec tortor magna. Etiam lobortis fermentum sapien sit amet placerat. In at tortor tortor.",
          frequency: 100
        },
        {
          id: 3,
          title: "Log Número 3",
          environment: "Desenvolvimento",
          description:
            "Proin quis iaculis ex, et placerat ipsum. Praesent porta dolor a erat dapibus vestibulum. Aliquam erat volutpat. Quisque nec nulla nisi. Suspendisse tincidunt laoreet tincidunt. In egestas nunc enim, in gravida ipsum eleifend non. Nullam ligula est, malesuada eu aliquam porttitor, ultricies pretium arcu. Duis pharetra efficitur lacus, faucibus faucibus sapien condimentum non. Suspendisse dictum, tortor quis laoreet suscipit, eros augue tempor ligula, sed tempus velit ipsum in sem. Etiam elementum blandit magna et congue. Nulla et placerat velit, mollis pharetra turpis. Donec efficitur vel diam ac posuere. Proin id nibh non est euismod scelerisque eget ut dui. Maecenas a odio sed tortor mattis porttitor. Phasellus convallis massa odio, et aliquam mi congue vel.",
          frequency: 25
        }
      ]
    };
  },
  mounted() {
    apiService.orderByLevel('error');
  },
  methods: {
    logPage(id) {
      window.location.assign('/#/log');
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