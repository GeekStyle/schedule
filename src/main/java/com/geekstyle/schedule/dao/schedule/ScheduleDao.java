package com.geekstyle.schedule.dao.schedule;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface ScheduleDao {
	
	@Select({"select version from schedule where name = #{name}"})
	public Integer getVersion(String name);
	
	@Update({"UPDATE schedule SET version = version + 1 where name = #{name}"})
	public void updateVersion(String name);
	
	@Select({"select version from schedule where name = #{name} for update"})
	public Integer addLock(String name);
	
}
