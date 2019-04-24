package bd.ac.seu.busdemo;

import bd.ac.seu.busdemo.model.Passenger;
import bd.ac.seu.busdemo.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BusdemoApplication {
    @Autowired
    private PassengerRepository passengerRepository;

    public static void main(String[] args) {
        SpringApplication.run(BusdemoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(){
        return args -> {
            Passenger passenger = new Passenger("4552435453","Abdur Rahman");
            passengerRepository.save(passenger);
            System.out.println(passenger);
        };
    }


}
