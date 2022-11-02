import java.text.DecimalFormat;

public class Produce {

    public final double TAX_RATE = 0.0625;
    private String farmName;
    private String type;
    private int amount;


    /**
     * Default Constructor
     */
    public Produce(){
        this.farmName = "";
        this.type = "";
        this.amount = 0;
    }

    /**
     * Overloaded constructor
     * @param name Farm name input by user
     * @param productType Type of product indicated by user
     */
    public Produce(String name, String productType){
        this.farmName = name;
        this.type = productType;
        this.amount = 0; //in pounds
    }

    /**
     * Overloaded constructor
     * @param name Farm name input by user
     * @param productType Type of product indicated by user
     * @param initialAmount Initial amount of product indicated by user
     */
    public Produce(String name, String productType, int initialAmount){
        this.farmName = name;
        this.type = productType;
        this.amount = initialAmount;
    }

    /**
     * setAmount(int) sets object amount to passed in integer
     * 
     * @param initialAmount initializes object's amount to user specified value
     */
    public void setAmount(int initialAmount){
        this.amount = initialAmount;
    }

    /**
     * getAmount() returns amount in object as integer
     * 
     * @return object's amount
     */
    public int getAmount(){
        return this.amount;
    }

    /**
     * validateType(String) checks passed String. If it matches, return true, else, return false
     * 
     * @param productType user input String to validate
     * @return boolean value indicating valid input or not
     */
    public static boolean validateType(String productType){
        switch (productType.toUpperCase()){
            case "CORN": case "SOYBEAN": case "PEACHES": case "APPLES": case "WHEAT":
                return true;
            default:
                return false;
        }
    }

    /**
     * private method calculateRate() calculates value based on object's amount and type, returns double
     * 
     * @return value of payout based on amount
     */
    private double calculateRate(){
        switch (this.type.toUpperCase()){
            case "CORN": case "SOYBEAN":
                return ((this.amount / 56 ) + ((TAX_RATE * 100) * this.amount));
            case "PEACHES": case "APPLES":
                return ((this.amount * 4.80 ) + ((TAX_RATE * 100) * this.amount));
            default:
                return 0;
        }
    }

    /**
     * Overloaded toString() method
     * 
     * @return formatted string
     */
    public String toString(){
        DecimalFormat df = new DecimalFormat("'$'0.00");
        return (this.farmName + " has " + this.amount + "lbs of " + this.type.toUpperCase() + ", which can be sold for " + df.format(calculateRate()));
    }
}