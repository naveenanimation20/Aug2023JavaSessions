package javasessions;

public class DataTypes {
	
	///strict type: 
	//static + dynamic
	//compile + RunTime

	public static void main(String[] args) {

		//DataTypes: type of data:
		//1. primitive type:you don't need any object/reference
		//2. non primitive type: need object/reference:
			//Array, Class, Interface, Objects, String
		
		//primitive:
		//1. Boolean Type: true/false
		//2. Numeric Type:
				//2.a: Character: char: a $ 1
				//2.b: Integral Value: 
							//Integer : byte, short, int, long
							//Floating-point: float, double
						
						
		//1. byte: 
		//size: 1 byte = 8 bits
		//range: -128 to 127
		byte a = 10;
		 a = 20;
		 a = 30;
		byte b = 40;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);

		//2. short:
		//size: 2 bytes = 2x8 = 16 bits
		//range: -32768 to 32767 => 
		short s1 = 1000;
		short s2 = -900;
		short s3 = 1;
		
		//3. int:
		//size: 4 bytes = 4x8 = 32 bits
		//range: -2147483648 to 2147483647 => -2^31 to 2^31-1
		int i = 10;
		int j = 35000;
		
		//4. long:
		//size: 8 bytes = 8x8 = 64 bits
		//range: - 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		//-2^63 to 2^63-1
		long l = 10;
		long num = 178788788899L;
		System.out.println(num);
		
		//long phone = 919898989898L; //phone, account , SSN, Aadhar number
		//String phone = "919898989898";
		
		//5. float:
		//size: 4 bytes = 4x8 = 32 bits
		//range: after . can take upto 7 digits
		float f1 = 12.33f;
		float f2 = (float)45.44;
		System.out.println(f1);
		System.out.println(f2);

		//6. double:
		//size: 8 bytes = 8x8 = 64 bits
		//range: after . can take upto 15 digits
		double d1 = 12.45555d;
		double d2 = 100;
		System.out.println(d2);
		
		
		//char:
		//size: 2 bytes = 16 bits
		//unicode --> special + lang char + ASCII 
		char c1 = 'a';//a-z: 97 to 122
		char c11 = 'b';//a-z
		
		char c2 = '0';//0-9: 48 to 57
		char c3 = 'G';//A-Z: 65 to 90
		char c4 = '$';
		
		System.out.println(c1);//a
		System.out.println(c2);//0
		System.out.println(c1+c11);//97+98=195
		System.out.println(c11-c1);
		System.out.println('0' + '9');//48+57 = 105
		
		//boolean: true/false: boolean literals
		//size: ~1 bit
		//range: true/false
		boolean flag = true;
		boolean isActive = false;
		
		System.out.println(flag);
		System.out.println(isActive);

		
		short studentCollegeMarks = 100;
		int number = 20;
		
		int defaultTimeOut = 10;
		int pop_value_number = 20;
		
		
		byte p1 = 101;
		byte p2 = 102;
		float p3 = p1+p2;//203
		//range: -128 to 127
		
		
		//
		System.out.println("------");
		
		byte P1 = 127;
		byte P2 = 125;
		
		int K2= (P1 + P2);//127+125 = 252
		System.out.println(K2);//3
		
		int I=-2147483648;
		int J=-2147483648;
		long K1=(long)(I+J); //(I+J = -4294967296 ==> 0)
		System.out.println(K1);//-4294967296
		
		int x = 200;
		byte u = (byte) 128;
		System.out.println(x+u);
		
		String ui = "Hello Selenium";
		System.out.println(ui + " "  + 90);
		
		
		String str1 = "Hello";
        String str2 = "World";
        String str3 = "HelloWorld";
        String str4 = str1+str2;
        str4 = str4.intern();
        
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        
        
        System.out.println(0.1+0.4);
    
		
		
			
	}

}
