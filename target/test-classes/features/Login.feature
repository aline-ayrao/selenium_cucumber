#language:pt
  Funcionalidade: Teste login BugBank
    Cenario: Login com sucesso
      Dado esteja na pagina inicial: "http://localhost:3000"
      E possuo cadastro
      Quando preencher email: "teste@teste.com.br" e senha: "teste"
      E clicar em fazer login
      Entao valido que a pagina de boas vindas foi carregada com sucesso
