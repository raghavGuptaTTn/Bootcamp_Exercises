package com.spring.jpa.session.repos;

import com.spring.jpa.session.entities.Student;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Integer> {

    @Query(value = "select * from student", nativeQuery = true)
    List<Student> findAllStudents(Pageable pageable);

//    @Query("select st.fname, st.lname from Student st")
//    List<Object[]> findAllStudentsPartial();


    @Query(value="select st.fname, st.lname from Student st", nativeQuery = true)
    List<Object[]> findAllStudentsPartial();

    @Query("select st.fname from Student st where st.fname = :firstName")
    List<Object[]> findAllStudentsByName(@Param("firstName") String fname);

    @Transactional
    @Modifying
    @Query("delete from Student where score=100")
    public void delEmp();

//    @Query("from Student")
//    List<Student> findAllStudents(Pageable pageable);


}
