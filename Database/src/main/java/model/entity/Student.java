package model.entity;
// Generated 2016-12-09 16:03:21 by Hibernate Tools 5.1.0.Alpha1

/**
 * Student generated by hbm2java
 */
public class Student extends Entity {
	private static final long serialVersionUID = 5752864416831130583L;
	private StudentId id;
	private Integer groupId;
	private Integer addressId;
	private Integer fieldOfStudyId;
	private Integer specializationId;
	private String studentTitle;
	private String studentFirstname;
	private String studentSecondname;
	private String studentLastname;
	private Long studentPesel;
	private String studentBirthdate;
	private String studentPhone;
	private Long studentAlbum;
	private String studentStudySystem;
	private Integer studentCurrentTerm;
	private String studentFormOfStudy;
	private String studentStartDate;
	private String studentEndDate;
	private String studentBankNumber;

	
	public Student() {}
	public Student(StudentId id) {
		this.id = id;
	}
	public Student(StudentId id, Integer groupId, Integer addressId, Integer fieldOfStudyId,
			Integer specializationId, String studentTitle, String studentFirstname,
			String studentSecondname, String studentLastname, Long studentPesel, String studentBirthdate,
			String studentPhone, Long studentAlbum, String studentStudySystem, Integer studentCurrentTerm,
			String studentFormOfStudy, String studentStartDate,
			String studentEndDate, String studentBankNumber) {
		this.id = id;
		this.groupId = groupId;
		this.addressId = addressId;
		this.fieldOfStudyId = fieldOfStudyId;
		this.specializationId = specializationId;
		this.studentTitle = studentTitle;
		this.studentFirstname = studentFirstname;
		this.studentSecondname = studentSecondname;
		this.studentLastname = studentLastname;
		this.studentPesel = studentPesel;
		this.studentBirthdate = studentBirthdate;
		this.studentPhone = studentPhone;
		this.studentAlbum = studentAlbum;
		this.studentStudySystem = studentStudySystem;
		this.studentCurrentTerm = studentCurrentTerm;
		this.studentFormOfStudy = studentFormOfStudy;
		this.studentStartDate = studentStartDate;
		this.studentEndDate = studentEndDate;
		this.studentBankNumber = studentBankNumber;
	}
	public Student(int studentId, String userLogin, Integer groupId, Integer addressId, Integer fieldOfStudyId,
			Integer specializationId, String studentTitle, String studentFirstname,
			String studentSecondname, String studentLastname, Long studentPesel, String studentBirthdate,
			String studentPhone, Long studentAlbum, String studentStudySystem, Integer studentCurrentTerm,
			String studentFormOfStudy, String studentStartDate,
			String studentEndDate, String studentBankNumber) {
		this.id = new StudentId(studentId, userLogin);
		this.groupId = groupId;
		this.addressId = addressId;
		this.fieldOfStudyId = fieldOfStudyId;
		this.specializationId = specializationId;
		this.studentTitle = studentTitle;
		this.studentFirstname = studentFirstname;
		this.studentSecondname = studentSecondname;
		this.studentLastname = studentLastname;
		this.studentPesel = studentPesel;
		this.studentBirthdate = studentBirthdate;
		this.studentPhone = studentPhone;
		this.studentAlbum = studentAlbum;
		this.studentStudySystem = studentStudySystem;
		this.studentCurrentTerm = studentCurrentTerm;
		this.studentFormOfStudy = studentFormOfStudy;
		this.studentStartDate = studentStartDate;
		this.studentEndDate = studentEndDate;
		this.studentBankNumber = studentBankNumber;
	}

	
	public StudentId getId() {
		return this.id;
	}
	public void setId(StudentId id) {
		this.id = id;
	}
	public Integer getGroupId() {
		return this.groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	public Integer getAddressId() {
		return this.addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public Integer getFieldOfStudyId() {
		return this.fieldOfStudyId;
	}
	public void setFieldOfStudyId(Integer fieldOfStudyId) {
		this.fieldOfStudyId = fieldOfStudyId;
	}
	public Integer getSpecializationId() {
		return this.specializationId;
	}
	public void setSpecializationId(Integer specializationId) {
		this.specializationId = specializationId;
	}
	public String getStudentFirstname() {
		return this.studentFirstname;
	}
	public void setStudentFirstname(String studentFirstname) {
		this.studentFirstname = studentFirstname;
	}
	public String getStudentSecondname() {
		return this.studentSecondname;
	}
	public void setStudentSecondname(String studentSecondname) {
		this.studentSecondname = studentSecondname;
	}
	public String getStudentLastname() {
		return this.studentLastname;
	}
	public void setStudentLastname(String studentLastname) {
		this.studentLastname = studentLastname;
	}
	public String getStudentBirthdate() {
		return this.studentBirthdate;
	}
	public void setStudentBirthdate(String studentBirthdate) {
		this.studentBirthdate = studentBirthdate;
	}
	public String getStudentPhone() {
		return this.studentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	public Long getStudentAlbum() {
		return this.studentAlbum;
	}
	public void setStudentAlbum(Long studentAlbum) {
		this.studentAlbum = studentAlbum;
	}
	public String getStudentStudySystem() {
		return this.studentStudySystem;
	}
	public void setStudentStudySystem(String studentStudySystem) {
		this.studentStudySystem = studentStudySystem;
	}
	public Integer getStudentCurrentTerm() {
		return this.studentCurrentTerm;
	}
	public void setStudentCurrentTerm(Integer studentCurrentTerm) {
		this.studentCurrentTerm = studentCurrentTerm;
	}
	public String getStudentFormOfStudy() {
		return this.studentFormOfStudy;
	}
	public void setStudentFormOfStudy(String studentFormOfStudy) {
		this.studentFormOfStudy = studentFormOfStudy;
	}
	public String getStudentTitle() {
		return studentTitle;
	}
	public void setStudentTitle(String studentTitle) {
		this.studentTitle = studentTitle;
	}
	public Long getStudentPesel() {
		return this.studentPesel;
	}
	public void setStudentPesel(Long studentPesel) {
		this.studentPesel = studentPesel;
	}
	public String getStudentStartDate() {
		return this.studentStartDate;
	}
	public void setStudentStartDate(String studentStartDate) {
		this.studentStartDate = studentStartDate;
	}
	public String getStudentEndDate() {
		return this.studentEndDate;
	}
	public void setStudentEndDate(String studentEndDate) {
		this.studentEndDate = studentEndDate;
	}
	public String getStudentBankNumber() {
		return studentBankNumber;
	}
	public void setStudentBankNumber(String studentBankNumber) {
		this.studentBankNumber = studentBankNumber;
	}
}