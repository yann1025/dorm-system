package com.example.dormsystem1.controller;
import com.example.dormsystem.common.R;
import com.example.dormsystem1.entity.Building;
import com.example.dormsystem1.mapper.BuildingMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/buildings")
public class BuildingController {
    private final BuildingMapper mapper;
    public BuildingController(BuildingMapper mapper){ this.mapper = mapper; }

    @GetMapping public R list(){ return R.ok(mapper.list()); }
    @PostMapping public R add(@RequestBody Building b){ mapper.insert(b); return R.ok(b); }
    @PutMapping public R update(@RequestBody Building b){ mapper.update(b); return R.ok(); }
    @DeleteMapping("/{id}") public R del(@PathVariable Long id){ mapper.delete(id); return R.ok(); }
}