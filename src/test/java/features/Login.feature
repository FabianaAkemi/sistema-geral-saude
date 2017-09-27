Feature: Login
  Como usuário desejo realizar login no sistema de saúde.

  Scenario: realizar login com sucesso

    Given eu acessar a tela de login do sistema
    And eu digitar o e-mail do usuário corretamente
    And eu digitar a senha do usuário corretamente
    And eu clicar no botão Acessar
    Then eu devo ser direcionado para a home do sistema

  Scenario: realizar login com usuário incorreto

    Given eu acessar a tela de login do sistema
    And eu digitar o e-mail do usuário incorretamente
    And eu digitar a senha do usuário corretamente
    And eu clicar no botão Acessar
    Then eu devo visualizar a mensagem ”E-mail e/ou senha incorretos” em forma de alert acima do botão Acessar


  Scenario: realizar login com senha incorreta
    Given eu acessar a tela de login do sistema
    And eu digitar o e-mail do usuário corretamente
    And eu digitar a senha do usuário incorretamente
    And eu clicar no botão Acessar
    Then eu devo visualizar a mensagem ”E-mail e/ou senha incorretos” em forma de alert acima do botão Acessar


  Scenario: realizar login deixando o campo Email em branco
    Given eu acessar a tela de login do sistema
    And eu digitar a senha do usuário corretamente
    And eu clicar no botão Acessar
    Then eu devo visualizar a mensagem ”O campo e-mail é obrigatório” em forma de alert acima do botão Acessar


  Scenario: realizar login deixando o campo senha em branco
    Given eu acessar a tela de login do sistema
    And eu digitar o e-mail do usuário corretamente
    And eu clicar no botão Acessar
    Then eu devo visualizar a mensagem ”O campo senha é obrigatório” em forma de alert acima do botão Acessar


  Scenario: realizar login com e-mail inválido
    Given eu acessar a tela de login do sistema
    And eu digitar o e-mail do usuário com dados invalidos (sem o @ por exemplo)
    And eu clicar no botão Acessar
    Then eu devo visualizar a mensagem ”Email inválido” em forma de alert acima do botão Acessar (considerar mensagem padrão do thymeleaf)




