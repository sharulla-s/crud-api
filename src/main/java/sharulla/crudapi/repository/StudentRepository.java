package sharulla.crudapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sharulla.crudapi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
