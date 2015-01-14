package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

import android.R.string;


public class Viewer extends User
{
	
	public void setName(String namString) throws IOException{
		if (namString.length() > 8){
			throw new IOException("Too Long");
		}
		this.name = namString;
	}
}
