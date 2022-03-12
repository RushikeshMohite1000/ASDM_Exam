
public class Circle {
	private int radius;
	private Point center;
	
	public Circle(int rad)
	{
		 
		radius = rad;
		center = new Point(0,0);//for user friendly we take (0,0)
	}

	public Circle(int rad, int x, int y)
	{
		radius = rad;
		center = new Point(x,y);
	}
	
	public String toString()//for our use used for printing value
	{
		String str= "Radius :" + radius + ", Center :" + center;
		return str;
	}

	public boolean intersect(Circle b) {
		
		int sum = this.radius + b.radius;// this function used when there is predefined value
		
		int jsq =  (this.center.getX() - b.center.getX()) * (this.center.getX() - b.center.getX());
		int ksq =  (this.center.getY() - b.center.getY()) * (this.center.getY() - b.center.getY());
		
		double distancebetweenpoints = Math.sqrt(jsq + ksq);
		
		if(sum < distancebetweenpoints)
			return false;
		else
			return true;
	}
	
	
}
