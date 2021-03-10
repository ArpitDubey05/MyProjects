
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a[]= {34,45,56,89,35,63};
		//int a[]= {70};
		
		char[] name= {'a','r','p','i','t',' ','d','u','b','e','y'};
		int size=name.length;
		System.out.println(size);
		String stringname="";
		
		
		for(int i=0;i<size;i++)
		{
			stringname=stringname + name[i];
		}
		System.out.println(stringname);
		String Sname="";
		
		for(int i=0;i<size;i++)
		{
			if(i==0)
			{
				char a=Character.toUpperCase(name[i]);
				Sname=Sname + a;
				
				//Sname=a;
			}
			else if( name[i] ==' ')
			{
				char b=Character.toUpperCase(name[i+1]);
				Sname=Sname +" " + b;
				i++;
			}
			else
			{
				Sname=Sname + name[i];
			}
				
			
		}
		
		System.out.println(Sname);
	}

}
