import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsedCarApp {
	private static List<Car> cars = new ArrayList<>();

	static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice;
		String delete;
		
		cars.add(new Car("Jeep", "Hydro", 2008, 30000));
		cars.add(new Car("Porshe", "Cayanne", 2016, 90000));
		cars.add(new Car("Ford", "Focus", 2016, 40000));
		cars.add(new UsedCar("Ford", "F150", 2014, 50000, 100000));
		cars.add(new UsedCar("Pontaic", "GT", 2004, 10000, 70000));
		cars.add(new UsedCar("Pontaic", "Grand Am", 2000, 2000, 90000));
		
		int i = 0;
		for(Car car: cars) {
			System.out.println(i+1 + ") " + car);
			i++;
		}
		
		System.out.println("Would you like to look at a car? Pick a number. ");
		choice = scnr.nextInt();
		
		int x = 1;
		for(Car car: cars) {
			if(x == choice) {
				System.out.println(x + ") " + car);
				System.out.println("Would you like to buy this car");
				delete = scnr.next();
				if(delete.equalsIgnoreCase("yes")) {
					cars.remove(car);
				}
			}
			x++;
		}

		for(Car car: cars) {
			System.out.println(i+1 + ") " + car);
		}
	}
	
}
