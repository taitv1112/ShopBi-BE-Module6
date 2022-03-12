package com.example.shopbibe.controller.PmController;

import com.example.shopbibe.model.Orders;
import com.example.shopbibe.service.indexService.IOrderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/orderInPm")
public class OrderInPmController {
    @Autowired
    IOrderImpl iOrder;
    // ham tra ve list order theo userId va status truyen vao
    @GetMapping("/listOrder/{id}")
    public List<Orders> findAllByStatus(@PathVariable long id,@RequestParam String status){
        return iOrder.findAllByStatus(id,status);
    }

    // ham edit Order theo Doi tuong order truyen sang
    @PutMapping
    public Orders  editOrder(@RequestBody Orders orders){
            iOrder.saveOrder(orders);
            return orders;
    }

}

