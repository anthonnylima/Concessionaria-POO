# 🚗 Sistema de Concessionária em Java

## 📖 Sobre o Projeto

Este projeto foi desenvolvido com o objetivo de aplicar conceitos de **Programação Orientada a Objetos (POO)** utilizando a linguagem Java.

O sistema simula o gerenciamento básico de uma concessionária, permitindo o cadastro, listagem, busca e remoção de veículos através de um menu interativo executado no terminal.

---

## 🛠️ Tecnologias Utilizadas

* Java
* Eclipse IDE
* Programação Orientada a Objetos (POO)
* ArrayList

---

## 📂 Estrutura do Projeto

### Classe `Carro`

Responsável por representar um veículo da concessionária.

#### Atributos

* Modelo
* Marca
* Ano
* Valor
* Placa
* Tipo

#### Métodos

* Construtor para inicialização dos dados.
* `toString()` para exibição das informações do veículo.

---

### Classe `Concessionaria`

Responsável pelo gerenciamento dos carros cadastrados.

#### Funcionalidades

* Adicionar carro
* Listar carros cadastrados
* Buscar carro por placa
* Remover carro por placa
* Impedir cadastro de placas duplicadas

---

### Classe `Main`

Responsável pela interação com o usuário através de um menu no console.

#### Opções disponíveis

1. Adicionar carro
2. Listar carros
3. Buscar carro por placa
4. Remover carro por placa
5. Sair do sistema

---

## ▶️ Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/anthonnylima/Concessionaria-POO.git
```

2. Abra o projeto no Eclipse.

3. Execute a classe:

```java
Main.java
```

4. Utilize o menu exibido no terminal.

---

## 💻 Exemplo de Uso

```text
===== CONCESSIONÁRIA =====
1 - Adicionar carro
2 - Listar carros
3 - Buscar por placa
4 - Remover por placa
0 - Sair

Escolha uma opção: 1

Modelo: Civic
Marca: Honda
Ano: 2022
Valor: 120000
Placa: ABC1234
Tipo: Sedan

Carro adicionado com sucesso!
```

---

## 📚 Conceitos Aplicados

* Classes e Objetos
* Encapsulamento
* Construtores
* Sobrescrita de métodos (`toString`)
* Estruturas de repetição
* Estruturas condicionais
* Coleções (`ArrayList`)
* Manipulação de Strings
* Entrada de dados com `Scanner`

---

## 🚀 Melhorias Futuras

* Cadastro de vendedores
* Cadastro de clientes
* Registro de vendas
* Persistência de dados em arquivos
* Interface gráfica
* Banco de dados

---

## 👨‍💻 Autor

**Anthonny de Lima Lucena**

* Curso: Ciência da Computação
* GitHub: https://github.com/anthonnylima
