public class Bicycle extends Vehicle {
    // The Bicycle class has an additional instance variable: numGears
    int numGears;

    // Add a constructor that takes two parameters (just maxSpeed and numGears),
    // the number of wheels is obvious for a bike
    public Bicycle(int maxSpeed, int numGears){
        super(maxSpeed, 2);
        this.numGears = numGears;
    }

    // Add a constructor that takes one parameter (just speed)
    // the number of wheels is obvious for a bike
    // because numGears is not supplied, the bike probably has just a single gear
    public Bicycle(int maxSpeed){
        super(maxSpeed, 2);
        this.numGears = 1;
    }

    // Add a default constructor (no parameters)
    public Bicycle(){
        super(20, 2);
        this.numGears = 1;
    }

    // Add a getter and setter for numGears

    public int getNumGears() {
        return numGears;
    }

    public void setNumGears(int numGears) {
        this.numGears = numGears;
    }
    // No other code needed
}
