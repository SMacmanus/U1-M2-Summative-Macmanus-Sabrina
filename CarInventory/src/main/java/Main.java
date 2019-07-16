import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    int i = 1;
    public static void main(String[] args) {
        String[] make;
        String[] model;
        int[] year;
        String[] color;
        int[] miles;

        ArrayList<Car> inventory = new ArrayList<>();
        Scanner selection = new Scanner(System.in);
        int selectNum;
        do{
            commandLine();
            selectNum = selection.nextInt();
            switch(selectNum) {
                case (1):
                    addCar(inventory);
                    break;
                case (2):
                    removeCar(inventory);
                    break;
                case (3):
                    showAll(inventory);
                    break;
                case (4):
                    searchAll(inventory);
                    break;
                case (5):
                    System.out.println("System Exited");
                    break;
            }
        }while(selectNum == 1 || selectNum == 2 || selectNum == 3 || selectNum == 4);

    }

    public static void addCar(ArrayList<Car> inventory) {
        System.out.println("ENTER MAKE");
        Scanner addMake = new Scanner(System.in);
        String make = (addMake.nextLine());

        System.out.println("ENTER MODEL");
        Scanner addModel = new Scanner(System.in);
        String model = (addModel.nextLine());

        System.out.println("ENTER YEAR");
        Scanner addYear = new Scanner(System.in);
        int year = (addYear.nextInt());

        System.out.println("ENTER COLOR");
        Scanner addColor = new Scanner(System.in);
        String color = (addColor.nextLine());

        System.out.println("ENTER MILEAGE");
        Scanner addMiles = new Scanner(System.in);
        int miles = addMiles.nextInt();

        //add new car object of ArrayList type of Car Class passing in parameters for constructor
        inventory.add(new Car(make, model, year, color, miles));
        int location = 1;

        //display inventory so far
        for(Car list : inventory) {
            System.out.println("Item No. " + location
                    + "    Make: " + list.getMake()
                    + "   Model: " + list.getModel()
                    + "   Year: " + list.getYear()
                    + "   Color: " +  list.getColor()
                    + "   Miles: " + list.getMiles());
            location++;
        }
    }
    //user command line method
    public static void commandLine(){
        System.out.println("What would you like to do? Please enter the number of your choice.");
        System.out.println("[1]add a car, [2]delete a car, [3]show all cars, [4]search inventory, [5]exit");
    }
    //remove method
    public static void removeCar(ArrayList<Car> inventory) {
        System.out.println("Enter the location of the car you would like to remove.");
        Scanner remove = new Scanner(System.in);
        int removeIndex = (remove.nextInt() - 1);
        inventory.remove(removeIndex);
    }
    //show all method
    public static void showAll(ArrayList<Car> inventory) {
        //iterate through ArrayList from Car class named inventory and print out results
        int location = 1;
        for(Car list : inventory) {
            System.out.println("Item No. " + location
                    + "    Make: " + list.getMake()
                    + "   Model: " + list.getModel()
                    + "   Year: " + list.getYear()
                    + "   Color: " +  list.getColor()
                    + "   Miles: " + list.getMiles());
            location++;
        }
    }

    //search inventory method using streams
    public static void searchAll(ArrayList<Car> inventory) {
        System.out.println("What would you like to search by? Please enter the number of your selection.");
        System.out.println("[1]Make, [2]Model, [3]Year, [4]Color, [5]Mileage under certain amount");
        Scanner searchBy = new Scanner(System.in);
        int search = searchBy.nextInt();
        switch (search) {
            case(1):
                System.out.println("Enter Make");
                Scanner searchMake = new Scanner(System.in);
                String make = searchMake.nextLine();
                List<Car> resultsModel = inventory.stream()
                        .filter(value -> value.getMake().equals((make)))
                        .collect(Collectors.toList());
                resultsModel.forEach((r) -> r.printInfo());
                break;
            case(2):
                System.out.println("Enter Model");
                Scanner searchModel = new Scanner(System.in);
                String model = searchModel.nextLine();
                List<Car> resultsMake = inventory.stream()
                        .filter(value -> value.getModel().equals((model)))
                        .collect(Collectors.toList());
                resultsMake.forEach((r) -> r.printInfo());
                break;
            case(3):
                System.out.println("Enter Year");
                Scanner searchYear = new Scanner(System.in);
                int year = searchYear.nextInt();
                List<Car> resultsYear = inventory.stream()
                        .filter(value -> value.getYear()==((year)))
                        .collect(Collectors.toList());
                resultsYear.forEach((r) -> r.printInfo());
                break;
            case(4):
                System.out.println("Enter Color");
                Scanner searchColor = new Scanner(System.in);
                String color = searchColor.nextLine();
                List<Car> resultsColor = inventory.stream()
                        .filter(value -> value.getColor().equals((color)))
                        .collect(Collectors.toList());
                resultsColor.forEach((r) -> r.printInfo());
                break;
            case(5):
                System.out.println("Miles under ___");
                Scanner searchMiles = new Scanner(System.in);
                int mileage = searchMiles.nextInt();
                List<Car> resultMiles = inventory.stream()
                        .filter(value -> value.getMiles() < ((mileage)))
                        .collect(Collectors.toList());
                resultMiles.forEach((r) -> r.printInfo());
                break;

        }

    }
}


