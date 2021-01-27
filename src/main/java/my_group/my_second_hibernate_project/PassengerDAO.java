package my_group.my_second_hibernate_project;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PassengerDAO {
	public void create(Passenger passenger) {
		Session session = MYConnection.getSession();
		Transaction trans = session.beginTransaction();
		session.persist(passenger);
		trans.commit();
		session.close();

	}
	public List<Passenger> read() {
		Session session = MYConnection.getSession();
		Criteria criteria = session.createCriteria(Passenger.class);
		List<Passenger> passengerList =  criteria.list();
		session.close();
		return passengerList;
	}
	public Passenger read(int pnr) {
		Session session = MYConnection.getSession();
		Passenger passenger =(Passenger) session.get(Passenger.class, pnr);
		session.close();
		return passenger;
	}
	public void update(Passenger passenger) {
		Session session = MYConnection.getSession();
		Passenger p =(Passenger) session.get(Passenger.class, passenger.getPnr());
		p.setFirstName(passenger.getFirstName());
		p.setLastName(passenger.getLastName());
		Transaction trans = session.beginTransaction();
		session.persist(p);
		trans.commit();
		session.close();
	}
	public void delete(int pnr) {
		Session session = MYConnection.getSession();
		Passenger passenger = (Passenger)session.get(Passenger.class, pnr);
		Transaction trans = session.beginTransaction();
		session.delete(passenger);
		trans.commit();
		session.close();
	}
	
	public static void main(String args[]) {
		Passenger passenger = new Passenger("Dhruva", "Som");
		PassengerDAO dao = new PassengerDAO();
		dao.create(passenger);
		List<Passenger> result = dao.read();
		System.out.println(result);
////		dao.create(passenger);
//		dao.delete(1);
////		System.out.println(passenger);
	}
}
