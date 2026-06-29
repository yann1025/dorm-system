package com.example.dormsystem1.controller;
import com.example.dormsystem.common.R;
import com.example.dormsystem1.entity.HygieneCheck;
import com.example.dormsystem1.mapper.HygieneMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hygienes")
public class HygieneController {
    private final HygieneMapper mapper;
    public HygieneController(HygieneMapper mapper){ this.mapper = mapper; }

    @GetMapping public R list(){ return R.ok(mapper.list()); }
    @PostMapping public R add(@RequestBody HygieneCheck h){ mapper.insert(h); return R.ok(); }
    @DeleteMapping("/{id}") public R del(@PathVariable Long id){ mapper.delete(id); return R.ok(); }
}