
public class Point {
	
private int x;
private int y;
public int getX()
{
	return x;
}

public void setX(int mx)//set fun sets value which is in private class
{
	x=mx;
}

public int getY()//get fun prints the value
{
	return y;
}

public void setY(int my)
{
	y=my;
}

public Point(int mx, int my) 
{
	x=mx;
	y=my;
}

public String toString()//tostring function used to print value
{
	//(7, 4)
	String str = "("+ x +", " + y +")";
	return str;
}	


}
