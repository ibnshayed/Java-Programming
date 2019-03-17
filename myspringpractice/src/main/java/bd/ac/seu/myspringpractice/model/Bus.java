package bd.ac.seu.myspringpractice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Bus {
    @Id
    String busNumber;
    String name;
    @Embedded
    Seat seat;
    @Enumerated(EnumType.STRING)
    Service service;
    @Embedded
    Destination destination;
    int ticketPrice;
    @ManyToOne
    List<Passenger> passengerList;

}
