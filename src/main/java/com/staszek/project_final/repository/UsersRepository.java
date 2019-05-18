package com.staszek.project_final.repository;

import com.staszek.project_final.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Long> {
//    @Override
//    Optional<Users> findById(Long aLong);

    Optional<Users> findByNameOfAcount(String nameOfAcount);
}
