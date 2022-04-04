public class Main {
    public static void main(String[] args) {
        PC myPC = new PC(new Case("2208", "Dell", "240", new Dimensions(20, 20, 5)),
                new Motherboard("BJ-200", "Asus", 4, 6, "v2.44"),
                new Monitor("27 inch", "Acer", 27, new Resolution(2540, 1440)));

        myPC.powerUp();
        System.out.println(myPC.getMonitor().getManufacturer());
        myPC.getMotherboard().loadProgram("Some default program");
        System.out.println(myPC.getTheCase().getDimensions().getDepth() + ", " + myPC.getTheCase().getDimensions().getHeight() + ", " + myPC.getTheCase().getDimensions().getWidth());

    }

}
