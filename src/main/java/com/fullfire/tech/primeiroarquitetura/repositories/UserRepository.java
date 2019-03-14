package com.fullfire.tech.primeiroarquitetura.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullfire.tech.primeiroarquitetura.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
