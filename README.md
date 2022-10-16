# Curso DIO - Imersão no Spring Framework com Spring Boot  
>> By Gleyson Sampaio 

## Aula: Beans vs Components [ ]

-Start

## Aula: Primeiros passos com Springboot [v] 

- Criação do projeto com spring initializer

- Criação de uma classe calculadora para servir de exemplo apenas com um método somar dois inteiros

- Com o spring framework o método main da aplicação não manipula mais os objetos, ele apenas inicializa a SpringApplication que vai gerenciar os componentes.

- Criação da classe MyApp que é um CommandLineRunner e tem um método Run onde serão feitas as manipulações 

- A dependencia entre as classes foi feita através de anotações. A classe Main é @SpringBootApplication e as demais São @Component

- A classe MyApp manipula os objetos com a anotação @AutoWired  


![com IOC](https://user-images.githubusercontent.com/93940659/196012057-b24cf187-5910-48ad-af61-7c7984341efd.png)

