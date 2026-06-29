package com.example.dormsystem1.mapper;
import com.example.dormsystem1.entity.Violation;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface ViolationMapper {
    @Select("SELECT v.violation_id, v.student_id, v.violation_date, v.violation_type, v.description, v.punishment, " +
            "       s.student_name, s.student_no " +
            "FROM violation v LEFT JOIN student s ON v.student_id=s.student_id " +
            "ORDER BY v.violation_id DESC")
    List<Violation> list();

    @Insert("INSERT INTO violation(student_id, violation_date, violation_type, description, punishment) " +
            "VALUES(#{studentId},#{violationDate},#{violationType},#{description},#{punishment})")
    int insert(Violation v);

    @Delete("DELETE FROM violation WHERE violation_id=#{id}")
    int delete(@Param("id") Long id);

    @Select("SELECT COUNT(*) FROM violation")
    int count();
}