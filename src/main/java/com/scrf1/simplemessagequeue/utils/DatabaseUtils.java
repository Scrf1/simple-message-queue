package com.scrf1.simplemessagequeue.utils;


import com.scrf1.simplemessagequeue.models.Juice;
import com.scrf1.simplemessagequeue.models.JuiceStore;
import com.scrf1.simplemessagequeue.models.User;
import com.scrf1.simplemessagequeue.repositories.JuiceRepository;
import com.scrf1.simplemessagequeue.repositories.JuiceStoreRepository;
import com.scrf1.simplemessagequeue.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DatabaseUtils implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private JuiceStoreRepository juiceStoreRepository;
    @Autowired
    private JuiceRepository juiceRepository;

    @Override
    public void run(String... args) throws Exception {

        User user = new User();
        user.setEmail("test@gmail.com");
        user.setPhone("+1 471 7411");
        user.setLastName("test");
        user.setFirstName("test");
        userRepository.save(user);

        JuiceStore store = new JuiceStore();
        store.setName("Juice store test");
        store.setLocation("California US");
        store.setPhone1("+1 77775 84");
        store.setEmail1("store@gmail.com");
        juiceStoreRepository.save(store);

        Juice juice = new Juice();
        juice.setName("Pineapple strawberry");
        juice.setPrice(10.0);
        juiceRepository.save(juice);
    }
}
