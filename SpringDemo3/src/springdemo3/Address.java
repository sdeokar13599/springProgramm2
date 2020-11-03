package springdemo3;

public class Address {

	private String city;
	private String state;
	private String country;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String state, String contry) {
		super();
		this.city = city;
		this.state = state;
		this.country = contry;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
		
	}



	public String getContry() {
		return country;
	}



	public void setContry(String contry) {
		this.country = contry;
	}



	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", contry=" + country + "]";
	}
	
	
	
	public void display()
	{
		System.out.println(city +"   "+state +"   "+country);
	}


}



