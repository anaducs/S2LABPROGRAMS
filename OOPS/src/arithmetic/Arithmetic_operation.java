package arithmetic;

public class Arithmetic_operation implements operation {

	@Override
	public int add() {
		// TODO Auto-generated method stub
		return (x+y);

	}

	@Override
	public int sub() {
		// TODO Auto-generated method stub
	
		return (x-y);

	}

	@Override
	public int div() {
		// TODO Auto-generated method stub
		return (x/y);

	}

	@Override
	public int mul() {
		// TODO Auto-generated method stub
		return (x*y);

	}
	private int x,y;
	public Arithmetic_operation(int a, int b)
	{
		x=a;
		y=b;
	}
	
	

}
