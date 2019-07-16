public class Main {
    public static void main(String[] args){
        Farmer f1 = new Farmer("Fred", 75, 100, 75, 10, 1);
        f1.run();
        f1.harvest();
        f1.attack();

        Constable c1 = new Constable("Carrie",60,100, 60,
                20,5, "Mordor");
        c1.run();
        c1.decreaseHealth();
        c1.arrest();

        Warrior w1 = new Warrior("William", 75,100,100,
                50,10,100);
        w1.attack();
        w1.run();
        w1.increaseStamina();
    }
}
