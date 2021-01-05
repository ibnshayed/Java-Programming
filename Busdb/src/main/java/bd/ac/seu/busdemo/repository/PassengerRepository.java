package bd.ac.seu.busdemo.repository;

import bd.ac.seu.busdemo.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,String> {
}
