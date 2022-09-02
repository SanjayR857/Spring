package com.cg.sm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class StudentController {
   
	@Autowired
	private StudentService service;
	
	//Retrieve All
	@GetMapping("/students")
	public List<Student> list(){
		return service.listAll();
	}
	//Retrieve student by id
	
	@GetMapping("/students/{id}")
	public ResponseEntity<Student> searchStudentById(@PathVariable Integer id){
	try{
	Student student = service.searchStudentById(id);
	return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
	catch (NoSuchElementException e)
	{
	return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
	}
	}
	
	//addStudent 
	@PostMapping("/students")
	public void addstudent(@RequestBody Student student) {
		service.save(student);
	}
	
//	//update student
//	@PutMapping("/students/{id}")
//	public ResponseEntity<?> updateStudent(@RequestBody Student student ,@PathVariable Integer id){
//		try {
//			
//			Student existstudent =service.searchStudentById(id);
//			return new ResponseEntity<>(HttpStatus.OK);
//		} catch (Exception e) {
//		return new ResponseEntity<>(HttpStatus.NOT//_FOUND);
//		}
//	}
	@PutMapping("/students/{id}")
	public ResponseEntity<?> update(@RequestBody Student student,@PathVariable Integer id) {
		try{
			Student existstudent = service.searchStudentById(id);
		    service.save(student);
		    return new ResponseEntity<>(HttpStatus.OK);
		   } catch(Exception e) {
			   
			   return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		   }
	}
	
	//delete Student
	@DeleteMapping("/students/{id}")
	public void delete(@PathVariable Integer id) {
		service.deleteStudent(id);
	}
}
