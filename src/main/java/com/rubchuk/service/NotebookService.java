package com.rubchuk.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rubchuk.entity.Notebook;

@Service
public interface NotebookService {

		void saveNotebook (Notebook notebook);
		
		List<Notebook> findAllNotebooks();
		
		Notebook findNotebookById(int id);
		
		void deleteTabletById(int id);
		
}
