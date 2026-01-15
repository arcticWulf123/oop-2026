public class Houses {
    public static void main(String[] args) {
        HouseBlueprint house1 = new HouseBlueprint();
        house1.storey = "2-Storey";
        house1.houseDesign = "Modern";

        HouseBlueprint house2 = new HouseBlueprint();
        house2.storey = "Bungalow";
        house2.houseDesign = "Farmhouse";

        house1.printDetails();
        house2.printDetails();

    }

}
