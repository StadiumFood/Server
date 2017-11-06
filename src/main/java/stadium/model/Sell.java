package stadium.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.json.JSONObject;
import stadium.exception.JsonParseException;

import javax.persistence.*;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

@Entity
public class Sell implements Functions {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "employeeId")
    private Long employeeId;

    @Column(name = "clientId")
    private Long clientId;

    @Column(name = "isCompleted")
    private Boolean isCompleted;

    @Column(name = "sellDate")
    private Timestamp sellDate;

    public Map<String, Object> getMap() {
        Map<String, Object> map = new HashMap<>();

        map.put("id", id);
        map.put("employeeId", employeeId);
        map.put("clientId", clientId);
        map.put("isCompleted", isCompleted);
        map.put("sellDate", sellDate);

        return map;
    }

    public void setMap(Map<String, Object> map) {

    }


    public static Client fromJson(JSONObject obj) throws JsonParseException {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(obj.toString(), Client.class);
        } catch (IOException ex) {
            throw new JsonParseException("Error on parse Sell from Json", ex);
        }
    }

    public Sell() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Boolean getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(Boolean completed) {
        isCompleted = completed;
    }

    public Timestamp getSellDate() {
        return sellDate;
    }

    public void setSellDate(Timestamp sellDate) {
        this.sellDate = sellDate;
    }
}
