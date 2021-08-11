import entities.DMKhoa;
import entities.DMMH;
import entities.DMSV;
import entities.KetQua;
import org.hibernate.*;
import util.HibernateUtil;

import java.util.Date;
import java.util.List;

public class Main {

    static final SessionFactory factory = HibernateUtil.getSessionFactory();

    public static void main(String[] args) {
        Session session = factory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
//        DMKhoa dmKhoa = new DMKhoa("LT", "Programing");
//        DMMH dmmh = session.get(DMMH.class, "05");
//        //create hoc sinh
//        DMSV dmsv = new DMSV("A13", "Truong", "Sang", "nam", new Date("1999/09/13"), "Bac Ninh", 13091999, dmKhoa);
//        KetQua ketQua = new KetQua(dmsv, dmmh, 2, 9);
//        session.save(ketQua);
//        transaction.commit();

            //use criteria
            Criteria criteria = session.createCriteria(DMSV.class);
            criteria.setFirstResult(1);
            criteria.setMaxResults(3);          //gioi han so luong lay ra
            List result = criteria.list();
            result.forEach(sv -> System.out.println(sv.toString()));



        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }


    }
}
