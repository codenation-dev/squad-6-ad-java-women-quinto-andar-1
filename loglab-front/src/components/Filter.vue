<template>
  <div id="filters">
    <select name="environment" id="env" @change="setFilter($event)">
      <option 
        v-for="env in envs" 
        :value="env.value" 
        :key="env.id">
          {{env.description}}
      </option>
    </select>

    <select name="order" id="orderLevelFrequency" @change="setFilter($event)">
      <option value selected>Ordenar Por</option>
      <option 
        v-for="order in orders" 
        :value="order.value" 
        :key="order.id">
          {{order.description}}
      </option>
    </select>

    <select name="search" id="env" @change="setFilter($event)">
      <option value selected>Buscar por</option>
      <option 
        v-for="search in search" 
        :value="search.value" 
        :key="search.id">
          {{search.description}}
      </option>
    </select>

    <input type="text" />
  </div>
</template>

<script>
export default {
  data() {
    return {
      envs: [
        {
          description: "Desenvolvimento",
          value: "desenvolvimento",
          id: 1
        },
        {
          description: "Produção",
          value: "producao",
          id: 2
        },
        {
          description: "Homologação",
          value: "homologacao",
          id: 3
        }
      ],
      orders: [
        {
          description: "Level",
          value: "level",
          id: 1
        },
        {
          description: "Frequência",
          value: "frequencia",
          id: 2
        }
      ],
      search: [
        {
          description: "Level",
          value: "level",
          id: 1
        },
        {
          description: "Descrição",
          value: "descricao",
          id: 2
        },
        {
          description: "Origem",
          value: "origem",
          id: 3
        }
      ]
    };
  },
  methods: {
    setFilter(event) {
      let value = event.target.value;
      this.$emit('change', value);
    }
  }
};
</script>

<style lang="scss">
@import "../assets/css/components";
@import "../assets/css/variables";

#filters {
  display: flex;
  flex-direction: row;
  align-items: center;
  padding: 10px 60px;
  box-sizing: border-box;
  background-color: $secondaryGray;

  @media screen and (max-width: $breakMedium) {
    flex-direction: column;
  }

  input,
  select {
    width: 25%;
    @media screen and (max-width: $breakMedium) {
      width: 100%;
      margin: 0 0 5px 0 !important;
    }
  }

  input {
    margin: 0;
  }

  select {
    border: 1px solid #ccc;
    background-color: white;
    padding: 8px;
    border-radius: 4px;
    margin-right: 5px;
  }
}
</style>