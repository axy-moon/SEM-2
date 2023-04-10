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
    double amt;

    Scanner sc = new Scanner(System.in);

    public double total_amount() {
        amt = this.per_unit_price*this.unit-this.tax;
        return amt;
    }

    public void input() {
        System.out.print("Please enter reference number\t");
        this.ref_no = sc.nextInt();

        System.out.print("Please enter units consumed\t");
        this.unit = sc.nextInt();

        System.out.print("Please enter per unit price\t");
        this.per_unit_price = sc.nextDouble();

        System.out.print("Please enter tax amount\t");
        this.tax = sc.nextInt();   

        total_amount();
    }

    public void display() {
        System.out.println("Reference number\t"+this.ref_no+"\nUnits\t"+this.unit+"\nTax\t"+this.tax+"\nPer unit price\t"+this.per_unit_price+"\nAmount to be Paid\t"+amt);
    }
}


public class CalculateBill {
    public static void main(String args[]) {
        Bill eb1 = new Electricity();
        eb1.input();
        eb1.display();

        
    }
}

