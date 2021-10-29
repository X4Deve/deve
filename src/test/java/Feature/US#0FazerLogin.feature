#Language: en
Feature: Fazer Login com Sucesso

  @CT001 @ab
  Scenario: Validar login realizado com sucesso
    Given que o usuario acesse a tela de login
    When o usuario realizar login
    Then sera realizado o login bem sucedido

  @CT002 @ab
  Scenario: Validar acesso ao menu lateral
    Given que o usuario acesse a home da Swaglabs
    When o usuario acessar o menu lateral
    Then sera aberto o menu lateral

  @CT003 @ab
  Scenario: Validar filtro menor para maior
    Given que o usuario acesse a home da Swaglabs
    When o usuario filtrar menor para maior
    Then sera realizado filtro nos produtos

#para criação youtube