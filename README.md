# 🚀 Java Spring Boot NoSQL API Boilerplate

## 📌 Sobre o Projeto
Este é um **boilerplate** para construção de APIs **NoSQL** utilizando **Java Spring Boot**. Ele fornece uma estrutura inicial organizada para facilitar o desenvolvimento, permitindo integração com bancos NoSQL, como **MongoDB**.  

O objetivo é servir como um ponto de partida para projetos que precisam de uma API flexível, escalável e de fácil manutenção.

## 🚀 Tecnologias Utilizadas
- **Java 21**
- **Spring Boot**
- **Spring Web**
- **Spring Data MongoDB** (ou outro banco NoSQL)
- **Lombok** (para reduzir código boilerplate)

## ⚙️ Estrutura do Projeto
```
📦 src/main/java/com/exemplo/api
 ┣ 📂 config        -> Configurações do banco e do ambiente
 ┣ 📂 controllers   -> Controladores da API (endpoints)
 ┣ 📂 models        -> Modelos de dados utilizados no banco
 ┣ 📂 repositories  -> Interfaces de acesso ao banco
 ┣ 📂 services      -> Regras de negócio e lógica da aplicação
 ┗ 📜 Application.java -> Classe principal do Spring Boot
```

## 🛠️ Configuração e Execução
1. **Clone o repositório**  
   ```sh
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio
   ```

2. **Configure o banco de dados**  
   O boilerplate está preparado para usar **MongoDB**. Caso necessário, altere a configuração no arquivo `application.properties`:
   ```properties
   spring.data.mongodb.uri=mongodb://localhost:27017/nome-do-banco
   ```

3. **Execute o projeto**  
   ```sh
   mvn spring-boot:run
   ```

4. **Testar a API**  
   Após a execução, a API estará rodando em:  
   ```
   http://localhost:8080
   ```

## 📄 Licença
Este projeto está sob a licença MIT.

---
🚀 **Boilerplate pronto para acelerar o desenvolvimento da sua API!**
