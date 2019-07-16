public class Warrior extends Character{
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

    public int shieldStrength;
    public int getShieldStrength(){return this.shieldStrength;}
    public void setShieldStrength(int shieldStrength){this.shieldStrength = shieldStrength;}

    public void run(){
        stamina = stamina - 15;
        System.out.println(name + " Stamina now " + stamina);
    }
    public void attack(){
        attackPower = attackPower -4;
        decreaseShieldStrength();
        System.out.println(name + " Attack power now " + attackPower + " & Shield strength now " + shieldStrength);
    }
    public void heal(){
        health = health +8;
        System.out.println(name + " Health level now " + health);
    }
    public void decreaseHealth(){
        health = health -12;
        System.out.println(name + " Health level now " + health);
    }
    public void increaseStamina(){
        stamina = stamina +3;
        System.out.println(name + " Stamina now " + stamina);
    }
    public void decreaseStamina(){
        stamina = stamina -10;
        System.out.println(name + " Stamina now " + stamina);
    }
    public void decreaseShieldStrength(){
        shieldStrength = shieldStrength -6;
    }

    public Warrior(String name, int strength, int health, int stamina, int speed, int attack, int shieldStrength){
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attack;
        this.shieldStrength = shieldStrength;
    }
}
