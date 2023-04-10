import java.util.*;

class Bill {
    public int ref_no;
    Scanner sc = new Scanner(System.in);
    public void input() {
        System.out.println("Please enter reference number\t");
        this.ref_no = sc.nextInt();
    }

    public void display() {
        System.out.println("Referece Number\t"+this.ref_no);
    }
}


class Electricity extends Bill{
    int unit;
    double per_unit_price;
    int tax;

    Scanner sc = new Scanner(System.in);

    public int total_amount() {
        return (int)this.per_unit_price*this.unit-this.tax;
    }

    public void input() {
        System.out.println("Please enter reference number\t");
        this.ref_no = sc.nextInt();

        System.out.println("Please enter units consumed\t");
        this.unit = sc.nextInt();

        System.out.println("Please enter per unit price\t");
        this.per_unit_price = sc.nextDouble();

        System.out.println("Please enter tax amount\t");
        this.tax = sc.nextInt();   
    }
}


public class CalculateBill {
    public static void main(String args[]) {
        Bill eb1 = new Electricity();
        eb1.input();

        //int amt = eb1.total_amount();
        eb1.display();

        //System.out.println("Amount to be paid\t"+amt);
        
    }
}

