package stadium.service;

import stadium.model.Functions;

import javax.validation.ConstraintViolationException;

public interface GenericService <T extends Functions> {
    T getById(Long id) throws Exception;
    Long saveSingleObject(T object) throws ConstraintViolationException;
}
