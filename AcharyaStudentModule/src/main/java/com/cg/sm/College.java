package com.cg.sm;

import org.apache.catalina.User;

public class College {
	
	private Integer Id;
	private User collegeAdmin;
	private String collegeName;
	private String location;
	
	public College() {
		super();
	}

	
     
	public College(Integer id, User collegeAdmin, String collegeName, String location) {
		super();
		Id = id;
		this.collegeAdmin = collegeAdmin;
		this.collegeName = collegeName;
		this.location = location;
	}



	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public User getCollegeAdmin() {
		return collegeAdmin;
	}

	public void setCollegeAdmin(User collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "College [Id=" + Id + ", collegeAdmin=" + collegeAdmin + ", collegeName=" + collegeName + ", location="
				+ location + ", getId()=" + getId() + ", getCollegeAdmin()=" + getCollegeAdmin() + ", getCollegeName()="
				+ getCollegeName() + ", getLocation()=" + getLocation() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
