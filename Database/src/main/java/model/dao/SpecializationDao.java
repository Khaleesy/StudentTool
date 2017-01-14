package model.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;

import model.dao.interfaces.GenericDao;
import model.dao.interfaces.ISpecializationDao;
import model.db.hib.util.HibernateUtil;
import model.entity.Department;
import model.entity.FieldOfStudy;
import model.entity.Specialization;
import model.entity.SpecializationId;

public class SpecializationDao extends GenericDao<Specialization, SpecializationId> implements ISpecializationDao {
	private Specialization specializationEntity;
	
	
	public SpecializationDao() {
		this.specializationEntity = null;
	}


	public Specialization findByName(String name) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria criteria = null;
		
		try {
			criteria = session.createCriteria(Specialization.class);
			criteria.add(Restrictions.eq("specializationName", name));
			specializationEntity = (Specialization)criteria.list().get(0);
		} catch( Exception e ) {
			e.getStackTrace();
		} finally {
			session.close();
		}

		if(specializationEntity != null) {
			return specializationEntity;
		} else {
			return null;
		}
	}
	public List<Specialization> findByFieldOfStudyId(Integer id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria criteria = null;
		List<Specialization> list = new ArrayList<Specialization>();
		
		try {
			criteria = session.createCriteria(Specialization.class);
			criteria.add(Restrictions.eq("id.fieldOfStudyId", id));
			list = criteria.list();
		} catch( Exception e ) {
			e.getStackTrace();
		} finally {
			session.close();
		}
		
		return list;
	}
	public List<Specialization> findByFieldOfStudyName(String name) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria criteria = null;
		List<Specialization> list = new ArrayList<Specialization>();
		
		try {
			FieldOfStudy field = new FieldOfStudyDao().findByName(name);
			
			criteria = session.createCriteria(Specialization.class);
			criteria.add(Restrictions.eq("id.fieldOfStudyId", field.getFieldOfStudyId()));
			list = criteria.list();
		} catch( Exception e ) {
			e.getStackTrace();
		} finally {
			session.close();
		}
		
		return list;
	}
	
	
	
	
	
	
	
	
	
	public List<Specialization> findSpecsByDepartmentId(Integer id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria criteria = null;
		List<Specialization> list = new ArrayList<Specialization>();
		
		try {
			List<FieldOfStudy> fields = new FieldOfStudyDao().findByDepartmentId(id);

			for(FieldOfStudy field : fields) {
				criteria = session.createCriteria(Specialization.class);
				criteria.add(Restrictions.eq("id.fieldOfStudyId", field.getFieldOfStudyId()));
				List listBase = criteria.list();
				
				list.addAll(listBase);
			}	
			
		} catch( Exception e ) {
			e.getStackTrace();
		} finally {
			session.close();
		}

		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}