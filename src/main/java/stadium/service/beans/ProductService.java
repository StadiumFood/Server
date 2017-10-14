package stadium.service.beans;

import org.springframework.stereotype.Service;
import stadium.model.Product;
import stadium.service.GenericServiceImpl;

@Service
public class ProductService extends GenericServiceImpl<Product> {
    public ProductService(){
        this.setType(Product.class);
    }
}