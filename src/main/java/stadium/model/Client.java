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
public class Client {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "surName")
    private String surName;

    @Column(name = "oldName")
    private String oldName;

    @Column(name = "email")
    private String email;

    @Column(name = "regDate")
    private Timestamp regDate;

    public Map<String, Object> getMap(){
        Map<String, Object> result = new HashMap<>();

        result.put("id", id);
        result.put("name", name);
        result.put("surName", surName);
        result.put("oldName", oldName);
        result.put("email", email);
        result.put("regDate", regDate);

        return result;
    }

    public static Client fromJson(JSONObject obj) throws JsonParseException {
        try{
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(obj.toString(), Client.class);
        }catch (IOException ex){
            throw  new JsonParseException("Error on parse Client from Json", ex);
        }
    }

    public Client(){}

    public Client(String name, String surName, String oldName, String email, Timestamp regDate) {
        this.name = name;
        this.surName = surName;
        this.oldName = oldName;
        this.email = email;
        this.regDate = regDate;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getRegDate() {
        return regDate;
    }

    public void setRegDate(Timestamp regDate) {
        this.regDate = regDate;
    }
}
