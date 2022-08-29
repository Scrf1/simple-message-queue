package com.scrf1.simplemessagequeue.services;

import com.scrf1.simplemessagequeue.entityDtos.JuiceStoreDto;
import com.scrf1.simplemessagequeue.models.Juice;
import com.scrf1.simplemessagequeue.models.JuiceStore;
import com.scrf1.simplemessagequeue.repositories.JuiceRepository;
import com.scrf1.simplemessagequeue.repositories.JuiceStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JuiceStoreServiceImpl implements JuiceStoreService {

    @Autowired
    private JuiceStoreRepository juiceStoreRepository;
    @Autowired
    private JuiceRepository juiceRepository;

    @Override
    public JuiceStore createJuiceStore(JuiceStoreDto dto) {
        if(dto == null)
            return null;
        JuiceStore juiceStore = new JuiceStore();
        juiceStore.setName(dto.getName());
        juiceStore.setEmail1(dto.getEmail1());
        juiceStore.setEmail2(dto.getEmail2());
        juiceStore.setPhone1(dto.getPhone1());
        juiceStore.setPhone2(dto.getPhone2());

        return juiceStoreRepository.save(juiceStore);
    }

    @Override
    public Optional<JuiceStore> getJuiceStoreById(Long id) {
        if(id == null)
            return Optional.empty();
        return juiceStoreRepository.findById(id);
    }

    @Override
    public Juice createJuice(String name, String description, String price) {
        if(name == null || (name != null && name.isEmpty()))
            return null;
        Juice juice = new Juice();
        juice.setName(name);
        juice.setDescription(description);
        juice.setPrice(price);
        return juiceRepository.save(juice);
    }

    @Override
    public Optional<Juice> getJuiceById(Long id) {
        if(id == null)
            return Optional.empty();
        return juiceRepository.findById(id);
    }
}
