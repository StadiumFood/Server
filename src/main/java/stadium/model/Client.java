package stadium.model;

import javax.persistence.*;
import java.sql.Timestamp;

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
