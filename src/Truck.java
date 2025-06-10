public class Truck extends Vehicle
{
    public Truck(int x, int y, int vx, int vy) 
    {
        super(x, y, vx, vy);
    }

    public void draw(MyFrame frame)
    {
    	// Car body
        frame.fillRect(x+70, y, 30, 20);
        // Left wheel
        frame. fillRect(x,y+20, 100, 20);
        //Left wheel
        frame. fillOval(x+25,y+40, 20, 20);
        // Right wheel
        frame. fillOval(x+10, y+40, 20, 20);
        // Car roof
        frame. fillOval(x+80, y+40, 20, 20);
        
    }
    
}

    

	
		
		
	


