package com.scrf1.simplemessagequeue.services;

import com.scrf1.simplemessagequeue.entityDtos.JuiceStoreDto;
import com.scrf1.simplemessagequeue.models.Juice;
import com.scrf1.simplemessagequeue.models.JuiceStore;

import java.util.Optional;

public interface JuiceStoreService {

    JuiceStore createJuiceStore(JuiceStoreDto dto);
    Optional<JuiceStore> getJuiceStoreById(Long id);

    Juice createJuice(String name, String description, String price);
    Optional<Juice> getJuiceById(Long id);

}
