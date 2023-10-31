package microservicio.facturacion.Facturacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "facturacion.Facturacion.repositorio") 
@EntityScan(basePackages = "facturacion.Facturacion.modelo") 
@ComponentScan(basePackages = "facturacion.Facturacion") 
public class FacturacionApplication {

    public static void main(String[] args) {
        SpringApplication.run(FacturacionApplication.class, args);
    }
	
}
