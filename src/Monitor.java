public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution defaultResolution;

    public Monitor(String model, String manufacturer, int size, Resolution defaultResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.defaultResolution = defaultResolution;
    }

    public void drawPixelAt(int x, int y, String colour) {
        System.out.println("Draw pixel at " + x + ", " + y + " in colour " + colour);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getDefaultResolution() {
        return defaultResolution;
    }
}
