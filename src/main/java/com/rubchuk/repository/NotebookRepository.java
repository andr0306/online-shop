package com.rubchuk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rubchuk.entity.Notebook;

@Repository
public interface NotebookRepository extends JpaRepository<Notebook, Integer>{

}
