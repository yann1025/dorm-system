package com.example.dormsystem1.mapper;
import com.example.dormsystem1.entity.Room;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface RoomMapper {
    @Select("SELECT r.room_id, r.building_id, r.room_no, r.capacity, r.remark, " +
            "       b.building_name, " +
            "       (SELECT COUNT(*) FROM checkin_record c WHERE c.room_id=r.room_id AND c.status='IN') AS used " +
            "FROM room r LEFT JOIN building b ON r.building_id=b.building_id " +
            "ORDER BY r.room_id")
    List<Room> list();

    @Insert("INSERT INTO room(building_id, room_no, capacity, remark) VALUES(#{buildingId},#{roomNo},#{capacity},#{remark})")
    @Options(useGeneratedKeys = true, keyProperty = "roomId", keyColumn = "room_id")
    int insert(Room r);

    @Update("UPDATE room SET building_id=#{buildingId}, room_no=#{roomNo}, capacity=#{capacity}, remark=#{remark} WHERE room_id=#{roomId}")
    int update(Room r);

    @Delete("DELETE FROM room WHERE room_id=#{id}")
    int delete(@Param("id") Long id);

    @Select("SELECT COUNT(*) FROM room")
    int count();

    @Select("SELECT IFNULL(SUM(capacity),0) FROM room")
    int sumCapacity();
}