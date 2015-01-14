package ca.ualberta.cs.lonelytwitter;


public class Retweet extends Tweet
{
	User originalPoster;

	
	public User getOriginalPoster()
	{
	
		return originalPoster;
	}

	
	public void setOriginalPoster(User originalPoster)
	{
	
		this.originalPoster = originalPoster;
	}

	
}
