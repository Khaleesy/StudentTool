package model.entity;
// Generated 2016-12-08 01:23:57 by Hibernate Tools 5.1.0.Alpha1

/**
 * Grade generated by hbm2java
 */
public class Grade implements java.io.Serializable {
	private static final long serialVersionUID = -7603669626099168295L;
	private GradeId id;
	private Integer teacherId;
	private Float gradeValue;
	private String gradeType;
	private String gradeDescription;

	
	public Grade() {}
	public Grade(GradeId id) {
		this.id = id;
	}
	public Grade(GradeId id, Integer teacherId, Float gradeValue, String gradeType, String gradeDescription) {
		this.id = id;
		this.teacherId = teacherId;
		this.gradeValue = gradeValue;
		this.gradeType = gradeType;
		this.gradeDescription = gradeDescription;
	}
	public Grade(int gradeId, int studentId, int courseId, int courseFormId, Integer teacherId, Float gradeValue, String gradeType, String gradeDescription) {
		this.id = new GradeId(gradeId, studentId, courseId, courseFormId);
		this.teacherId = teacherId;
		this.gradeValue = gradeValue;
		this.gradeType = gradeType;
		this.gradeDescription = gradeDescription;
	}

	
	public GradeId getId() {
		return this.id;
	}
	public void setId(GradeId id) {
		this.id = id;
	}
	public Integer getTeacherId() {
		return this.teacherId;
	}
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}
	public Float getGradeValue() {
		return this.gradeValue;
	}
	public void setGradeValue(Float gradeValue) {
		this.gradeValue = gradeValue;
	}
	public String getGradeType() {
		return this.gradeType;
	}
	public void setGradeType(String gradeType) {
		this.gradeType = gradeType;
	}
	public String getGradeDescription() {
		return this.gradeDescription;
	}
	public void setGradeDescription(String gradeDescription) {
		this.gradeDescription = gradeDescription;
	}
}