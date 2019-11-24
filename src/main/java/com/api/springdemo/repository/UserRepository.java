package com.api.springdemo.repository;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

import com.api.springdemo.dao.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface UserRepository extends PagingAndSortingRepository<User, Long>  {

    List<User> findByName(@Param("name") String name);
}

/*
public interface UserRepository extends CrudRepository<User, Integer>, PagingAndSortingRepository<User, Long>  {

    List<User> findByLastName(@Param("name") String name);
}
*/