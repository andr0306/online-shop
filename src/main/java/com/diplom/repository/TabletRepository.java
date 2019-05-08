package com.diplom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diplom.entity.Tablet;
@Repository
public interface TabletRepository extends JpaRepository<Tablet, Integer>{

}
