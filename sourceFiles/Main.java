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

public class Main extends JApplet
{
    public static void main(String args[])
    {
      ArrayList<String> stringsForUse = new ArrayList<String>();
      try
      {

        Scanner userInput = new Scanner(System.in);
        File readInputtedFile = new FileReader;
        while(userInput.hasNextLine())
        {
          stringsForUse.add(userInput.nextLine());
        }
        for(int i = 0, i < stringsForUse; i++)
        {
            System.out.printf("-%s", i);
        }
      }
      DisplayGUI file = new DisplayGUI();
    }

}
