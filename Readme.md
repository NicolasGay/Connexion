# Projet "Connexion"
Ceci est un projet réalisé dans le cadre de la formation SopraSteria chez Aelion


## Class ChatRoom
Ceci est un exemple de classe que l'on retrouve dans le projet

```java

public class ChatRoom {
	
	private  String name;
	private   User user;
	public static List<Message> messages = new ArrayList<>();

	
	public String getRoomName() {
		return name;
	}

	public User getUser() {
		return user;
	}
	public static List<Message> getMessages() {
		return messages;
	}

}

```