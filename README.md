**Sistema de Controle de Alunos**
Este é um projeto de aplicação web simples para gerenciamento de alunos, desenvolvido com Java e o ecossistema Spring. A aplicação permite realizar as quatro operações básicas de um CRUD (Create, Read, Update, Delete) para a entidade "Aluno".

🚀 Tecnologias Utilizadas
Java 17

Spring Boot 3.x

Spring Web: Para criação de controllers e endpoints web.

Spring Data JPA: Para persistência de dados e comunicação com o banco.

Spring Boot Validation: Para validação dos dados de entrada no servidor.

Thymeleaf: Como motor de templates para renderizar as páginas HTML.

H2 Database: Banco de dados em memória para ambiente de desenvolvimento.

Maven: Para gerenciamento de dependências e build do projeto.

📋 Pré-requisitos
Antes de começar, garanta que você tenha os seguintes softwares instalados em sua máquina:

JDK 17 ou superior.

Apache Maven 3.8 ou superior.

Uma IDE de sua preferência (ex: IntelliJ IDEA, Eclipse) ou um editor de texto.

▶️ Como Executar a Aplicação
Você pode rodar o projeto de duas maneiras:

1. Pela sua IDE (Recomendado)
Clone ou baixe este repositório.

Abra o projeto na sua IDE como um "Existing Maven Project".

Aguarde a IDE baixar todas as dependências do Maven (pode levar alguns minutos na primeira vez).

Encontre a classe principal ControleAlunosApplication.java no caminho src/main/java/br/com/controlealunos/.

Clique com o botão direito sobre ela e selecione "Run 'ControleAlunosApplication.main()'".

O servidor web embarcado (Tomcat) será iniciado na porta 8080.

-------------------------------


**🧪 Como Testar a Aplicação (Passo a Passo)**
Após iniciar a aplicação, abra seu navegador de internet e siga os passos abaixo.

Acessar a Página Principal
Ação: Acesse a URL: http://localhost:8080/alunos
Resultado Esperado: A página de listagem de alunos deve ser exibida com a mensagem "Nenhum aluno cadastrado ainda."

-------------------------------

**Consultando o Banco de Dados (H2 Console)**
Você pode acessar o banco de dados H2 diretamente para verificar os dados "por trás das câmeras" usando comandos SQL.

Mantenha a aplicação rodando.

Em outra aba do navegador, acesse: http://localhost:8080/h2-console

Na tela de login do H2, verifique se a URL JDBC está correta:

JDBC URL: jdbc:h2:mem:alunodb

User Name: sa

Password: (deixe em branco)

Clique em Connect.

No painel esquerdo, você verá a tabela ALUNOS (ou ALUNO, dependendo do mapeamento).

Na caixa de texto (editor de SQL) da direita, você pode executar consultas.

Exemplos de Consultas (SELECTs)
Digite o comando abaixo e clique no botão "Run"

SELECT * FROM ALUNOS;
