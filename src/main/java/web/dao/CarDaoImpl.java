package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

@Repository
public class CarDaoImpl implements CarDao {

    public static final Car bmw = new Car("BMW", "3er", 192);
    public static final Car toyota = new Car("Toyota", "Camry", 275);
    public static final Car volkswagen = new Car("Volkswagen", "Passat", 140);
    public static final Car renault = new Car("Renault", "Megane", 113);
    public static final Car chevrolet = new Car("Chevrolet", "Captiva", 182);


}
