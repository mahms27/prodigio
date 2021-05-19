package com.example.demo.mapper;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.demo.dto.VmtCountyDTO;
import com.example.demo.entity.VmtCounty;

@Service
public class VmtCountyMapperImpl implements VmtCountyMapper {

	@Override
	public VmtCountyDTO convertToDto(VmtCounty v) {
		
		VmtCountyDTO vDTO  = null;
		
		if(v != null) {
			
			ModelMapper modelMapper = new ModelMapper();
			vDTO = modelMapper.map(v, VmtCountyDTO.class);
			
		}
			
		return vDTO;
	}

	@Override
	public VmtCounty toEntity(VmtCountyDTO vDTO) {
		
		ModelMapper modelMapper = new ModelMapper();
		VmtCounty v = modelMapper.map(vDTO, VmtCounty.class);
		
		return v;
		
	}

	@Override
	public List<VmtCountyDTO> convertToDtoList(List<VmtCounty> vList) {
		
		ModelMapper modelMapper = new ModelMapper();
		List<VmtCountyDTO> vDTOList = new ArrayList<>();
		for(VmtCounty v: vList) {
			VmtCountyDTO vDTO = modelMapper.map(v, VmtCountyDTO.class);
			vDTOList.add(vDTO);
		}
		return vDTOList;
	}

}
