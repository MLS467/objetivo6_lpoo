package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;



@SpringBootApplication
public class LpooOrmSpringdataMavenApplication {

    public static void main(String[] args) {
        SpringApplication.run(LpooOrmSpringdataMavenApplication.class, args);
        HomeController.main(null);
    }

}
