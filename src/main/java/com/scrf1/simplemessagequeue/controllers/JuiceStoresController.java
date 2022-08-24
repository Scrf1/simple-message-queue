package com.scrf1.simplemessagequeue.controllers;

import com.scrf1.simplemessagequeue.entityDtos.JuiceStoreDto;
import com.scrf1.simplemessagequeue.models.JuiceStore;
import com.scrf1.simplemessagequeue.services.JuiceStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/juice-stores")
@CrossOrigin
public class JuiceStoresController {

    @Autowired
    private JuiceStoreService juiceStoreService;

    @GetMapping("/create-store")
    public JuiceStore createJuiceStore(@RequestBody JuiceStoreDto store) {
        return juiceStoreService.createJuiceStore(store);
    }

    @GetMapping("/store/{id}")
    public JuiceStore getJuiceStore(@PathVariable("id") Long storeId) {
        if(storeId == null)
            return null;
        return juiceStoreService.getJuiceStoreById(storeId).get();
    }

}
