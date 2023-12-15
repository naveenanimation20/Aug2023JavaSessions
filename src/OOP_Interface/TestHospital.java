package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.physioServices();
		fh.ENTServices();
		fh.dentalServices();
		fh.emergencyServices();
		fh.gynoServices();
		
		fh.medicalTraining();
		fh.medicalInsurance();
		
		System.out.println(USMedical.min_fee);//10
		System.out.println(FortisHospital.min_fee);//50
		
		USMedical.billing();
		
		fh.medicalNewsPublish();
		fh.covidVaccination();
		fh.RnD();
		
		
		//top casting: child class object can be referred by parent interface ref variable
		
		USMedical us = new FortisHospital();
		us.physioServices();
		us.oncologyServices();
		us.pediaServices();
		us.emergencyServices();
			
		
		UKMedical uk = new FortisHospital();
		uk.dentalServices();
		uk.orthoServices();
		uk.emergencyServices();
		
		
		//down casting: NA
		//FortisHospital fh1 = new USMedical();
		
		
		//
		
		
		
		
		
	}

}
