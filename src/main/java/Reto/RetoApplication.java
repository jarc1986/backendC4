//modelo
//interface
//repositorio
//servicio
//controlador


package Reto;

import Reto.interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import Reto.interfaces.InterfaceFragances;

@Component
@SpringBootApplication
public class RetoApplication implements CommandLineRunner {
   @Autowired
    private InterfaceFragances interfaceFragances;
    @Autowired
    private InterfaceUser interfaceUser;
	public static void main(String[] args) {
		SpringApplication.run(RetoApplication.class, args);
	}
          @Override
    public void run(String... args) throws Exception {
        interfaceFragances.deleteAll();
        interfaceUser.deleteAll();
    }
        

}
