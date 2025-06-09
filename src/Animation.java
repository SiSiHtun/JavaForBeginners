
public class Animation extends MyFrame {
	public void run() {
		
		int y=100;
		int x=50;
		
		
		while(x<=170) {
			clear();
			
			setColor(0,128,0);
			fillOval(x,y,100,100);
			x+=10;
			sleep(0.1);
			}
			
		
		while(x>=50) {
			clear();
			
			setColor(0,128,0);
			fillOval(x,y,100,100);
			
			x-=10;
			
			sleep(0.1);
		}
		
		while(x<=170) {
			clear();
			
			setColor(0,128,0);
			fillOval(x,y,100,100);
			x+=10;
			sleep(0.1);
			}
		
	}

}
