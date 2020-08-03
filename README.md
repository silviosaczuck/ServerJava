# ServerJava
Este projeto tem como objetivo a criação de um Servidor TCP, onde ao inicia-lo é possivel definir a porta a ser utilizado.  O Objetivo deste servidor é estar apto a atender diversos serviços sendo executados em varias portas. A principio já tem um serviço implementado para testes. Este serviço serviço realiza uma busca por Titulos de Filmes no site do IMDB (https://www.imdb.com), caso haja alguma alteração no layout do site, possivelmente este serviço não mais será valido.

# Serviço "Busca de Titulos de Filmes"

O serviço de busca de filmes utiliza Payloads.

Para Request:
<query length>:<query>

Para Response:
<payload length>:<payload>

OBS: 1. O comprimento da query e payload não deve considerar o ':' separador.

Exemplo:
Consulta: Star Trek 

Request => 9:Star Trek
Resposta: Star Trek O Filme 

Response => 17:Star Trek O Filme

# Tecnologias

Java JDK 8 -> https://www.oracle.com/java/technologies/javase-jdk8-downloads.html
Gradle -> https://docs.gradle.org
JSoup -> https://jsoup.org

# Testando o Servidor e Serviços

Java Instalado?

Verificando se o java esta instalado
Em seu Windows 10, clique na Lupa e digite "cmd".
Em seguida clique sobre a "Prompt de Comando"
Digite java -version e aperte "Enter"
Se o retorno for algo similar a isto:
java version "1.8.0_211"
Java(TM) SE Runtime Environment (build 1.8.0_211-b12)
Java HotSpot(TM) 64-Bit Server VM (build 25.211-b12, mixed mode)

O java esta instalado em seu PC.

Caso contrario, sera necessario instala-lo.
Link para fazer o donwload da instalação https://www.oracle.com/technetwork/java/javase/overview/index.html 
Selecione o arquivo, conforme seu sistema operacional. Depois de baixar o arquivo JDK, basta executa-lo e seguir os passo da isntalação.

Testando o Servidor

# Baixando o arquivo TCPServer-1.0.jar

Vá até o Projeto
Na Raiz do Projeto existe a Pasta app Acesse ela.
Clique sobre o arquivo TCPServe-1.0.jar
Uma nova pagina sera aberta, clique no botão donwload
Salve o arquivo em seu computador

# Executando

Acesse o prompt de comando
Navegue pelas pastas ate onde foi salvo o arquivo TCPServer-1.0.jar
No prompt de comando digite o seguinte comando: 
java -jar TCPServer-1.0.jar [--port]
Obs: O Paramentro port é opcional, caso não seja informado, o servidor iniciara na porta 5551

Versão
Componente	Versão
TCPServer	1.0
Contato

saczuck@gmail.com
