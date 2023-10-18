package logic;

public class Ghost{

    private int id;
    private int speed;
    private String sprite;

    public Ghost(int identifier, int spd, String spr){
        this.id = identifier;
        this.speed = spd;
        this.sprite = spr;
    }

    public void setSpeed(int speed){
    }

    public int getSpeed(){
        return 0;
    }

    public int getID(){  
        return 0;
    }

    public String getSprite(){   
        return "";
    }

    public void movement(){    
    }
}
