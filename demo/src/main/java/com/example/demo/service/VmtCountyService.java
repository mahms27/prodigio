package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.VmtCountyDTO;

public interface VmtCountyService {
	
	VmtCountyDTO findById(Integer id);
	
	VmtCountyDTO save(VmtCountyDTO vDTO);
	
	List<VmtCountyDTO> findAll();
	
	void delete(Integer id);
	
}
