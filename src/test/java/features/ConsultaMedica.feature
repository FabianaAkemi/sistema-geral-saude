Feature: Consulta médica
  Como usuário desejo realizar o cadastro e pesquisa de uma consulta médica

  Scenario: salvar consulta médica com sucesso
    Given eu estou na home do sistema
    And eu clicar no botão Cadastros
    And eu clicar no botão Cadastrar Consulta
    And eu digitar o nome do paciente
    And eu digitar o nome do medico
    And eu digitar a descrição da consulta
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Consulta salva com sucesso”

  Scenario: salvar consulta médica sem inserir nome do médico
    Given eu estou na home do sistema
    And eu clicar no botão Cadastros
    And eu clicar no botão Cadastrar Consulta
    And eu digitar o nome do paciente
    And eu digitar a descrição da consulta
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Favor preencher o campo médico” em forma de alert no topo da página

  Scenario: salvar consulta médica sem inserir nome do paciente
    Given eu estou na home do sistema
    And eu clicar no botão Cadastros
    And eu clicar no botão Cadastrar Consulta
    And eu digitar o nome do medico
    And eu digitar a descrição da consulta
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Favor preencher o campo paciente” em forma de alert no topo da página

  Scenario: salvar consulta médica sem inserir descrição
    Given eu estou na home do sistema
    And eu clicar no botão Cadastros
    And eu clicar no botão Cadastrar Consulta
    And eu digitar o nome do paciente
    And eu digitar o nome do medico
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Favor preencher o campo descrição da consulta” em forma de alert no topo da página
