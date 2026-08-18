package Interface;

import Dto.Customer;

import java.util.List;

public interface GenericInterface<T> {
    void save(T obj);
    List<T> getAll();
    void delete(T id);
}
