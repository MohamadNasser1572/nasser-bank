package com.nasser.nasserbank;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Nasser Bank App", description = "Backend Rest APIs for Nasser Bank", version = "v1.0", contact = @Contact(name = "Mohammad Nasser", email = "mhmdnaser1572@gmail.com", url = "https://github.com/MohamadNasser1572/nasser-bank"), license = @License(name = "Mohammad Nasser", url = "https://github.com/MohamadNasser1572/nasser-bank")), externalDocs = @ExternalDocumentation(description = "Nasser Bank App Documentation", url = "https://github.com/MohamadNasser1572/nasser-bank"))
public class NasserBankApplication {

        public static void main(String[] args) {
                SpringApplication.run(NasserBankApplication.class, args);
        }

}
