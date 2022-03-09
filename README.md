# dsmovie-FullStack

Introdução: Esse aplicativo foi feito utilizando as IDEs VSCode para o frontend e IntelliJ Comunity para o Backend,
em meus projetos eu tenho preferência por utilizar o MYSql como SGBD, mas como uparei esse projeto pelo Heroku, utilizarei o 
postgrees que pode ser upado de forma free. Quero deixar claro que essa produção não é de direito autoral meu, eu sou apenas um 
DEV Júnior que concluiu com sucesso o curso "Semana Spring React - Trilha Profissionalizante" do canal DevSuperior.
Posteriormente, pretendo fazer esse mesmo codigo, com o diferencial que trocarei o frontend de React para Angular9

instalações utilizadas nesse projeto 
{
JDK 15
Postman
Postgresql 12
pgAdmin
Heroku CLI
NodeJS 16
VSCode (frontend)
IntelliJ (backend)
Git
}


********************************************INICIO DO EPISODIO 1********************************************
(Criação do front e backend, Linkando com o Github, Subindo o front com yarn, Add bootstrap e css, ) 


yarn create react-app frontend --template typescript (cria o projeto chamado frontend utilizando typescript)

delete a pasta .git na pasta frontend

yarn start (frontend) (esse comando faz o projeto executar)

crie um projeto no spring initializer e cole no backend 
dependencias{
Web
JPA
H2
Postgres
Security
}

após configurar as dependencias do backend

---LINKANDO COM O GITHUB---

git init (para criar o repositorio gi no pc (pasta do projeto))
git add . (adiciona os arquivos na area de stading)
git commit -m "Projeto criado e pronto para codar" (da um comit master com esse "nome")
git branch -M main (cria branch main (boa pratica))
git remote add origin git@github.com:.......  (associei o projeto local, com o meu projeto remoto do github)
git push -u origin main (envia para o git hub) 

---sempre que for commitar---
git add .
git commit -m "commit"
git push


 

--------------------------------------------FRONT-END--------------------------------------------

deixe apenas os files (public{index.html} src{App.tsx, index.css, index.tsx e react-app}
o restante pode apagar desses packeges (public e src). Faça as auterações nescessarias e suba a aplicação
com "yarn start".

---Adicionando BootStrap e CSS ao projeto---
(bootstrap é um framework de css que uma boa estrutura já pronta que ejudará a montar um layout mais facilmente)

yarn add bootstrap@5.1.3 (frontend) (adiciona o bootstrap)


---ROTAS---
yarn add react-router-dom@6.2.1 @types/react-router-dom@5.3.2
  


