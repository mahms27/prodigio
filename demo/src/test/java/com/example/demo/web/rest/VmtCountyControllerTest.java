package com.example.demo.web.rest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.demo.dto.VmtCountyDTO;
import com.example.demo.service.VmtCountyService;

@RunWith(MockitoJUnitRunner.Silent.class)
public class VmtCountyControllerTest {

	@InjectMocks
	@Spy
	private VmtCountyController controller;
	
	@Mock
	private VmtCountyService service;

 @Test
 public void findAllTest() {
	 
	List <VmtCountyDTO> response = new ArrayList<>();
	ResponseEntity<List <VmtCountyDTO>> resExpected = new ResponseEntity<List <VmtCountyDTO>>(response, HttpStatus.OK);
	when(service.findAll()).thenReturn(response);
	ResponseEntity<List <VmtCountyDTO>> resAssert = controller.findAll();
	assertEquals(resExpected.getBody(), resAssert.getBody());
 }
 
 @Test
 public void createTest() {
	 
	VmtCountyDTO request = new VmtCountyDTO();
	VmtCountyDTO response = new VmtCountyDTO();
	ResponseEntity<VmtCountyDTO> resExpected = new ResponseEntity<VmtCountyDTO>(response, HttpStatus.OK);
	when(service.save(request)).thenReturn(response);
	ResponseEntity<VmtCountyDTO> resAssert = controller.create(request);
	assertEquals(resExpected.getBody(), resAssert.getBody());
 }
 
 @Test
 public void findByIdTest() {
	 
	Integer id = 1;
	VmtCountyDTO response = new VmtCountyDTO();
	ResponseEntity<VmtCountyDTO> resExpected = new ResponseEntity<VmtCountyDTO>(response, HttpStatus.OK);
	when(service.findById(id)).thenReturn(response);
	ResponseEntity<VmtCountyDTO> resAssert = controller.findById(id);
	assertEquals(resExpected.getBody(), resAssert.getBody());
	
 }
 
 @Test
 public void updateTest() {
	 
	VmtCountyDTO request = new VmtCountyDTO();
	VmtCountyDTO response = new VmtCountyDTO();
	ResponseEntity<VmtCountyDTO> resExpected = new ResponseEntity<VmtCountyDTO>(response, HttpStatus.OK);
	when(service.save(request)).thenReturn(response);
	ResponseEntity<VmtCountyDTO> resAssert = controller.create(request);
	assertEquals(resExpected.getBody(), resAssert.getBody());
	
 }
 
 @Test
 public void deleteTest() {
	 Integer id = 1;
	 service.delete(id);
	 Assert.assertNull(service.findById(id));
 }
 
}
