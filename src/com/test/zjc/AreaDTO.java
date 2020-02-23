package com.test.zjc;

import java.util.Date;


/**
 * @author wuzg
 * 区域设置DTO
 * 2014年3月5日
 */
public class AreaDTO  {

	private static final long serialVersionUID = 1L;
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String pId;//上级区域  a 
	private String code;//区域代码b
	private String name;//区域名字
	private String isused;//是否启用[0:否1:是]
	private String remarks;//备注
	private String pname;//上级区域名字
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsused() {
		return isused;
	}
	public void setIsused(String isused) {
		this.isused = isused;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
