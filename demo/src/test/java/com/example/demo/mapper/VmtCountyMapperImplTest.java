package com.example.demo.mapper;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.modelmapper.ModelMapper;

import com.example.demo.dto.VmtCountyDTO;
import com.example.demo.entity.VmtCounty;

@RunWith(MockitoJUnitRunner.Silent.class)
public class VmtCountyMapperImplTest {

	private VmtCounty vo;
	private VmtCountyDTO dto;
	private List<VmtCountyDTO> list;
	
	@Mock
	private ModelMapper modelMapper = new ModelMapper();
	
	@Before
	public void setData() {
		
		dto = new VmtCountyDTO();
		vo = new VmtCounty();
		list = new ArrayList<>();
		
		LocalDate date = LocalDate.now();
		BigDecimal bigDecimal = new BigDecimal("0.01");
		
		vo.setBaselinejanVmt(1);
		vo.setCountyFips(1);
		vo.setCountyName("name");
		vo.setCountyVmt(1);
		vo.setDate(date);
		vo.setDateAtLow(date);
		vo.setMean7CountyVmtAtLow(bigDecimal);
		vo.setPercent_change_from_jan(bigDecimal);
		vo.setPercentChangeFromLow(bigDecimal);
		vo.setStateName("stateName");
		
		dto.setBaselinejanVmt(1);
		dto.setCountyFips(1);
		dto.setCountyName("name");
		dto.setCountyVmt(1);
		dto.setDate(date);
		dto.setDateAtLow(date);
		dto.setMean7CountyVmtAtLow(bigDecimal);
		dto.setPercent_change_from_jan(bigDecimal);
		dto.setPercentChangeFromLow(bigDecimal);
		dto.setStateName("stateName");
		
		list.add(dto);
		
		assertEquals(vo.getBaselinejanVmt(),dto.getBaselinejanVmt());
		assertEquals(vo.getCountyFips(),dto.getCountyFips());
		assertEquals(vo.getCountyName(),dto.getCountyName());
		assertEquals(vo.getCountyVmt(),dto.getCountyVmt());
		assertEquals(vo.getDate(),dto.getDate());
		assertEquals(vo.getDateAtLow(),dto.getDateAtLow());
		assertEquals(vo.getMean7CountyVmtAtLow(),dto.getMean7CountyVmtAtLow());
		assertEquals(vo.getPercent_change_from_jan(),dto.getPercent_change_from_jan());
		assertEquals(vo.getPercentChangeFromLow(),dto.getPercentChangeFromLow());
		assertEquals(vo.getStateName(),dto.getStateName());

	}
	
	@Test
	public void whenAssertingNull_thenTrue() {	
		VmtCountyDTO dtoExpected = null;
		assertNull(dtoExpected, () -> " dtoExpected es  nulo");				
	}
	
	
	@Test
	public void whenAssertingNotNull_thenTrue() {
		VmtCountyDTO dtoExpected = new VmtCountyDTO();
	    assertNotNull(dtoExpected, () -> " dtoExpected no es nulo");
	}
	
	@Test
	public void convertToDTO () {
		VmtCountyDTO dtoExpected = new VmtCountyDTO();
		when(modelMapper.map(any(), any())).thenReturn(dtoExpected);
		VmtCountyDTO dtoAssert= modelMapper.map(vo, VmtCountyDTO.class);
		assertEquals(dtoExpected, dtoAssert);
		
	}
	
	@Test
	public void convertToVO () {
		VmtCounty voExpected = new VmtCounty();
		when(modelMapper.map(any(), any())).thenReturn(voExpected);
		VmtCounty voAssert = modelMapper.map(dto, VmtCounty.class);
		assertEquals(voExpected, voAssert);
	}
	

}
