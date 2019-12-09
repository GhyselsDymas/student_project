package be.ehb.student_project.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StudentDAO extends CrudRepository<Student, Integer> {
}
