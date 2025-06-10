import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Car extends Vehicle implements KeyListener{
	
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
	//
	@Override
	public void keyPressed(KeyEvent e) {
		
		
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("キーが押されました");
		
		if(e.getKeyCode()==KeyEvent.VK_LEFT) 
		{
			vx=-5;
			
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) 
		{
			vx=5;
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("キーが押されました");
		// TODO 自動生成されたメソッド・スタブ
		if(e.getKeyCode()==KeyEvent.VK_LEFT)
		{
			vx=0;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			vx=0;
		}
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
	
		// TODO 自動生成されたメソッド・スタブ
		
		
	}
	
	
	

}
