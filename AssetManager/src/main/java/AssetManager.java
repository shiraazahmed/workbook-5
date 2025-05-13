import java.util.ArrayList;

public class AssetManager {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("Primary House", "2020-01-01", 300000, "123 Main St", 1, 2000, 5000));
        assets.add(new House("Vacation Home", "2018-06-15", 500000, "456 Beach Rd", 2, 1500, 3000));
        assets.add(new Vehicle("Family Car", "2021-03-10", 25000, "Toyota", "Camry", 50000, 2021));
        assets.add(new Vehicle("Old Truck", "2010-05-20", 15000, "Ford", "F-150", 120000, 2010));

        for (Asset asset : assets) {
            System.out.println(asset.getDescription() + " value: $" + asset.getValue());
        }
    }
}



