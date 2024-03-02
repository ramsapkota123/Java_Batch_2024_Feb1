package oops;

public class GateWay {
	
	public static void main(String[] args) {
		Bike bike = new Bike();
		Vehicle vehicle = new Vehicle();
		Car car=new Car();
		System.out.println(bike instanceof Vehicle);
		System.out.println(car instanceof Car);
		System.out.println(vehicle instanceof Vehicle);
		
		Vehicle a[]=new Vehicle[3];
		a[0]=new Vehicle();
		a[1]=new Car();
		a[2]=new Bike();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	if(vehicle instanceof Bike) {
		bike=(Bike)vehicle;
		bike.bikeHasNoWindow();
		bike.hasBrake();
		bike.hasHandle();
		
	}else if(vehicle instanceof Car){
		car=(Car)vehicle;
		car.hasBrake();
		car.hasHood();
	}else {
		vehicle.hasHandle();
		
	}
	
		
		
		
		

	}

}
