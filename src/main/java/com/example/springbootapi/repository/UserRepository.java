package com.example.springbootapi.repository;

//import org.springframework.data.repository.CrudRepository;
import com.example.springbootapi.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface UserRepository extends PagingAndSortingRepository<User, Long>  {

    List<User> findByName(@Param("name") String name);
}