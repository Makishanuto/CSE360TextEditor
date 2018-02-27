import java.awt.*;  
import javax.swing.*;  
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.JApplet;

public class cse360 extends JApplet
{  
	cse360()  
	{  
		String strInput = "";
		int numLines = 0;
		int numLinesRemoved = 0;
		int numCount = 0;
		int numWordsPerLine = 0;
		int numLength = 0;
		
		//Create JFrame
		JFrame frame = new JFrame("Text Analyzer");
		frame.setSize(500, 400);
		frame.setLayout(new GridLayout(7, 2));
		frame.setVisible(true);

		//Create buttons
		JButton open = new JButton("Open File");  
		open.setBounds(50,100,95,30);  
		open.addActionListener(new ActionListener()
		{  
			public void actionPerformed(ActionEvent e)
			{  
				//Open file
			}  
		});  

		JButton save = new JButton("Save File");
		save.setBounds(50, 100, 95, 30);
		save.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//Save file
			}
		});

		//Create Labels
		JLabel input = new JLabel("Input File");
		input.setBounds(50, 100, 80, 30);;
		input.setFont(new Font("", Font.BOLD, 20));
		input.setForeground(Color.black);
		
		JLabel fileName = new JLabel(strInput);
		fileName.setBounds(50, 100, 80, 30);;
		fileName.setFont(new Font("", Font.BOLD, 20));
		fileName.setForeground(Color.black);
		
		JLabel lines = new JLabel("Number of Lines");
		lines.setBounds(50, 100, 80, 30);;
		lines.setFont(new Font("", Font.BOLD, 20));
		lines.setForeground(Color.black);
		
		JLabel lNumLines = new JLabel(Integer.toString(numLines));
		lNumLines.setBounds(50, 100, 80, 30);;
		lNumLines.setFont(new Font("", Font.BOLD, 20));
		lNumLines.setForeground(Color.black);
		
		JLabel removed = new JLabel("Blank Lines Removed");
		removed.setBounds(50, 100, 80, 30);;
		removed.setFont(new Font("", Font.BOLD, 20));
		removed.setForeground(Color.black);
		
		JLabel lRemoved = new JLabel(Integer.toString(numLinesRemoved));
		lRemoved.setBounds(50, 100, 80, 30);;
		lRemoved.setFont(new Font("", Font.BOLD, 20));
		lRemoved.setForeground(Color.black);
		
		JLabel count = new JLabel("Word Count");
		count.setBounds(50, 100, 80, 30);;
		count.setFont(new Font("", Font.BOLD, 20));
		count.setForeground(Color.black);
		
		JLabel lCount = new JLabel(Integer.toString(numCount));
		lCount.setBounds(50, 100, 80, 30);;
		lCount.setFont(new Font("", Font.BOLD, 20));
		lCount.setForeground(Color.black);
		
		JLabel wordsPerLine = new JLabel("Average words/line");
		wordsPerLine.setBounds(50, 100, 80, 30);;
		wordsPerLine.setFont(new Font("", Font.BOLD, 20));
		wordsPerLine.setForeground(Color.black);
		
		JLabel lWordsPerLine = new JLabel(Integer.toString(numWordsPerLine));
		lWordsPerLine.setBounds(50, 100, 80, 30);;
		lWordsPerLine.setFont(new Font("", Font.BOLD, 20));
		lWordsPerLine.setForeground(Color.black);
		
		JLabel length = new JLabel("Average line length");
		length.setBounds(50, 100, 80, 30);;
		length.setFont(new Font("", Font.BOLD, 20));
		length.setForeground(Color.black);
		
		JLabel lLength = new JLabel(Integer.toString(numLength));
		lLength.setBounds(50, 100, 80, 30);;
		lLength.setFont(new Font("", Font.BOLD, 20));
		lLength.setForeground(Color.black);
		
		//Add buttons to frame
		frame.add(open);
		frame.add(save);
		
		//Add labels to frame
		frame.add(input);
		frame.add(fileName);
		frame.add(lines);
		frame.add(lNumLines);
		frame.add(removed);
		frame.add(lRemoved);
		frame.add(count);
		frame.add(lCount);
		frame.add(wordsPerLine);
		frame.add(lWordsPerLine);
		frame.add(length);
		frame.add(lLength);
		
		/*
		//Initiate JFrame
		JFrame f= new JFrame("Text Analyzer");

		//Initiate JPanels
		JPanel selectFile = new JPanel();  
		selectFile.setBounds(40, 40, 400, 400);    
		selectFile.setBackground(Color.gray); 

		JPanel justification = new JPanel();
		justification.setBounds(40, 550, 400, 400);
		justification.setBackground(Color.gray);

		JPanel analysis = new JPanel();
		analysis.setBounds(500, 40, 1350, 910);
		analysis.setBackground(Color.gray);

		//Initiate JLabels
		JLabel selectLabel = new JLabel("Select File");
		selectLabel.setBounds(50, 100, 80, 30);
		selectLabel.setFont(new Font("", Font.BOLD, 20));
		selectLabel.setForeground(Color.black);

		JLabel justificationLabel = new JLabel("Justification"); 
		justificationLabel.setBounds(50, 100, 80, 30);
		justificationLabel.setFont(new Font("", Font.BOLD, 20));
		justificationLabel.setForeground(Color.black);

		JLabel analysisLabel = new JLabel("Analysis");
		analysisLabel.setBounds(50, 100, 80, 30);;
		analysisLabel.setFont(new Font("", Font.BOLD, 20));
		analysisLabel.setForeground(Color.black);

		JLabel input = new JLabel("Choose input file: ");
		input.setBounds(50, 100, 80, 30);;
		input.setFont(new Font("", Font.BOLD, 20));
		input.setForeground(Color.black);

		//Add JLabels to JPanels
		selectFile.add(selectLabel);
		selectFile.add(input);
		justification.add(justificationLabel);
		analysis.add(analysisLabel);

		//Add JPanels to JFrame
		f.add(selectFile);  
		f.add(justification);
		f.add(analysis); 

		//JFrame stuff
		f.setSize(400,400);    
		f.setLayout(null);    
		f.setVisible(true);   
		*/

	}  

	public static void main(String args[])  
	{  
		new cse360();  
	}  
} 
