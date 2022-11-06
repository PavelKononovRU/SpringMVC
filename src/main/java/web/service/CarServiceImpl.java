package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
@Service
public class CarServiceImpl implements CarService {
    @Override
    public  List<Car> getCarsList(@RequestParam(value = "count", required = false) int count, List<Car> list) {
        List<Car> getListCars = new ArrayList<>();
        if (count <= list.size()) {
            for (int i = 0; i < count; i++) {
                getListCars.add(i, list.get(i));
            }
        } else return list;
        return getListCars;
    }
}

