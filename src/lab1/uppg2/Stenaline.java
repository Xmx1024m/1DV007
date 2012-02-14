package lab1.uppg2;

import java.util.ArrayList;
import java.util.Iterator;

public class Stenaline implements Ferry {
	// Arraylist som sparar alla v�ra objekt fr�n Vehicle
	ArrayList<Vehicle> pVehicle = new ArrayList<>();
	
	private ArrayList<Passenger> pPass = new ArrayList<>();
	
	@Override
	public int countPassengers() {
		int pSum = 0; // summan av passangerare
		
		// Loopar igenom alla passengers och l�gger till dem i pSum
		for (int i = 0; i < pPass.size(); i++) {
			pSum += pPass.get(i).getPass();
		}
		
		// Loopar igenom alla bilar och l�gger till deras passengers i pSum
		for (int i = 0; i < pVehicle.size(); i++) {
			pSum += pVehicle.get(i).getPass();
		}
		
		return pSum;
	}

	@Override
	public int countVehicleSpace() {
		// Returnerar summan av hur mycket yta alla fordon tar upp i f�rjan
		int sizeSum = 0;
		
		// Loopar igenom alla fordon och l�gger till deras storlek i sizeSum
		for (int i = 0; i < pVehicle.size(); i++) {
			sizeSum += pVehicle.get(i).getSize();
		}
		
		return sizeSum;
	}

	@Override
	public int countMoney() {
		int sum = 0; // total sum
		
		// Loopar igenom alla fordon vi har och l�gger till priset f�r varje i sum
		for (int i = 0; i < pVehicle.size(); i++) {
			sum += pVehicle.get(i).getPrize();
		}
		
		for (int i = 0; i < pPass.size(); i++) {
			sum += pPass.get(i).getPrize();
		}
		
		return sum;
	}

	@Override
	public Iterator iterator() {
		return null;
	}

	@Override
	public void embark(Vehicle v) {
		// L�gger till v�rt fordon p� f�rjan
		
		if (hasRoomforPassenger() && hasSpaceFor(v)) {
			pVehicle.add(v);
			countMoney();
		}
		else
			System.err.println("Vi har inte plats f�r mer fordon p� f�rjan");
		
	}

	@Override
	public void embark(Passenger p) {
		// L�gger till v�r pass. p� f�rjan
		if (hasRoomforPassenger()) {
			pPass.add(p);
			countMoney();
		}
		else
			System.err.println("Vi har inte plats f�r mer passagerare");		
	}

	@Override
	public void disembark() {
		// T�mmer pVehicle / Passengers p� fordon, sparar pengarna
		pPass.clear();
		pVehicle.clear();
		
	}

	@Override
	public boolean hasSpaceFor(Vehicle v) {
		// Tittar om fordonets storlek + nuvarande storleken �r mindre �n 40
		
		if (v.getSize() + countVehicleSpace() <= 40)
			return true;
		else
			return false;
		
	}

	@Override
	public boolean hasRoomforPassenger() {
		// Tittar om vi har rum f�r alla passagerare
		
		if (this.countPassengers() + countPassengers() <= 200)
			return true;
		else
			return false;
	}

}
