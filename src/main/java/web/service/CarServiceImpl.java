package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    List<Car> cars = new ArrayList<>();

    {
        cars.add(CarDaoImpl.bmw);
        cars.add(CarDaoImpl.toyota);
        cars.add(CarDaoImpl.volkswagen);
        cars.add(CarDaoImpl.renault);
        cars.add(CarDaoImpl.chevrolet);
    }


    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCars(Integer count) {
        return cars.stream().limit(count).toList();
    }
}

