package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;


public abstract class User
{
	protected String name;

	public User(String name){
		this.name = name;
	}
	
	public User (){
		name = "Annonymous";
	}
	
	
	public String getName()
	{
	
		return name;
	}

	
	public abstract void setName(String name) throws IOException;
}
