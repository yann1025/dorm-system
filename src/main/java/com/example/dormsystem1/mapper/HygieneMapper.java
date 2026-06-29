package com.example.dormsystem1.mapper;
import com.example.dormsystem1.entity.HygieneCheck;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface HygieneMapper {
    @Select("SELECT h.check_id, h.room_id, h.check_date, h.score, h.checker, h.remark, " +
            "       r.room_no, b.building_name " +
            "FROM hygiene_check h " +
            "LEFT JOIN room r    ON h.room_id=r.room_id " +
            "LEFT JOIN building b ON r.building_id=b.building_id " +
            "ORDER BY h.check_id DESC")
    List<HygieneCheck> list();

    @Insert("INSERT INTO hygiene_check(room_id, check_date, score, checker, remark) " +
            "VALUES(#{roomId},#{checkDate},#{score},#{checker},#{remark})")
    int insert(HygieneCheck h);

    @Delete("DELETE FROM hygiene_check WHERE check_id=#{id}")
    int delete(@Param("id") Long id);
}