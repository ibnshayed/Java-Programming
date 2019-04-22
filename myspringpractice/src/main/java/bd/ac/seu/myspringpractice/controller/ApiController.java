package bd.ac.seu.myspringpractice.controller;

import bd.ac.seu.myspringpractice.model.Bus;
import bd.ac.seu.myspringpractice.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class ApiController {
    @Autowired
    private BusRepository busRepository;
    private List<Bus> list;

    @RequestMapping(value = "allbus")
    public List<Bus> getAllBuses() {

        return busRepository.findAll();
    }

    @RequestMapping(value = "bus/{id}")
    public Bus getABus(@PathVariable String id) {
        return busRepository.findById(id).orElse(null);
    }
}
