package Interface;

import Dto.Customer;

public interface CustomerInterface extends GenericInterface<Customer> {
    public <T> void getById(int id);
}
