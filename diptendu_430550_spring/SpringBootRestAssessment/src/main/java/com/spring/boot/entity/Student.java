package com.spring.boot.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	private int admissionId;
	private String itiCode;
	private int tradeId;
	private int academicYear;
	private String studentName;
	private String fatherName;
	private String motherName;
	private String dob;
	private String sscStatus;
	private double gpa;
	private int sscMarks;
	private int yearofpass;
	private String caste;
	private String subcaste;
	private String enclosedCertifecates[];
	private String rationcardNumber;
	private long adhaarcardNumber;
	private String admissionDate;
	private int meritNo;
	private long hallticketNumber;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="admissionId")
	private Admission admission;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="addrId")
	private Address address;

	public int getAdmissionId() {
		return admissionId;
	}

	public void setAdmissionId(int admissionId) {
		this.admissionId = admissionId;
	}

	public String getItiCode() {
		return itiCode;
	}

	public void setItiCode(String itiCode) {
		this.itiCode = itiCode;
	}

	public int getTradeId() {
		return tradeId;
	}

	public void setTradeId(int tradeId) {
		this.tradeId = tradeId;
	}

	public int getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(int academicYear) {
		this.academicYear = academicYear;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getSscStatus() {
		return sscStatus;
	}

	public void setSscStatus(String sscStatus) {
		this.sscStatus = sscStatus;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getSscMarks() {
		return sscMarks;
	}

	public void setSscMarks(int sscMarks) {
		this.sscMarks = sscMarks;
	}

	public int getYearofpass() {
		return yearofpass;
	}

	public void setYearofpass(int yearofpass) {
		this.yearofpass = yearofpass;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public String getSubcaste() {
		return subcaste;
	}

	public void setSubcaste(String subcaste) {
		this.subcaste = subcaste;
	}

	public String[] getEnclosedCertifecates() {
		return enclosedCertifecates;
	}

	public void setEnclosedCertifecates(String[] enclosedCertifecates) {
		this.enclosedCertifecates = enclosedCertifecates;
	}

	public String getRationcardNumber() {
		return rationcardNumber;
	}

	public void setRationcardNumber(String rationcardNumber) {
		this.rationcardNumber = rationcardNumber;
	}

	public long getAdhaarcardNumber() {
		return adhaarcardNumber;
	}

	public void setAdhaarcardNumber(long adhaarcardNumber) {
		this.adhaarcardNumber = adhaarcardNumber;
	}

	public String getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}

	public int getMeritNo() {
		return meritNo;
	}

	public void setMeritNo(int meritNo) {
		this.meritNo = meritNo;
	}

	public long getHallticketNumber() {
		return hallticketNumber;
	}

	public void setHallticketNumber(long hallticketNumber) {
		this.hallticketNumber = hallticketNumber;
	}

	public Admission getAdmission() {
		return admission;
	}

	public void setAdmission(Admission admission) {
		this.admission = admission;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
