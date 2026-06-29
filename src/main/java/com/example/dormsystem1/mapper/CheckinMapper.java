package com.example.dormsystem1.mapper;
import com.example.dormsystem1.entity.CheckinRecord;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface CheckinMapper {
    @Select("SELECT c.checkin_id, c.student_id, c.room_id, c.checkin_at, c.checkout_at, c.status, " +
            "       s.student_name, s.student_no, r.room_no, b.building_name " +
            "FROM checkin_record c " +
            "LEFT JOIN student s ON c.student_id=s.student_id " +
            "LEFT JOIN room r    ON c.room_id=r.room_id " +
            "LEFT JOIN building b ON r.building_id=b.building_id " +
            "ORDER BY c.checkin_id DESC")
    List<CheckinRecord> list();

    @Insert("INSERT INTO checkin_record(student_id, room_id, checkin_at, status) VALUES(#{studentId},#{roomId},#{checkinAt},'IN')")
    int insert(CheckinRecord c);

    @Update("UPDATE checkin_record SET room_id=#{roomId} WHERE checkin_id=#{checkinId} AND status='IN'")
    int transfer(CheckinRecord c);

    @Update("UPDATE checkin_record SET status='OUT', checkout_at=#{checkoutAt} WHERE checkin_id=#{checkinId}")
    int checkout(CheckinRecord c);

    @Select("SELECT COUNT(*) FROM checkin_record WHERE status='IN'")
    int countActive();

    @Select("SELECT COUNT(*) FROM checkin_record WHERE student_id=#{sid} AND status='IN'")
    int activeByStudent(@Param("sid") Long sid);
}