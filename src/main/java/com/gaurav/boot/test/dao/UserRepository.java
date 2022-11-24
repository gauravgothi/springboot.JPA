package com.gaurav.boot.test.dao;

import com.gaurav.boot.test.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {

    //Derived Query method : Only need to declare declartion , implementation automatically inserted by spring
    public List<User> findByName(String name);

    public List<User> findByNameAndId(String name, Integer id);

}
