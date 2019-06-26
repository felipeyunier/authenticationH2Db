package com.example.demo.daoImpl;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.db.UserDB;

public interface UserDBRepositoryImpl extends CrudRepository<UserDB, Long>{

	Optional<UserDB> findByUsername(@Param("username") String username);
}
