package model.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import model.dao.interfaces.GenericDao;
import model.dao.interfaces.ITeacherDao;
import model.db.hib.util.HibernateUtil;
import model.entity.Teacher;
import model.entity.TeacherId;

/***
 * DAO class represents teacher for all operations on this type.
 * 
 * @author Mateusz Mucha
 *
 */
public class TeacherDao extends GenericDao<Teacher, TeacherId> implements ITeacherDao {
	private Teacher teacherEntity;

	/***
	 * Default construtor sets basic field using in this class.
	 */
	public TeacherDao() {
		this.teacherEntity = null;
	}

	public List<Teacher> findByDepartmentId(Integer id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria criteria = null;
		List<Teacher> list = new ArrayList<Teacher>();

		try {
			criteria = session.createCriteria(Teacher.class);
			criteria.add(Restrictions.eq("departmentId", id));
			list = criteria.list();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			session.clear();
			session.close();
		}

		return list;
	}

	public List<Teacher> findByInstituteId(Integer id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria criteria = null;
		List<Teacher> list = new ArrayList<Teacher>();

		try {
			criteria = session.createCriteria(Teacher.class);
			criteria.add(Restrictions.eq("instituteId", id));
			list = criteria.list();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			session.clear();
			session.close();
		}

		return list;
	}

	public Teacher findByName(String firstName, String lastName) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria criteria = null;

		try {
			criteria = session.createCriteria(Teacher.class);
			criteria.add(Restrictions.and(Restrictions.eq("teacherFirstname", firstName),
					Restrictions.eq("teacherLastname", lastName)));
			teacherEntity = (Teacher) criteria.list().get(0);
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			session.clear();
			session.close();
		}

		if (teacherEntity != null) {
			return teacherEntity;
		} else {
			return null;
		}
	}

	public Teacher findByLogin(String userLogin) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria criteria = null;

		try {
			criteria = session.createCriteria(Teacher.class);
			criteria.add(Restrictions.eq("id.userLogin", userLogin));
			teacherEntity = (Teacher) criteria.list().get(0);
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			session.clear();
			session.close();
		}

		if (teacherEntity != null) {
			return teacherEntity;
		} else {
			return null;
		}
	}

	public Teacher findByUserId(Integer id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria criteria = null;

		try {
			criteria = session.createCriteria(Teacher.class);
			criteria.add(Restrictions.eq("id.userId", id));
			teacherEntity = (Teacher) criteria.list().get(0);
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			session.clear();
			session.close();
		}

		if (teacherEntity != null) {
			return teacherEntity;
		} else {
			return null;
		}
	}

	public Teacher findById(Integer id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria criteria = null;

		try {
			criteria = session.createCriteria(Teacher.class);
			criteria.add(Restrictions.eq("id.teacherId", id));
			teacherEntity = (Teacher) criteria.list().get(0);
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			session.clear();
			session.close();
		}

		if (teacherEntity != null) {
			return teacherEntity;
		} else {
			return null;
		}
	}
}