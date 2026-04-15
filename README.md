# 🏒 Stats Hockey API

Uma API RESTful desenvolvida em **Java** e **Spring Boot** para gerir equipas, jogadores e estatísticas de jogos de Hóquei em Patins.

Este projeto substitui uma antiga arquitetura de consola/JDBC por uma arquitetura moderna dividida em camadas (Controller, Service, Repository), utilizando Spring Data JPA para comunicação com a base de dados MySQL.

## 🚀 Tecnologias Utilizadas

* **Java 25** (ou a tua versão)
* **Spring Boot 3.x**
    * Spring Web (REST API)
    * Spring Data JPA (Hibernate)
* **MySQL** (Base de Dados Relacional)
* **Lombok** (Redução de código boilerplate)
* **Maven** (Gestão de dependências)

## ⚙️ Como Executar o Projeto

1. **Pré-requisitos:** Ter o MySQL instalado e a correr.
2. **Base de Dados:** Criar um schema no MySQL chamado `stats_hoquei`.
3. **Variáveis de Ambiente:** O projeto não contém passwords no código por motivos de segurança. Para correr, deves configurar as seguintes variáveis de ambiente no teu IDE ou sistema:
    * `DB_USER` (ex: root)
    * `DB_PASSWORD` (a tua password do MySQL)
4. Correr a classe `StatsHockeyApplication.java`. A API ficará disponível em `http://localhost:8080`.

## 📡 Endpoints Principais (API)

Aqui estão alguns dos comandos que podes testar usando o Postman:

### Equipas (`/equipas`)
* `GET /equipas` - Lista todas as equipas.
* `POST /equipas` - Cria uma nova equipa (Enviar JSON no Body).
* `DELETE /equipas/{nome}` - Remove uma equipa pelo nome.

### Jogadores (`/jogadores`)
* `GET /jogadores` - Lista todos os jogadores.
* `POST /jogadores` - Cria um novo jogador.
* `DELETE /jogadores/{id}` - Remove um jogador pelo seu ID automático.

### Jogos (`/jogos`)
* `GET /jogos` - Lista o histórico de jogos.
* `POST /jogos` - Regista um novo jogo e atualiza as estatísticas.