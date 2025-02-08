package com.wecp.car_rental_management_system.repository;


import com.wecp.car_rental_management_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// public interface UserRepository {
//     // implement jpa repository here
// }

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    // implement jpa repository here
    @Query("SELECT users FROM User users WHERE username = ?1 AND password = ?2")
    User findByUsernameAndPassword(String username, String password);
}
