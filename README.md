# Sistema Acadêmico — Gestão de Disciplinas, Horários e Atividades

Sistema desktop desenvolvido em **Java (Swing)** com persistência em **PostgreSQL**, voltado para o aluno organizar sua vida acadêmica: disciplinas cursadas, professores, horários de aula, atividades/entregas e anotações de estudo.

Projeto desenvolvido para a disciplina de Banco de Dados, aplicando modelagem relacional, normalização e o padrão de arquitetura **DAO (Data Access Object)** com **VO (Value Object)** em Java.

## Funcionalidades

- **Cadastro e login de usuário** (aluno)
- **Cadastro de disciplinas**, com carga horária, sigla e professor responsável
- **Cadastro de professores** e informações de contato
- **Cadastro de horários de aula**, vinculando disciplina, dia da semana e hora de início/término
- **Cadastro de atividades**, com data, tipo (prova, trabalho, etc.), conteúdo e prazo de entrega
- **Cadastro de anotações** por disciplina, para registrar observações de estudo
- **Consultas** com visualização detalhada de horários, atividades e anotações cadastradas

## Arquitetura

O projeto segue o padrão **DAO + VO**, separando claramente:

- **`vo/`** — Value Objects: representam as entidades do domínio (`UsuarioVO`, `DisciplinaVO`, `ProfessorVO`, `AtividadeVO`, `AnotacaoVO`, `HorarioVO`, `DiaVO`, `HoraVO`, `DisciplinaDiaVO`, `TipoAtividadeVO`).
- **`persistencia/`** — DAOs: responsáveis pelas operações de CRUD (criar, ler, atualizar, excluir) de cada entidade no banco de dados.
- **`visao/`** — Telas Swing (`Login`, `Principal`, telas de `Cadastro*` e `Consulta*`) responsáveis pela interface gráfica.
- **`ConexaoBD/`** — Classe utilitária de conexão com o banco PostgreSQL via JDBC.

## Modelo de dados

O sistema gira em torno das seguintes entidades principais e seus relacionamentos:

- **Usuário (Aluno)** → possui disciplinas, atividades e anotações
- **Disciplina** → vinculada a um professor e a um ou mais horários (dia + hora)
- **Professor** → ministra disciplinas
- **Horário** → relaciona disciplina, dia da semana e hora de início/término
- **Atividade** → vinculada a uma disciplina, com tipo, conteúdo e data de entrega
- **Anotação** → vinculada a uma disciplina, com data e conteúdo da anotação

## Tecnologias utilizadas

- **Java** (Swing para interface gráfica desktop)
- **PostgreSQL** — banco de dados relacional
- **JDBC** — conexão Java–PostgreSQL (driver `postgresql-9.4.1209.jar`)
- **JCalendar** — componente de seleção de datas na interface
- **NetBeans / Ant** — build do projeto

## Estrutura do projeto

```
BancoDados_Sis_academico/
├── src/
│   ├── ConexaoBD/
│   │   └── ConexaoBD.java          # Conexão JDBC com PostgreSQL
│   ├── vo/                         # Value Objects (entidades)
│   ├── persistencia/                # DAOs (acesso a dados / CRUD)
│   └── visao/                       # Telas Swing (Login, Cadastros, Consultas)
├── dist/
│   ├── ProjetoBD.jar                # Executável do sistema
│   └── lib/                         # Dependências (PostgreSQL driver, JCalendar)
└── build.xml
```

## Como executar

**Pré-requisitos:**
- Java JDK instalado
- PostgreSQL instalado e em execução

**1. Configure o banco de dados**

Crie um banco chamado `ProjetoBD2` no PostgreSQL com as tabelas correspondentes às entidades listadas em [Modelo de dados](#modelo-de-dados) (usuário, disciplina, professor, dia, hora, horário, atividade, tipo de atividade e anotação).

**2. Ajuste as credenciais de conexão**

Em `src/ConexaoBD/ConexaoBD.java`, edite usuário e senha de acordo com seu ambiente local:
```java
private String url = "jdbc:postgresql://localhost:5432/ProjetoBD2";
private String usr = "postgres";
private String pass = "postgres";
```

**3. Execute o projeto**

Pelo NetBeans, abra o projeto e execute a classe `visao.Login`, ou rode o `.jar` já compilado:
```bash
java -jar dist/ProjetoBD.jar
```

## Limitações conhecidas

- As credenciais de conexão com o banco estão fixas (hardcoded) no código-fonte, em vez de um arquivo de configuração externo.
- Algumas consultas SQL são montadas por concatenação de strings em vez de `PreparedStatement` com parâmetros, o que é uma prática vulnerável a SQL Injection e vale ser corrigida em uma próxima versão.
- Projeto acadêmico com fins de aprendizado de modelagem de banco de dados e padrão DAO — não implementa criptografia de senha nem validações mais robustas de segurança.

## Autor

**Dheyk da Silva Souza**
Graduando em Engenharia de Computação — IFMT
[GitHub](https://github.com/dheykSilva) • [LinkedIn](https://www.linkedin.com/in/dheyk-da-silva-souza-914153168/)
