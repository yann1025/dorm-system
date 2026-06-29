package com.example.dormsystem1.mapper;
import com.example.dormsystem1.entity.Student;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface StudentMapper {
    @Select("<script>SELECT student_id, student_no, student_name, gender, class_name, phone FROM student " +
            "<where>" +
            "<if test='kw!=null and kw!=\"\"'> AND (student_name LIKE CONCAT('%',#{kw},'%') OR student_no LIKE CONCAT('%',#{kw},'%'))</if>" +
            "</where> ORDER BY student_id</script>")
    List<Student> list(@Param("kw") String kw);

    @Insert("INSERT INTO student(student_no, student_name, gender, class_name, phone) " +
            "VALUES(#{studentNo},#{studentName},#{gender},#{className},#{phone})")
    @Options(useGeneratedKeys = true, keyProperty = "studentId", keyColumn = "student_id")
    int insert(Student s);

    @Update("UPDATE student SET student_no=#{studentNo}, student_name=#{studentName}, gender=#{gender}, class_name=#{className}, phone=#{phone} WHERE student_id=#{studentId}")
    int update(Student s);

    @Delete("DELETE FROM student WHERE student_id=#{id}")
    int delete(@Param("id") Long id);

    @Select("SELECT COUNT(*) FROM student")
    int count();
}