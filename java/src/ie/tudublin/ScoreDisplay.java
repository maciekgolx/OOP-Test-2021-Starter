package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	ArrayList<Integer> ArrList= new ArrayList<Integer>(8);
	
	public void settings()
	{
		size(1000, 500);

		//How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
		
	}
	public char charAt(int index)

	public void loadScore()
	{
		string string= score.toString(score);
		int number=Integer.parseInt(string);
		int length= score.length();
		for(int i=0;i<length;i++)
		{
			ArrList.add(number);
		}
	}
	public void setup() 
	{
		
	}

	public void draw()
	{
		background(255);
		
	}

	void drawNotes()
	{
	}
}
