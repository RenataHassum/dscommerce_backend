### Renata Hassum - [Linkedin](https://www.linkedin.com/in/renataviottohassumdev) | renatahassum@gmail.com

# Sobre o projeto DSCommerce [![NPM](https://img.shields.io/npm/l/react)](https://github.com/RenataHassum/dscommerce_backend/blob/main/LICENSE)

DS Commerce é um projeto full stack que combina um backend desenvolvido com Spring Boot para o gerenciamento de um catálogo online, área administrativa e carrinho de compras. A API RESTful do projeto é devidamente documentada e visualizada através do Swagger.
O projeto adota as melhores práticas e inclui funcionalidades completas de autenticação, autorização e CRUD. Além disso, possibilita o controle de acesso personalizado com base no perfil do usuário cadastrado e oferece consultas customizadas de produtos.
#### Para uma experiência interativa, o frontend está disponível em:
[GitHub Frontend](https://github.com/RenataHassum/dscommerce_react) | [Figma Frontend](https://www.figma.com/file/ZrGNVNG0kZL6txDv4G8P6s/DSCommerce?type=design&node-id=0-1&t=9oVgHod4bdzmveLf-0)

#### Acesse o site [RHCommerce](https://rhcommerce.vercel.app/)
- Login: alex@gmail.com
- Senha: 123456
- Com esse login, você terá acesso à área do cliente, onde poderá navegar, comprar, adicionar itens ao carrinho e finalizar pedidos. Além disso, você também terá acesso à área administrativa, onde poderá gerenciar produtos e realizar ações como criação, inserção, edição e exclusão de produtos.

Este projeto foi desenvolvido como trabalho de conclusão de curso na instituição de ensino <a href="https://devsuperior.com.br/cursos"><img align="center" height="16" alt="DevSuperior" src="https://devsuperior.com.br/_next/static/images/logo-white-10059e26f600604a7b5bd7782ed7550c.svg"></a> - Formação Desenvolvedor Moderno.

# Teste as requisições no Postman Collection
#### Projeto disponível na plataforma de hospedagem Railway - Requisições automáticas prontas para uso, sem necessidade de clonar o projeto
#### Siga o passo a passo:
1) Clique no botão "Run in Postman"
2) Acesse a opção "View collection"
3) Teste as requisições conforme orientações abaixo
   
      [![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/22138191-b4f3d92a-d854-40e7-b69e-524a58fd8f89?action=collection%2Ffork&source=rip_markdown&collection-url=entityId%3D22138191-b4f3d92a-d854-40e7-b69e-524a58fd8f89%26entityType%3Dcollection%26workspaceId%3D0f2a5db9-d3fe-4e18-8d9f-7a08117770cb#?env%5Bfdm-DSCommerce%5D=W3sia2V5IjoiaG9zdCIsInZhbHVlIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwIiwiZW5hYmxlZCI6dHJ1ZSwidHlwZSI6ImRlZmF1bHQifSx7ImtleSI6ImNsaWVudC1pZCIsInZhbHVlIjoibXljbGllbnRpZCIsImVuYWJsZWQiOnRydWUsInR5cGUiOiJkZWZhdWx0In0seyJrZXkiOiJjbGllbnQtc2VjcmV0IiwidmFsdWUiOiJteWNsaWVudHNlY3JldCIsImVuYWJsZWQiOnRydWUsInR5cGUiOiJkZWZhdWx0In0seyJrZXkiOiJ1c2VybmFtZSIsInZhbHVlIjoiYWxleEBnbWFpbC5jb20iLCJlbmFibGVkIjp0cnVlLCJ0eXBlIjoiZGVmYXVsdCJ9LHsia2V5IjoicGFzc3dvcmQiLCJ2YWx1ZSI6IjEyMzQ1NiIsImVuYWJsZWQiOnRydWUsInR5cGUiOiJkZWZhdWx0In0seyJrZXkiOiJ0b2tlbiIsInZhbHVlIjoiIiwiZW5hYmxlZCI6dHJ1ZSwidHlwZSI6ImRlZmF1bHQifSx7ImtleSI6InJlZnJlc2hfdG9rZW4iLCJ2YWx1ZSI6IiIsImVuYWJsZWQiOnRydWUsInR5cGUiOiJhbnkifV0=)

## Login endpoints
#### Escolha o ambiente do projeto: "dsCommerce" (lembre-se de substituir os emails para login)

`POST` Permite efetuar o login de um usuário. Utilize as seguintes credenciais para teste:
- alex@gmail.com
  - Funções: "ROLE_ADMIN"
  - Acesso: Liberado 
  
- maria@gmail.com
  - Funções: "ROLE_CLIENT"
  - Acesso: Restrito

## Order endpoints
`GET by ID`
- Liberado para o próprio usuário com função "ROLE_CLIENT" e para "ROLE_ADMIN" com acesso adicional
- Permite obter informações sobre um pedido por ID

`POST Create Order`
- Liberado para o próprio usuário com função "ROLE_CLIENT"
- Permite que um usuário logado crie um novo pedido

## Product / Category endpoints
`GET List / by ID`
- Liberado para todos os usuários, incluindo aqueles que não estão autenticados
- Permite obter informações sobre produtos/categorias

`POST Create / PUT Update / DELETE Delete`
- Restrito a usuários com função "ROLE_CLIENT"
- Liberado para usuários com função "ROLE_ADMIN"
- Permitem criar, atualizar e excluir produtos/categorias

## User endpoints
`GET Logged-in User`
- Liberado para usuário logado com função "ROLE_CLIENT"
- Permite visualizar informações pessoais do usuário logado, sem informar o ID

# Tecnologias | Implantação em produção
- Java, Spring Boot, Spring Cloud, Spring Security, Validation, OAuth2, JWT, API REST, JPA, Hibernate, Maven, H2 Database, PostgreSQL, ORM, Git
- Implantação backend: Railway
- Implantação banco de dados: Postgresql

# Técnicas | Competências
- Programação Orientada a Objetos (POO) e Seed de Banco de Dados: Permite o desenvolvimento eficiente de um sistema orientado a objetos e a criação de um modelo conceitual representando entidades e relacionamentos.
- Arquitetura em Camadas: Utiliza uma estrutura organizada em camadas, proporcionando separação clara de responsabilidades e facilitando a manutenibilidade do sistema.
- Web Services RESTful: Implementa web services RESTful, seguindo o padrão DTO para transferência de dados.
- Operações CRUD completas: Realiza as operações completas de Criar, Ler, Atualizar, Excluir e Procurar.
- Tratamento de Exceções: Implementa mecanismos de tratamento de exceções, garantindo mensagens de erro claras para os usuários.
- Paginação de Dados: Implementa técnicas de paginação para otimizar o desempenho e viabilizar a navegação eficiente em conjuntos de dados extensos.
- Validação de Dados: Realiza validação de dados utilizando o Bean Validation para garantir conformidade com os requisitos especificados.
- Autenticação e Autorização: Implementa OAuth2 e JWT para autenticação e autorização segura dos usuários.
- Password Token: Implementa o uso de tokens para garantir a segurança na redefinição de senhas e manter a autenticação contínua dos usuários.
- Autorizações Personalizadas: Realiza pré-autorização de métodos sensíveis, restringindo o acesso apenas a usuários autorizados.
- Consultas ao Banco de Dados com JPQL: Realiza consultas ao banco de dados utilizando a linguagem de consulta JPQL.

## Modelo conceitual
![Modelo Conceitual](https://github.com/RenataHassum/assets/blob/main/dscommerce_assets/modelo_conceitual.png?raw=true)

## Padrão camadas
![Padrão camadas](https://github.com/RenataHassum/assets/blob/main/padrao_camadas.jpg?raw=true)

# Agradecimentos
<a href="https://devsuperior.com.br/cursos"><img align="center" height="16" alt="DevSuperior" src="https://devsuperior.com.br/_next/static/images/logo-white-10059e26f600604a7b5bd7782ed7550c.svg"></a> - Professor Nélio Alves

# Autora
### Renata Hassum - [Linkedin](https://www.linkedin.com/in/renataviottohassumdev) | renatahassum@gmail.com
Fico à disposição para qualquer esclarecimento, não hesite em me contatar
