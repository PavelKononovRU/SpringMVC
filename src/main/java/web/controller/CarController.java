package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) int count, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "3er", 192));
        cars.add(new Car("Toyota", "Camry", 275));
        cars.add(new Car("Volkswagen", "Passat", 140));
        cars.add(new Car("Renault", "Megane", 113));
        cars.add(new Car("Chevrolet", "Captiva", 182));

        model.addAttribute("car", CarService.getCarsList(count, cars));
        return "car";
    }
}
