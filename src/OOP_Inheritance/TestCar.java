package OOP_Inheritance;

public class TestCar {
	
	public static void test() {
		
	}
	
	

	public static void main(String[] args) {

		
		test();
		TestCar.test();
		
		BMW b = new BMW();
		b.start();//overridden
		b.stop();//inherited
		b.refuel();//inherited
		b.autoParking();//individual
		b.engine();//overridden
		BMW.billing();
		Car.billing();
		System.out.println(b.maxSpeed);
		b.checkTypePressure();
		
		System.out.println("-------");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		System.out.println("-------");
		//top/up casting:
		//child class object can be referred by parent class ref variable:
		Car c1 = new BMW();
		c1.start();//BMW start
		c1.stop();
		c1.refuel();
		c1.engine();
		
		//child class object can be referred by grand parent class ref variable:
		Vehicle v1 = new BMW();
		v1.engine();
		

		//down casting: parent class object can be referred by child class ref variable?????
		//BMW b1 = (BMW)new Car();//ClassCastException
		
		//BMW b2 = (BMW)new Vehicle();//ClassCastException
		
		
		//Page
		//LP
		//HP
		//RP
		//Page p = new LP(); //YES
		//Lp p1 = new Page();
		
		
		
	}

}
