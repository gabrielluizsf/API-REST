package com.gabrielluizsf.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielluizsf.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
