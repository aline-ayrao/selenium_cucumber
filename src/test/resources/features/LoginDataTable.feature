#language:pt
  Funcionalidade: Teste login BugBank
    Cenario: Login com sucesso
      Dado esteja na pagina inicial: "http://localhost:3000"
      E preencho o cadastro com os dados
        |Email          |Nome       |Senha    |Confirmacao|
        |teste@teste.com|Tst Qa     |testetst |testetst   |
        |qa@teste.com   |Tts Qa     |teste123 |teste123   |
        |junit@teste.com|Teste Tst  |teste333 |teste333   |

      Quando preencher email: "teste@teste.com.br" e senha: "teste"
      E clicar em fazer login
      Entao valido que a pagina de boas vindas foi carregada com sucesso
