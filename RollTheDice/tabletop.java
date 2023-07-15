import java.util.Scanner;

public class tabletop {
    public static void main(String[] args) {
        //
        System.out.println("program Starts ---");
        //
        /// create scanner
        Scanner scan = new Scanner(System.in);
        /// create dice
        dice d1 = new dice();
        /// show the dice before input
        System.out.print("before the rotation ; ");
        System.out.println(d1.toString());
        /// instructions
        System.out.println("put a squence of rotation ex.(fblrb)");
        String str =   "f   ; roll the dice forward" +
                     "\nb   ; roll the dice backward" +
                     "\nl   ; roll the dice to the left (top pivot)" +
                     "\nr   ; roll the dice to the right (top pivot)" +
                     "\nc   ; roll the dice clock-wise (front pivot)" +
                     "\nd   ; roll the dice counter-clock-wise (front pivot)"
                     ;
        System.out.println(str);
        // recieve input
        System.out.print(":> ");
        str = scan.nextLine().toLowerCase();
        /// check each string char
        int falseCount = 0;
        for (int i = 0; i < str.length(); i++) {
            String c = String.valueOf(str.charAt(i));
            switch(c){
                case "f" :
                    d1.forward();
                break;
                case "b" :
                    d1.backward();
                break;
                case "l" :
                    d1.left();
                break;
                case "r" :
                    d1.right();
                break;
                case "c" :
                    d1.cw();
                break;
                case "d" :
                    d1.ccw();
                break;
                default :
                    falseCount++;
                break;
            }
        }
        /// print output
        System.out.print("after the rotation ; ");
        System.out.println(d1.toString());
        if(falseCount != 0){
            System.out.println("!!! Attention !!! : " + falseCount + " false char(s) captured\nplease check your sequence of input\nthe output was proceeded normally avoiding the invalid command char\n!!! Attention !!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        /// end
        scan.close();
        System.out.println("program ends ---");
    }
}
