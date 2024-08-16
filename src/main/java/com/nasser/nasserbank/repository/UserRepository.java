package com.nasser.nasserbank.repository;

import com.nasser.nasserbank.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Boolean existsByEmail(String email);
    //Boolean existsByAccountNumber(String accountNumber);
}
