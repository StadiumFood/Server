package stadium.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.json.JSONObject;
import stadium.exception.JsonParseException;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
public class Client implements Functions {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surName")
    private String surName;

    @Column(name = "oldName")
    private String oldName;

    @Column(name = "email")
    @NotNull
    private String email;

    @Column(name = "regDate")
    private Timestamp regDate;

    @Column(name = "remDate")
    private Timestamp remDate;

    @Column(name = "password")
    private String password;

    @Column(name = "isValidated")
    private Boolean isValidated;

    public Map<String, Object> getMap(){
        Map<String, Object> result = new HashMap<>();

        result.put("id", id);
        result.put("name", name);
        result.put("surName", surName);
        result.put("oldName", oldName);
        result.put("email", email);
        result.put("regDate", regDate);
        result.put("remDate", remDate);
        result.put("isValidated", isValidated);

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Timestamp getRemDate() {
        return remDate;
    }

    public void setRemDate(Timestamp remDate) {
        this.remDate = remDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getIsValidated() {
        return isValidated;
    }

    public void setIsValidated(Boolean validated) {
        isValidated = validated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (id != null ? !id.equals(client.id) : client.id != null) return false;
        if (name != null ? !name.equals(client.name) : client.name != null) return false;
        if (surName != null ? !surName.equals(client.surName) : client.surName != null) return false;
        if (oldName != null ? !oldName.equals(client.oldName) : client.oldName != null) return false;
        if (email != null ? !email.equals(client.email) : client.email != null) return false;
        if (regDate != null ? !regDate.equals(client.regDate) : client.regDate != null) return false;
        if (remDate != null ? !remDate.equals(client.remDate) : client.remDate != null) return false;
        if (password != null ? !password.equals(client.password) : client.password != null) return false;
        return isValidated != null ? isValidated.equals(client.isValidated) : client.isValidated == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surName != null ? surName.hashCode() : 0);
        result = 31 * result + (oldName != null ? oldName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (regDate != null ? regDate.hashCode() : 0);
        result = 31 * result + (remDate != null ? remDate.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (isValidated != null ? isValidated.hashCode() : 0);
        return result;
    }
}
