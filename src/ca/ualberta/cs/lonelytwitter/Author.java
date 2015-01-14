package ca.ualberta.cs.lonelytwitter;


public class Author extends User implements UserLike
{
	public Author (String str){
		super(str);
	}

	@Override
	public void setName(String name)
	{

		this.name = name;
		
	}
}
