package pl.hotel;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Reservations {
	private List<Reservation> reservations = new ArrayList<Reservation>();

	public Reservations(List<Reservation> reservations) {
		super();
		this.reservations = reservations;
	}

	public Reservations() {	}
	
	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	
	
}
