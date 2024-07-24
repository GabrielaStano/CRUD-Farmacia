CRUD-Farmacia

Este repositório contém um projeto desenvolvido como parte do curso da Generation Brasil, que implementa um sistema de gerenciamento de farmácias utilizando operações CRUD (Create, Read, Update, Delete) para os recursos Categoria e Produto.

Funcionalidades

- <b>Categorias</b>: Permite criar, listar, atualizar e deletar categorias de produtos.
- <b>Produtos</b>: Permite criar, listar, atualizar e deletar produtos, associados às suas respectivas categorias.

Tecnologias Utilizadas

- <b>Java</b>: Linguagem de programação principal utilizada no projeto.
- <b>Spring Boot</b>: Framework para construção de aplicações Java.
- <b>Spring Security</b>: Para implementação da segurança e autenticação.
- <b>JWT (JSON Web Token)</b>: Para autenticação baseada em tokens.
- <b>MySQL</b>: Banco de dados utilizado para armazenar informações.
- <b>JUnit</b>: Framework para testes unitários.
- <b>Swagger</b>: Ferramenta para documentação da API.

Configuração do Projeto

Pré-requisitos

- **Java 8** instalado.
- **PostgreSQL** configurado e rodando.

Passos para Configuração

1. Clone o Repositório

   ```
   bash
   git clone https://github.com/seu-usuario/CRUD-Farmacia.git
   cd CRUD-Farmacia
   ```

2. Configuração do Banco de Dados

   Configure o arquivo `application.properties` com as informações do seu banco de dados PostgreSQL.

   ```
   properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/farmacia
   spring.datasource.username=seu-usuario
   spring.datasource.password=sua-senha
   spring.jpa.hibernate.ddl-auto=update
   ```

3. Compilar e Executar a Aplicação

   ```
   bash
   mvn clean install
   mvn spring-boot:run
   ```

### Endpoints Principais

#### Categoria

- GET /categorias**: Retorna todas as categorias.
- GET /categorias/{id}**: Retorna uma categoria específica por ID.
- POST /categorias**: Cria uma nova categoria.
- PUT /categorias**: Atualiza uma categoria existente.
- DELETE /categorias/{id}**: Deleta uma categoria por ID.

#### Produto

- GET /produtos**: Retorna todos os produtos.
- GET /produtos/{id}**: Retorna um produto específico por ID.
- POST /produtos**: Cria um novo produto.
- PUT /produtos**: Atualiza um produto existente.
- DELETE /produtos/{id}**: Deleta um produto por ID.

Estrutura do projeto

CRUD-Farmacia/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── seuusuario/
│   │   │           └── crudfarmacia/
│   │   │               ├── CrudFarmaciaApplication.java
│   │   │               ├── controller/
│   │   │               │   ├── CategoriaController.java
│   │   │               │   └── ProdutoController.java
│   │   │               ├── model/
│   │   │               │   ├── Categoria.java
│   │   │               │   └── Produto.java
│   │   │               ├── repository/
│   │   │               │   ├── CategoriaRepository.java
│   │   │               │   └── ProdutoRepository.java
│   │   │               └── service/
│   │   │                   ├── CategoriaService.java
│   │   │                   └── ProdutoService.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
│   │       └── templates/
│   └── test/
│       └── java/
│           └── com/
│               └── seuusuario/
│                   └── crudfarmacia/
│                       ├── CategoriaControllerTests.java
│                       └── ProdutoControllerTests.java
├── .gitignore
├── pom.xml
└── README.md


Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e enviar pull requests.

Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

Contato

Para mais informações, entre em contato através do [email] gabrielastano.f@gmail.com.
