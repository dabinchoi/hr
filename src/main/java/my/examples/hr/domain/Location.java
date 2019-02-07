package my.examples.hr.domain;

import javax.persistence.*;

@Entity
@Table(name = "locations")

public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long locationId;
    private String streetAddress;
    private String postalCode;
    private String city;
    private String stateProvince;
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
}
