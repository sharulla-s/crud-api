package sharulla.crudapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sharulla.crudapi.entity.Student;
import sharulla.crudapi.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	//save
	@PostMapping("/student")
	public Student saveStudent(
			@RequestBody Student student)
	{
		return studentService.saveStudent(student);
	}
	
	
	//Read
	@GetMapping("/student")
	public List<Student> fetchStudentList()
	{
		return studentService.fetchStudentList();
	}
	
	//update
	@PutMapping("/student/{id}")
	public Student
	updateStudent(@RequestBody Student student,
			@PathVariable("id") Long studentId)
	{
		return studentService.updateStudent(student, studentId);
	}
	
	//delete
	@DeleteMapping("/student/{id}")
	public String deleteStudentById(@PathVariable("id")
	Long studentId)
	
	{
		studentService.deleteStudentById(studentId);
		return "Deleted successfully";
	}

}
