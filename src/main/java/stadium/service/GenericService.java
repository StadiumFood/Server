package stadium.service;

public interface GenericService <T> {
    T getById(int id) throws Exception;

}
