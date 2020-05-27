package factoryMediator;

public  class User {
protected String nickname;
protected ChatRoomMediator mediator;
	
	public User(String nickname) {
		this.nickname=nickname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public ChatRoomMediator getMediator() {
		return mediator;
	}

	public void setMediator(ChatRoomMediator mediator) {
		this.mediator = mediator;
	}
	
	
	public void addMessage(String message) {
		mediator.sendMessage(this, message);
	}
	
}

