package com.gamezone.repository;

import com.gamezone.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByPrimaryKey(long id);
}
