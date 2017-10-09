package stadium.service;

import stadium.model.Functions;

import javax.validation.ConstraintViolationException;

public interface GenericService <T extends Functions> {
    T getById(Long id) throws Exception;
    Long save(T object) throws ConstraintViolationException;
    void delete(Long id) throws Exception;
    void patch(T object) throws Exception;
}
