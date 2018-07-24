package com.gamezone.repository;

import com.gamezone.entity.Computer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerRepository extends CrudRepository<Computer, Long> {
}
