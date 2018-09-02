package com.gamezone.repository;

import com.gamezone.entity.Terminal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface TerminalRepository extends CrudRepository<Terminal, Long> {

}
