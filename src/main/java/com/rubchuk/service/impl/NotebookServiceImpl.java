package com.rubchuk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubchuk.entity.Notebook;
import com.rubchuk.repository.NotebookRepository;
import com.rubchuk.service.NotebookService;

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
