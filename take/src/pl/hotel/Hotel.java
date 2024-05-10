package pl.hotel;

import javax.ejb.Local;

@Local
public interface Hotel {

	public abstract String create(Reservation reservation);

	public abstract Reservation find(int idc);

	public abstract Reservations get();

	public abstract String update(Reservation reservation);

	public abstract void delete(int idc);



}