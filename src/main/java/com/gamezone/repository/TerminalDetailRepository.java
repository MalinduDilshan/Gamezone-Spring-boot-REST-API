package com.gamezone.repository;

import com.gamezone.entity.TerminalDetail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerminalDetailRepository extends CrudRepository<TerminalDetail, Long> {

}
