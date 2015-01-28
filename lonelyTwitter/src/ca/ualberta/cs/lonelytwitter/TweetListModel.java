package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;


public class TweetListModel
{
	ArrayList<LonelyTweetModel> tweetsArrayList;
	private int count;
	
	public void addTweet(LonelyTweetModel tweet){
		tweetsArrayList.add(tweet);
		count++;
	}
	
	public LonelyTweetModel[] getTweets(){
		return (LonelyTweetModel[]) tweetsArrayList.toArray();
	}
	
	public Boolean hasTweet(LonelyTweetModel tweet){
		return tweetsArrayList.contains(tweet);
	}
	
	public void removeTweet(LonelyTweetModel tweet){
		tweetsArrayList.remove(tweet);
	}
	
	public int getCount(){
		return count;
	}
}
