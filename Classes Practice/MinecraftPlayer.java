public class MinecraftPlayer {
    
    String username;
    String AccountUser;
    String skin;
    boolean right_handed;
    int health = 20;
    int total_dirt;

    MinecraftPlayer(){
        username = "Minecraft Player";
        skin = "steve";
        right_handed = true;
    }

    MinecraftPlayer(String user, String skin_name, boolean r_handed){
        username = user;
        skin = skin_name;

        right_handed = r_handed;
    }

    void dig_dirt(){
        total_dirt++;
        System.out.println(username + " has digged " + total_dirt + " dirt");
    }

    void get_health(){
        System.out.println(username + " has " + health);
    }
}
