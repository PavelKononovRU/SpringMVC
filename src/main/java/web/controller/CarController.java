package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService service;

    @Autowired
    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping()
    public String carsPage(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if ((count == null) || (count < 0) || (count >= 5)) {
            model.addAttribute("cars", service.getAllCars());
        } else {
            model.addAttribute("cars", service.getCars(count));
        }
        return "cars";
    }

/*    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) int count, Model model) {

*//*        cars.add(CarDaoImpl.bmw);
        cars.add(CarDaoImpl.toyota);
        cars.add(CarDaoImpl.volkswagen);
        cars.add(CarDaoImpl.renault);
        cars.add(CarDaoImpl.chevrolet);*//*

        model.addAttribute("carnumbers", service.getCarsList(count, cars));
        return "cars";
    }*/


}
