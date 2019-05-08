package com.diplom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diplom.entity.Repair;
import com.diplom.repository.RepairRepository;
import com.diplom.service.RepairService;

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

	@Override
	public void deleteRepairById(int id) {
		
		repairRepository.delete(id);
		
	}

}
