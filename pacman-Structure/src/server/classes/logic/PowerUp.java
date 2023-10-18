package logic;

public class PowerUp{

    private int id;
    private int value;
    private boolean itsFruit;
    private String sprite;

    public PowerUp(int identifier, int val, boolean frut, String spr){
        this.id = identifier;
        this.value = val;
        this.itsFruit = frut;
        this.sprite = spr;
    }

    public String getSprite(){
        return "";
    }

    public int getValue(){
        return 0;
    }

    public int getID(){ 
        return 0;
    }

    public boolean itsFruit(){  
        return false;
    }
}
