package stadium.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.json.JSONObject;
import stadium.exception.JsonParseException;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

@Entity
public class Passport implements Functions{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "series")
    private Integer series;

    @Column(name = "number")
    private Integer number;

    @Column(name = "birthday")
    private Timestamp birthday;

    @Column(name = "sex")
    @Size(max = 1)
    private String sex;

    @Column(name = "address")
    private String address;

    @Column(name = "editionDate")
    private Timestamp editionDate;

    @Column(name = "editionPlace")
    private String editionPlace;

    public Map<String, Object> getMap(){
        Map<String, Object> result = new HashMap<>();

        result.put("id", id);
        result.put("series", series);
        result.put("number", number);
        result.put("birthday", birthday);
        result.put("sex", sex);
        result.put("address", address);
        result.put("editionDate", editionDate);
        result.put("editionPlace", editionPlace);

        return result;
    }

    public static Client fromJson(JSONObject obj) throws JsonParseException {
        try{
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(obj.toString(), Client.class);
        }catch (IOException ex){
            throw  new JsonParseException("Error on parse Passport from Json", ex);
        }
    }

    public Passport() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(Timestamp editionDate) {
        this.editionDate = editionDate;
    }

    public String getEditionPlace() {
        return editionPlace;
    }

    public void setEditionPlace(String editionPlace) {
        this.editionPlace = editionPlace;
    }
}
