public class LaptopClass {
    public static void main(String[] args) {
        Laptop jadeLaptop = new Laptop();
        jadeLaptop.brand = "Dell";
        jadeLaptop.storage = 256;
        jadeLaptop.memory = 8;
        jadeLaptop.screen = 13.3;
        jadeLaptop.model = "Latitude 7390";
        jadeLaptop.condition = "Old";
        jadeLaptop.price = 35000;

        Laptop otherLaptop = new Laptop();
        otherLaptop.brand = "Apple";
        otherLaptop.storage = 512;
        otherLaptop.memory = 16;
        otherLaptop.screen = 15;
        otherLaptop.model = "Pro M2";
        otherLaptop.condition = "New";
        otherLaptop.price = 59000;

        jadeLaptop.printDetails();
        otherLaptop.printDetails();
    }
}
