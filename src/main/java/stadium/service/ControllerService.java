package stadium.service;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stadium.dto.ResponseDTO;
import stadium.model.*;
import stadium.service.beans.*;

import javax.validation.ConstraintViolationException;

@Service
public class ControllerService {

    @Autowired
    ClientService clientService;

    @Autowired
    CoordinatesService coordinatesService;

    @Autowired
    EmployeeService employeeService;

    @Autowired
    EmployeeWorksService employeeWorksService;

    @Autowired
    PassportService passportService;

    @Autowired
    PositionService positionService;

    @Autowired
    ProductAvaliabilityService productAvaliabilityService;

    @Autowired
    ProductService productService;

    @Autowired
    SellEntreService sellEntreService;

    @Autowired
    SellService sellService;

    @Autowired
    StorageService storageService;

    @Autowired
    TypeService typeService;

    public ResponseDTO getClientById(Long id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        Client temp = clientService.getById(id);
        if(temp==null)
            throw new NotFoundException("Client with given id not found");
        dto.setData(temp.getMap());
        return dto;
    }

    public ResponseDTO saveSingleClient(Client client) throws ConstraintViolationException {
        ResponseDTO dto = ResponseDTO.allIsOk();
        Long id = clientService.save(client);
        dto.setMessage(id.toString());
        return dto;
    }

    public ResponseDTO deleteSingleClient(Long id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        clientService.delete(id);
        return dto;
    }

    public ResponseDTO getCoordinatesById(Long id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        Coordinates temp = coordinatesService.getById(id);
        if(temp==null)
            throw new NotFoundException("Coordinates with given id not found");
        dto.setData(temp.getMap());
        return dto;
    }

    public ResponseDTO saveSingleCoordinates(Coordinates coordinates) throws ConstraintViolationException {
        ResponseDTO dto = ResponseDTO.allIsOk();
        Long id = coordinatesService.save(coordinates);
        dto.setMessage(id.toString());
        return dto;
    }

    public ResponseDTO deleteSingleCoordinates(Long id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        coordinatesService.delete(id);
        return dto;
    }

    public ResponseDTO getEmployeeById(Long id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        Employee temp = employeeService.getById(id);
        if(temp==null)
            throw new NotFoundException("Employee with given id not found");
        dto.setData(temp.getMap());
        return dto;
    }

    public ResponseDTO saveSingleEmployee(Employee employee) throws ConstraintViolationException {
        ResponseDTO dto = ResponseDTO.allIsOk();
        Long id = employeeService.save(employee);
        dto.setMessage(id.toString());
        return dto;
    }

    public ResponseDTO deleteSingleEmployee(Long id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        employeeService.delete(id);
        return dto;
    }

    public ResponseDTO getEmployeeWorksById(Long id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        EmployeeWorks temp = employeeWorksService.getById(id);
        if(temp==null)
            throw new NotFoundException("EmployeeWorks with given id not found");
        dto.setData(temp.getMap());
        return dto;
    }

    public ResponseDTO saveSingleEmployeeWorks(EmployeeWorks employeeWorks) throws ConstraintViolationException {
        ResponseDTO dto = ResponseDTO.allIsOk();
        Long id = employeeWorksService.save(employeeWorks);
        dto.setMessage(id.toString());
        return dto;
    }

    public ResponseDTO deleteSingleEmployeeWorks(Long id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        employeeWorksService.delete(id);
        return dto;
    }

    public ResponseDTO getPassportById(Long id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        Passport temp = passportService.getById(id);
        if(temp==null)
            throw new NotFoundException("Passport with given id not found");
        dto.setData(temp.getMap());
        return dto;
    }

    public ResponseDTO saveSinglePassport(Passport passport) throws ConstraintViolationException {
        ResponseDTO dto = ResponseDTO.allIsOk();
        Long id = passportService.save(passport);
        dto.setMessage(id.toString());
        return dto;
    }

    public ResponseDTO deleteSinglePassport(Long id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        passportService.delete(id);
        return dto;
    }

    public ResponseDTO getPositionById(Long id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        Position temp = positionService.getById(id);
        if(temp==null)
            throw new NotFoundException("Position with given id not found");
        dto.setData(temp.getMap());
        return dto;
    }

    public ResponseDTO saveSinglePosition(Position position) throws ConstraintViolationException {
        ResponseDTO dto = ResponseDTO.allIsOk();
        Long id = positionService.save(position);
        dto.setMessage(id.toString());
        return dto;
    }

    public ResponseDTO deleteSinglePosition(Long id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        positionService.delete(id);
        return dto;
    }

    public ResponseDTO getProductAvaliabilityById(Long id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        ProductAvaliability temp = productAvaliabilityService.getById(id);
        if(temp==null)
            throw new NotFoundException("ProductAvaliability with given id not found");
        dto.setData(temp.getMap());
        return dto;
    }

    public ResponseDTO saveSingleProductAvaliability(ProductAvaliability productAvaliability) throws ConstraintViolationException {
        ResponseDTO dto = ResponseDTO.allIsOk();
        Long id = productAvaliabilityService.save(productAvaliability);
        dto.setMessage(id.toString());
        return dto;
    }

    public ResponseDTO deleteSingleProductAvaliability(Long id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        productAvaliabilityService.delete(id);
        return dto;
    }

    public ResponseDTO getProductById(Long id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        Product temp = productService.getById(id);
        if(temp==null)
            throw new NotFoundException("Product with given id not found");
        dto.setData(temp.getMap());
        return dto;
    }

    public ResponseDTO saveSingleProduct(Product product) throws ConstraintViolationException {
        ResponseDTO dto = ResponseDTO.allIsOk();
        Long id = productService.save(product);
        dto.setMessage(id.toString());
        return dto;
    }

    public ResponseDTO deleteSingleProduct(Long id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        productService.delete(id);
        return dto;
    }

    public ResponseDTO getSellEntreById(Long id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        SellEntre temp = sellEntreService.getById(id);
        if(temp==null)
            throw new NotFoundException("SellEntre with given id not found");
        dto.setData(temp.getMap());
        return dto;
    }

    public ResponseDTO saveSingleSellEntre(SellEntre sellEntre) throws ConstraintViolationException {
        ResponseDTO dto = ResponseDTO.allIsOk();
        Long id = sellEntreService.save(sellEntre);
        dto.setMessage(id.toString());
        return dto;
    }

    public ResponseDTO deleteSingleSellEntre(Long id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        sellEntreService.delete(id);
        return dto;
    }

    public ResponseDTO getSellById(Long id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        Sell temp = sellService.getById(id);
        if(temp==null)
            throw new NotFoundException("Sell with given id not found");
        dto.setData(temp.getMap());
        return dto;
    }

    public ResponseDTO saveSingleSell(Sell sell) throws ConstraintViolationException {
        ResponseDTO dto = ResponseDTO.allIsOk();
        Long id = sellService.save(sell);
        dto.setMessage(id.toString());
        return dto;
    }

    public ResponseDTO deleteSingleSell(Long id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        sellService.delete(id);
        return dto;
    }

    public ResponseDTO getStorageById(Long id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        Storage temp = storageService.getById(id);
        if(temp==null)
            throw new NotFoundException("Storage with given id not found");
        dto.setData(temp.getMap());
        return dto;
    }

    public ResponseDTO saveSingleStorage(Storage storage) throws ConstraintViolationException {
        ResponseDTO dto = ResponseDTO.allIsOk();
        Long id = storageService.save(storage);
        dto.setMessage(id.toString());
        return dto;
    }

    public ResponseDTO deleteSingleStorage(Long id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        storageService.delete(id);
        return dto;
    }

    public ResponseDTO getTypeById(Long id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        Type temp = typeService.getById(id);
        if(temp==null)
            throw new NotFoundException("Type with given id not found");
        dto.setData(temp.getMap());
        return dto;
    }

    public ResponseDTO saveSingleType(Type type) throws ConstraintViolationException {
        ResponseDTO dto = ResponseDTO.allIsOk();
        Long id = typeService.save(type);
        dto.setMessage(id.toString());
        return dto;
    }

    public ResponseDTO deleteSingleType(Long id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        typeService.delete(id);
        return dto;
    }

}