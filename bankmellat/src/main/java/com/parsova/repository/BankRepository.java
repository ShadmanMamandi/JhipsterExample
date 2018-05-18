package com.parsova.repository;

import com.parsova.domain.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by shiva on 7/3/17.
 */

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {


}
