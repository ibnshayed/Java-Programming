package bd.ac.seu.myticketms;

import bd.ac.seu.myticketms.model.Passenger;
import bd.ac.seu.myticketms.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyticketmsApplication {
    @Autowired
    private PassengerRepository passengerRepository;
    public static void main(String[] args) {
        SpringApplication.run(MyticketmsApplication.class, args);
    }
    @Bean
    CommandLineRunner runner(){
        return args ->{
            passengerRepository.save(new Passenger("14454","Abdur Rahman","0124524245","abc@gmail.com"));
            System.out.println("I'm in");
        };
    }

}
