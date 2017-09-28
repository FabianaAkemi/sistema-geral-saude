Feature: Médicos
  Como usuário, desejo cadastrar e pesquisar médicos.

  Background:
    Given eu estou na home do sistema
    And eu clicar no botão Cadastros
    And eu clicar no botão Cadastrar MedicosThen eu devo visualizar a mensagem “Favor preencher o campo médico” em forma de alert no topo da página
    And eu estar na pagina de cadastro do medico

    Scenario: salvar medico com sucesso
      And eu digitar as informações de medico completas
        | nome |   CRM  |  especialidade | telefone |         email       |
        | fran | 000111 |     pediatra   | 32321111 | franteste@gmail.com |
      And eu clicar no botão Salvar
      Then eu devo visualizar a mensagem “Médico salvo com sucesso”

    Scenario: salvar medico sem inserir nome
      And eu digitar todas  as informacoes exceto nome
        |   CRM  |  especialidade | telefone |         email       |
        | 000111 |     pediatra   | 32321111 | franteste@gmail.com |
      And eu clicar no botão Salvar
      Then eu devo visualizar a mensagem “Favor preencher o campo nome” em forma de alert no topo da página

    Scenario: salvar medico sem inserir CRM
      And eu digitar todas  as informacoes exceto CRM
        | nome |  especialidade | telefone |         email       |
        | fran |     pediatra   | 32321111 | franteste@gmail.com |
      And eu clicar no botão Salvar
      Then eu devo visualizar a mensagem “Favor preencher o campo CRM” em forma de alert no topo da página

    Scenario: salvar medico sem inserir especialidade
      And eu digitar todas  as informacoes exceto especialidade
        | nome  |   CRM  | telefone |         email       |
        | fran  | 000111 | 32321111 | franteste@gmail.com |
      And eu clicar no botão Salvar
      Then eu devo visualizar a mensagem “Favor preencher o campo especialidade” em forma de alert no topo da página

    Scenario: salvar medico sem inserir telefone
      And eu digitar todas  as informacoes exceto telefone
        | nome  |   CRM  | especialidade |         email       |
        | fran  | 000111 |    pediatra   | franteste@gmail.com |
      And eu clicar no botão Salvar
      Then eu devo visualizar a mensagem “Favor preencher o campo telefone” em forma de alert no topo da página

    Scenario: salvar medico sem inserir email
      And eu digitar todas  as informacoes exceto email
        | nome |   CRM  |  especialidade | telefone |
        | fran | 000111 |     pediatra   | 32321111 |
      And eu clicar no botão Salvar
      Then eu devo visualizar a mensagem “Favor preencher o campo email” em forma de alert no topo da página

    Scenario: salvar medico sem preencher todos os campos obrigatórios
      And eu clicar no botao salvar
      Then eu devo visualizar a mensagem “Favor preencher o campo nome” em forma de alert no topo da página
      Then eu devo visualizar a mensagem “Favor preencher o campo CRM” em forma de alert no topo da página
      Then eu devo visualizar a mensagem “Favor preencher o campo especialidade” em forma de alert no topo da página
      Then eu devo visualizar a mensagem “Favor preencher o campo telefone” em forma de alert no topo da página
      Then eu devo visualizar a mensagem “Favor preencher o campo email” em forma de alert no topo da página

