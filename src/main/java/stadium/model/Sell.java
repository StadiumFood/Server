package stadium.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Sell {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "userId")
    private Integer userId;

    @Column(name = "isCompleted")
    private Boolean isCompleted;

    @Column(name = "sellDate")
    private Timestamp sellDate;

    public Sell(Integer userId, Boolean isCompleted, Timestamp sellDate) {
        this.userId = userId;
        this.isCompleted = isCompleted;
        this.sellDate = sellDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }

    public Timestamp getSellDate() {
        return sellDate;
    }

    public void setSellDate(Timestamp sellDate) {
        this.sellDate = sellDate;
    }
}
