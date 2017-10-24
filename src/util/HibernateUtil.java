
package util;



import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
		private static final SessionFactory sessionFactory;
		static {
			try {
				Configuration config = new Configuration();
	            sessionFactory = config.configure("hibernate.cfg.xml").buildSessionFactory();
			} catch (Throwable th) {

				System.err.println("Ential SessionFactory creation failed" + th);
				throw new ExceptionInInitializerError(th);
			}
		}
		public static SessionFactory getSessionFactory() {
			return sessionFactory;
		}
}
