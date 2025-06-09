
public class Car extends Vehicle{
	
	public Car(int x,int y,int vx,int vy)
	{
		super(x,y,vx,vy);
	}
	public void draw(MyFrame frame) {
		
	        // Car body
	        frame.fillRect(x+20, y, 40, 20);
	        // Left wheel
	        frame. fillRect(x,y+20, 80, 20);
	        // Right wheel
	        frame. fillOval(x+10, y+40, 20, 20);
	        // Car roof
	        frame. fillOval(x+50, y+40, 20, 20);
	    
	}
	

}
