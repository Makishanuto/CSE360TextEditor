import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import javax.swing.JApplet;
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
        master.setSize(1028, 736);
        master.setLayout(new GridLayout(8, 2));
        master.setVisible(true);
        master.getContentPane().setBackground(Color.lightGray);

        Container frame = master.getContentPane();

        //Create buttons
        JButton open = new JButton("Open File");
        open.setBounds(50,100,95,30);
        open.setFont(new Font("", Font.BOLD, 40));
        open.setForeground(Color.white);
        open.setBackground(Color.black);

        JButton save = new JButton("Save File");
        save.setBounds(50, 100, 95, 30);
        save.setFont(new Font("", Font.BOLD, 40));
        save.setForeground(Color.white);
        save.setBackground(Color.black);

        JButton rightJ = new JButton("Right Justification");
        open.setBounds(50,100,95,30);
        open.setFont(new Font("", Font.BOLD, 40));
        open.setForeground(Color.white);
        open.setBackground(Color.black);

        JButton leftJ = new JButton("Left Justification");
        open.setBounds(50,100,95,30);
        open.setFont(new Font("", Font.BOLD, 40));
        open.setForeground(Color.white);
        open.setBackground(Color.black);

        //Create Labels
        JLabel input = new JLabel("Input File");
        input.setBounds(50, 100, 80, 30);;
        input.setFont(new Font("", Font.BOLD, 30));
        input.setForeground(Color.black);

        JLabel fileName = new JLabel("--");
        fileName.setBounds(50, 100, 80, 30);;
        fileName.setFont(new Font("", ~Font.BOLD, 30));
        fileName.setForeground(Color.black);

        JLabel lines = new JLabel("Num of Lines");
        lines.setBounds(50, 100, 80, 30);;
        lines.setFont(new Font("", Font.BOLD, 30));
        lines.setForeground(Color.black);

        JLabel lNumLines = new JLabel("--");
        lNumLines.setBounds(50, 100, 80, 30);;
        lNumLines.setFont(new Font("", ~Font.BOLD, 30));
        lNumLines.setForeground(Color.black);

        JLabel removed = new JLabel("Blank Lines");
        removed.setBounds(50, 100, 80, 30);;
        removed.setFont(new Font("", Font.BOLD, 30));
        removed.setForeground(Color.black);

        JLabel lRemoved = new JLabel("--");
        lRemoved.setBounds(50, 100, 80, 30);;
        lRemoved.setFont(new Font("", ~Font.BOLD, 30));
        lRemoved.setForeground(Color.black);

        JLabel count = new JLabel("Word Count");
        count.setBounds(50, 100, 80, 30);;
        count.setFont(new Font("", Font.BOLD, 30));
        count.setForeground(Color.black);

        JLabel lCount = new JLabel("--");
        lCount.setBounds(50, 100, 80, 30);;
        lCount.setFont(new Font("", ~Font.BOLD, 30));
        lCount.setForeground(Color.black);

        JLabel wordsPerLine = new JLabel("Avg words/line");
        wordsPerLine.setBounds(50, 100, 80, 30);;
        wordsPerLine.setFont(new Font("", Font.BOLD, 30));
        wordsPerLine.setForeground(Color.black);

        JLabel lWordsPerLine = new JLabel("--");
        lWordsPerLine.setBounds(50, 100, 80, 30);;
        lWordsPerLine.setFont(new Font("", ~Font.BOLD, 30));
        lWordsPerLine.setForeground(Color.black);

        JLabel length = new JLabel("Avg length");
        length.setBounds(50, 100, 80, 30);;
        length.setFont(new Font("", Font.BOLD, 30));
        length.setForeground(Color.black);

        JLabel lLength = new JLabel("--");
        lLength.setBounds(50, 100, 80, 30);;
        lLength.setFont(new Font("", ~Font.BOLD, 30));
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

        frame.add(rightJ);
        frame.add(leftJ);
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
