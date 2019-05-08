package com.diplom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diplom.entity.Pc;

@Repository
public interface PcRepository extends JpaRepository<Pc, Integer>{

}
