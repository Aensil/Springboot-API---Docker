package com.uptc.frw.jpa.repository;

import com.uptc.frw.jpa.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
