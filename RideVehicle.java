public class RideVehicle {

	private int capacity;
	private int filledSeats;
	private boolean atStation;
	
	public RideVehicle(int c, int fS, int z, boolean aS) {
		capacity = c;
		filledSeats = fS;
		atStation = aS;
	}
	
	public int getOpenSeats() {
		return capacity - filledSeats;
	}
	
	public void fillToCapacity() {
		if (atStation) {
			if (filledSeats < capacity) {
				filledSeats = filledSeats + (capacity - filledSeats);
				System.out.println("Vehicle filled to capacity with " + filledSeats + " riders.");
			}
		} else {
			System.out.println("Vehicle not at station.");
		}
	}
	
	public void emptyVehicle() {
		filledSeats = 0;
	}

}
