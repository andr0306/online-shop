package com.rubchuk.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rubchuk.entity.Pc;

@Service
public interface PcService {
	
	void savePc (Pc pc);
	
	List<Pc> findAllPcs();
	
	Pc findPcById (int id);
	
	void deletePcById (int id);
}
