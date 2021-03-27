package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.HangarService;

@Controller
public class CarController {
    @Autowired
    HangarService hangar;

    @GetMapping("/cars")
    public String getNumberCar(@RequestParam(defaultValue = "0")int count, Model model){
        if (count !=0){
            model.addAttribute("cars", hangar.getNumberCar(count));

        } else {
            model.addAttribute("cars", hangar.getAllCars());
        }
        return "cars";

    }


}
