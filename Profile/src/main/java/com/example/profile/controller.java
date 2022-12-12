package com.example.profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@Autowired
	private Services services;

	@GetMapping("/Profiles")
	public List<Profile> findAll(){
		return services.allProfile();

	}
	@GetMapping("/Profiles/{id}")
	public ResponseEntity<Profile> findById( @PathVariable Integer id) {
		try 
		{
			Profile profile = services.findById(id);
			return new ResponseEntity<Profile>(profile, HttpStatus.OK);
		} 
		catch (Exception e) 
		{
			return new ResponseEntity<Profile>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/Profiles")
	public void add(@RequestBody Profile profile) {
		services.save(profile);
	}
	
	@PutMapping("/Profiles/{id}")
	public ResponseEntity<?> update(@RequestBody Profile profile ,@PathVariable Integer id)
	{
		try {
			Profile existuser= services.findById(id);
			services.save(profile);
			return new ResponseEntity<Profile>(profile ,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<Profile>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/Profiles/{id}")
	public void delete(@PathVariable Integer id) {
		services.delete(id);
		
	}
}

