# Curso DIO - Imersão no Spring Framework com Spring Boot  
>> Mentor Gleyson Sampaio 

_______________________________________________________________________________________________________________________________________________________________________
## Aula: ORM e JPA [x]

- ORM: Mapeamento de objeto relacional. Mapeamento de um objeto para uma tabela
- JPA: Java Persistence API - especificação que realiza operações de persistencia de objetos através de um framework (Ex. Hibernate) 



_______________________________________________________________________________________________________________________________________________________________________
## Aulas: Properties Value e Configuration Properties[x]

resource Application.properties: recurso do framework para centralizar a declaracção de valores das propriedades da aplicação.

Duas aulas no mesmo código 


_______________________________________________________________________________________________________________________________________________________________________
## Aula: Singleton ou prototype [x]

- Singleton: uma instancia da classe é criada para toda execução da aplicação. Esse único objeto ficará disponível para todas chamadas
- Prototype: é criado um objeto para cada chamada

Neste exemplo primeiro criamos um Bean de remetente como singleton. Neste caso quando foi alterado o email de um remetente mudou o email de todos os remetentes pois na verdade era apenas um objeto instanciado e as chamadas estavam apontando para o mesmo endereço de memória.

Em seguida marcamos o bean de remetente com a anotação @Scope("prototype") e dessa forma a cada chamada ao remetente o framework criou uma instancia separada e assim conseguimos alterar o email de cada remetente sem afetar os demais


_______________________________________________________________________________________________________________________________________________________________________
## Aula: Beans vs Components [x]

Os components e os beans são para criar objetos gerenciados pelo conteiner

- Usa-se @Component quando são componentes que serão scanneados na aplicação, quando eu tenho acesso ao código fonte, quando eu adicionei a classe ao projeto criando o código referente. Exemplo da aula anterior a classe Calculadora onde criamos um @Component MyApp para ser um CommandLineRunner e manipular a classe calculadora.

- Usa-se @Bean para injetar a dependencia de uma interface sem que seja necessário implementar a classe dessa interface. Como exemplo na aula anterior não seria necessário implementar a classe MyApp que implementa a interface CommandLineRunner para ter acesso ao método da run da interface. 
   - No exemplo desta aula usa-se uma classe externa que não é do Spring Framework, como foi o caso do CommandLineRunner, e por isso essa classe não era um @Bean e nesse      caso o @Bean deve ser criado manualmente simplesmente instanciando um objeto dessa classe a colocando a anotação @Bean. 
   
### Problemas:
1- ao testar o código conforme feito na aula minha IDE não estava localizando o com.google.code.Gson
    Lembrei do arquivo de configuração Maven pom.xml e ao verificar percebi que lá não estavaa a dependencia para esse artefaato. Mesmo apos adicionar a tag com a         dependencia não reconheceu o recurso. Conferi o gitHub do professor estava tudo certo. Pesquisei pela dependencia maven no google chegando ao MVN repository mas só 
    encontrei o código exatamente igual o meu. Só foi resolvido quando usei a ferramenta da IDE para pesquisar dependencias do Maven pois ele isntalou autoamticamente     e assim percebi meu erro que foi não carrregar as mudanças Maven após salvar o pom.xml

_______________________________________________________________________________________________________________________________________________________________________
## Aula: Primeiros passos com Springboot [v] 

- Criação do projeto com spring initializer

- Criação de uma classe calculadora para servir de exemplo apenas com um método somar dois inteiros

- Com o spring framework o método main da aplicação não manipula mais os objetos, ele apenas inicializa a SpringApplication que vai gerenciar os componentes.

- Criação da classe MyApp que é um CommandLineRunner e tem um método Run onde serão feitas as manipulações 

- A dependencia entre as classes foi feita através de anotações. A classe Main é @SpringBootApplication e as demais São @Component

- A classe MyApp manipula os objetos com a anotação @AutoWired  


![com IOC](https://user-images.githubusercontent.com/93940659/196012057-b24cf187-5910-48ad-af61-7c7984341efd.png)

