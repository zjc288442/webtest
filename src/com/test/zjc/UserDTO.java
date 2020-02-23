package com.test.zjc;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @author zhangjm
 * 用户DTO
 * 2014年2月15日
 */
public class UserDTO   {

	private static final long serialVersionUID = 1L;
	private String userId;//用户id
	private String userName;//姓名
	private String loginCode;//登陆名
	private String loginPassword;//登陆密码
	private String userStatus;//用户状态(0:无效 1:有效 2:锁定)
	private String userLevel;//用户级别 
	private String orgId;//所属机构
	private String organName;//机构名称
	private String userType;//用户类别(0:内部 1外部)
	private String remark;//备注
	private String stopDate;//注销时间
	private String isused; //用户是否锁定状态
	private Date pwdUpdateDate; //用户最后一次修改密码的时间
	private Integer pwdErrCount; //密码输错次数
	private Date pwdErrTime;//密码输错时间
	private String ip;//ip地址
	private String machine;//主机名
	private String code;//客户编码
	private String createdBy;
	private String createdDate;
	private String updatedBy;
	private String updatedDate;
	private String status;//状态
	private String QQNo;//QQ号码
	private String email;//电子邮件
	private String movePhone;//移动电话
	private String fixedPhone;//住宅电话
	private String postNo;//邮政编码
	private String homeAddress;//住宅地址
	private Integer kindEnumid;
	private Integer placeEnumid;
	private String degree;//学历
	private Integer schollageEnumid;
	private Integer typeEnumid;
	private Integer dutyEnumid;
	private Integer postEnumid;
	private String sex;
	private String otherCardNo;//其它证件号码
	private String personalCardNo;//证件号码
	private String cardType;//证件类型
	private String cardNum;//证件号码
	private String dimissionTime;
	private String entryTime;
	private String borthDate;
	private String shortCode;
	private String roleId;//角色Id
	private Integer mob;//MOB
	private String enable;//是否激活
	private String approvemarker;//分单标记
	
	private String pId;//兼容ztreejson
	private List<String> orgIds;//组织机构id
	private List<String> listUser;//
	
	private String roles;//角色
	private String orgs;//机构
	private String posts;//岗位
	private int num;//业务管理-预约记录
	
	private String userNameLevel; //用户和级别
	//预约记录
	private String personName;//客户名称
	private String customerNo;//客户编号
	private String cardNo;//客户身份证号
	private String mobile;//手机号码
	private String managera;//信贷员
	private BigDecimal minLimit;//最小限额
	private BigDecimal maxLimit;//最大限额
	private String ucaccount;//uc账号
	private String caller;//主叫号码
	private String longcaller;//长号
	private String reapproveGrant;//大额复审权限
	private String productName;
	private String isnewcolleague;//是否新同事
	private BigDecimal visitTarget;//外访月目标
	
	private String sign;
	
	private List<String> firstList =  new ArrayList<String>();//初审菜单列表需要的list
	
	private List<String> organList;
	
	private String ownerOrganId;
	
	private String handleFeeType;//用户历史业务数据
	
	private String ssoLoginName;//EIP单点登录账号
	
	public String getSsoLoginName() {
		return ssoLoginName;
	}
	public void setSsoLoginName(String ssoLoginName) {
		this.ssoLoginName = ssoLoginName;
	}
	public String getHandleFeeType() {
		return handleFeeType;
	}
	public void setHandleFeeType(String handleFeeType) {
		this.handleFeeType = handleFeeType;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public List<String> getFirstList() {
		return firstList;
	}
	public void setFirstList(List<String> firstList) {
		this.firstList = firstList;
	}
	public String getManagera() {
		return managera;
	}
	public void setManagera(String managera) {
		this.managera = managera;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getOrganName() {
		return organName;
	}
	public void setOrganName(String organName) {
		this.organName = organName;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getUserNameLevel() {
		return userNameLevel;
	}
	public void setUserNameLevel(String userNameLevel) {
		this.userNameLevel = userNameLevel;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public List<String> getOrgIds() {
		return orgIds;
	}
	
	public Integer getMob() {
		return mob;
	}
	public void setMob(Integer mob) {
		this.mob = mob;
	}
	public void setOrgIds(List<String> orgIds) {
		this.orgIds = orgIds;
	}
	
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getQQNo() {
		return QQNo;
	}
	public void setQQNo(String qQNo) {
		QQNo = qQNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMovePhone() {
		return movePhone;
	}
	public void setMovePhone(String movePhone) {
		this.movePhone = movePhone;
	}
	public String getFixedPhone() {
		return fixedPhone;
	}
	public void setFixedPhone(String fixedPhone) {
		this.fixedPhone = fixedPhone;
	}
	public String getPostNo() {
		return postNo;
	}
	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Integer getKindEnumid() {
		return kindEnumid;
	}
	public void setKindEnumid(Integer kindEnumid) {
		this.kindEnumid = kindEnumid;
	}
	public Integer getPlaceEnumid() {
		return placeEnumid;
	}
	public void setPlaceEnumid(Integer placeEnumid) {
		this.placeEnumid = placeEnumid;
	}
	public String getDegree() {
		return degree;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public String getOrgs() {
		return orgs;
	}
	public void setOrgs(String orgs) {
		this.orgs = orgs;
	}
	public String getPosts() {
		return posts;
	}
	public void setPosts(String posts) {
		this.posts = posts;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public Integer getSchollageEnumid() {
		return schollageEnumid;
	}
	public void setSchollageEnumid(Integer schollageEnumid) {
		this.schollageEnumid = schollageEnumid;
	}
	public Integer getTypeEnumid() {
		return typeEnumid;
	}
	public void setTypeEnumid(Integer typeEnumid) {
		this.typeEnumid = typeEnumid;
	}
	public Integer getDutyEnumid() {
		return dutyEnumid;
	}
	public void setDutyEnumid(Integer dutyEnumid) {
		this.dutyEnumid = dutyEnumid;
	}
	public Integer getPostEnumid() {
		return postEnumid;
	}
	public void setPostEnumid(Integer postEnumid) {
		this.postEnumid = postEnumid;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getOtherCardNo() {
		return otherCardNo;
	}
	public void setOtherCardNo(String otherCardNo) {
		this.otherCardNo = otherCardNo;
	}
	public String getPersonalCardNo() {
		return personalCardNo;
	}
	public void setPersonalCardNo(String personalCardNo) {
		this.personalCardNo = personalCardNo;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}	
	public String getStopDate() {
		return stopDate;
	}
	public void setStopDate(String stopDate) {
		this.stopDate = stopDate;
	}
	public String getDimissionTime() {
		return dimissionTime;
	}
	public void setDimissionTime(String dimissionTime) {
		this.dimissionTime = dimissionTime;
	}
	public String getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(String entryTime) {
		this.entryTime = entryTime;
	}
	public String getBorthDate() {
		return borthDate;
	}
	public void setBorthDate(String borthDate) {
		this.borthDate = borthDate;
	}
	
	public String getShortCode() {
		return shortCode;
	}
	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoginCode() {
		return loginCode;
	}
	public void setLoginCode(String loginCode) {
		this.loginCode = loginCode;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getIsused() {
		return isused;
	}
	public void setIsused(String isused) {
		this.isused = isused;
	}
	public Date getPwdUpdateDate() {
		return pwdUpdateDate;
	}
	public void setPwdUpdateDate(Date pwdUpdateDate) {
		this.pwdUpdateDate = pwdUpdateDate;
	}
	public Integer getPwdErrCount() {
		return pwdErrCount;
	}
	public void setPwdErrCount(Integer pwdErrCount) {
		this.pwdErrCount = pwdErrCount;
	}
	public Date getPwdErrTime() {
		return pwdErrTime;
	}
	public void setPwdErrTime(Date pwdErrTime) {
		this.pwdErrTime = pwdErrTime;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getMachine() {
		return machine;
	}
	public void setMachine(String machine) {
		this.machine = machine;
	}
	public String getEnable() {
		return enable;
	}
	public void setEnable(String enable) {
		this.enable = enable;
	}
	public List<String> getListUser() {
		return listUser;
	}
	public void setListUser(List<String> listUser) {
		this.listUser = listUser;
	}
	public BigDecimal getMinLimit() {
		return minLimit;
	}
	public void setMinLimit(BigDecimal minLimit) {
		this.minLimit = minLimit;
	}
	public BigDecimal getMaxLimit() {
		return maxLimit;
	}
	public void setMaxLimit(BigDecimal maxLimit) {
		this.maxLimit = maxLimit;
	}
	public String getApprovemarker() {
		return approvemarker;
	}
	public void setApprovemarker(String approvemarker) {
		this.approvemarker = approvemarker;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public List<String> getOrganList() {
		return organList;
	}
	public void setOrganList(List<String> organList) {
		this.organList = organList;
	}
	public String getOwnerOrganId() {
		return ownerOrganId;
	}
	public void setOwnerOrganId(String ownerOrganId) {
		this.ownerOrganId = ownerOrganId;
	}
	public String getUcaccount() {
		return ucaccount;
	}
	public void setUcaccount(String ucaccount) {
		this.ucaccount = ucaccount;
	}
	public String getCaller() {
		return caller;
	}
	public void setCaller(String caller) {
		this.caller = caller;
	}
	public String getLongcaller() {
		return longcaller;
	}
	public void setLongcaller(String longcaller) {
		this.longcaller = longcaller;
	}
	public String getReapproveGrant() {
		return reapproveGrant;
	}
	public void setReapproveGrant(String reapproveGrant) {
		this.reapproveGrant = reapproveGrant;
	}
	public String getIsnewcolleague() {
		return isnewcolleague;
	}
	public void setIsnewcolleague(String isnewcolleague) {
		this.isnewcolleague = isnewcolleague;
	}
	public BigDecimal getVisitTarget() {
		return visitTarget;
	}
	public void setVisitTarget(BigDecimal visitTarget) {
		this.visitTarget = visitTarget;
	}
	
}
