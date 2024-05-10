package pl.hotel;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/hotel")
@Consumes({ "application/json" })
@Produces({ "application/json" })

//@Consumes({ "application/xml" })
//@Produces({ "application/xml" })

public class HotelREST implements Hotel {

	@EJB
	HotelEJB bean;
	
	

	@Override
	@POST
	public String create(Reservation reservation) {
		bean.create(reservation);
		return "reservation created2!";
	}

	@Override
	@GET
	@Path("/{idc}")
	public Reservation find(@PathParam("idc") int idc) {
		Reservation reservation = bean.find(idc);
		
		return reservation;
	}
	

	@Override
	@GET
	public Reservations get() {
		List<Reservation> lreservations = bean.get();
		Reservations reservations = new Reservations(lreservations);
		return reservations;
	}

	@Override
	@PUT
	public String update(Reservation reservation) {
		try {
			bean.update(reservation);
			return "reservation updated!";
		} catch (Exception e) {
			e.printStackTrace();
			return "reservation not updated :(";
		}
	}


	@Override
	@DELETE
	@Path("/{idc}")
	public void delete(@PathParam("idc") int idc) {
		System.out.println("usunieto");
		bean.delete(idc);
	}


}
