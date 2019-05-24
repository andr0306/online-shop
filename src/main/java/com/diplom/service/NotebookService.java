package com.diplom.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.diplom.entity.Notebook;

//описуемо методи для роботи з таблицею ноутбуки
@Service
public interface NotebookService {

		void saveNotebook (Notebook notebook);
		
		List<Notebook> findAllNotebooks();
		
		Notebook findNotebookById(int id);
		
		void deleteTabletById(int id);
		
}
