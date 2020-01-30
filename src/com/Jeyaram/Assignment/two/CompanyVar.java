package com.Jeyaram.Assignment.two;
//bean class
public class CompanyVar {
	
	int cid;
	String cname,cfounder,chead;
	
	
	public CompanyVar(int cid, String cname, String cfounder, String chead) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cfounder = cfounder;
		this.chead = chead;
	}
	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + ", cfounder=" + cfounder + ", chead=" + chead + "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCfounder() {
		return cfounder;
	}
	public void setCfounder(String cfounder) {
		this.cfounder = cfounder;
	}
	public String getChead() {
		return chead;
	}
	public void setChead(String chead) {
		this.chead = chead;
	}
	
	

}
