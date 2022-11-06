package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImpl;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    CarService service;
    List<Car> cars = new ArrayList<>();

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) int count, ModelMap model) {

        cars.add(CarDaoImpl.bmw);
        cars.add(CarDaoImpl.toyota);
        cars.add(CarDaoImpl.volkswagen);
        cars.add(CarDaoImpl.renault);
        cars.add(CarDaoImpl.chevrolet);

        model.addAttribute("car", service.getCarsList(count, cars));
        return "car";
    }
}
