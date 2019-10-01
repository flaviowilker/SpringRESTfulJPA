# Spring RESTful JPA/Hibernate

WebService de exemplo para estudos.
 
Para iniciar o projeto deve ser adicionado em um servidor tomcat (7 ou 8).
  
# Tecnologias utilizadas:

  - Spring
  - JPA/Hibernate
  - Log4j
  - Jackson
  
# Exemplo de metodos HTTP para REST

| CRUD | HTTP | URL | Header | Body |
| ------ | ------ | ------ | ------ | ------ |
| Listar todos | GET | http://localhost:8080/springrestfuljpa/cursos | content-type: application/json;charset=UTF-8 |  |
| Listar um | GET | http://localhost:8080/springrestfuljpa/cursos/1 | content-type: application/json;charset=UTF-8 |  |
| Salvar | POST | http://localhost:8080/springrestfuljpa/cursos | content-type: application/json;charset=UTF-8 | { "titulo": "Teste",  "cargaHoraria": "20HS", "dataInicio": "07/02/2018" } |
| Alterar todo o objeto | PUT | http://localhost:8080/springrestfuljpa/cursos/1 | content-type: application/json;charset=UTF-8 | { "titulo": "Teste 123",  "cargaHoraria": "30HS", "dataInicio": "20/02/2018" } |
| Alterar um ou mais campos | PATCH | http://localhost:8080/springrestfuljpa/cursos/1 | content-type: application/json;charset=UTF-8 | { "dataInicio": "20/02/2018" } |
| Excluir | DELETE | http://localhost:8080/springrestfuljpa/cursos/1 | content-type: application/json;charset=UTF-8 |  |
