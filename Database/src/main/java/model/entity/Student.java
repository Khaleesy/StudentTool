package model.entity;
// Generated 2016-12-09 16:03:21 by Hibernate Tools 5.1.0.Alpha1

/**
 * Student generated by hbm2java
 */
public class Student implements java.io.Serializable {
	private static final long serialVersionUID = 5752864416831130583L;
	private StudentId id;
	private Integer groupId;
	private Integer addressId;
	private Integer fieldOfStudyId;
	private Integer specializationId;
	private String studentPhoto;
	private String studentTitle;
	private String studentFirstname;
	private String studentSecondname;
	private String studentLastname;
	private String studentBirthdate;
	private String studentPhone;
	private String studentAlbum;
	private String studentFormofstudy;
	private Integer studentCurrentTerm;
	private String studentFormOfStudy;
	private String studentTermTitle;
	private String studentDiplomaTitle;

	
	public Student() {}
	public Student(StudentId id) {
		this.id = id;
	}
	public Student(StudentId id, Integer groupId, Integer addressId, Integer fieldOfStudyId,
			Integer specializationId, String studentPhoto, String studentTitle, String studentFirstname, String studentSecondname,
			String studentLastname, String studentBirthdate, String studentPhone, String studentAlbum,
			String studentFormofstudy, Integer studentCurrentTerm, String studentFormOfStudy, String studentTermTitle,
			String studentDiplomaTitle) {
		this.id = id;
		this.groupId = groupId;
		this.addressId = addressId;
		this.fieldOfStudyId = fieldOfStudyId;
		this.specializationId = specializationId;
		this.studentPhoto = studentPhoto;
		this.studentTitle = studentTitle;
		this.studentFirstname = studentFirstname;
		this.studentSecondname = studentSecondname;
		this.studentLastname = studentLastname;
		this.studentBirthdate = studentBirthdate;
		this.studentPhone = studentPhone;
		this.studentAlbum = studentAlbum;
		this.studentFormofstudy = studentFormofstudy;
		this.studentCurrentTerm = studentCurrentTerm;
		this.studentFormOfStudy = studentFormOfStudy;
		this.studentTermTitle = studentTermTitle;
		this.studentDiplomaTitle = studentDiplomaTitle;
	}
	public Student(int studentId, int userId, Integer groupId, Integer addressId, Integer fieldOfStudyId,
			Integer specializationId, String studentPhoto, String studentTitle, String studentFirstname, String studentSecondname,
			String studentLastname, String studentBirthdate, String studentPhone, String studentAlbum,
			String studentFormofstudy, Integer studentCurrentTerm, String studentFormOfStudy, String studentTermTitle,
			String studentDiplomaTitle) {
		this.id = new StudentId(studentId, userId);
		this.groupId = groupId;
		this.addressId = addressId;
		this.fieldOfStudyId = fieldOfStudyId;
		this.specializationId = specializationId;
		this.studentPhoto = studentPhoto;
		this.studentTitle = studentTitle;
		this.studentFirstname = studentFirstname;
		this.studentSecondname = studentSecondname;
		this.studentLastname = studentLastname;
		this.studentBirthdate = studentBirthdate;
		this.studentPhone = studentPhone;
		this.studentAlbum = studentAlbum;
		this.studentFormofstudy = studentFormofstudy;
		this.studentCurrentTerm = studentCurrentTerm;
		this.studentFormOfStudy = studentFormOfStudy;
		this.studentTermTitle = studentTermTitle;
		this.studentDiplomaTitle = studentDiplomaTitle;
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
	public String getStudentPhoto() {
		return this.studentPhoto;
	}
	public void setStudentPhoto(String studentPhoto) {
		this.studentPhoto = studentPhoto;
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
	public String getStudentAlbum() {
		return this.studentAlbum;
	}
	public void setStudentAlbum(String studentAlbum) {
		this.studentAlbum = studentAlbum;
	}
	public String getStudentFormofstudy() {
		return this.studentFormofstudy;
	}
	public void setStudentFormofstudy(String studentFormofstudy) {
		this.studentFormofstudy = studentFormofstudy;
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
	public String getStudentTermTitle() {
		return this.studentTermTitle;
	}
	public void setStudentTermTitle(String studentTermTitle) {
		this.studentTermTitle = studentTermTitle;
	}
	public String getStudentDiplomaTitle() {
		return this.studentDiplomaTitle;
	}
	public void setStudentDiplomaTitle(String studentDiplomaTitle) {
		this.studentDiplomaTitle = studentDiplomaTitle;
	}
	public String getStudentTitle() {
		return studentTitle;
	}
	public void setStudentTitle(String studentTitle) {
		this.studentTitle = studentTitle;
	}
}