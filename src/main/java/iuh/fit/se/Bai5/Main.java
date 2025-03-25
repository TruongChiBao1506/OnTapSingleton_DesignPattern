package iuh.fit.se.Bai5;

public class Main {
    public static void main(String[] args) {
        System.out.println("🚗 Sản xuất xe thể thao:");
        VehicleProduction.productVehicle(new SportsCarFactory());

        System.out.println("\n🚙 Sản xuất xe gia đình:");
        VehicleProduction.productVehicle(new FamilyCarFactory());

        System.out.println("\n🔋 Sản xuất xe điện:");
        VehicleProduction.productVehicle(new ElectricCarFactory());
    }
}
