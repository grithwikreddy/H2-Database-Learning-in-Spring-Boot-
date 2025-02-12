package com.crud.H2DataLearning.Repository;

import com.crud.H2DataLearning.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
