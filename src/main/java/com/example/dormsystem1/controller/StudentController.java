package com.example.dormsystem1.controller;
import com.example.dormsystem.common.R;
import com.example.dormsystem1.entity.Student;
import com.example.dormsystem1.mapper.StudentMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentMapper mapper;
    public StudentController(StudentMapper mapper){ this.mapper = mapper; }

    @GetMapping public R list(@RequestParam(required = false) String kw){ return R.ok(mapper.list(kw)); }
    @PostMapping public R add(@RequestBody Student s){ mapper.insert(s); return R.ok(s); }
    @PutMapping public R update(@RequestBody Student s){ mapper.update(s); return R.ok(); }
    @DeleteMapping("/{id}") public R del(@PathVariable Long id){ mapper.delete(id); return R.ok(); }
}