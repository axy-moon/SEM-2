import java.util.*;

class Billing {
    double computeBill(double price) {
        return price*0.08+price;
    }

    double computeBill(double price,double qty) {
        return qty*price+(price*0.08);
    }

    double computeBill(double price,double qty,double cpn) {
        return (price*qty)-cpn+(price*0.08);
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double price = 56;
            double qty = 4;
            double cpn = 50;

            Billing x = new Billing();
            double val = x.computeBill(price,qty);
            double val2 = x.computeBill(price,qty,cpn);
            double val3 = x.computeBill(price);

            System.out.println("Only Price: "+ val3);
            System.out.println("Price and Qty: "+ val);
            System.out.println("Price Qty cpn: "+ val2);

    }

}