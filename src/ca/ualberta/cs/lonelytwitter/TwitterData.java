package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

import android.R.bool;


public abstract class TwitterData
{
	ArrayList<User> followers;
	ArrayList<User> following;
	
	public ArrayList<User> getFollowers()
	{
	
		return followers;
	}
	
	public void setFollowers(ArrayList<User> followers)
	{
	
		this.followers = followers;
	}
	
	public ArrayList<User> getFollowing()
	{
	
		return following;
	}
	
	public void setFollowing(ArrayList<User> following)
	{
	
		this.following = following;
	}
	
	
	public abstract bool followUser(User u);
	public abstract bool unfollowUser(User u);
	
}
