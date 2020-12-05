package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    public List<Car> getCars(int count){

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Ford Focus", "7755", "2014"));
        cars.add(new Car("Kia Rio", "1299", "2015"));
        cars.add(new Car("Audy A5", "2542", "2017"));
        cars.add(new Car("Hyundai Solaris", "4456", "2016"));
        cars.add(new Car("Skoda Octavia", "3514", "2019"));

        while (count < cars.size()) {
            cars.remove(cars.size() - 1);
        }

        return cars;
    }
}