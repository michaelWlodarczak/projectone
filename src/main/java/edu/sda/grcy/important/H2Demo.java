//package edu.sda.grcy.important;
//
//public class H2Demo {
//    public static void main(String[] args) {
//        Pesel pesel1 = Pesel.createPesel("111");
//        Pesel pesel2 = Pesel.createPesel("222");
//        Transaction transaction = null;
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            // start a transaction
//            transaction = session.beginTransaction();
//            // save the student objects
//            session.save(pesel1);
//            session.save(pesel2);
//            // commit transaction
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            List<Pesel> peselList = session.createQuery("from Pesel", Pesel.class).list();
//            peselList.forEach(s -> System.out.println(s.getPeselNumber()));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        HibernateUtil.getSessionFactory().close();
//    }
//}
//
