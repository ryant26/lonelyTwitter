package ca.ualberta.cs.lonelytwitter;


public class Tweet
{
	private String text;

	
	public String getText()
	{
	
		return text;
	}

	
	public void setText(String text)
	{
		//Assert len < 140 char
		this.text = text;
	}
	
}
