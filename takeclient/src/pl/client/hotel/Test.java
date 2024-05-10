package pl.client.hotel;

public class Test {
	public static void main(String[] args) {
		String serverUrl = "http://localhost:8080/take/hotel";
		try{
			String url = serverUrl;
//			String message = "<reservation id=\"0\"><worker_id>2</worker_id><client_id>2</client_id><price>1000</price><room_id>2</room_id></reservation>";
			String message ="{\"price\":1200,\"dateTo\":\"15.06.2024\",\"dateFrom\":\"10.06.2024\",\"clientId\":4,\"roomId\":3,\"workerId\":1,\"serviceId\":2}";

			System.out.println("DOPOST "+url );
			String txt = HttpHelper.doPost(url,message,"application/json");
			System.out.println("-----------------------");
			System.out.println(txt);
			System.out.println("-----------------------");

			
			url = serverUrl;
			System.out.println("DOGET "+url );
			txt = HttpHelper.doGet(url);
			System.out.println("-----------------------");
			System.out.println(txt);
			System.out.println("-----------------------");
		} catch (Exception e) {e.printStackTrace();}
	}
}
