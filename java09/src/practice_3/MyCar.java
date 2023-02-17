package practice_3;

public class MyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car=new Car();
		car.number=1010;
		car.speed=70;
		
		System.out.println(car);
		car.run();
		
		Truck t=new Truck();
		t.number=1000;
		t.speed=40;
		t.luggage=5;
		System.out.println("\n"+t);
		t.run();
		t.carry();
		
		CoffeeTruck ct=new CoffeeTruck();
		ct.number=1020;
		ct.speed=50;
		ct.luggage=3;
		ct.order=5;
		System.out.println("\n"+ct);
		ct.run();
		ct.carry();
		ct.ordering();

	}

}
