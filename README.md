# Estudos Mensageria: RabbitMQ

> Conjunto de serviços de consumer e producer (com e sem exchanges).

## Linguagens e tecnologias utilizadas

- Spring Boot
- RabbitMQ
- Spring Web 
- Docker


## Descrição
Primeiro, foi criada a instância do RabbitMQ através de um container no Docker `docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.9-management`. Assim, o console já fica disponível. Depois foi criado um Queue com o nome de "example". Esse nome vai ser utilizado nos arquivos application.properties dos serviços. Para os testes com exchanges (foi usada uma direct exchange com uma routing key) é preciso criar a exchange na [interface padrão do RabbitMQ.  ](http://localhost:15672/) Com tudo pronto e rodando, os testes podem ser feitos nas interfaces do [producer](http://localhost:8080/teste) e do [producer com exchange](http://localhost:8081/teste). A resposta virá automaticamente no console do serviço consumer. 






