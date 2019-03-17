package bd.ac.seu.myspringpractice.repository;

import bd.ac.seu.myspringpractice.model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends JpaRepository<Bus,String> {
}
