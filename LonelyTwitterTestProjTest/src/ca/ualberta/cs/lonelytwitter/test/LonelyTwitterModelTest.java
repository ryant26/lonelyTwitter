package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import android.test.AndroidTestCase;


public class LonelyTwitterModelTest extends AndroidTestCase
{
	NormalTweetModel ntm1;
	NormalTweetModel ntm2;
	
	ImportantTweetModel itm1;
	ImportantTweetModel itm2;
	
	
	@Override
	protected void setUp() throws Exception
	{
		ntm1 = new NormalTweetModel("text", new Date());
		ntm2 = new NormalTweetModel("text", new Date());
		
		itm1 = new ImportantTweetModel("text", new Date());
		itm2 = new ImportantTweetModel("text", new Date());
		super.setUp();
	}
	
	public void testEqualsBug(){
		assertFalse("Important Tweets Shouldn't be equal to normal tweets!", itm1.equals(ntm1));
	}
	
	public void test

	
}
