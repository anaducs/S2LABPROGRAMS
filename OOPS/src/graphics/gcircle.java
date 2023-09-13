package graphics;

public class gcircle implements area {

	@Override
	public double calcarea() {
		// TODO Auto-generated method stub
		return (Math.PI *radius*radius);
	}
	private double radius;
	public gcircle(double r)
	{
		radius=r;
	}

}
