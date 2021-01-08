package di;

public class Journey {

	public static void main(String[] args) {
		traveler tr =new traveler();
		tr.setV(new Car()); // inject car depenency
        tr.startjourney();
    	tr.setV(new bike()); // inject car depenency
        tr.startjourney();
	}
	

}
