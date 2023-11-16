# LAB_3---POO-2023
# Projeto Corpos Celestes do Sistema Solar

## Sobre o Projeto

O projeto "Corpos Celestes do Sistema Solar" é uma aplicação Java desenvolvida como parte do curso de Programação Orientada a Objetos na Universidade São Francisco. 
A aplicação visa fornecer informações detalhadas sobre os corpos celestes do Sistema Solar, promovendo o conhecimento científico e educacional no Brasil.

### Principais Recursos

- Cadastro, leitura, atualização e exclusão de informações sobre corpos celestes.
- Apresentação de informações detalhadas sobre cada corpo celeste.
- Interface amigável e intuitiva para facilitar a navegação.

## Nome dos Desenvolvedores e RA

- André Silveira Franco (RA: 202103306)
- Felipe Pereira de Brito (RA: 202102000)

## Tecnologia Empregada

- Linguagem de Programação: Java
- Framework: Spring Boot
- Banco de Dados: SQL (utilizando Hibernate para mapeamento objeto-relacional)
- Ferramentas de Build: Maven

## Razão da escolha
- Java é escolhido devido à sua robustez e ampla adoção na comunidade de desenvolvimento.
- Spring Boot simplifica o desenvolvimento e configuração, acelerando o processo.
- O uso do Hibernate facilita a integração com o banco de dados relacional.

## Descrição da Arquitetura

A arquitetura da aplicação segue os princípios da Programação Orientada a Objetos, com a separação clara de responsabilidades em classes e módulos. As principais classes incluem:
- `CorpoCeleste`: Representa um corpo celeste com atributos como nome, tipo, tamanho, etc.
- `CorpoCelesteService`: Contém a lógica de negócios para manipulação de corpos celestes.
- `CorpoCelesteController`: Controla as requisições HTTP e interage com o serviço.

## Funcionalidade

#### A terminar

### Operações CRUD

1. **Create (Criação):**
   - Endpoint para adicionar um novo corpo celeste com informações completas.

2. **Read (Leitura):**
   - Endpoint para recuperar informações de todos os corpos celestes.
   - Endpoint para obter detalhes de um corpo celeste específico.

3. **Update (Atualização):**
   - Endpoint para modificar informações de um corpo celeste existente.

4. **Delete (Exclusão):**
   - Endpoint para excluir um corpo celeste do sistema.
