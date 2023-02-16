public class WindSpeed {
    public static void main(String[] args)
    {
        int wind = Integer.parseInt(args[0]);

            if(wind>155)
                System.out.println("Category 5 Hurricane");
            else if(wind>=131)
                System.out.println("Category 4 Hurricane");
            else if(wind>=111)
                System.out.println("Category 3 Hurricane");
            else if(wind>=96)
                System.out.println("Category 2 Hurricane");
            else if(wind>=74)
                System.out.println("Category 1 Hurricane");
            else
                System.out.println("Not a Hurricane");
    }
}