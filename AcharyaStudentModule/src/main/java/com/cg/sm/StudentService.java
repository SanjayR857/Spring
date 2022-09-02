package com.cg.sm;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class StudentService {

	@Autowired
    private StudentRespository repo;
	
	public List <Student>  listAll(){
		return repo.findAll();
	}
	//search student by id
	public Student searchStudentById(Integer id) {
		return repo.findById(id).get();
	}

	//save data
	public void save(Student student) {
		 repo.save(student);
	}
	//delete student
	public void deleteStudent(Integer id) {
		repo.deleteById(id);
	}
	
}
