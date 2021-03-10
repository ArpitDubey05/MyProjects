package defaultPackage;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		String str1=new String("Morning");
		System.out.println(str1=="Morning");
		System.out.println(str1);
		System.out.println(str1.equals("Morning"));
		
		String str2 ="Morning";
		System.out.println("Morning"==str2);
		boolean result=str2.substring(0, 2).startsWith("M");
		System.out.println("value of result is " + result);
		int marks=100;
		byte grade=8;
		float price=18;
		double rate=12.00;
		char kuchor='K';
		
		Integer i=new Integer(marks);
		Byte b=new Byte(grade);
		Float f=new Float(price);
		Double d=new Double(rate);
		Character c=new Character(kuchor);
		
		System.out.println("I am Integer class object and my value is " + i);
		System.out.println("I am Byte class object and my value is " + b);
		System.out.println("I am Float class object and my value is " + f);
		System.out.println("I am Double class object and my value is " + d);
		System.out.println("I am Char class object and my value is " + c);
		
		System.out.println(" ");
		int ii=i.intValue();
		byte bb=b.byteValue();
		float ff=f.floatValue();
		double dd=d.doubleValue();
		char cc=c.charValue();
		
		
		System.out.println("I am Integer primitive and my value is " + ii);
		System.out.println("I am Byte primitive and my value is " + bb);
		System.out.println("I am Float primitive and my value is " + ff);
		System.out.println("I am Double primitivet and my value is " + dd);
		System.out.println("I am Char primitive and my value is " + cc);
		
		System.out.println(" ");
		
		
		String a1="69";
		String b1="69.96";
		String c1="8";
		
		Integer s1=Integer.parseInt(a1);
		Double s2=Double.parseDouble(b1);
		Float s3=Float.parseFloat(c1);
		
		System.out.println("I am a1 to integer and my value is " + s1);
		System.out.println("I am b1 to byte and my value is " + s2);
		System.out.println("I am c1 to char and my value is " + s3);
		
		System.out.println(" ");
		/*int iii=Integer.parseInt(a1);
		System.out.println("iii just got parsed " + iii);
		float fff=Float.parseFloat(b1);
		System.out.println("fff just got parsed " + fff);
		byte bbb=Byte.parseByte(c1);
		System.out.println("bbb just got parsed " + bbb);
		*/
		
		float a1p=s3.floatValue();
		double b1p=s2.doubleValue();
		int c1p=s1.intValue();
		

		System.out.println("I am float wrapper to float and my value is " + a1p);
		System.out.println("I am double erapper to double and my value is " + b1p);
		System.out.println("I am integer wrapper to int and my value is " + c1p);
		
		
		
	}

}
