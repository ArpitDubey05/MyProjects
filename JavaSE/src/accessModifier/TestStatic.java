package accessModifier;

public class TestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name=StaticTest.StaticMethod();
		System.out.println(Name);
		System.out.println(StaticTest.staticvar);
		
		StaticTest ST=new StaticTest();
		System.out.println(ST.nonststic);
		//String n=ST.Nonstatic();
		ST.Nonstatic();
		System.out.println(ST.Nonstatic());
	}

}
