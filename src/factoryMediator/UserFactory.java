package factoryMediator;

public  class UserFactory {
	
public User createUser(String nickname, String typeOfUser ) {
	
	if(typeOfUser.equals("user")) {
		
		return new NormalUser(nickname);
	}
	else if(typeOfUser.equals("bot")) {
		return new Bot(nickname);
	}
	System.out.println("You are trying to create uknown type of user!Try again!");
	return null;
}
	}

