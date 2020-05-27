package factoryMediator;

import java.util.HashMap;

public class MessagesChatRoom implements ChatRoomMediator {
	
	private HashMap<String, User> users = new HashMap<String, User>();
    private UserFactory userFactory;
    private User bot;
 
    
    public  void addUser(User user) {
		if(user!=null) {
			users.put(user.getNickname(), user);
    		System.out.println("User with nickname " + user.getNickname() + " has been added to the conversation");
		}
		user.setMediator(this);
		
	}
    
	@Override
	public  void removeUser(User user) {
    	if(users.containsKey(user) && user!=null) {
    		this.users.remove(user);
    	}
    }
    
	@Override
	public void sendMessage(User user,String message) {
		
    	System.out.println("User with nickname " + user.getNickname() + " say: " + message);
  	
	if(bot!=null && message.contains("cat")) {
	 removeUser(users.get(user));
	 //bot.printMessage(message);
		System.out.println("===============");
	 System.out.println(bot.getNickname() + " the word 'cat' is a forbidden, so you must be removed from the conversation!");
	 System.out.println("User with nickname " + user.getNickname() + " has been removed from the conversation!");
		System.out.println("===============");
	} 
	if(message.equals("addBot") && bot==null) {
		userFactory=new UserFactory();
		bot=userFactory.createUser("DefaultBot", "bot");
		System.out.println("===============");
		System.out.println("Bot with nickname " + bot.getNickname() + " created.");
		System.out.println("===============");
	}
		}
}
