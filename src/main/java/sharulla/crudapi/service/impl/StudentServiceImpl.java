package sharulla.crudapi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sharulla.crudapi.entity.Student;
import sharulla.crudapi.repository.StudentRepository;
import sharulla.crudapi.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public List<Student> fetchStudentList() {
		// TODO Auto-generated method stub
		return (List<Student>)
				studentRepository.findAll();
	}

	@Override
	public Student updateStudent(Student student, Long studentId) {
		
		 Student stuDB
         = studentRepository.findById(studentId)
               .get();

     
		// TODO Auto-generated method stub
		return studentRepository.save(stuDB);
	}

	@Override
	public void deleteStudentById(Long studentId) {
		// TODO Auto-generated method stub
		
		studentRepository.deleteById(studentId);
		
	}
	
	

}
