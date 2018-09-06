package com.geekstyle.schedule.service.schedule.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.geekstyle.schedule.dao.schedule.ScheduleDao;
import com.geekstyle.schedule.service.schedule.ScheduleService;
import com.geekstyle.schedule.service.time.TimeService;

@Service
@Transactional
public class ScheduleServiceImpl implements ScheduleService	{

	public static Map<String,Integer> versionMap = new HashMap<String,Integer>();
	
	@Autowired
	ScheduleDao scheduleDao;
	
	@Autowired
	TimeService timeService;
	
	@Override
	public Integer getVersion(String name) {
		return scheduleDao.getVersion(name);
	}

	@Override
	public void updateVersion(String name) {
		Integer version = scheduleDao.addLock(name);
		if( versionMap.get(name) == null ) {
			versionMap.put(name, 0);
		}
		Integer localVersion = versionMap.get(name);
		if(localVersion.intValue() < version.intValue()) {
			versionMap.put(name, version);
			return;
		}
		timeService.updateTime();
		versionMap.put(name, version + 1);
		scheduleDao.updateVersion(name);
	}
	
}
