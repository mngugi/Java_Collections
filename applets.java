// A Hello World Applet
// Save file as HelloWorld.java

import java.applet.Applet;
import java.awt.Graphics;


public class Ducky extends JApplet
{
	// Overriding paint() method
	@Override
	public void paint(Graphics g)
	{
		g.drawString("Hello World", 20, 20);
	}
	
	
 
}

