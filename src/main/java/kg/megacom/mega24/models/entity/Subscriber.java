package kg.megacom.mega24.models.entity;

import kg.megacom.mega24.enums.Status;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "subscribers")
public class Subscriber {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String phoneNumber;

}
