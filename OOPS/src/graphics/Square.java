package graphics;

public class Square implements area {

	@Override
	public double calcarea() {
		// TODO Auto-generated method stub
		return (side1*side2);
	}
private double side1,side2;
public Square(double s1, double s2)
{
	side1=s1;
	side2=s2;
}
}
