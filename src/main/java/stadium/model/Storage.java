package stadium.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.json.JSONObject;
import stadium.exception.JsonParseException;

import javax.persistence.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Entity
public class Storage implements Functions{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "coordinatesId")
    private Coordinates coordinatesId;

    @Column(name = "sector")
    private String sector;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    public Map<String, Object> getMap(){
        Map<String, Object> result = new HashMap<>();

        result.put("id", id);
        result.put("coordinatesId", coordinatesId);
        result.put("sector", sector);
        result.put("name", name);
        result.put("phone", phone);

        return result;
    }

    public static Client fromJson(JSONObject obj) throws JsonParseException {
        try{
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(obj.toString(), Client.class);
        }catch (IOException ex){
            throw  new JsonParseException("Error on parse Storage from Json", ex);
        }
    }

    public Storage(){}

    public Coordinates getCoordinatesId() {
        return coordinatesId;
    }

    public void setCoordinatesId(Coordinates coordinatesId) {
        this.coordinatesId = coordinatesId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
