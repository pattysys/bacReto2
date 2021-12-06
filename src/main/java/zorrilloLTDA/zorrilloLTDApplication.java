package zorrilloLTDA;
import zorrilloLTDA.interfaces.InterfaceUser;
import zorrilloLTDA.interfaces.InterfaceFragance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class zorrilloLTDApplication implements CommandLineRunner {
   @Autowired
    private InterfaceFragance interfaceFragance;
    @Autowired
    private InterfaceUser interfaceUser;
	public static void main(String[] args) {
		SpringApplication.run(zorrilloLTDApplication.class, args);
	}
          @Override
    public void run(String... args) throws Exception {
        interfaceFragance.deleteAll();
        interfaceUser.deleteAll();
    }
        

}
