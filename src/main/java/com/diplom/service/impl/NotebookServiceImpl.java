package com.diplom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diplom.entity.Notebook;
import com.diplom.repository.NotebookRepository;
import com.diplom.service.NotebookService;
// реалізовуємо методи з ноутбук сервісу  за допомогою Jpa репозиторію
@Service
public class NotebookServiceImpl implements NotebookService{
	
	@Autowired
	private NotebookRepository notebookRepository;

	public void saveNotebook(Notebook notebook) {
		notebookRepository.save(notebook);	
	}
	public List<Notebook> findAllNotebooks() {	
		return notebookRepository.findAll();
	}
	public Notebook findNotebookById(int id) {
		
		return notebookRepository.findOne(id);
	}
	public void deleteTabletById(int id) {
		notebookRepository.delete(id);	
	}
}
