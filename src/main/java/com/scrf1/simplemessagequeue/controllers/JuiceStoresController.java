package com.scrf1.simplemessagequeue.controllers;

import com.scrf1.simplemessagequeue.entityDtos.JuiceCommand;
import com.scrf1.simplemessagequeue.entityDtos.JuiceDto;
import com.scrf1.simplemessagequeue.entityDtos.JuiceStoreDto;
import com.scrf1.simplemessagequeue.messaging.CommandQueueSender;
import com.scrf1.simplemessagequeue.models.Juice;
import com.scrf1.simplemessagequeue.models.JuiceStore;
import com.scrf1.simplemessagequeue.services.JuiceStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/juice-stores")
@CrossOrigin
public class JuiceStoresController {

    @Autowired
    private JuiceStoreService juiceStoreService;
    @Autowired
    CommandQueueSender queueSender;

    @PostMapping("/create-store")
    public JuiceStore createJuiceStore(@RequestBody JuiceStoreDto store) {
        return juiceStoreService.createJuiceStore(store);
    }

    @GetMapping("/store/{id}")
    public JuiceStore getJuiceStore(@PathVariable("id") Long storeId) {
        if(storeId == null)
            return null;
        return juiceStoreService.getJuiceStoreById(storeId).get();
    }

    @PostMapping("/juices")
    public Juice createJuice(@RequestBody JuiceDto juiceDto) {
        if(juiceDto == null)
            return null;
        return juiceStoreService.createJuice(juiceDto.getName(), juiceDto.getDescription(), juiceDto.getPrice());
    }

    @GetMapping("/juices/{id}")
    public Juice getJuice(@PathVariable("id") Long id) {
        if(id == null)
            return null;
        return juiceStoreService.getJuiceById(id).get();
    }

    @PostMapping("/juices/command")
    public String passCommand(@RequestBody JuiceCommand command) {
        if(command == null)
            return "CAN'T EXECUTE THE COMMAND BECAUSE MALFORMED COMMAND!";

        if(command.getDate() == null)
            command.setDate(new Date());
        return queueSender.send(command);
    }

}
