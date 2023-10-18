package logic;

public interface AbstractFactory{
    public void createGhost(String sprite, int id, int speed);
    public void createPowerUp(int id, int value, boolean itsFruit, String sprite);
}
