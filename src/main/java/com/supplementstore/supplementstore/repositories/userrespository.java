package com.supplementstore.supplementstore.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.supplementstore.supplementstore.entites.Users;



@Repository
public interface userrespository extends JpaRepository<Users,Long> {

    List<Users> findByusername(String username);
    List<Users> findByUsernameAndPassword(String username, String password);



   
}
