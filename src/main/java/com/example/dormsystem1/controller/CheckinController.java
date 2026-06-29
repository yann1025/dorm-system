package com.example.dormsystem1.controller;
import com.example.dormsystem.common.R;
import com.example.dormsystem1.entity.CheckinRecord;
import com.example.dormsystem1.mapper.CheckinMapper;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;

@RestController
@RequestMapping("/api/checkins")
public class CheckinController {
    private final CheckinMapper mapper;
    public CheckinController(CheckinMapper mapper){ this.mapper = mapper; }

    @GetMapping public R list(){ return R.ok(mapper.list()); }

    @PostMapping public R add(@RequestBody CheckinRecord c){
        if(mapper.activeByStudent(c.getStudentId())>0) return R.fail("该学生已在住");
        if(c.getCheckinAt()==null) c.setCheckinAt(LocalDate.now());
        mapper.insert(c);
        return R.ok();
    }

    @PutMapping("/transfer") public R transfer(@RequestBody CheckinRecord c){
        mapper.transfer(c); return R.ok();
    }

    @PutMapping("/checkout") public R checkout(@RequestBody CheckinRecord c){
        if(c.getCheckoutAt()==null) c.setCheckoutAt(LocalDate.now());
        mapper.checkout(c); return R.ok();
    }
}