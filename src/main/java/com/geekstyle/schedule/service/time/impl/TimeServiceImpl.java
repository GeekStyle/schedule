package com.geekstyle.schedule.service.time.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekstyle.schedule.dao.time.TimeDao;
import com.geekstyle.schedule.service.time.TimeService;

@Service
public class TimeServiceImpl implements TimeService {

	@Autowired
	TimeDao timeDao;
	
	@Override
	public Integer getTime() {
		return timeDao.getTime();
	}

	@Override
	public void updateTime() {
		timeDao.updateTime();
	}

}
