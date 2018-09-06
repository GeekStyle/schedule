package com.geekstyle.schedule.controller.time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.geekstyle.schedule.service.time.TimeService;

@RestController
@RequestMapping("/time")
public class TimeController {
	
	@Autowired
	TimeService timeService;
	
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody ResponseEntity<Integer> getTime() {
		Integer time =  timeService.getTime();
		return ResponseEntity.status(HttpStatus.OK).body(time);
	}
	
}
