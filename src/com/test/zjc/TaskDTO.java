package com.test.zjc;

import java.util.Date;



/**
 * 璁″垝浠诲姟dto
 * @author zengtp
 *
 * 2014骞�3鏈�4鏃�
 */
public class TaskDTO   {
	private String taskId;
	private String taskName;//浠诲姟鍚嶇О
	private String state;// 鐘舵�� 0:鍋滅敤1锛氬惎鐢�
	private String type;// 绫诲瀷0锛氭墜鍔�1锛氫竴娆�2锛氭瘡灏忔椂3锛氭瘡鏃�4锛氭瘡鏄熸湡5锛氭瘡鏈�6锛氶珮绾�
	private String remark;// 澶囨敞
	private String corn;// corn琛ㄨ揪寮�
	private Date nextTime;// 涓嬩竴娆℃墽琛屾椂闂�
	private Date preTime;//涓婁竴娆℃墽琛屾椂闂� 
	private String taskState="1";// 浠诲姟鐘舵��0:澶辫触1锛氭垚鍔�
	private String recurValue;//澶嶅彂鍊�
	private String className;//宸ヤ綔浠诲姟鐨勭被鍚�
	private String operation="1";//鎿嶄綔0锛氬仠姝�1锛氳繍琛�
	private String nextTimeByString;//浣跨敤string鏄剧ず涓嬩竴娆℃墽琛屾椂闂�
	
	public String getNextTimeByString() {
		return nextTimeByString;
	}
	public void setNextTimeByString(String nextTimeByString) {
		this.nextTimeByString = nextTimeByString;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getRecurValue() {
		return recurValue;
	}
	public void setRecurValue(String recurValue) {
		this.recurValue = recurValue;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCorn() {
		return corn;
	}
	public void setCorn(String corn) {
		this.corn = corn;
	}
	public Date getNextTime() {
		return nextTime;
	}
	public void setNextTime(Date nextTime) {
		
		this.nextTime = nextTime;
	}
	public Date getPreTime() {
		return preTime;
	}
	public void setPreTime(Date preTime) {
		this.preTime = preTime;
	}
	public String getTaskState() {
		return taskState;
	}
	public void setTaskState(String taskState) {
		this.taskState = taskState;
	}
	
	
	
	
	
}
