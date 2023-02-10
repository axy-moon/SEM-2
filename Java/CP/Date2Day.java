import java.util.Scanner;

public class Date2Day {

int months(int month)
{
    switch(month) {
    case 1:
    return 1;

    case 2:
    return 4;

    case 3:
    return 4;

    case 4:
    return 0;

    case 5:
    return 2;

    case 6:
    return 5;

    case 7:
    return 0;

    case 8:
    return 3;

    case 9:
    return 6;

    case 10:
    return 1;

    case 11:
    return 4;

    case 12:
    return 6;

    default :
    System.out.println("Invalid month");
    return -1;
}

}
int years(int year)
{
    if(year>=1600 && year<= 1699)
    return 6;
    
    if(year>=1700 && year<= 1799)
    return 4;
    
    if(year>=1800 &&year<=1899)
    return 2;
    
    if(year>=1900 &&year<= 1999)
    return 0;
    
    if(year>=2000 &&year<=2999)
    return 6;

    else {
    System.out.println("Invalid year code");
    return -1; }

}

int mon(int year)
{
    return year%100;
}
int divy(int yy)
{
    return yy/4;
}

void calcDay(int result)
{

    switch(result){
    case 1 : System.out.println("Sunday");break;
    case 2 : System.out.println("Monday");break;
    case 3 : System.out.println("Tuesday");break;
    case 4 : System.out.println("Wednesday");break;
    case 5 : System.out.println("Thursday");break;
    case 6 : System.out.println("Friday");break;
    case 0 : System.out.println("Saturday");break;

}
}

public static void main(String[] args)

{ 
    int date,month,year;
    int mc,yc,yy,ryy,sum,result;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the date(mm/dd/yyyy): ");

    month=sc.nextInt();
    date=sc.nextInt();
    year=sc.nextInt();
    Date2Day day=new Date2Day();
    mc=day.months(month);

    yc=day.years(year);

    yy=day.mon(year);

    ryy=day.divy(yy);

    sum=date+mc+yc+yy+ryy;
    result=sum%7;

    day.calcDay(result);
}

}
