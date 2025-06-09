
public class DisplayCarsTrains extends MyFrame
{
	public void run()
	{
		Vehicle[] Vehicle=new Vehicle[3];
		Vehicle[0]=new Car(10,30,3,0);
		Vehicle[1]=new Car(10,100,5,0);
		Vehicle[2]=new Train(10,150,7,0);
		
		for (int i=0; i<30; i++)
		{
			clear();
			for (int j=0; j<Vehicle.length;j++)
			{
				Vehicle[j].draw(this);
				Vehicle[j].move();
			}
			sleep(0.1);
		}
		
	}

}
