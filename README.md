# Sistema Automotivo – Gestão de Estoque de Veículos

## 📌 Sobre o Projeto
Este projeto visa desenvolver um sistema que permite o cadastro eficiente de veículos, organização de informações (como modelo, ano, marca e preço) e a gestão completa do estoque de uma concessionária. O sistema soluciona o problema de desorganização através de uma API REST que permite registrar, buscar, filtrar, atualizar e remover dados de forma ágil e segura.

## ⚙️ Funcionalidades Implementadas
* **Cadastro de Veículos:** Registro detalhado incluindo modelo, marca, ano de fabricação, cor, preço, quilometragem e status de disponibilidade.
* **Cadastro de Marcas e Modelos:** Registro de montadoras e linhas de veículos, associando-os diretamente aos carros no estoque.
* **Consulta e Filtros:** Busca avançada de veículos disponíveis por marca, modelo, preço, ano e status.
* **Atualização:** Edição rápida de informações rotineiras, como preço, quilometragem e disponibilidade.
* **Remoção:** Exclusão de veículos do banco de dados quando são vendidos ou descontinuados.

## 🛠️ Tecnologias Utilizadas
* **Backend:** Java com framework Spring Boot para a criação da API REST e operações CRUD.
* **Banco de Dados:** MySQL para a persistência de dados utilizando modelo físico relacional.
* **Arquitetura e Padrões:** Aplicação de conceitos fundamentais de Programação Orientada a Objetos (POO), incluindo classes, atributos, métodos, herança e encapsulamento.

## 🚀 Como Executar o Projeto
1. Clone este repositório na sua máquina local.
2. Configure as credenciais do banco de dados MySQL no arquivo `application.properties`.
3. Execute a aplicação via IDE (como IntelliJ IDEA).
4. Utilize uma ferramenta como o Postman para testar os endpoints da API REST (Criar, Ler, Atualizar e Deletar).
