package com.xwx.entity;

public class Plan {
	
	private Integer pid         ;
	private String pname       ;
	private String amount      ;//投资金额
	private String manager     ;//分管领导
	private String content     ;//投资说明
	private String did         ;//对应的部门id
	
	private String dname;//部门名称
	private String mhname;
	
	public String getMhname() {
		return mhname;
	}
	public void setMhname(String mhname) {
		this.mhname = mhname;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	@Override
	public String toString() {
		return "Plan [pid=" + pid + ", pname=" + pname + ", amount=" + amount + ", manager=" + manager + ", content="
				+ content + ", did=" + did + ", dname=" + dname + "]";
	}

}
