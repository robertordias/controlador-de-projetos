# Controlador de Projetos

Controlador de Projetos utilizando Maven, Java 8 e Spring Boot (v1.4.3).

Para fazer a criação de novo membro, precisa enviar uma requisição para a request abaixo (POST):

http://localhost:8080/membros

Com o corpo em formato JSON:

{
    "nome": "Nome Escolhido",
    "atribuicao" : "F"
}

Atribuição "F" para Funcionário e "G" para Gerente, qualquer atribuição diferente será inválida.