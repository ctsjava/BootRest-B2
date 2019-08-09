package com.spring.boot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ContactNumber {

	@Id
	private int contactnoId;
	private long studentNumber;
	private long fatherNumber;
	private long otherNumber;

	public int getContactnoId() {
		return contactnoId;
	}

	public void setContactnoId(int contactnoId) {
		this.contactnoId = contactnoId;
	}

	public long getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(long studentNumber) {
		this.studentNumber = studentNumber;
	}

	public long getFatherNumber() {
		return fatherNumber;
	}

	public void setFatherNumber(long fatherNumber) {
		this.fatherNumber = fatherNumber;
	}

	public long getOtherNumber() {
		return otherNumber;
	}

	public void setOtherNumber(long otherNumber) {
		this.otherNumber = otherNumber;
	}

}
