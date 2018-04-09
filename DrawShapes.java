
import java.awt.*;
//import javax.swing.*;

public class DrawShapes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawingPanel panel = new DrawingPanel(220, 150);
		panel.setBackground(Color.yellow);
		
		Graphics g = panel.getGraphics();
		
		g.setColor(Color.blue);
		g.fillOval(50, 25, 40, 40);
		g.fillOval(130, 25, 40, 40);
		
		g.setColor(Color.red);
		g.fillRect(70, 45, 80, 80);
		
		g.setColor(Color.black);
		g.drawLine(70, 85, 150, 85);
	}
}
