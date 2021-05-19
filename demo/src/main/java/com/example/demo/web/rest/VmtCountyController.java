package com.example.demo.web.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.VmtCountyDTO;
import com.example.demo.exception.EntityNotFoundException;
import com.example.demo.service.VmtCountyService;

@RestController
@RequestMapping("/api")
public class VmtCountyController {
	
	@Autowired
	private VmtCountyService service;
	
	@GetMapping("/vmtCounty")
	@ResponseBody
	public ResponseEntity<List<VmtCountyDTO>> findAll() throws EntityNotFoundException{
		return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
	}
	
	@PostMapping(value = "/vmtCounty", produces = MediaType.APPLICATION_JSON_VALUE, consumes = {"application/json; charset=utf-8; application/x-www-form-urlencoded"})
	@ResponseBody
	public ResponseEntity <VmtCountyDTO> create(@RequestBody VmtCountyDTO dto) {
	    return new ResponseEntity<>(service.save(dto), HttpStatus.OK);
	}
	
	@GetMapping("/vmtCounty/{id}")
	public ResponseEntity <VmtCountyDTO> findById(@PathVariable Integer id) throws EntityNotFoundException{
	    return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
	}

	@PutMapping("/vmtCounty/{id}")
	public ResponseEntity <VmtCountyDTO> udpate(@RequestBody VmtCountyDTO dto, @PathVariable Integer id) {
		return new ResponseEntity<>(service.save(dto), HttpStatus.OK);
	}
	
    @DeleteMapping("/vmtCounty/{id}")
    void delete(@PathVariable Integer id) {
        service.delete(id);
    }
	
}
