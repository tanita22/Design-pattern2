package factoryMediator;

public class Main {
	
	public static void main(String[] args) {
    MessagesChatRoom messagesChatRoom=new MessagesChatRoom();
    
    
	UserFactory factory=new UserFactory();
	
	User user1=factory.createUser("Tanya" ,"user");
	User user2=factory.createUser("Ivan" ,"user");
	User user3=factory.createUser("Denitsa", "user");
	 
   messagesChatRoom.addUser(user1);
   messagesChatRoom.addUser(user2);
   messagesChatRoom.addUser(user3);
  
   user1.addMessage("Hello,everyone.");
   user2.addMessage("Hiiii");
   user3.addMessage("Good morning");
   user1.addMessage("What is your favourite animal?");
   user2.addMessage("addBot");
   user3.addMessage("dog");
   user2.addMessage("cat");
   user1.addMessage("Woww");
	
	}

}
