package com.rubchuk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubchuk.entity.Pc;
import com.rubchuk.repository.PcRepository;
import com.rubchuk.service.PcService;

@Service
public class PcServiceImpl implements PcService{
	
	@Autowired
	private PcRepository pcRepository;

	@Override
	public void savePc(Pc pc) {
		pcRepository.save(pc);
		
	}

	@Override
	public List<Pc> findAllPcs() {
		// TODO Auto-generated method stub
		return pcRepository.findAll();
	}

	@Override
	public Pc findPcById(int id) {
		// TODO Auto-generated method stub
		return pcRepository.findOne(id);
	}

	@Override
	public void deletePcById(int id) {
		
		pcRepository.delete(id);
	}

}
