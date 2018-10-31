package com.rubchuk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubchuk.entity.Tablet;
import com.rubchuk.repository.TabletRepository;
import com.rubchuk.service.TabletService;

@Service
public class TabletServiceImpl implements TabletService{
	
	@Autowired 
	private TabletRepository tabletRepository;

	@Override
	public void saveTablet(Tablet tablet) {
		tabletRepository.save(tablet);
		
	}

	@Override
	public List<Tablet> findAllTablets() {
		// TODO Auto-generated method stub
		return tabletRepository.findAll();
	}

	@Override
	public Tablet findTabletById(int id) {
		// TODO Auto-generated method stub
		return tabletRepository.findOne(id);
	}

	@Override
	public void deleteTabletById(int id) {
		tabletRepository.delete(id);
		
	}

}
