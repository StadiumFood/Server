package stadium.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.json.JSONObject;
import stadium.exception.JsonParseException;

import javax.persistence.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Entity
public class SellEntre  implements Functions{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "sellId")
    private Integer sellId;

    @Column(name = "productId")
    private Integer productId;

    @Column(name = "storageId")
    private Integer storageId;

    @Column(name = "productPrice")
    private Double productPrice;

    @Column(name = "quantity")
    private Integer quantity;

    public Map<String, Object> getMap(){
        Map<String, Object> result = new HashMap<>();

        result.put("id", id);
        result.put("sellId", sellId);
        result.put("productId", productId);
        result.put("storageId", storageId);
        result.put("productPrice", productPrice);
        result.put("quantity", quantity);

        return result;
    }

    public static Client fromJson(JSONObject obj) throws JsonParseException {
        try{
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(obj.toString(), Client.class);
        }catch (IOException ex){
            throw  new JsonParseException("Error on parse SellEntre from Json", ex);
        }
    }

    public SellEntre(){}

    public SellEntre(Integer sellId, Integer productId, Integer storageId, Double productPrice, Integer quantity) {
        this.sellId = sellId;
        this.productId = productId;
        this.storageId = storageId;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSellId() {
        return sellId;
    }

    public void setSellId(Integer sellId) {
        this.sellId = sellId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getStorageId() {
        return storageId;
    }

    public void setStorageId(Integer storageId) {
        this.storageId = storageId;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
