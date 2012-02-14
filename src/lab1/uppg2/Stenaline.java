package lab1.uppg2;

import java.util.ArrayList;
import java.util.Iterator;

public class Stenaline implements Ferry {

<<<<<<< HEAD
	// Arraylist som sparar alla våra objekt från Vehicle
	private ArrayList<Vehicle> pVehicle = new ArrayList<>();
=======
	// Arraylist som sparar alla vï¿½ra objekt frï¿½n Vehicle
	ArrayList<Vehicle> pVehicle = new ArrayList<>();
>>>>>>> origin/mathias
	
	private ArrayList<Passenger> pPass = new ArrayList<>();
	
	@Override
	public int countPassengers() {
		int pSum = 0; // summan av passangerare
		
		// Loopar igenom alla passengers och lï¿½gger till dem i pSum
		for (int i = 0; i < pPass.size(); i++) {
			pSum += pPass.get(i).getPass();
		}
		
		// Loopar igenom alla bilar och lï¿½gger till deras passengers i pSum
		for (int i = 0; i < pVehicle.size(); i++) {
			pSum += pVehicle.get(i).getPass();
		}
		
		return pSum;
	}

	@Override
	public int countVehicleSpace() {
		// Returnerar summan av hur mycket yta alla fordon tar upp i fï¿½rjan
		int sizeSum = 0;
		
		// Loopar igenom alla fordon och lï¿½gger till deras storlek i sizeSum
		for (int i = 0; i < pVehicle.size(); i++) {
			sizeSum += pVehicle.get(i).getSize();
		}
		
		return sizeSum;
	}

	@Override
	public int countMoney() {
		int sum = 0; // total sum
		
		// Loopar igenom alla fordon vi har och lï¿½gger till priset fï¿½r varje i sum
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
		// Lï¿½gger till vï¿½rt fordon pï¿½ fï¿½rjan
		
		if (hasRoomforPassenger() && hasSpaceFor(v)) {
			pVehicle.add(v);
			countMoney();
		}
		else
			System.err.println("Vi har inte plats fï¿½r mer fordon pï¿½ fï¿½rjan");
		
	}

	@Override
	public void embark(Passenger p) {
		// Lï¿½gger till vï¿½r pass. pï¿½ fï¿½rjan
		if (hasRoomforPassenger()) {
			pPass.add(p);
			countMoney();
		}
		else
			System.err.println("Vi har inte plats fï¿½r mer passagerare");		
	}

	@Override
	public void disembark() {
		// Tï¿½mmer pVehicle / Passengers pï¿½ fordon, sparar pengarna
		pPass.clear();
		pVehicle.clear();
		
	}

	@Override
	public boolean hasSpaceFor(Vehicle v) {
		// Tittar om fordonets storlek + nuvarande storleken ï¿½r mindre ï¿½n 40
		
		if (v.getSize() + countVehicleSpace() <= 40)
			return true;
		else
			return false;
		
	}

	@Override
	public boolean hasRoomforPassenger() {
		// Tittar om vi har rum fï¿½r alla passagerare
		
		if (this.countPassengers() + countPassengers() <= 200)
			return true;
		else
			return false;
	}

}
