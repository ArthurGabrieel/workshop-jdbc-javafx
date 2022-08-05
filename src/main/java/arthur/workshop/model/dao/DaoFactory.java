package arthur.workshop.model.dao;

import arthur.workshop.db.DB;
import arthur.workshop.model.dao.impl.DepartmentDaoJDBC;
import arthur.workshop.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }
    public static DepartmentDao createDepartmentDao(){
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
