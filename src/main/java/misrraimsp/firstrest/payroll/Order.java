package misrraimsp.firstrest.payroll;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "CUSTOMER_ORDER")
class Order {

    @Id
    @GeneratedValue
    private Long id;

    private String description;

    private Status status;


}
