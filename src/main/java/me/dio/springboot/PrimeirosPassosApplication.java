package me.dio.springboot;

import me.dio.springboot.beansxcomponents.ConversorJson;
import me.dio.springboot.beansxcomponents.ViaCepResponse;
import me.dio.springboot.singletonxprototype.SistemaMensagem;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PrimeirosPassosApplication {

    /* Aula primeiros passos, esse metodo SpringApplication.run chama o metodo run da classe MyApp
    que é um CommandLineRunner*/
    /*public static void main(String[] args) {
        SpringApplication.run(PrimeirosPassosApplication.class, args);
    }
    */
	/* Aula beans versus components, este bean faz a mesma função do metodo run da classe MyApp porém não precisa
	ser implementado em uma classe. Ou seja, estamos implementado um metodo da interface CommandLineRunner sem
	que uma classe implemente essa interface. o bean não tem o código da classe explicito.
	* */
	/*@Bean
	public CommandLineRunner run(ConversorJson conversor) throws Exception {
		return args -> {
			String json = "{\"cep\": \"01001-000\",\"logradouro\": \"Praça da Sé\",\"localidade\": \"São Paulo\"}";
			ViaCepResponse response = conversor.converter(json);
			System.out.println("Dados do CEP: " + response);
		};
	}*/

    /* Codigo referente aula SINGLETON VS PROTOTYPE*/

/*    @Bean
    public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
        return args -> {
            sistema.enviarConfirmacaoCadastro();
            sistema.enviarMensagemBoasVindas();
            sistema.enviarConfirmacaoCadastro();
        };
    }*/

    /* Aula Properties Value*/

    public static void main(String[] args) {
        SpringApplication.run(PrimeirosPassosApplication.class, args);
    }
}
