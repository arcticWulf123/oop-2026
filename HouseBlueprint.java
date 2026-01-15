public class HouseBlueprint {
    String storey;
    String houseDesign;

    void printDetails() {
        System.out.printf("""
                %s %s
                """, storey, houseDesign);
    }
}