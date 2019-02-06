import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp {

	private static List<Car> cars = new ArrayList<>();

	static Scanner scnr = new Scanner(System.in);
	

	public static void main(String[] args) {
		String yn = "y";
		
		int carsEntered;
		String make;
		String model;
		int year;
		double price;
		
		
		System.out.println("Welcome to SP Motors Adminstration Console!");
		
		System.out.println("How many cars do you want to enter");
		carsEntered = scnr.nextInt();
		
		for(int i = 0; i < carsEntered; i++) {
			System.out.println("What make is the car? ");
			make = scnr.next();
			
			System.out.println("What model is the car? ");
			model = scnr.next();
			
			System.out.println("What year is the car? ");
			year = scnr.nextInt();
			
			System.out.println("What is the price? ");
			price = scnr.nextDouble();
			
			cars.add(new Car(make, model, year, price));
			System.out.println();
		}

		
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));

		}
				

	}

}
