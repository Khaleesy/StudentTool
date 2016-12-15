package model.dao.interfaces;

import java.util.List;
import model.entity.Institute;

public interface IInstituteDao extends IGenericDao<Institute, Integer> {
	Institute findByName(String name);
	Institute findByFullName(String name);
	List<Institute> findByDepartmentId(Integer id);
	List<Institute> findByDepartmentName(String name);
}