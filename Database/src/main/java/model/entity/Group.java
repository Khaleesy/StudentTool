package model.entity;
// Generated 2016-12-08 01:23:57 by Hibernate Tools 5.1.0.Alpha1

/**
 * Group generated by hbm2java
 */
public class Group extends Entity {
	private static final long serialVersionUID = 1085364102744222860L;
	private Integer groupId;
	private String groupName;
	private String groupDescription;
	private Integer fieldOfStudyId;

	
	public Group() {}
	public Group(String groupName, String groupDescription, Integer fieldOfStudyId) {
		this.groupName = groupName;
		this.groupDescription = groupDescription;
		this.fieldOfStudyId = fieldOfStudyId;
	}

	
	public Integer getGroupId() {
		return this.groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupDescription() {
		return this.groupDescription;
	}
	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}
	public Integer getFieldOfStudyId() {
		return this.fieldOfStudyId;
	}
	public void setFieldOfStudyId(Integer fieldOfStudyId) {
		this.fieldOfStudyId = fieldOfStudyId;
	}
}