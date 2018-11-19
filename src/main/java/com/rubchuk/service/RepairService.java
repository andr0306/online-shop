package com.rubchuk.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.rubchuk.entity.Repair;

@Service
public interface RepairService {
	
	void saveRepair (Repair repair);
	
	List<Repair> findAllRepairs();
	
	void deleteRepairById(int id);

}
