package com.rubchuk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rubchuk.entity.Repair;

@Repository
public interface RepairRepository extends JpaRepository<Repair, Integer>{

}
