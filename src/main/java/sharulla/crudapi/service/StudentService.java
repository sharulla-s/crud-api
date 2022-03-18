package sharulla.crudapi.service;

import java.util.List;

import sharulla.crudapi.entity.Student;

public interface StudentService {
	
	//save
	Student saveStudent(Student student);
	
	//read
	List<Student> fetchStudentList();
	
	//update
	Student updateStudent(Student student, Long studentId);
	
	//delete
	void deleteStudentById(Long studentId );

}
