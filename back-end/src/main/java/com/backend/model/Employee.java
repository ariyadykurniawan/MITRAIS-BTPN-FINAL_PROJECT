package com.backend.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="employee")
public class Employee {

	@Id
    @Column(name="emp_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long empId;
    @Column(name="first_name", nullable = false)
    private String firstName;
    @Column(name="last_name", nullable = false)
    private String lastName;
    @Column(name="gender", nullable = false)
    private String gender;
    @Column(name="dob", nullable = false)
    private Date dob;
	@Column(name="nationality", nullable = false)
    private String nationality;
	@Column(name="marital_status", nullable = false)
	private String maritalStatus;
	@Column(name="phone_number", nullable = false)
	private String phoneNumber;
	@Column(name="sub_division", nullable = false)
	private String subDivision;
	@Column(name="status", nullable = false)
	private String status;
	@Column(name="suspend_date",nullable = false)
	private Date suspendDate;
	@Column(name="hired_date")
	private Date hiredDate;
	@Column(name="grade", nullable = false)
	private String grade;
	@Column(name="division", nullable = false)
	private String division;
	@Column(name="email", nullable = false)
	private String email;
	
	@Lob
	@Column
	(name="emp_pict", nullable = false)
	private String empPict;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="office_location_id")
	private OfficeLocation officeLocation;
	
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getSubDivision() {
		return subDivision;
	}
	public void setSubDivision(String subDivision) {
		this.subDivision = subDivision;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Date getSuspendDate() {
		return suspendDate;
	}
	public void setSuspendDate(Date suspendDate) {
		this.suspendDate = suspendDate;
	}
	
	public Date getHiredDate() {
		return hiredDate;
	}
	public void setHiredDate(Date hiredDate) {
		this.hiredDate = hiredDate;
	}
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmpPict() {
		return empPict;
	}
	public void setEmpPict(String empPict) {
		this.empPict = empPict;
	}
	
	public OfficeLocation getOfficeLocation() {
		return officeLocation;
	}
	public void setOfficeLocation(OfficeLocation officeLocation) {
		this.officeLocation = officeLocation;
	}
	
	public Employee(){
		
	}

	public Employee(String firstName, String lastName, String gender, Date dob, String nationality,
			String maritalStatus, String phoneNumber, String subDivision, String division, String status, Date suspendDate, Date hiredDate,
			String grade, String email, OfficeLocation officeLocation, String empPict) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.nationality = nationality;
		this.maritalStatus = maritalStatus;
		this.phoneNumber = phoneNumber;
		this.subDivision = subDivision;
		this.division = division;
		this.status = status;
		this.suspendDate = suspendDate;
		this.hiredDate = hiredDate;
		this.grade = grade;
		this.email = email;
		this.officeLocation = officeLocation;
		this.empPict = empPict;
	}
	
}