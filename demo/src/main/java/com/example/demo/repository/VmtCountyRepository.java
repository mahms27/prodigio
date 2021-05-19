package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.VmtCounty;

public interface VmtCountyRepository extends JpaRepository<VmtCounty, Integer>{
	
	VmtCounty findByCountyFips(Integer id);
	
	List<VmtCounty> findAll();

}
