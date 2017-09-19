package stadium.service;

import stadium.model.functions;

public interface GenericService <T> {
    T getById(Integer id) throws Exception;

}
