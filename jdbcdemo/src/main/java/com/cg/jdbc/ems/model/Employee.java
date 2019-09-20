package com.cg.jdbc.ems.model;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Employee {
	
	private BigInteger empId;
	private String empname;
	private BigDecimal empSal;
	
	public Employee() {
		
	}

	public Employee(BigInteger empId, String empname, BigDecimal empSal) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.empSal = empSal;
	}

	public BigInteger getEmpId() {
		return empId;
	}

	public void setEmpId(BigInteger empId) {
		this.empId = empId;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public BigDecimal getEmpSal() {
		return empSal;
	}

	public void setEmpSal(BigDecimal empSal) {
		this.empSal = empSal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		result = prime * result + ((empSal == null) ? 0 : empSal.hashCode());
		result = prime * result + ((empname == null) ? 0 : empname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		if (empSal == null) {
			if (other.empSal != null)
				return false;
		} else if (!empSal.equals(other.empSal))
			return false;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", empSal=" + empSal + "]";
	}
	
	

}
