# TrabalhoIndividualAPI

Vocês foram convidados para desenvolver um sistema de biblioteca e precisam criar uma entidade LIVRO contendo as informações, id, titulo, e quantidade de paginas. O titulo não pode ser vazio e nem passar os 40 caracteres. A quantidade de paginas não pode ficar sem preenchimento.

O livro também deve ter informações da PUBLICACAO contendo autor, data da publicacao, e editora. O autor não pode ser vazio e nem ultrapassar 25 caracteres.

Deve-se criar:
entidade
interface do repositorio
o controller contendo um CRUD (GET, POST, PUT, DELETE) do recurso (Inserir as anotações necessárias para que esta classe funcione como um controlador.)
Inserir as validações para tratamento dos campos obrigatórios na classe Livro (titulo, autor)
Inserir a classe de ControllerExceptionHandler e ErroResposta para tratamento das exceções

(usar o banco H2)

Dependencias:
spring-boot-starter-data-jpa
spring-boot-starter-web
spring-boot-devtools
h2
spring-boot-starter-validation

O desenvolver frontend informou que precisam ser criados os seguintes endpoints, e seus respectivos modelos de json que serão informados para o backend:
GET
localhost:8080/livros
localhost:8080/livros/<id>

POST
localhost:8080/livros
{
    "titulo": "...",
    "qtdPaginas": ...,
    "publicacao": {
        "autor": "...",
        "dataPublicacao": "yyyy-MM-dd",
        "editora": "..."
    }
}

PUT
localhost:8080/livros/<id>
{
    "titulo": "...",
    "qtdPaginas": ...,
    "publicacao": {
        "autor": "...",
        "dataPublicacao": "yyyy-MM-dd",
        "editora": "..."
    }
}

DELETE
localhost:8080/livros/<id>

O desenvolvedor frontend pediu para você realizar o tratamento dos erros também, pois ele precisa informar para o usuário da plataforma o que aconteceu de falha caso o mesmo não preencha algum dado obrigatório ou de forma correta.
