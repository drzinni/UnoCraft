package com.danielzinni.unocraft;

public class Card 
{
	int type;
	String text;
	int color;
	
	public Card(int type, String text, int color)
	{
		this.type = type;
		this.text = text;
		this.color = color;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
}
