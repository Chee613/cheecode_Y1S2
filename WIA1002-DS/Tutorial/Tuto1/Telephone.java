public class Telephone {
    // Instance variables
    private String areaCode;
    private String number;
    
    // Static variable to keep track of created objects
    private static int numberOfTelephoneObject = 0;

    // Constructor to initialize instance variables
    public Telephone(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
        numberOfTelephoneObject++;
    }

    // Accessor (getter) and mutator (setter) methods
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    // Method to concatenate areaCode and number with a dash
    public String makeFullNumber() {
        return areaCode + "-" + number;
    }
    
    public static int getNumberOfTelephoneObject() {
        return numberOfTelephoneObject;
    }
}
