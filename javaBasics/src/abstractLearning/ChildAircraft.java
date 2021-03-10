package abstractLearning;

public class ChildAircraft extends ParentAircraft{

	public static void main(String[] args) {
		
		ChildAircraft ca = new ChildAircraft();
		ca.maxSize();
		ca.Myaircraft();
		
		

	}

	public void Myaircraft()
	{
		System.out.println("Fuck yeah- this is my first aircraft");
	}

	@Override
	public void maxSpeed() {
		// nai bta rhe TODO Auto-generated method stub
		
	}

	@Override
	public void maxSize() {
		System.out.println("Bahut bada");
		
	}

	@Override
	public void maxcapacity() {
		System.out.println("jitni marji utni capacity");
		
	}

}
