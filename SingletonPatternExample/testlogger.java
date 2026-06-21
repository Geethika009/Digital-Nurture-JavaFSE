class TestLogger {
    public static void main(String[] args) {

        Logger obj1 = Logger.getInstance();
        Logger obj2 = Logger.getInstance();

        if (obj1 == obj2) {
            System.out.println("Same object created");
        } else {
            System.out.println("Different objects created");
        }
    }
}