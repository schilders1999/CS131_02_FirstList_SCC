
public class ListApp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			FirstList<String> stringList = new FirstList<String>();
			
			stringList.addItem("Zero");
			stringList.addItem("One");
			stringList.addItem("Two");
			stringList.addItem("Three");
			stringList.addItem("Four");
			stringList.addItem("Five");
			stringList.addItem("Six");
			stringList.addItem("Seven");
			stringList.addItem("Eight");
			stringList.addItem("Nine");
			
			int stepString=0;
			stringList.setItemPosition(0);
			
			while (stringList.getItemPosition()<10) 
			{
				
				System.out.print("String" + stringList.getItemPosition() + " is: " );
				System.out.println(stringList.getItem());
				stepString++;
				stringList.setItemPosition(stepString);
				
			}
			
			FirstList<Square> squareList = new FirstList<Square>();
			
			Square s1 = new Square(3);
			Square s2 = new Square(4);
			Square s3 = new Square(6);
			Square s4 = new Square(8);
			
			squareList.addItem(s1);
			squareList.addItem(s2);
			squareList.addItem(s3);
			squareList.addItem(s4);
		
			int stepSquare=0;
			squareList.setItemPosition(0);
			
			while (squareList.getItemPosition()<4)
			{
				
				System.out.print("Square" + squareList.getItemPosition() + " has a length of: " );
				System.out.print(squareList.getItem() + "\n");
				stepSquare++;
				squareList.setItemPosition(stepSquare);
				
			}
			
			FirstList<Point> pointList = new FirstList<Point>();
			
			Point p1 = new Point(1,2,3);
			Point p2 = new Point(2,3,4);
			Point p3 = new Point(3,4,5);
			
			pointList.addItem(p1);
			pointList.addItem(p2);
			pointList.addItem(p3);
			
			int stepPoint=0;
			pointList.setItemPosition(0);
			
			while (pointList.getItemPosition()<3)
			{
				
				System.out.print("The position of point " + pointList.getItemPosition() + " is: ");
				System.out.print(pointList.getItem() + "\n");
				stepPoint++;
				pointList.setItemPosition(stepPoint);
				
			}
			
			
			
	}

}
