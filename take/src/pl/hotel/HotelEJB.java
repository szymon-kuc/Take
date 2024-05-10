package pl.hotel;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class HotelEJB {
	
	@PersistenceContext(name="hotel")
	EntityManager manager;

	
	public void create(Reservation reservation) {
		System.out.println("Creating reservation!");
		manager.persist(reservation);
	}

	public void delete(int idc) {
		Reservation reservation = manager.find(Reservation.class, idc);
		manager.remove(reservation);
	}

//	public List<Car> findByMake(String make) {
//		Query q = manager.createQuery("select r from Reservation r where r.make like :make");
//		q.setParameter("make", make);
//		@SuppressWarnings("unchecked")
//		List<Car> lista =q.getResultList();
//		return lista;
//	}

	public Reservation find(int idc) {
		return manager.find(Reservation.class, idc);
	}

	public List<Reservation> get() {
		Query q = manager.createQuery("select r from Reservation r");
		@SuppressWarnings("unchecked")
		List<Reservation> list = q.getResultList();
		return list;
	}

	public void update(Reservation reservation) {
		reservation = manager.merge(reservation);
	}

	
}
