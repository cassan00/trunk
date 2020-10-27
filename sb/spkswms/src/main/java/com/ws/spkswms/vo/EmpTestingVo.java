package com.ws.spkswms.vo;

/*
 * plz convt -> lombok
 */

public class EmpTestingVo {
	String empNo;
	String eName;
	String job;

	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "EmpVo [empNo=" + empNo + ", eName=" + eName + ", job=" + job + "]";
	}


}
