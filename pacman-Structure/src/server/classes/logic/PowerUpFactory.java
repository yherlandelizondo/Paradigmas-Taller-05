package logic;

public class PowerUpFactory implements AbstractFactory{

    public PowerUpFactory(){  
    }

    @Override
    public void createGhost(String sprite, int id, int speed){
        /*Don't create Ghost object*/
    }
    @Override  
    public void createPowerUp(int id, int value, boolean itsFruit, String sprite){   
    }
}
