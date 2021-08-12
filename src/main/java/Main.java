import entities.*;
import org.hibernate.*;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
//            Criteria criteria = session.createCriteria(DMSV.class);
//            criteria.setFirstResult(1);
//            criteria.setMaxResults(3);                                                      //gioi han so luong lay ra
//            criteria.add(Restrictions.eq("TenSV", "Hung"));                 //lay sinh vien co ten la Hung
//            criteria.add(Restrictions.gt("HocBong", (float)10000));             //hoc bong lon hon 10000
//            criteria.addOrder(Order.desc("HocBong"));                                       //sap xep giam dan
//            criteria.setProjection(Projections.avg("HocBong"));         //tinh trung binh
//            List result = criteria.list();
//            result.forEach(sv -> System.out.println(sv.toString()));

            //use many-to-many
//            DMSV dmsv = session.get(DMSV.class, "A13");
//            Club club1 = new Club("SAMI" , "Đội sinh viên tình nguyện viện Toán", "Sinh viên tình nguyện thuộc viện Toán", "Đại học BKHN");
//            Club club2 = new Club("SEC" , "Đội sinh viên tình nguyện viện DTVT", "Sinh viên tình nguyện thuộc viện DTVT", "Đại học BKHN");
//            Set<Club> clubs = new HashSet<Club>();
//            clubs.add(club1);
//            clubs.add(club2);
//
//            dmsv.setClubs(clubs);
//            session.save(dmsv);
//            transaction.commit();

            //use JPQL
//            CriteriaBuilder builder = session.getCriteriaBuilder();
//            CriteriaQuery<DMSV> query =  builder.createQuery(DMSV.class);
//            Root<DMSV> root = query.from(DMSV.class);               //root = from
//            query.select(root);

        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }


    }
}
