package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HangarServiceImpl implements HangarService {
    private final List <Car> cars;

    public HangarServiceImpl(){
        this.cars = new ArrayList<>();
    }

    @Override
    public List<Car> getNumberCar(int count) {
        return  cars.stream().limit(count).collect(Collectors.toList());
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public void addCar(Car car) {
        cars.add(car);
    }
}
