package logic;

public class Player{

private int id;
private EventManager eventManager;
private int xCoord;
private int yCoord;
private int score;
private int health;

public Player(int identifier, EventManager manager, int x, int y, int scr, int hp){
    this.id = identifier;
    this.eventManager = manager;
    this.xCoord = x;
    this.yCoord = y;
    this.score = scr;
    this.health = hp;
}

public void updateServerData(int id, int score, int health){
}

public void sendData(){
}

private int getMatch(){
return 0;
}

private void createObserver(int id){
}

public String getUserType(){
return "";
}

public int getID(){
return 0;
}

private void createPlayer(int id){

}

private void dataRequest(){

}

private void updateInterface(){

}

private void xMovement(int xCoord){

}

private void yMovement(int yCoord){

}

private void fruitEaten(){

}

private void ghostEaten(){

}

private void pillEaten(){

}
}
