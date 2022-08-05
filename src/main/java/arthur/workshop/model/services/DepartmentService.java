package arthur.workshop.model.services;

import arthur.workshop.model.dao.DaoFactory;
import arthur.workshop.model.dao.DepartmentDao;
import arthur.workshop.model.entities.Department;

import java.util.List;

public class DepartmentService {

    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {
        return dao.findAll();
    }
}
