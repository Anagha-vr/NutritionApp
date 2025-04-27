package com.nutrition.userService.Entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userIdentification;
    private String name;
    private String contact;
    private String gender;
    private String dob;
    private String photo;
    private String email;
    private String role;
    private String status;
    private double weight;
    private double height;
    private String dietaryOrientation;
    private String intensity;
    private String goal;
    private String workoutTime;
    private String wakeUpTime;
    private String sleepTime;
    private String medicalCondition;
    private String allergicTo;
    private String loginName;
    private String password;
    
    
    public User() {
    }

    
	public User(Long id, String userIdentification, String name, String contact, String gender, String dob,
			String photo, String email, String role, String status, double weight, double height,
			String dietaryOrientation, String intensity, String goal, String workoutTime, String wakeUpTime,
			String sleepTime, String medicalCondition, String allergicTo, String loginName, String password) {
		super();
		this.id = id;
		this.userIdentification = userIdentification;
		this.name = name;
		this.contact = contact;
		this.gender = gender;
		this.dob = dob;
		this.photo = photo;
		this.email = email;
		this.role = role;
		this.status = status;
		this.weight = weight;
		this.height = height;
		this.dietaryOrientation = dietaryOrientation;
		this.intensity = intensity;
		this.goal = goal;
		this.workoutTime = workoutTime;
		this.wakeUpTime = wakeUpTime;
		this.sleepTime = sleepTime;
		this.medicalCondition = medicalCondition;
		this.allergicTo = allergicTo;
		this.loginName = loginName;
		this.password = password;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserIdentification() {
		return userIdentification;
	}
	public void setUserIdentification(String userIdentification) {
		this.userIdentification = userIdentification;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getDietaryOrientation() {
		return dietaryOrientation;
	}
	public void setDietaryOrientation(String dietaryOrientation) {
		this.dietaryOrientation = dietaryOrientation;
	}
	public String getIntensity() {
		return intensity;
	}
	public void setIntensity(String intensity) {
		this.intensity = intensity;
	}
	public String getGoal() {
		return goal;
	}
	public void setGoal(String goal) {
		this.goal = goal;
	}
	public String getWorkoutTime() {
		return workoutTime;
	}
	public void setWorkoutTime(String workoutTime) {
		this.workoutTime = workoutTime;
	}
	public String getWakeUpTime() {
		return wakeUpTime;
	}
	public void setWakeUpTime(String wakeUpTime) {
		this.wakeUpTime = wakeUpTime;
	}
	public String getSleepTime() {
		return sleepTime;
	}
	public void setSleepTime(String sleepTime) {
		this.sleepTime = sleepTime;
	}
	public String getMedicalCondition() {
		return medicalCondition;
	}
	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}
	public String getAllergicTo() {
		return allergicTo;
	}
	public void setAllergicTo(String allergicTo) {
		this.allergicTo = allergicTo;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userIdentification=" + userIdentification + ", name=" + name + ", contact="
				+ contact + ", gender=" + gender + ", dob=" + dob + ", photo=" + photo + ", email=" + email + ", role="
				+ role + ", status=" + status + ", weight=" + weight + ", height=" + height + ", dietaryOrientation="
				+ dietaryOrientation + ", intensity=" + intensity + ", goal=" + goal + ", workoutTime=" + workoutTime
				+ ", wakeUpTime=" + wakeUpTime + ", sleepTime=" + sleepTime + ", medicalCondition=" + medicalCondition
				+ ", allergicTo=" + allergicTo + ", loginName=" + loginName + ", password=" + password + "]";
	}


	

   
}
