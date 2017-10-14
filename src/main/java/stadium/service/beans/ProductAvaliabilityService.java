package stadium.service.beans;

import org.springframework.stereotype.Service;
import stadium.model.ProductAvaliability;
import stadium.service.GenericServiceImpl;

@Service
public class ProductAvaliabilityService extends GenericServiceImpl<ProductAvaliability> {
    public ProductAvaliabilityService(){
        this.setType(ProductAvaliability.class);
    }
}