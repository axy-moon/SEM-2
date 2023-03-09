class Shirts {

    String material = "Cotton";

    public Shirts(int collar,int sleeve) {
        System.out.println("Collar Size: " + collar);
        System.out.println("Sleeve Length: " + sleeve);
        System.out.println("Material: " + material + "\n");

    }

}

public class TestShirt {
    public static void main(String[] args) {
        System.out.println("Shirt 1");
        Shirts lp = new Shirts(25,10);

        System.out.println("Shirt 2");
        Shirts as = new Shirts(19,23);

        System.out.println("Shirt 3");
        Shirts gc = new Shirts(29,11);
    }
}