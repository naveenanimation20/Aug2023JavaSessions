package OOP_Interface;

public interface IndianMedical {
	
	
	public void gynoServices();

	public void ENTServices();

	public void emergencyServices();
	
	default void RnD(){
		System.out.println("IND - R&D");
	}

}
