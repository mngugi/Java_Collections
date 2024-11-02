package structures;

public class oneParam {
    private int count;

    // Constructor with one parameter
    public oneParam(int count) {
        this.count = count;
    }

    // Default constructor that calls the parameterized constructor
    public oneParam() {
        this(0); // Calls the constructor with count initialized to 0
    }

    public int getCount() {
        return count;
    }
}

