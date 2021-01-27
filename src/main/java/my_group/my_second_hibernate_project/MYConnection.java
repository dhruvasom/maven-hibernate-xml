package my_group.my_second_hibernate_project;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
public class MYConnection {
	public static Session getSession() {
		return new Configuration().
				configure("hibernate.cfg.xml").
				buildSessionFactory().
				openSession();
	}
}
