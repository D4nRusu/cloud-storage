package com.danrusu.drive.repository;

import com.danrusu.drive.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {
    // List<Account> findById(@Param("accountId") long accountId);

    Optional<Account> findById(long accountId);
}
