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
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository, OrderRepository orderRepository) {

        return args -> {
            Employee e1 = new Employee();
            e1.setName("Bilbo Baggins");
            e1.setRole("burglar");
            employeeRepository.save(e1);
            Employee e2 = new Employee();
            e2.setName("Frodo Baggins");
            e2.setRole("thief");
            employeeRepository.save(e2);
            employeeRepository.findAll().forEach(employee -> log.info("Preloaded " + employee));

            Order o1 = new Order();
            o1.setDescription("MacBook Pro");
            o1.setStatus(Status.COMPLETED);
            orderRepository.save(o1);
            Order o2 = new Order();
            o2.setDescription("iPhone");
            o2.setStatus(Status.IN_PROGRESS);
            orderRepository.save(o2);
            orderRepository.findAll().forEach(order -> { log.info("Preloaded " + order); });
        };
    }
}
