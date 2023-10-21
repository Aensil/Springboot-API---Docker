package com.uptc.frw.jpa.repository;

import com.uptc.frw.jpa.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {
}
