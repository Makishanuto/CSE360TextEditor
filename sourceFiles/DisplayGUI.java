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
import java.util.Scanner;
import java.util.ArrayList;


public class DisplayGUI extends JApplet
{
    public DisplayGUI ()
    {
        ArrayList<String> stringsForUse = new ArrayList<String>();

        //Create JFrame
        JFrame master = new JFrame("Text Analyzer");
        master.setSize(1028, 5000);
        master.setLayout(new BorderLayout());
        master.setVisible(true);
        master.getContentPane().setBackground(Color.lightGray);

        Container frame = master.getContentPane();

        //Create buttons
        JButton open = new JButton("Open File");
        open.setFont(new Font("", Font.BOLD|Font.ITALIC, 40));
        open.setForeground(Color.white);
        open.setBackground(Color.blue);

        JButton save = new JButton("Save File");
        save.setFont(new Font("", Font.BOLD|Font.ITALIC, 40));
        save.setForeground(Color.white);
        save.setBackground(Color.blue);


        JButton rightJ = new JButton("Right");
        rightJ.setFont(new Font("", Font.BOLD, 40));
        rightJ.setForeground(Color.white);
        rightJ.setBackground(Color.black);

        JButton leftJ = new JButton("Left");
        leftJ.setFont(new Font("", Font.BOLD, 40));
        leftJ.setForeground(Color.white);
        leftJ.setBackground(Color.black);
        
        JButton fullJ = new JButton("Full");
        fullJ.setFont(new Font("", Font.BOLD, 40));
        fullJ.setForeground(Color.white);
        fullJ.setBackground(Color.black);
        
        JButton singleS = new JButton("Single");
        singleS.setFont(new Font("", Font.BOLD, 40));
        singleS.setForeground(Color.white);
        singleS.setBackground(Color.black);
        
        JButton doubleS = new JButton("Double");
        doubleS.setFont(new Font("", Font.BOLD, 40));
        doubleS.setForeground(Color.white);
        doubleS.setBackground(Color.black);

        JButton analysis = new JButton("Show Analysis");
        analysis.setFont(new Font("", Font.BOLD, 40));
        analysis.setForeground(Color.white);
        analysis.setBackground(Color.black);
        
        JButton blank = new JButton(" -- ");
        blank.setFont(new Font("", Font.BOLD, 40));
        blank.setForeground(Color.white);
        blank.setBackground(Color.black);
        
        
        //Create Labels
        JLabel input = new JLabel("Input File" ,  SwingConstants.CENTER);
        input.setFont(new Font("", Font.BOLD, 30));
        input.setForeground(Color.black);

        JLabel fileName = new JLabel("--" ,  SwingConstants.CENTER);
        fileName.setFont(new Font("", ~Font.BOLD, 30));
        fileName.setForeground(Color.black);

        JLabel lines = new JLabel("Num of Lines" ,  SwingConstants.CENTER);
        lines.setFont(new Font("", Font.BOLD, 30));
        lines.setForeground(Color.black);

        JLabel lNumLines = new JLabel("--" ,SwingConstants.CENTER);
        lNumLines.setFont(new Font("", ~Font.BOLD, 30));
        lNumLines.setForeground(Color.black);

        JLabel removed = new JLabel("Blank Lines Removed" ,SwingConstants.CENTER);
        removed.setFont(new Font("", Font.BOLD, 30));
        removed.setForeground(Color.black);

        JLabel lRemoved = new JLabel("--" ,SwingConstants.CENTER);
        lRemoved.setFont(new Font("", ~Font.BOLD, 30));
        lRemoved.setForeground(Color.black);

        JLabel count = new JLabel("Word Count" ,SwingConstants.CENTER);
        count.setFont(new Font("", Font.BOLD, 30));
        count.setForeground(Color.black);

        JLabel lCount = new JLabel("--" ,SwingConstants.CENTER);
        lCount.setFont(new Font("", ~Font.BOLD, 30));
        lCount.setForeground(Color.black);

        JLabel wordsPerLine = new JLabel("Avg words/line" ,SwingConstants.CENTER);
        wordsPerLine.setFont(new Font("", Font.BOLD, 30));
        wordsPerLine.setForeground(Color.black);

        JLabel lWordsPerLine = new JLabel("--" ,SwingConstants.CENTER);
        lWordsPerLine.setFont(new Font("", ~Font.BOLD, 30));
        lWordsPerLine.setForeground(Color.black);

        JLabel length = new JLabel("Avg line length " ,SwingConstants.CENTER);
        length.setFont(new Font("", Font.BOLD, 30));
        length.setForeground(Color.black);

        JLabel lLength = new JLabel("--" ,SwingConstants.CENTER);
        lLength.setFont(new Font("", ~Font.BOLD, 30));
        lLength.setForeground(Color.black);
        
        JLabel spaces = new JLabel("Number of Spaces " ,SwingConstants.CENTER);
        spaces.setFont(new Font("", Font.BOLD, 30));
        spaces.setForeground(Color.black);

        JLabel lspaces = new JLabel("--" ,SwingConstants.CENTER);
        lspaces.setFont(new Font("", ~Font.BOLD, 30));
        lspaces.setForeground(Color.black);
        
        JLabel width = new JLabel("Line Width" ,SwingConstants.CENTER);
        width.setFont(new Font("", Font.BOLD, 30));
        width.setForeground(Color.black);

        JLabel lwidth = new JLabel("--",  SwingConstants.CENTER);
        lwidth.setFont(new Font("", ~Font.BOLD, 30));
        lwidth.setForeground(Color.black);
        
        JLabel LineWidth = new JLabel("Line Width", SwingConstants.CENTER);
        LineWidth.setFont(new Font("", ~Font.BOLD, 30));
        LineWidth.setForeground(Color.black);

        
        JLabel justification = new JLabel("Justification", SwingConstants.CENTER);
        justification.setFont(new Font("", ~Font.BOLD, 35));
        justification.setBackground(Color.blue);

        JLabel spacing = new JLabel("Spacing", SwingConstants.CENTER);
        spacing.setFont(new Font("", ~Font.BOLD, 35));
        spacing.setBackground(Color.blue);
        
        JLabel analysis1 = new JLabel("Analysis", SwingConstants.CENTER);
        analysis1.setFont(new Font("", ~Font.BOLD, 30));
        analysis1.setForeground(Color.black);
        
        
        //JSlider
        JSlider slider = new JSlider();
        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
              System.out.println("Slider: " + slider.getValue());
            }
          });
          
        
        
        //create panels
        Panel options = new Panel();
        options.setLayout(new GridLayout(10, 2));
        options.add(open);
        options.add(save);
        options.add(justification);
        options.add(spacing);
        options.add(rightJ);
        options.add(singleS);
        options.add(leftJ);
        options.add(doubleS);
        options.add(fullJ);
        options.add(blank);
        options.add(LineWidth);
        options.add(slider);
        
        Panel middle = new Panel();
        middle.setLayout(new GridLayout(2, 1));
        middle.add(analysis);	
        //middle.add();
        middle.add(analysis1);
        
        Panel bottom = new Panel();
        bottom.setLayout(new GridLayout(8, 2));
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
        //frame.add(blank, BorderLayout.EAST);
        //frame.add((blank, BorderLayout.WEST);
        frame.add(middle, BorderLayout.CENTER);
        frame.add(bottom, BorderLayout.SOUTH);
        

        final JFileChooser fileChooser  = new JFileChooser();
        JTextField leftJBool = new JTextField("true");

        rightJ.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
            {
        		if(e.getSource() == "rightJ") {
                    leftJBool.setText("false");
                }
            }
        });

        leftJ.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
            {
        		if(e.getSource() == "rightJ") {
        			leftJBool.setText("true");
                }
            }
        });


        for(int i = 0; i < stringsForUse.size(); i++)
        {
            int x;
            for(int j = 0; j < stringsForUse.size(); j++){
                x = (stringsForUse.get(j)).length();
            }
        }

        // File Chooser


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


        //Do when clicked
        open.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int numLines = 0;
                int numLinesRemoved = 0;
                int numCount = 0;
                int numWordsPerLine = 0;
                int numLength = 0;
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

                    // Input has been read

                      for(int i = 0; i < stringsForUse.size(); i++) // Check words
                      {
                          if((stringsForUse.get(i)).length() > 0)
                          {
                              String[] listOfWords = (stringsForUse.get(i)).split("\\s+");
                              numCount += listOfWords.length;
                          }
                      }
                      numWordsPerLine = numCount / stringsForUse.size();
                      int total = 0;
                      for(int i = 0; i < stringsForUse.size(); i++) { // Line Length
                          total += (stringsForUse.get(i)).length();
                      }
                      numLength = total / stringsForUse.size();

                      for(int i = 0; i < stringsForUse.size(); i++) // Make sure lines aren't a little too long
                      {
                          if((stringsForUse.get(i)).length() > 80) {

                          }
                      }
                      for(int i = 0; i < stringsForUse.size(); i++) // Check for and remove blank lines
                      {
                          if((stringsForUse.get(i)).length() == 0) {
                              stringsForUse.remove(i);
                              numLinesRemoved++;
                          }
                      }

                      for(int i = 0; i < stringsForUse.size()-1; i++) // Concatenation
                      {
                          int next = i+1;
                          String possibleOutput = "";
                          possibleOutput +=  (stringsForUse.get(i)) + " " + (stringsForUse.get(next));
                          if(possibleOutput.length() < 80)
                          {
                              String toModify = stringsForUse.get(i) + " " + (stringsForUse.get(next));
                              stringsForUse.set(i, toModify);
                              i++; // Skip to the next one
                          }
                      }

                      fileName.setText(strInput);
                      lNumLines.setText(Integer.toString(numLines));
                      lRemoved.setText(Integer.toString(numLinesRemoved));
                      lCount.setText(Integer.toString(numCount));
                      lWordsPerLine.setText(Integer.toString(numWordsPerLine));
                      lLength.setText(Integer.toString(numLength));
                 }
                 else { // User cancelled
                      System.out.println("Option cancelled lmao");
                 }
                  //Open file */
              }
        });

        //Change color when hovering
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

        //Do when clicked
        save.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int checkIfFileChosen = fileChooser.showSaveDialog(DisplayGUI.this);
                if(checkIfFileChosen == JFileChooser.APPROVE_OPTION)
                {
                    try {
                        File writeFile = new File(fileChooser.getSelectedFile()+".txt");
                        PrintWriter outputText = new PrintWriter(writeFile);
                        if(leftJBool.getText().equalsIgnoreCase("true")) {
                			for (int i = 0; i < stringsForUse.size(); i++){
                                outputText.printf("-%80s", stringsForUse.get(i));
                                outputText.println();
                			}
                			outputText.close();
                        }
                        else {
                            for (int i = 0; i < stringsForUse.size(); i++){
                                outputText.printf("%80s", stringsForUse.get(i));
                                outputText.println();
                            }
                            outputText.close();
                        }

                    } catch(Exception ex) {
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
        g.fillRect(0, 0, 400, 400);
        g.setColor(Color.black);
        g.drawRect(0, 0, 400, 400);
    }
}
