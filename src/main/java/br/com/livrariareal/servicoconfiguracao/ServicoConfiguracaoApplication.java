package br.com.livrariareal.servicoconfiguracao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ServicoConfiguracaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicoConfiguracaoApplication.class, args);
	}
}
