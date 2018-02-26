import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

class MyCanvas extends JComponent
{
	String s = "Select Files";
	String input = "Input: ";
	String output = "Output: ";
	String browse = "Browse...";
	String j = "Justification";
	String left = "Left";
	String right = "Right";
	String a = "Analysis";
	String wordsProcessed = "Number of words processed: ";
	String lines = "Number of lines: ";
	String linesRemoved = "Number of blank lines removed: ";
	String wordsPerLine = "Average number of words per line: ";
	String lineLength = "Average line length: ";
	
	public void paint(Graphics g) 
	{
		//Draw background
		g.setColor(Color.blue);
		g.fillRect(0, 0, 1920, 1045);
		g.setColor(Color.black);
		g.drawRect(0, 0, 1920, 1045);
		
		//Draw input/output box
		g.setColor(Color.gray);
		g.fillRect(10, 10, 500, 500);
		g.setColor(Color.black);
		g.drawRect (10, 10, 500, 500);
		
		//Draw input/output text
		g.setColor(Color.white);
		g.drawString(s, 250, 70);
		
		
		//Draw Justification box
		g.setColor(Color.gray);
		g.fillRect(10, 550, 500, 480);
		g.setColor(Color.black);
		g.drawRect(10, 550, 500, 480);
		
		//Draw analysis box
		g.setColor(Color.gray);
		g.fillRect(550,10, 1360, 1020);
		g.setColor(Color.black);
		g.drawRect(550, 10, 1360, 1020);
	}
}
public class cse360 
{
	public static void main(String[] a)
	{
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(30, 30, 300, 300);
		window.getContentPane().add(new MyCanvas());
		window.setVisible(true);
	}
}
