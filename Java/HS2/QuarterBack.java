public class QuarterBack {
    public static void main(String[] args) {

        int A = Integer.parseInt(args[0]);
        int B = Integer.parseInt(args[1]);
        int C = Integer.parseInt(args[2]);
        int D = Integer.parseInt(args[3]);
        int E = Integer.parseInt(args[4]);

      
    System.out.println("Completion Ratio: " + CompletionRatio(A,B));
    System.out.println("Yards per Pass: " + YardsPerPass(C,B));
    System.out.println("Touch Down Ratio: " + TouchDownRatio(D,B));
    System.out.println("Interception Ratio: " + InterceptionRatio(E,B));

}

     static double CompletionRatio(int A,int B) {
            return 250/3*((A/B)-0.3);
    }

    static double YardsPerPass(int C,int B) {
            return 25/6*((C/B)-3);
    }
    static double TouchDownRatio(int D,int B) {
            return 1000/3*(D/B);
    }

    static double InterceptionRatio(int E,int B) {
            return 1250/3*(0.095-(E/B));
    }

}