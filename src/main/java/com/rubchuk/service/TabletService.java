package com.rubchuk.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rubchuk.entity.Tablet;

@Service
public interface TabletService {
	
	void saveTablet(Tablet tablet);
	
	List<Tablet> findAllTablets();
	
	Tablet findTabletById (int id);
	
	void deleteTabletById (int id);
}
