import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import javax.swing.JApplet;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import javax.swing.JApplet;

import java.io.*; // File
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class DisplayGUI extends JApplet
{
    public DisplayGUI ()
    {
        ArrayList<String> stringsForUse = new ArrayList<String>();
        ArrayList<String> listOfWords = new ArrayList<String>();

        //Create JFrame
        JFrame master = new JFrame("Text Analyzer");
        master.setSize(800, 700);
        master.setLayout(new BorderLayout());
        master.setVisible(true);
        master.getContentPane().setBackground(Color.lightGray);

        Container frame = master.getContentPane();

        //Create buttons
        JButton open = new JButton("Open File");
        open.setFont(new Font("", Font.BOLD|Font.ITALIC, 40));
        open.setForeground(Color.blue);
        open.setBackground(Color.black);

        JButton save = new JButton("Save File");
        save.setFont(new Font("", Font.BOLD|Font.ITALIC, 40));
        save.setForeground(Color.blue);
        save.setBackground(Color.black);

      
        JButton analysis = new JButton("Show Analysis");
        analysis.setFont(new Font("", Font.BOLD, 40));
        analysis.setForeground(Color.blue);
        analysis.setBackground(Color.black);

        
        //Create Labels
        JLabel input = new JLabel("Input File" ,  SwingConstants.CENTER);
        input.setFont(new Font("", Font.PLAIN, 20));
        input.setForeground(Color.black);
        input.setOpaque(true);
        input.setBackground(Color.blue);

        JLabel fileName = new JLabel("--" ,  SwingConstants.CENTER);
        fileName.setFont(new Font("", ~Font.PLAIN, 20));
        fileName.setForeground(Color.black);
        fileName.setOpaque(true);
        fileName.setBackground(Color.blue);

        JLabel lines = new JLabel("Num of Lines" ,  SwingConstants.CENTER);
        lines.setFont(new Font("", Font.PLAIN, 20));
        lines.setForeground(Color.black);
        lines.setOpaque(true);
        lines.setBackground(Color.lightGray);

        JLabel lNumLines = new JLabel("--" ,SwingConstants.CENTER);
        lNumLines.setFont(new Font("", ~Font.PLAIN, 20));
        lNumLines.setForeground(Color.black);
        lNumLines.setOpaque(true);
        lNumLines.setBackground(Color.lightGray);

        
        JLabel removed = new JLabel("Blank Lines Removed" ,SwingConstants.CENTER);
        removed.setFont(new Font("", Font.PLAIN, 20));
        removed.setForeground(Color.black);
        removed.setOpaque(true);
        removed.setBackground(Color.blue);


        JLabel lRemoved = new JLabel("--" ,SwingConstants.CENTER);
        lRemoved.setFont(new Font("", ~Font.PLAIN, 20));
        lRemoved.setForeground(Color.black);
        lRemoved.setOpaque(true);
        lRemoved.setBackground(Color.blue);


        JLabel count = new JLabel("Word Count" ,SwingConstants.CENTER);
        count.setFont(new Font("", Font.PLAIN, 20));
        count.setForeground(Color.black);
        count.setOpaque(true);
        count.setBackground(Color.lightGray);


        JLabel lCount = new JLabel("--" ,SwingConstants.CENTER);
        lCount.setFont(new Font("", ~Font.PLAIN, 20));
        lCount.setForeground(Color.black);
        lCount.setOpaque(true);
        lCount.setBackground(Color.lightGray);


        JLabel wordsPerLine = new JLabel("Avg words/line" ,SwingConstants.CENTER);
        wordsPerLine.setFont(new Font("", Font.PLAIN, 20));
        wordsPerLine.setForeground(Color.black);
        wordsPerLine.setOpaque(true);
        wordsPerLine.setBackground(Color.blue);

        JLabel lWordsPerLine = new JLabel("--" ,SwingConstants.CENTER);
        lWordsPerLine.setFont(new Font("", ~Font.PLAIN, 20));
        lWordsPerLine.setForeground(Color.black);
        lWordsPerLine.setOpaque(true);
        lWordsPerLine.setBackground(Color.blue);

        JLabel length = new JLabel("Avg line length " ,SwingConstants.CENTER);
        length.setFont(new Font("", Font.PLAIN, 20));
        length.setForeground(Color.black);
        length.setOpaque(true);
        length.setBackground(Color.lightGray);

        JLabel lLength = new JLabel("--" ,SwingConstants.CENTER);
        lLength.setFont(new Font("", ~Font.PLAIN, 20));
        lLength.setForeground(Color.black);
        lLength.setOpaque(true);
        lLength.setBackground(Color.lightGray);
        
        JLabel spaces = new JLabel("Number of Spaces " ,SwingConstants.CENTER);
        spaces.setFont(new Font("", Font.PLAIN, 20));
        spaces.setForeground(Color.black);
        spaces.setOpaque(true);
        spaces.setBackground(Color.blue);

        JLabel lspaces = new JLabel("--" ,SwingConstants.CENTER);
        lspaces.setFont(new Font("", ~Font.BOLD, 20));
        lspaces.setForeground(Color.black);
        lspaces.setOpaque(true);
        lspaces.setBackground(Color.blue);
        
        JLabel width = new JLabel("Line Width" ,SwingConstants.CENTER);
        width.setFont(new Font("", Font.PLAIN, 20));
        width.setForeground(Color.black);
        width.setOpaque(true);
        width.setBackground(Color.lightGray);

        JLabel lwidth = new JLabel("--",  SwingConstants.CENTER);
        lwidth.setFont(new Font("", ~Font.BOLD, 20));
        lwidth.setForeground(Color.black);
        lwidth.setOpaque(true);
        lwidth.setBackground(Color.lightGray);
        
        JLabel LineWidth = new JLabel("Line Width", SwingConstants.CENTER);
        LineWidth.setFont(new Font("", ~Font.PLAIN, 20));
        LineWidth.setForeground(Color.black);
        LineWidth.setOpaque(true);
        LineWidth.setBackground(Color.lightGray);

        
        JLabel justification = new JLabel("Justification", SwingConstants.CENTER);
        justification.setFont(new Font("", Font.PLAIN|Font.BOLD, 30));
        justification.setOpaque(true);
        justification.setForeground(Color.black);
        justification.setBackground(Color.lightGray);

        JLabel spacing = new JLabel("Spacing", SwingConstants.CENTER);
        spacing.setFont(new Font("", Font.PLAIN|Font.BOLD, 30));
        spacing.setOpaque(true);
        spacing.setForeground(Color.black);
        spacing.setBackground(Color.lightGray);
        
        JLabel analysis1 = new JLabel("Analysis", SwingConstants.CENTER);
        analysis1.setFont(new Font("", Font.PLAIN|Font.ITALIC, 35));
        analysis1.setOpaque(true);
        analysis1.setForeground(Color.black);
        analysis1.setBackground(Color.lightGray);
        
        
        //JSlider
        JSlider slider = new JSlider(0, 100, 50);
        slider.setMajorTickSpacing(10); 
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
   
        //CHoices
        Choice justificationchoice = new Choice();
        justificationchoice.setFont(new Font("", Font.PLAIN, 20));
        justificationchoice.setBackground(Color.lightGray);
        justificationchoice.setForeground(Color.black);
        justificationchoice.addItem("Left");
        justificationchoice.addItem("Right");
        justificationchoice.addItem("Full");
              
        Choice spacingchoice = new Choice();
        spacingchoice.setFont(new Font("", Font.PLAIN ,20));
        spacingchoice.setBackground(Color.lightGray);
        spacingchoice.setForeground(Color.black);
        spacingchoice.addItem("Single");
        spacingchoice.addItem("Double");
        
          
      
        //create panels
        Panel options = new Panel();
        options.setLayout(new GridLayout(4, 2));
        //options.setSize(800, 100);
        options.add(open);
        options.add(save);
        options.add(justification);
        options.add(spacing);
        options.add(justificationchoice);
        options.add(spacingchoice);
        options.add(LineWidth);
        options.add(slider);
        
        Panel middle = new Panel();
        middle.setLayout(new GridLayout(2, 1));
       // middle.setSize(800,200);
        middle.add(analysis);	
        middle.add(analysis1);
        
        Panel bottom = new Panel();
        bottom.setLayout(new GridLayout(8, 2));
       // bottom.setSize(800, 200);
        bottom.add(input);
        bottom.add(fileName);
        bottom.add(lines);
        bottom.add(lNumLines);
        bottom.add(removed);
        bottom.add(lRemoved);
        bottom.add(count);
        bottom.add(lCount);
        bottom.add(wordsPerLine);
        bottom.add(lWordsPerLine);
        bottom.add(length);
        bottom.add(lLength);
        bottom.add(spaces);
        bottom.add(lspaces);
        bottom.add(width);
        bottom.add(lwidth);
        
        
        
        frame.add(options, BorderLayout.NORTH);
        frame.add(middle, BorderLayout.CENTER);
        frame.add(bottom, BorderLayout.SOUTH);
        
        
//------------------------------------------------------------------END OF GUI------------------------------------------------------------------------------

        final JFileChooser fileChooser  = new JFileChooser();

        //Change color when hovering
        open.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                open.setBackground(Color.gray);
            }

            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                open.setBackground(Color.black);
            }
        });
        
        save.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                save.setBackground(Color.gray);
            }

            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                save.setBackground(Color.black);
            }
        });
        
 
        analysis.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
            	analysis.setBackground(Color.gray);
            }

            public void mouseExited(java.awt.event.MouseEvent evt)
            {
            	analysis.setBackground(Color.black);
            }
        });


        //Do when clicked
        open.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
            	stringsForUse.clear();
            	listOfWords.clear();
                // variables
                int numLines = 0;
                int numLinesRemoved = 0;
                int numCount = 0;
                int numWordsPerLine = 0;
                int numLength = 0;
                int numberofspaces = 0;
            
                
                int checkIfFileChosen = fileChooser.showOpenDialog(DisplayGUI.this);
                if(checkIfFileChosen == JFileChooser.APPROVE_OPTION)
                {
                	
                      File readInputtedFile = fileChooser.getSelectedFile();
                      String strInput = readInputtedFile.getName();
                      
                      
                    Scanner userInput = null;
                    try {
                        userInput = new Scanner(readInputtedFile);
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }
                    while(userInput.hasNextLine())
                     {
                        stringsForUse.add(userInput.nextLine());
                        numLines++;
                     }
                      userInput.close();
                    // Input has been read, added to stringsForUse
                      

                      for(int i = 0; i < stringsForUse.size(); i++) // Check word count
                      {
                          if((stringsForUse.get(i)).length() > 0)
                          {
                        	  String[] list = (stringsForUse.get(i)).split("\\s+");
                              numCount += list.length;
                              
                              /*
                              for(int j=0; j< list.length; j++){
                            	  System.out.println(list[j]);
                              }
                              
                              //Collections.addAll(listOfWords, list);
                              
                              if(list.length < listOfWords.size())
                              {
                            	  System.out.println("TRUE");
                            	  System.out.println(list.length);
                            	  System.out.println(listOfWords.size());
                              }
                              
                              for(int j=0; j< listOfWords.size(); j++){
                            	  System.out.println(listOfWords.get(j));
                              }
                              */
                              
                              
                          }
                      }
                                    
                      numWordsPerLine = numCount / (stringsForUse.size());   //gets words per line
                      
                                          
                      int total = 0;
                      for(int i = 0; i < stringsForUse.size(); i++) { // Line Length
                          total += (stringsForUse.get(i)).length();
                      }
                      numLength = total / stringsForUse.size();
                      

                      int linewidth = slider.getValue();
                      for(int i = 0; i < stringsForUse.size(); i++) // Make sure lines aren't a little too long
                      {
                          if((stringsForUse.get(i)).length() >linewidth) {
                          }
                      }
                      
                      
                      for(int i = 0; i < stringsForUse.size(); i++) // Get number of spaces
                      {        
                    	  
                    	  if((stringsForUse.get(i)).length() > 0)
                          {
                    		  if((stringsForUse.get(i)).length() >linewidth) { //if one word is over max characters. 
                    			  numberofspaces += 0;
                              }
                    		  else {
                    	          
                    	          numberofspaces +=  linewidth - stringsForUse.get(i).replace(" ", "").length();
                    		  }
                          }
                      }
                      
                      
                      for(int i = 0; i < stringsForUse.size(); i++) // Check for and remove blank lines
                      {
                          if((stringsForUse.get(i)).length() == 0) {
                              stringsForUse.remove(i);
                              numLinesRemoved++;
                          }
                      }

                      fileName.setText(strInput);
                      lNumLines.setText(Integer.toString(numLines));
                      lRemoved.setText(Integer.toString(numLinesRemoved));
                      lCount.setText(Integer.toString(numCount));
                      lWordsPerLine.setText(Integer.toString(numWordsPerLine));
                      lLength.setText(Integer.toString(numLength));
                      lspaces.setText(Integer.toString(numberofspaces));
                      lwidth.setText(Integer.toString(slider.getValue()));
                      
                      fileName.setVisible(false);
                      lNumLines.setVisible(false);
                      lRemoved.setVisible(false);
                      lCount.setVisible(false);
                      lWordsPerLine.setVisible(false);
                      lLength.setVisible(false);
                      lspaces.setVisible(false);
                      lwidth.setVisible(false);
                 }
                 else { // User cancelled
                      System.out.println("Option cancelled lmao");
                 }
                  //Open file */
              }
        });

        analysis.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
            	fileName.setVisible(true);
                lNumLines.setVisible(true);
                lRemoved.setVisible(true);
                lCount.setVisible(true);
                lWordsPerLine.setVisible(true);
                lLength.setVisible(true);
                lspaces.setVisible(true);
                lwidth.setVisible(true);
            }
        });

        //Do when clicked
        save.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
            	//variables
            	int spacestoadd =0;
            	int words=0;
            	int spacestoaddaftereachword =0;
                String outputString = "";
                for (int i = 0; i < listOfWords.size(); i++){
                    System.out.println(listOfWords.get(i));
                }

                int checkIfFileChosen = fileChooser.showSaveDialog(DisplayGUI.this);
                if(checkIfFileChosen == JFileChooser.APPROVE_OPTION)
                {
                    try {
                        File writeFile = new File(fileChooser.getSelectedFile()+".txt");
                        PrintWriter outputText = new PrintWriter(writeFile);
                        
                        int linewidth = slider.getValue();
                        
                                    
                        if(justificationchoice.getSelectedIndex() == 0) {  //Left justification
                            String line = "";
                			for (int i = 0; i < listOfWords.size(); i++) {
                			    if(listOfWords.get(i).isEmpty() != true) {
                                    line += listOfWords.get(i) + " ";
                                    if (line.length() > linewidth) { 
                                        outputText.println();
                                        line = "";
                                    }
                                    if (spacingchoice.getSelectedIndex() == 1) {  //double spacing
                                        outputText.println();
                                    }
                                    outputString += listOfWords.get(i) + " ";
                                }
                            }
                            outputText.printf("%-" + linewidth + "s", outputString);
                			outputText.println();
                			outputText.close();
                        }

                        if (justificationchoice.getSelectedIndex() == 1){  //Right justification 
                            String line = "";
                            for (int i = 0; i < listOfWords.size(); i++) {
                                line += listOfWords.get(i) + " ";
                                if(line.length() > linewidth) {
                                    outputString += "\n";
                                    line = "";
                                }
                                if  (spacingchoice.getSelectedIndex() ==1){  //double spacing
                                    outputString += "\n";
                                }
                                outputString += listOfWords.get(i) + " ";
                            }
                            outputText.printf("%" + linewidth + "s", outputString + "\n");
                            outputText.close();
                        }

                        if (justificationchoice.getSelectedIndex() == 2)
                        {
                        	for (int i = 0; i < stringsForUse.size(); i++){
                        		while(i !=  (stringsForUse.size()-1))
                                {
                                    String[] listOfWords = (stringsForUse.get(i)).split("\\s+");
                                    for (int j=0; j < listOfWords.length; j++){
                                    	words += listOfWords[j].length();
                                    }                   
                                    spacestoadd = linewidth-words; //Column space- the number of characters in the words on each line
                                    spacestoaddaftereachword = spacestoadd / ( listOfWords.length -1 ); //divided by number of words on line -1                               
                                   for(int k = 0; k < stringsForUse.size(); k++){
                                    	stringsForUse.set(k, stringsForUse.get(k) + " "); 
                                    } 
                                }                          
                            }
                            outputText.close();
                        }
                        
                			outputText.close();
                    }

                     catch(Exception ex){
                            ex.printStackTrace();
                        }
                }
                else
                {
                    System.out.println("User cancelled.");
                }
            }
        });
       // newmaster.add(master);
    }

    public void paint(Graphics g)
    {
        //Draw background
        g.setColor(Color.gray);
        g.fillRect(0, 0, 800, 700);
        g.setColor(Color.black);
        g.drawRect(0, 0, 800, 700);
    }
}
