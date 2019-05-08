package com.diplom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diplom.entity.Repair;

@Repository
public interface RepairRepository extends JpaRepository<Repair, Integer>{

}
