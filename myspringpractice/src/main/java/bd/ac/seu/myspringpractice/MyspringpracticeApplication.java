package bd.ac.seu.myspringpractice;

import bd.ac.seu.myspringpractice.model.Bus;
import bd.ac.seu.myspringpractice.model.Destination;
import bd.ac.seu.myspringpractice.model.Passenger;
import bd.ac.seu.myspringpractice.model.Service;
import bd.ac.seu.myspringpractice.repository.BusRepository;
import bd.ac.seu.myspringpractice.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.SQLOutput;
import java.util.List;

@SpringBootApplication
public class MyspringpracticeApplication {
    @Autowired
    private BusRepository busRepository;
    @Autowired
    private PassengerRepository passengerRepository;


    public static void main(String[] args) {
        SpringApplication.run(MyspringpracticeApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
/*
            List<Bus> passengerList = busRepository.findAll();
            passengerList.forEach(System.out::println);*/
/*
            passengerRepository.findAll().stream().filter(bus -> bus.getName().startsWith("R")).forEach(System.out::println);*/
/*

            busRepository.save(new Bus("3217","Ena",46, Service.ON,new Destination("Dhaka","Gopalgonj"),500));
            busRepository.save(new Bus("3213","Ena",46, Service.ON,new Destination("Dhaka","Chattragram"),1000));
            busRepository.save(new Bus("3214","Ena",50, Service.ON,new Destination("Dhaka","Khulna"),600));
            busRepository.save(new Bus("3215","Ena",50, Service.ON,new Destination("Dhaka","Kishorganj"),400));
            busRepository.save(new Bus("3216","Ena",46, Service.ON,new Destination("Dhaka","Comilla"),350));
*/
            busRepository.findAll().stream().forEach(System.out::println);
        };
    }

}

