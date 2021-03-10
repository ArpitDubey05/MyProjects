package constructors;

public class MainConstructorClass extends ConstructorAbstractClass {

	String x;
	String y;
	
	public MainConstructorClass() 
	{
		this("Arpit");
		System.out.println("I am non parameterised consdtructor");
	}
	
	public MainConstructorClass(String s) 
	{
		/*this("Arpit","Dubey");*/
		x=s;
		System.out.println("I am parameterised consdtructor with value "+s); 
	}
	
	public MainConstructorClass(String a, String b) 
	{
		
		//b=this.y;
		System.out.println("I am parameterised constructor with values "+a+" " + b);
	}
	
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainConstructorClass obj=new MainConstructorClass();
		System.out.println(obj);
		Integer i=new Integer(5);
		i=i+6;
		System.out.println(i);
	}*/

}
