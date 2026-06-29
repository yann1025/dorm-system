package com.example.dormsystem1.controller;
import com.example.dormsystem.common.R;
import com.example.dormsystem1.mapper.*;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/stats")
public class StatsController {
    private final BuildingMapper bm;
    private final RoomMapper rm;
    private final StudentMapper sm;
    private final CheckinMapper cm;
    private final ViolationMapper vm;

    public StatsController(BuildingMapper bm, RoomMapper rm, StudentMapper sm,
                           CheckinMapper cm, ViolationMapper vm){
        this.bm=bm; this.rm=rm; this.sm=sm; this.cm=cm; this.vm=vm;
    }

    @GetMapping
    public R overview(){
        Map<String,Object> m = new HashMap<>();
        m.put("buildingCount", bm.count());
        m.put("roomCount",     rm.count());
        m.put("studentCount",  sm.count());
        m.put("bedTotal",      rm.sumCapacity());
        m.put("bedUsed",       cm.countActive());
        m.put("violationCount",vm.count());
        return R.ok(m);
    }
}