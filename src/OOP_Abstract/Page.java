package OOP_Abstract;

public abstract class Page {
	
	
	//jvm will add one hidden default const... internally	
	
	//default const....
	public Page() {
		System.out.println("Page const...");
	}
	
	public Page(int a) {
		System.out.println("Page const..." + a);
	}
	
	
	
	//abs... class can not have object/ can not create/instantiate the abs class
	//but abs class can have the const.. and it will be called when you create the object of child class
	//abs.. class can have abs... method and non abs.. methods
	
	
	//no abs.. methods: 0% abstraction
	//only abs.. methods: 100% abstraction
	//abs+non abs.. methods: [0-100%]partial abstraction
	
	public abstract void title();
	public abstract void url();
	
	public void pageLoadTime() {
		System.out.println("Page load time out = 10 secs");
	}
	
	public final void logo() {
		System.out.println("App logo");
	}

	
	//when to use abs... class:
	//0-100% abstraction
	
	//100% abstraction: Interface
	
	

}
