package com.lead.repository;

import com.lead.entity.Lead;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LeadRepository extends JpaRepository<Lead, Integer> {

    List<Lead> findByMobileNumber(Long mobileNumber);
}
