public class House extends Asset {
    private String address;
    private int condition;
    private int sqFootage;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int sqFootage, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.sqFootage = sqFootage;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSqFootage() {
        return sqFootage;
    }

    public void setSqFootage(int sqFootage) {
        this.sqFootage = sqFootage;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
    public double getValue() {
        double baseValue;
        switch (condition) {
            case 1: baseValue = 180.00 * sqFootage;
            break;
            case 2: baseValue = 130.00 * sqFootage;
            break;
            case 3: baseValue = 90.00 * sqFootage;
            break;
            case 4: baseValue = 80.00 * sqFootage;
            break;
            default: baseValue = 0.00;
        }
        return baseValue + (0.25 * lotSize);
    }



}
