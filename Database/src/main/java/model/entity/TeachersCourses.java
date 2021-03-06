package model.entity;
// Generated 2016-12-08 01:23:57 by Hibernate Tools 5.1.0.Alpha1

/**
 * TeachersCourses generated by hbm2java
 */
public class TeachersCourses extends Entity {
	private static final long serialVersionUID = 8657291523649635137L;
	private TeachersCoursesId id;

	public TeachersCourses() {
	}

	public TeachersCourses(TeachersCoursesId id) {
		this.id = id;
	}

	public TeachersCourses(int teacherId, int courseId) {
		this.id = new TeachersCoursesId(teacherId, courseId);
	}

	public TeachersCoursesId getId() {
		return this.id;
	}

	public void setId(TeachersCoursesId id) {
		this.id = id;
	}
}