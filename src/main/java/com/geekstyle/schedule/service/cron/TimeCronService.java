package com.geekstyle.schedule.service.cron;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.geekstyle.schedule.service.schedule.ScheduleService;

@Component
public class TimeCronService {
	
	@Autowired
	ScheduleService scheduleService;
	
    @Scheduled(cron="* * * * * ? ")
    public void getExchangeRate() {
    	scheduleService.updateVersion("time");
    }
	
}
