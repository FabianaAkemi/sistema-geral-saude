Feature: Consulta médica
  Como usuário desejo realizar o cadastro e pesquisa de uma consulta médica

  Background:
    Given eu estou na home do sistema
    And eu clicar no botão Cadastros
    And eu clicar no botão Cadastrar Consulta

  Scenario: salvar consulta médica com sucesso
    And eu digitar as informações completas
    | nomePaciente | nomeMedico |    descricao   |
    |     fran     |   joao     | consulta teste |
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Consulta salva com sucesso”


  Scenario: salvar consulta médica sem inserir nome do médico
    And eu digitar as informações sem nome do medico
      | nomePaciente |    descricao   |
      |     fran     | consulta teste |
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Favor preencher o campo médico” em forma de alert no topo da página

  Scenario: salvar consulta médica sem inserir nome do paciente
    And eu digitar as informações sem nome do paciente
      | nomeMedico |    descricao   |
      |   joao     | consulta teste |
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Favor preencher o campo paciente” em forma de alert no topo da página

  Scenario: salvar consulta médica sem inserir descrição
    And eu digitar as informações sem descricao
      | nomePaciente | nomeMedico |
      |     fran     |   joao     |
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Favor preencher o campo descrição da consulta” em forma de alert no topo da página
