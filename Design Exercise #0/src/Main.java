public class Main {
	public static void main(String[] args) {
		TwitterFollowers acc = new TwitterFollowers();
		
		//people create their own Twitter accounts
		acc.addNewUser("Jaime Spacco");
		acc.addNewUser("David Bunde");
		acc.addNewUser("Vera Kazakova");
		acc.addNewUser("Ritwik Bose");
		
		//everyone follows Spacco
		//the user enters their name, and the name of the person they want to follow
		acc.follow("David Bunde", "Jaime Spacco");
		acc.follow("Vera Kazakova", "Jaime Spacco");
		acc.follow("Ritwik Bose", "Jaime Spacco");
		//prints the list of Spacco's followers who can see Spacco's posts
		acc.printFollowers("Jaime Spacco");
		
		//follow() has no effect since Bunde is already following Spacco
		acc.follow("David Bunde", "Jaime Spacco");
		acc.printFollowers("Jaime Spacco");
		
		//Bunde unfollows Spacco
		acc.unfollow("David Bunde", "Jaime Spacco");
		acc.printFollowers("Jaime Spacco");
		
		//unfollow() has no effect since Bunde is not following Spacco
		acc.unfollow("David Bunde", "Jaime Spacco");
		acc.printFollowers("Jaime Spacco");
	}
}
