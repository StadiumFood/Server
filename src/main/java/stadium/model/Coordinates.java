package stadium.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.json.JSONObject;
import stadium.exception.JsonParseException;

import javax.persistence.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Entity
public class Coordinates implements Functions{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "latitudeDeg")
    private Integer latitudeDeg;

    @Column(name = "latitudeMin")
    private Integer latitudeMin;

    @Column(name = "latitudeSec")
    private Float latitudeSec;

    @Column(name = "longirudeDeg")
    private Integer longirudeDeg;

    @Column(name = "longirudeMin")
    private Integer longirudeMin;

    @Column(name = "longirudeSec")
    private Float longirudeSec;

    public Map<String, Object> getMap(){
        Map<String, Object> result = new HashMap<>();

        result.put("id", id);
        result.put("latitudeDeg", latitudeDeg);
        result.put("latitudeMin", latitudeMin);
        result.put("latitudeSec", latitudeSec);
        result.put("longirudeDeg", longirudeDeg);
        result.put("longirudeMin", longirudeMin);
        result.put("longirudeSec", longirudeSec);

        return result;
    }

    public static Client fromJson(JSONObject obj) throws JsonParseException {
        try{
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(obj.toString(), Client.class);
        }catch (IOException ex){
            throw  new JsonParseException("Error on parse Coordinates from Json", ex);
        }
    }

    public Coordinates() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLatitudeDeg() {
        return latitudeDeg;
    }

    public void setLatitudeDeg(Integer latitudeDeg) {
        this.latitudeDeg = latitudeDeg;
    }

    public Integer getLatitudeMin() {
        return latitudeMin;
    }

    public void setLatitudeMin(Integer latitudeMin) {
        this.latitudeMin = latitudeMin;
    }

    public Float getLatitudeSec() {
        return latitudeSec;
    }

    public void setLatitudeSec(Float latitudeSec) {
        this.latitudeSec = latitudeSec;
    }

    public Integer getLongirudeDeg() {
        return longirudeDeg;
    }

    public void setLongirudeDeg(Integer longirudeDeg) {
        this.longirudeDeg = longirudeDeg;
    }

    public Integer getLongirudeMin() {
        return longirudeMin;
    }

    public void setLongirudeMin(Integer longirudeMin) {
        this.longirudeMin = longirudeMin;
    }

    public Float getLongirudeSec() {
        return longirudeSec;
    }

    public void setLongirudeSec(Float longirudeSec) {
        this.longirudeSec = longirudeSec;
    }
}
