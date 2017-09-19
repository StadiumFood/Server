package stadium.model;

import javax.persistence.*;

@Entity
public class SellEntre {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

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

    public SellEntre(Integer sellId, Integer productId, Integer storageId, Double productPrice, Integer quantity) {
        this.sellId = sellId;
        this.productId = productId;
        this.storageId = storageId;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
