
public class Animation extends MyFrame {
	public void run() {
		int y=200;
		int x=30;
		
		
		while(y>=80) {
			clear();
			
			setColor(0,128,0);
			fillOval(x,y,100,100);
			y-=5;
			sleep(0.1);
			}
			
		
		while(x<=170) {
			clear();
			
			setColor(0,128,0);
			fillOval(x,y,100,100);
			
			x+=5;
			
			sleep(0.1);
		}
	}

}
