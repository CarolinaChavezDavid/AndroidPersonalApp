package com.carolinaapp.apis.repositories;

import com.carolinaapp.apis.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
