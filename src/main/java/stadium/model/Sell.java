package stadium.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Map;

@Entity
public class Sell {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "clientId")
    private Long clientId;

    @Column(name = "isCompleted")
    private Boolean isCompleted;

    @Column(name = "sellDate")
    private Timestamp sellDate;

//    public Map<String, Object> getMap(){
//        return null;
//    }

    public Sell(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
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
