package com.geekstyle.schedule.model.version;

import java.util.Date;

import net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer.Prefixing;

public class Schedule {
	
	private Integer id;
	private String name;
	private Integer version;
	private String description;
	private Date createTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
