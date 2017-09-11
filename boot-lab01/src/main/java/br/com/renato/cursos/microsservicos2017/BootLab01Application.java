package br.com.renato.cursos.microsservicos2017;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
//  Esta app só estende SpringBootServletInitializer para poder rodar 
//em um app server: 
public class BootLab01Application extends SpringBootServletInitializer  {
    //  O método abaixo só é necessário para se rodar dentro de um app server:
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BootLab01Application.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(BootLab01Application.class, args);
	}
}
