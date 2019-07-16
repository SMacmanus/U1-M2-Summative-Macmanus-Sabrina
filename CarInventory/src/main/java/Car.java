
    public class Car {

        private String  make;
        private String model;
        private int year;
        private String color;
        private int miles;

        //default constructor
        public Car(){}
        //primary constructor
        public Car(String make, String model, int year, String color, int miles){
            this.make = make;
            this.model = model;
            this.year = year;
            this.color = color;
            this.miles = miles;
        }
        //getters
        public String getMake(){ return this.make; }
        public String getModel(){ return this.model;}
        public int getYear() { return this.year;}
        public String getColor() {return this.color;}
        public int getMiles() {return this.miles;}
        //setters
        public void setMake(String make){ this.make = make; }
        public void setModel(String model) {this.model = model;}
        public void setYear(int year) {this.year = year;}
        public void setColor(String color) {this.color = color;}
        public void setMiles(int miles) {this.miles = miles;}

        public void printInfo(){
            System.out.println("Make: " + this.make
                    + "  Model: " + this.model
                    + "  Year: " + this.year
                    + "  Color: " + this.color
                    + "  Miles: " + this.miles);
        }

    }

