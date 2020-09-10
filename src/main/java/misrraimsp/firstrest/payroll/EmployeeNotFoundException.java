package misrraimsp.firstrest.payroll;

public class EmployeeNotFoundException extends EntityNotFoundByIdException {

    public EmployeeNotFoundException(Long entityId, String entityClass) {
        super(entityId, entityClass);
    }
}
