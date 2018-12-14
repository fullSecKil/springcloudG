package com.fly.sericefeign.service.imp;

import com.fly.sericefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Service;

@Service
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayFormClientOne(String name) {
        return "sorry" + name;
    }
}
