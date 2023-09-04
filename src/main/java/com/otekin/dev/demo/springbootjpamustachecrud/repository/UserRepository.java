package com.otekin.dev.demo.springbootjpamustachecrud.repository;

import com.otekin.dev.demo.springbootjpamustachecrud.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}