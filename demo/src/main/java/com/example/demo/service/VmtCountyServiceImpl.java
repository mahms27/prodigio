package com.example.demo.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.VmtCountyDTO;
import com.example.demo.entity.VmtCounty;
import com.example.demo.mapper.VmtCountyMapperImpl;
import com.example.demo.repository.VmtCountyRepository;


@Service
public class VmtCountyServiceImpl implements VmtCountyService{


    @PersistenceContext
    private EntityManager em;
    
	@Autowired
	private VmtCountyRepository repo;
	
	@Autowired
	private VmtCountyMapperImpl mapper;
    
	@Override
	public VmtCountyDTO findById(Integer id) {
		// TODO Auto-generated method stub
		return mapper.convertToDto(repo.findByCountyFips(id));
	}

	@Override
	@Transactional
	public VmtCountyDTO save(VmtCountyDTO vDTO) {
		
		VmtCountyDTO  vDTOResp= null;
		try {
			VmtCounty vVo = mapper.toEntity(vDTO);
			if(vVo.getCountyFips() == null) {
				em.persist(vVo);
			}else {
				em.merge(vVo);
			}
			vDTOResp = mapper.convertToDto(vVo);
		} catch (Exception e) {
			System.out.print(e);
		}
		return vDTOResp;
	}

	@Override
	public List<VmtCountyDTO> findAll() {
		return mapper.convertToDtoList(repo.findAll());
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
		
	}

}
