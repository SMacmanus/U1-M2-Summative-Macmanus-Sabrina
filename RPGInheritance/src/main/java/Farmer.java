public class Farmer extends Character {

    private String name;
    public String getName(){ return this.name; }
    public void setName(String name){this.name = name;}
    private int strength;
    public int getStrength(){return this.strength;}
    public void setStrength(int strength){this.strength = strength;}
    private int health;
    public int getHealth(){return this.health;}
    public void setHealth(int health){this.health = health;}
    private int stamina;
    public int getStamina(){return this.stamina;}
    public void setStamina(int stamina){this.stamina = stamina;}
    private int speed;
    public int getSpeed(){return this.speed;}
    public void setSpeed(int speed){this.speed = speed;}
    private int attackPower;
    public int getAttack(){return this.attackPower;}
    public void setAttack(int attack){this.attackPower = attackPower;}

    public void run(){
        stamina = stamina - 4;
        System.out.println(name + " Stamina now " + stamina);
    }
    public void attack(){
        attackPower = attackPower -1;
        System.out.println(name + " Attack power now " + attackPower);
    }
    public void heal(){
        health = health +10;
        System.out.println(name + "Health level now " + health);
    }
    public void decreaseHealth(){
        health = health -7;
        System.out.println(name + " Health level now " + health);
    }
    public void increaseStamina(){
        stamina = stamina +4;
        System.out.println(name + " Stamina now " + stamina);
    }
    public void decreaseStamina(){
        stamina = stamina -3;
        System.out.println(name + " Stamina now " + stamina);
    }
    public void plow(){
        stamina = stamina -6;
        speed = speed -1;
        System.out.println(name + " Stamina now " + stamina + ", & Speed now " + speed);
    }
    public void harvest(){
        stamina = stamina -10;
        health = health + 5;
        System.out.println(name + " Stamina now " + stamina + ", & Health now " + health);
    }

    public Farmer(String name, int strength, int health, int stamina, int speed, int attack){
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attack;
    }
}

