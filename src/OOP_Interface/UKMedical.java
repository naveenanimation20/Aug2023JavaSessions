package OOP_Interface;

public interface UKMedical {
	
	public void dentalServices();
	
	public void orthoServices();
	
	public void emergencyServices();


	default void RnD(){
		System.out.println("UK - R&D");
	}


}
