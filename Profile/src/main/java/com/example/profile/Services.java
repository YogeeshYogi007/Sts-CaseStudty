package com.example.profile;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Services {

	@Autowired
	private repository repository;
	
	public List<Profile> allProfile(){
		return repository.findAll();
		
	}
	
	public Profile findById(int id) {
		return repository.findById(id).get();
		
	}
	public void save(Profile profile) {
		repository.save(profile);
	}
	public void delete(Integer id) {
		repository.deleteById(id);
	}
	
}
