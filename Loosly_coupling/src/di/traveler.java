package di;

public class traveler {

	private Vehicle v;
	
	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}


	public void startjourney() {
		v.move();
	}
	
}
