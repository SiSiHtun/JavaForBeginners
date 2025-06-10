import java.util.Vector;

public class DisplayCarsTrains extends MyFrame
{
	public void run()
	{
		Vector<Vehicle>vehicles =new Vector <Vehicle>();
		vehicles.add(new Car(10,30,3,0));
		vehicles.add(new Car(10,100,-5,0));
		vehicles.add(new Train(10,180,7,0));
		vehicles.add(new Train(10,200,-10,0));
		vehicles.add(new Truck(20,300,9,0));
		vehicles.add(new Truck(10,350,-10,0));
		
		
		
		
		for (int i=0; i<30; i++)
		{
			clear();
			for (int j=0; j<vehicles.size();j++)
			{
				vehicles.get(j).draw(this);
				vehicles.get(j).move();
			}
			sleep(0.1);
		}
		
	}

}
