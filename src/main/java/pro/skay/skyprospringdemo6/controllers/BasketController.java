package pro.skay.skyprospringdemo6.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.skay.skyprospringdemo6.servicies.BasketService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class BasketController {


    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public List<Integer> add(@RequestParam List<Integer>ids){
         return basketService.add(ids);
    }
    @GetMapping("/get")
    public Map<Integer, Integer> get(){
        return basketService.get();
    }
}
