package ca.ualberta.cs.lonelytwitter;

import java.sql.Connection;
import java.util.ArrayList;


public interface TwiterConnection
{
	public Connection connectToTwitter(String APIKey);
	public ArrayList<User> getFollowers();
	public ArrayList<Tweet> getNewTweets(Integer number);
}
