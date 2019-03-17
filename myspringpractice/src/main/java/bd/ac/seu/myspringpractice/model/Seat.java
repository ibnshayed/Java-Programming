package bd.ac.seu.myspringpractice.model;

import javax.persistence.Embeddable;

@Embeddable
public class Seat {
    int totalSeat;
    int availableSeat;
}
