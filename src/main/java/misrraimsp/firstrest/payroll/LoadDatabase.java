package misrraimsp.firstrest.payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {

        return args -> {
            Employee e1 = new Employee();
            e1.setName("Bilbo Baggins");
            e1.setRole("burglar");
            log.info("Preloading " + repository.save(e1));
            Employee e2 = new Employee();
            e2.setName("Frodo Baggins");
            e2.setRole("thief");
            log.info("Preloading " + repository.save(e2));
        };
    }
}
