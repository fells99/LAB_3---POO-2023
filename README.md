<a name="readme-top"></a>
<div align="center">

# Corpos Celestes do Sistema Solar <br/> C.C.S.S

<br/>
      <img src="imagens/logo.jpg" alt="Logo" width="100" height="100">
  </a>
</div>
   
## Sobre o Projeto

O projeto "Corpos Celestes do Sistema Solar" é uma aplicação Java desenvolvida como parte do curso de Programação Orientada a Objetos na USF (Universidade São Francisco). Será utilizado principalmente o CRUD (Create, Read, Update, Delete). <br/>
A aplicação visa fornecer informações detalhadas sobre os corpos celestes do Sistema Solar, promovendo o conhecimento científico e educacional no Brasil.

<p align="right">(<a href="#readme-top">Voltar ao início</a>)</p>

### Principais Recursos

- Cadastro, leitura, atualização e exclusão de informações sobre corpos celestes.
- Apresentação de informações detalhadas sobre cada corpo celeste.
- Interface amigável e intuitiva para facilitar a navegação.

  <p align="right">(<a href="#readme-top">Voltar ao início</a>)</p>

## Nome dos Desenvolvedores e RA

- André Luis Silveira Franco (RA: 202103306)
- Felipe Pereira de Brito (RA: 202102000)

  <p align="right">(<a href="#readme-top">Voltar ao início</a>)</p>

## Tecnologia Empregada

- Linguagem de Programação: Java
- Framework: Spring Boot
- Banco de Dados: SQL
- Ferramentas de Build: Maven
- Editor: Visual Studio Code
- Tester: Insomnia

### Razão da escolha
- Java é escolhido devido à sua robustez e ampla adoção na comunidade de desenvolvimento.
- Spring Boot simplifica o desenvolvimento e configuração, acelerando o processo.
- SQL devido a sua integração com o Visual Studio, pois oferece suporte a Entity Framework para mapeamento objeto-relacional (ORM), facilitando a interação com o banco de dados.
- Insomnia foi utilizado pois permite enviar solicitações HTTP para testar endpoints de serviços web, assim nos ajudando a realizar os testes necessários na API do projeto CCSS.

<p align="right">(<a href="#readme-top">Voltar ao início</a>)</p>

## Descrição da Arquitetura

A arquitetura da aplicação segue os princípios da Programação Orientada a Objetos, com a separação clara de responsabilidades em classes e módulos. Abaixo será explicado sobre os pacotes:
- `Pacote com.example.corposcelestessistemasolar.repository`:

Neste pacote, há uma interface chamada `CorposCelestesrepository`, que estende JpaRepository do Spring Data JPA. Essa interface fornece métodos CRUD padrão, bem como um método personalizado findByTipo. Essa interface permite a interação com o banco de dados de maneira fácil e eficiente.
- `Pacote com.example.corposcelestessistemasolar.models`:

Este pacote contém a classe `CorposCelesteSistemaSolar`, que é uma entidade JPA (Java Persistence API) representando os corpos celestes no sistema solar. A classe é mapeada para a tabela `corpos_celestes` no banco de dados. As propriedades da classe correspondem às colunas da tabela.
- `Pacote com.example.corposcelestessistemasolar.controllers`:

Neste pacote, há um controlador chamado `CorpoCelesteController`, que é responsável por lidar com as requisições HTTP relacionadas aos corpos celestes. Ele usa a anotação `@RestController` para indicar que as funções neste controlador retornam dados diretamente em vez de renderizar visualizações. As operações básicas de CRUD (Create, Read, Update, Delete) são implementadas para manipular os recursos `CorposCelesteSistemaSolar`.
- `Pacote com.example.corposcelestessistemasolar`:

 Este pacote contém a classe principal `CorposcelestessistemasolarApplication`, que é a classe de inicialização da aplicação Spring Boot. Ela usa a anotação `@SpringBootApplication` para indicar que é uma aplicação Spring Boot.
SQL para a tabela `corpos_celestes`:
<br/>
Existe um script SQL que cria a tabela `corpos_celestes` no banco de dados. Essa tabela armazena informações sobre os corpos celestes, como nome, tipo, tamanho, distância do sol e elemento químico predominante.
- `Pacote test`:

Existe um `pacote test` com a classe `CorposcelestessistemasolarApplicationTests`. Esta classe contém um método de teste vazio (contextLoads()) que é executado durante o teste da aplicação. Essa classe é criada automaticamente pelo Spring Boot para garantir que a aplicação inicialize corretamente.

  <p align="right">(<a href="#readme-top">Voltar ao início</a>)</p>


