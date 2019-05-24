package com.diplom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diplom.entity.Notebook;

//наслідуемося він JPA репозиторія який надає нам реалізацію методів для роботи з базою даних
@Repository
public interface NotebookRepository extends JpaRepository<Notebook, Integer>{

}
