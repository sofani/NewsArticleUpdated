package data;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.User;
import util.HibernateUtil;

public class UserDB {
	
	
		public static void insert(User user) {
	        SessionFactory em = HibernateUtil.getSessionFactory();
	        Session session = em.getCurrentSession();
	        Transaction trans = session.beginTransaction();
	        trans.begin();
	        try {
	           session.save(user);
	            trans.commit();
	        } catch (Exception e) {
	            System.out.println(e);
	        } finally {
	            em.close();
	        }
	    }
	    
	}
	
	


