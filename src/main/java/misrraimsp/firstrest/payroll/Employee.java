package misrraimsp.firstrest.payroll;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
class Employee {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String role;

}