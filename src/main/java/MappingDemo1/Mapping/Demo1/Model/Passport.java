package MappingDemo1.Mapping.Demo1.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "passport")
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "passportIdGenerator")
    @SequenceGenerator(name = "passportIdGenerator" , initialValue = 50000,allocationSize = 1000)
    @Column(name = "passport_id")
    private int passportId;
    @Column(name = "passport_number")
    private String passportNumber;

    @Column(name = "country")
    private String country;


}
