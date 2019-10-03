package com.restexample.restexample.repositories;

import com.restexample.restexample.models.PrivateUser;
import org.springframework.data.repository.CrudRepository;

public interface PrivateUserRepository extends CrudRepository<PrivateUser, Integer> {
}
