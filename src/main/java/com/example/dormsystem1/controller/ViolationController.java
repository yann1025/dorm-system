package com.example.dormsystem1.controller;
import com.example.dormsystem.common.R;
import com.example.dormsystem1.entity.Violation;
import com.example.dormsystem1.mapper.ViolationMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/violations")
public class ViolationController {
    private final ViolationMapper mapper;
    public ViolationController(ViolationMapper mapper){ this.mapper = mapper; }

    @GetMapping public R list(){ return R.ok(mapper.list()); }
    @PostMapping public R add(@RequestBody Violation v){ mapper.insert(v); return R.ok(); }
    @DeleteMapping("/{id}") public R del(@PathVariable Long id){ mapper.delete(id); return R.ok(); }
}