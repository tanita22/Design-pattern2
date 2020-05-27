package factoryMediator;

public interface  ChatRoomMediator {


	public abstract void sendMessage(User user,String message);
	public static void addUser(User user) {
	
		
	}
    void removeUser(User user);

}
