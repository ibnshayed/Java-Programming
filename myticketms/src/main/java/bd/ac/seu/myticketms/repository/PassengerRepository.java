package bd.ac.seu.myticketms.repository;

import bd.ac.seu.myticketms.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger,String> {
}
