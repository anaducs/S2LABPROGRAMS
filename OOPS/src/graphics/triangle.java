package graphics;

public class triangle implements area {

	@Override
	public double calcarea() {
		// TODO Auto-generated method stub
		double s = (side1+side2+side3)/2;
		double a = Math.sqrt(s+(s-side1)+(s-side2)+(s-side3));
		return a;
	}

	private double side1,side2,side3;
	public triangle(double s1, double s2, double s3)
	{
		side1=s1;
		side2=s2;
		side3=s3;
	}
}