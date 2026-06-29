package com.example.dormsystem1.controller;
import com.example.dormsystem.common.R;
import com.example.dormsystem1.entity.Room;
import com.example.dormsystem1.mapper.RoomMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {
    private final RoomMapper mapper;
    public RoomController(RoomMapper mapper){ this.mapper = mapper; }

    @GetMapping public R list(){ return R.ok(mapper.list()); }
    @PostMapping public R add(@RequestBody Room r){ mapper.insert(r); return R.ok(r); }
    @PutMapping public R update(@RequestBody Room r){ mapper.update(r); return R.ok(); }
    @DeleteMapping("/{id}") public R del(@PathVariable Long id){ mapper.delete(id); return R.ok(); }
}