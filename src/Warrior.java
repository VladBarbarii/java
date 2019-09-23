public class Warrior {
    protected String name = "Warrier";
    public int health = 0;
    public int attKMax = 0;
    public int blockMax = 0;

    public Teleports teleportType;

    public Warrior(){

    }

    public Warrior(String name, int health, int attKMax, int blockMax) {
        this.setName(name);
        this.health = health;
        this.attKMax = attKMax;
        this.blockMax = blockMax;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int attack(){
        return 1+(int)(Math.random()*((attKMax-1)+1));
    }

    public int block(){
        return 1+(int)(Math.random()*((blockMax-1)+1));
    }

    public String teleport(){
        return teleportType.teleport();
    }

    public void setTeleportAbility(Teleports newTeleportType){
        teleportType = newTeleportType;
    }












}
