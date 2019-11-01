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
#filters {
  display: flex;
  flex-direction: row;
  align-items: center;
  padding: 10px 60px;
  box-sizing: border-box;

}
</style>