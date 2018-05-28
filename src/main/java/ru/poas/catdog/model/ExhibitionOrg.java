package ru.poas.catdog.model;

/**
 * Created by vlusslus on 28.05.2018.
 */
import javax.persistence.*;

@Entity
@Table(name = "exhibition_org")
public class ExhibitionOrg {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "location")
    private String location;

    public ExhibitionOrg() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
