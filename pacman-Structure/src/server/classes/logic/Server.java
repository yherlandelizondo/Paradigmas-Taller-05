package logic;

public class Server {
    private int playerNumber;

    public Server(int playNum){
        this.playerNumber = playNum;
    }

    public void createGhost(String sprite, int id, int speed){
    }
    public void createPill(int id, int value, boolean itsFruit, String sprite){
    }
    public void createFruit(int id, int value, boolean itsFruit, String sprite){
    }
    public void nextLevel(){
    }
    public void modifySpeed(int id, int speed){
    }
    public void modifyScore(int id, int score){
    }
    
    public void sendData(){
    }
    public void updateData(int id, int score, int health){
    }
    public void modifyHealth(int id, int health){
    }
    
}