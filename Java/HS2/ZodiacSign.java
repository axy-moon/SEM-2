public class ZodiacSign {
    public static void main(String[] args)
    {
        int mon = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
    while(true) {

        if(mon>=1 || mon<=2) {
            if((mon==1 && day>=20) || (mon==2 && day<=17)) {
                System.out.println("Aquarius");
                break;
            }
        }

        if(mon>=2 || mon<=3) {
            if((mon==2 && day>=28) || (mon==3 && day<=19)) {
                System.out.println("Pisces"); 
                break; 
                }
        }

        if(mon>=3 || mon<=4) {
            if((mon==3 && day>=31) || (mon==4 && day<=19)) {
                System.out.println("Aries");
                break;
            }

        }

        if(mon>=4 || mon<=5) {
            if((mon==4 && day>=30) || (mon==5 && day<=20)) {
                System.out.println("Taurus");
                break;
            }
        }

        if(mon>=5 || mon<=6) {
            if((mon==5 && day>=30) || (mon==6 && day<=20)) {
                System.out.println("Gemini");
                break;
            }
        }

        if(mon>=6 || mon<=7) {
            if((mon==6 && day>=21) || (mon==7 && day<=22)) {
                System.out.println("Cancer");
                break;
            }
        }

            
        if(mon>=7 || mon<=8) {
            if((mon==7 && day>=21) || (mon==8 && day<=22)) {
                System.out.println("Leo");
                break;
            }
     }
        if(mon>=8 || mon<=9) {
            if((mon==8 && day>=23) || (mon==9 && day<=22)) {
                System.out.println("Virgo");
                break;
            }
     }

        if(mon>=9 || mon<=10) {
            if((mon==9 && day>=23) || (mon==9 && day<=22)) {
                System.out.println("Libra");
                break;
            }
        }

        if(mon>=10 || mon<=11) {
            if((mon==10 && day>=23) || (mon==11 && day<=21)) {
                System.out.println("Scorpio");
                break;
            }
        }

        if(mon>=11 || mon<=12) {
            if((mon==11 && day>=22) || (mon==12 && day<=21)) {
                System.out.println("Sagittarus");
                break;
            }
        }

        if(mon>=12 || mon<=1) {
            if((mon==12 && day>=22) || (mon==1 && day<=19)) {
                System.out.println("Capricorn");
                break;
            }
        }
    }
 }
}