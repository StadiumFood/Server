package stadium.model;

import javax.persistence.*;

@Entity
public class ProductAvaliability {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "productId")
    private Integer productId;

    @Column(name = "storageId")
    private Integer storageId;

    @Column(name = "quantity")
    private Integer quantity;

    public ProductAvaliability(Integer productId, Integer storageId, Integer quantity) {
        this.productId = productId;
        this.storageId = storageId;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
