package com.restexample.restexample.config;

import com.restexample.restexample.models.PrivateUser;
import com.restexample.restexample.repositories.PrivateUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DbSeed implements ApplicationRunner {

    @Autowired
    PrivateUserRepository privateUserRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        PrivateUser user1 = new PrivateUser("Nicolai", 26);
        PrivateUser user2 = new PrivateUser("Jakob", 25);

        privateUserRepository.save(user1);
        privateUserRepository.save(user2);
    }
}
