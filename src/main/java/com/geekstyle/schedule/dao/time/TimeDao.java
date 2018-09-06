package com.geekstyle.schedule.dao.time;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface TimeDao {
	
	@Select({"select time from time where id = 1"})
	public Integer getTime();
	
	@Update({"UPDATE time SET time = time + 1 where id = 1"})
	public void updateTime();
	
}
