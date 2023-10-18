package logic;

public class GhostFactory implements AbstractFactory {

    public GhostFactory(){
        
    }
    @Override
    public void createGhost(String sprite, int id, int speed){
    }
    @Override  
    public void createPowerUp(int id, int value, boolean itsFruit, String sprite){
        /*Don't create powerUp object*/
    }

}
