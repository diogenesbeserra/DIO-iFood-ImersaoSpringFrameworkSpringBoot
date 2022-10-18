package me.dio.springboot.propertiesvalue;

import me.dio.springboot.singletonxprototype.Remetente;
import me.dio.springboot.singletonxprototype.RemetenteProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagemProperties implements CommandLineRunner{
    /*codigo referente a aula Configuration properties*/
    @Autowired
    private RemetenteProperties remetenteProperties;

    /* Codigo referente a aula Properties value*/

    /*@Value("${name:NoReply-DIO}")
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefones}")
    private List<Long> telefones =
            new ArrayList<>(Arrays.asList(new Long[]{11956781254L}));*/

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + remetenteProperties.getNome()
                + "\nE-mail:" + remetenteProperties.getEmail() + "\n"
                + "\nCom telefones para contato: " + remetenteProperties.getTelefones());
        System.out.println("Seu cadastro foi aprovado");
    }
}
