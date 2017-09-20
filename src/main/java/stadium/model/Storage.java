package stadium.model;

import javax.persistence.*;

@Entity
public class Storage {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "stadiumId")
    private Integer stadiumId;

    @Column(name = "sector")
    private String sector;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    public Storage(){}

    public Storage(Integer stadiumId, String sector, String name, String phone) {
        this.stadiumId = stadiumId;
        this.sector = sector;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getStadiumId() {
        return stadiumId;
    }

    public void setStadiumId(Integer stadiumId) {
        this.stadiumId = stadiumId;
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
