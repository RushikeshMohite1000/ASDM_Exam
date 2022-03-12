
public class Main {
	public static void main(String[] args) {

	Circle c1  = new Circle(10);
	Circle c2  = new Circle(3, 8, 5);
	System.out.println(c1);
	System.out.println(c2);
	
	if( c1.intersect(c2) )//value is taken from circle class
	{
		System.out.println("c1 intersect c2");//all done in other classes
	}
}
	

}
