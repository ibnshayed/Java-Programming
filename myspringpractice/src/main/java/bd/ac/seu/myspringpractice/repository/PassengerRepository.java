package bd.ac.seu.myspringpractice.repository;

import bd.ac.seu.myspringpractice.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, String> {

}
