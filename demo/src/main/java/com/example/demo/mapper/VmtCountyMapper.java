package com.example.demo.mapper;

import java.util.List;

import com.example.demo.dto.VmtCountyDTO;
import com.example.demo.entity.VmtCounty;


public interface VmtCountyMapper {
	
	VmtCountyDTO convertToDto(VmtCounty v);

	VmtCounty toEntity(VmtCountyDTO vDTO);
	
	List<VmtCountyDTO> convertToDtoList(List<VmtCounty> vList);
}
