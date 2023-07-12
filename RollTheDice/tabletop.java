import java.util.Scanner;

public class tabletop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        dice d1 = new dice();
        System.out.println(d1.toString());
        System.out.println("cmd list : help, f, b, l ,r , cw , ccw, end");
        boolean loop = true;
        while(loop){
            String c = scan.nextLine();
            switch(c){
                case "help" :
                    String str = "help ; show this command list"+
                               "\nf   ; roll the dice forward" +
                               "\nb   ; roll the dice backward" +
                               "\nl   ; roll the dice to the left (top pivot)" +
                               "\nr   ; roll the dice to the right (top pivot)" +
                               "\ncw  ; roll the dice clock-wise (front pivot)" +
                               "\nccw ; roll the dice counter-clock-wise (front pivot)" +
                               "\nend || any other strings ; end the program" 
                                ;
                    System.out.println(str);
                break;
                case "f" :
                    d1.forward();
                    System.out.println(d1.toString());
                break;
                case "b" :
                    d1.backward();
                    System.out.println(d1.toString());
                break;
                case "l" :
                    d1.left();
                    System.out.println(d1.toString());
                break;
                case "r" :
                    d1.right();
                    System.out.println(d1.toString());
                break;
                case "cw" :
                    d1.cw();
                    System.out.println(d1.toString());
                break;
                case "ccw" :
                    d1.ccw();
                    System.out.println(d1.toString());
                break;
                case "end" :
                default :
                    loop = false;
                break;
            }
        }
        /// end
        scan.close();
        System.out.println("program ends ---");
    }
}
