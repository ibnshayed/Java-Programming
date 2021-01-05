package bd.ac.seu.myspringpractice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Passenger {
    @Id
    String nationalId;
    String name;
    String mobile;
    int amountOfSeat;
    long totalPayingAmount;
}
