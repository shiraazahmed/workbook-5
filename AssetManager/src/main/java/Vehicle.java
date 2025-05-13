public class Vehicle extends Asset {
    private String make;
    private String model;
    private int odometer;
    private int year;

    public Vehicle(String description, String dateAcquired, double originalCost, String make, String model, int odometer, int year) {
        super(description, dateAcquired, originalCost);
        this.make = make;
        this.model = model;
        this.odometer = odometer;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getValue() {
        int age = 2023 - year;
        double baseValue = getOriginalCost();
        if (age < 3) {
            baseValue = baseValue * 0.03;
        } else if (age < 6) {
            baseValue = baseValue * 0.06;
        } else if (age < 10) {
            baseValue = baseValue * 0.08;
        } else {
            baseValue = 1000.00;
        }

        if (odometer > 100000 && !(model.contains("Honda") || model.contains("Toyota"))) {
            baseValue *= 0.75;
        }

        return baseValue;
    }
}



