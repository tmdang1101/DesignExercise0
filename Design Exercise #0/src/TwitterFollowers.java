import java.util.*;

public class TwitterFollowers {
	private Map< String,ArrayList<String>> followers;
	
	//creates a Twitter "account" as a TreeMap where the key is the user name
	//and the value is the list of their followers
	public TwitterFollowers() {
		followers = new TreeMap< String,ArrayList<String>>();
	}
	
	//adds new users to Twitter
	//if they're already in Twitter, no effect
	public void addNewUser(String user) {
		if(!followers.containsKey(user))
			followers.put(user, new ArrayList<String>());
	}
	
	//follower wants to follow user
	//if follower or user not found in Twitter, no effect
	public void follow(String follower, String user) {
		if(!followers.containsKey(user) || !followers.containsKey(follower))
			return;
		if(followers.get(user).contains(follower))
			return;
		
		followers.get(user).add(follower);
	}
	
	//follower wants to unfollow user
	//if follower or user not found in Twitter, no effect
	public void unfollow(String follower, String user) {
		if(!followers.containsKey(user) || !followers.containsKey(follower))
			return;
		if(!followers.get(user).contains(follower))
			return;
		
		followers.get(user).remove(follower);
	}
	
	//prints list of followers of user
	public void printFollowers(String user) {
		System.out.println(user + "'s followers are: " + followers.get(user));
	}
}