package com.rubchuk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubchuk.entity.Repair;
import com.rubchuk.repository.RepairRepository;
import com.rubchuk.service.RepairService;

@Service
public class RepairServiceImpl implements RepairService{

	@Autowired
	private RepairRepository repairRepository; ;
	
	@Override
	public void saveRepair(Repair repair) {
		repairRepository.save(repair);
		
	}

	@Override
	public List<Repair> findAllRepairs() {
		// TODO Auto-generated method stub
		return repairRepository.findAll();
	}

}
