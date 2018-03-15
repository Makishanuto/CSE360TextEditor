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
        String strInput = "";
        int numLines = 0;
        int numLinesRemoved = 0;
        int numCount = 0;
        int numWordsPerLine = 0;
        int numLength = 0;

        ArrayList<String> stringsForUse = new ArrayList<String>();

        //Create JFrame
        JFrame frame = new JFrame("Text Analyzer");
        frame.setSize(500, 400);
        frame.setLayout(new GridLayout(7, 2));
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.lightGray);

        //Create buttons
        JButton open = new JButton("Open File");
        open.setBounds(50,100,95,30);
        open.setFont(new Font("", Font.BOLD, 40));
        open.setForeground(Color.white);
        open.setBackground(Color.black);


        // File Chooser
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


        //Do when clicked
        open.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                  int checkIfFileChosen = fileChooser.showOpenDialog(DisplayGUI.this);
                  if(checkIfFileChosen == JFileChooser.APPROVE_OPTION)
                  {
                      File readInputtedFile = fileChooser.getSelectedFile();
                      Scanner userInput = new Scanner(System.in);
                      while(userInput.hasNextLine())
                      {
                          stringsForUse.add(userInput.nextLine());
                      }
                      for(int i = 0; i < stringsForUse.size(); i++)
                      {
                          int x;
                          for(int j = 0; j < stringsForUse.size(); j++){
                    //          x = stringsForUse<String>[j].length();
                    //          System.out.printf("-%" + x + "s", i);
                          }
                      }
                  }
                  else {
                      System.out.println("Option canelled lmao");
                  }
                  //Open file
              }
        });

        JButton save = new JButton("Save File");
        save.setBounds(50, 100, 95, 30);
        save.setFont(new Font("", Font.BOLD, 40));
        save.setForeground(Color.white);
        save.setBackground(Color.black);

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
                //Save file
            }
        });

        //Create Labels
        JLabel input = new JLabel("Input File");
        input.setBounds(50, 100, 80, 30);;
        input.setFont(new Font("", Font.BOLD, 30));
        input.setForeground(Color.black);

        JLabel fileName = new JLabel(strInput);
        fileName.setBounds(50, 100, 80, 30);;
        fileName.setFont(new Font("", ~Font.BOLD, 30));
        fileName.setForeground(Color.black);

        JLabel lines = new JLabel("Number of Lines");
        lines.setBounds(50, 100, 80, 30);;
        lines.setFont(new Font("", Font.BOLD, 30));
        lines.setForeground(Color.black);

        JLabel lNumLines = new JLabel(Integer.toString(numLines));
        lNumLines.setBounds(50, 100, 80, 30);;
        lNumLines.setFont(new Font("", ~Font.BOLD, 30));
        lNumLines.setForeground(Color.black);

        JLabel removed = new JLabel("Blank Lines Removed");
        removed.setBounds(50, 100, 80, 30);;
        removed.setFont(new Font("", Font.BOLD, 30));
        removed.setForeground(Color.black);

        JLabel lRemoved = new JLabel(Integer.toString(numLinesRemoved));
        lRemoved.setBounds(50, 100, 80, 30);;
        lRemoved.setFont(new Font("", ~Font.BOLD, 30));
        lRemoved.setForeground(Color.black);

        JLabel count = new JLabel("Word Count");
        count.setBounds(50, 100, 80, 30);;
        count.setFont(new Font("", Font.BOLD, 30));
        count.setForeground(Color.black);

        JLabel lCount = new JLabel(Integer.toString(numCount));
        lCount.setBounds(50, 100, 80, 30);;
        lCount.setFont(new Font("", ~Font.BOLD, 30));
        lCount.setForeground(Color.black);

        JLabel wordsPerLine = new JLabel("Average words/line");
        wordsPerLine.setBounds(50, 100, 80, 30);;
        wordsPerLine.setFont(new Font("", Font.BOLD, 30));
        wordsPerLine.setForeground(Color.black);

        JLabel lWordsPerLine = new JLabel(Integer.toString(numWordsPerLine));
        lWordsPerLine.setBounds(50, 100, 80, 30);;
        lWordsPerLine.setFont(new Font("", ~Font.BOLD, 30));
        lWordsPerLine.setForeground(Color.black);

        JLabel length = new JLabel("Average line length");
        length.setBounds(50, 100, 80, 30);;
        length.setFont(new Font("", Font.BOLD, 30));
        length.setForeground(Color.black);

        JLabel lLength = new JLabel(Integer.toString(numLength));
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
