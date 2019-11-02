<template>
  <div id="filters">
    <select name="environment" id="env">
      <option value="Desenvolvimento" disabled>Ambiente</option>
      <option value="Desenvolvimento">Desenvolvimento</option>
      <option value="Produção">Produção</option>
      <option value="Homologação">Homologação</option>
    </select>

    <select name="environment" id="env">
      <option value="Desenvolvimento" disabled>Ordenar por</option>
      <option value="Produção">Produção</option>
      <option value="Homologação">Homologação</option>
    </select>

    <select name="environment" id="env">
      <option value="Desenvolvimento" disabled>Buscar por</option>
      <option value="Produção">Produção</option>
      <option value="Homologação">Homologação</option>
    </select>

    <input type="text" />
  </div>
</template>


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