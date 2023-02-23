public class Season {
    public static void main(String[] args)
    {
        int mon = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
    while(true) {
        if(mon>=3 && mon<=6) {
            if((mon==3 && day>=21) || (mon==6 && day<=20)) {
                System.out.println("Spring");
                break;
            }
            System.out.println("Spring2");
            break;
            
        }

        if(mon>=6 && mon<=9) {
            if((mon==6 && day>=21) || (mon==9 && day<=22)) {
                System.out.println("Summer"); 
                break; 
                }
            System.out.println("Summer"); 
            break;
        }

        if(mon>=9 && mon<=12) {
            if((mon==9 && day>=23) || (mon==12 && day<=21)) {
                System.out.println("Fall");
                break;
            }
            else if(mon==10 || mon==11) {
            System.out.println("Fall");
            break;
            }

        }

        if(mon>=12 || mon<=3) {
            if((mon==12 && day>=21) || (mon==3 && day<=20)) {
                System.out.println("Winter");
                break;
            }
            else {
            System.out.println("Winter");
            break;
            }
        }

    }
}

}