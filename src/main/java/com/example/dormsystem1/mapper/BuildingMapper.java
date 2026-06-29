package com.example.dormsystem1.mapper;
import com.example.dormsystem1.entity.Building;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface BuildingMapper {
    @Select("SELECT building_id, building_name, floors, manager FROM building ORDER BY building_id")
    List<Building> list();

    @Insert("INSERT INTO building(building_name, floors, manager) VALUES(#{buildingName},#{floors},#{manager})")
    @Options(useGeneratedKeys = true, keyProperty = "buildingId", keyColumn = "building_id")
    int insert(Building b);

    @Update("UPDATE building SET building_name=#{buildingName}, floors=#{floors}, manager=#{manager} WHERE building_id=#{buildingId}")
    int update(Building b);

    @Delete("DELETE FROM building WHERE building_id=#{id}")
    int delete(@Param("id") Long id);

    @Select("SELECT COUNT(*) FROM building")
    int count();
}