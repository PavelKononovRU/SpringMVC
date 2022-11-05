package web.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    List<Car> cars = new ArrayList<>();
    static public void  printCars(int count) {
/*        List<Object> list = new ArrayList<>();
        list.add(new Car("BMW", "3er", 192));
        list.add(new Car("Toyota", "Camry", 275));
        list.add(new Car("Volkswagen", "Passat", 140));
        list.add(new Car("Renault", "Megane", 113));
        list.add(new Car("Chevrolet", "Captiva", 182));

        for (Object obj : list) {
            System.out.println(obj.toString());
        }*/
    }

}
