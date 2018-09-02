package com.gamezone.repository;

import com.gamezone.entity.Computer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface ComputerRepository extends CrudRepository<Computer, Long> {

    Computer findByPrimaryKey(long id);
}
