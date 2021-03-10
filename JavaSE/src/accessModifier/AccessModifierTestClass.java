package accessModifier;

public class AccessModifierTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifiers am=new AccessModifiers();
		System.out.println(am.Defvar);
		System.out.println(am.DefMethod());
		
		System.out.println(am.Protvar);
		System.out.println(am.ProtectedMethod());
	}

}
