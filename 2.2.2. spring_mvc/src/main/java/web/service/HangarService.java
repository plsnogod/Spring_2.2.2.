package web.service;

import web.model.Car;

import java.util.List;

public interface HangarService {
    List <Car> getNumberCar(int count);
    List <Car> getAllCars();
    void addCar(Car car);
}
