public class dice {
    private static int top = 1, front = 2, left = 3, right = 4, back = 5, bottom = 6;
    dice(){
    }
    public void forward(){//
        int temp = top;
        top = back;
        back = bottom;
        bottom = front;
        front = temp;
    } 
    public void backward(){//
        int temp = top;
        top = front;
        front = bottom;
        bottom = back;
        back = temp;
    } 
    public void left(){
        int temp = top;
        top = left;
        left = bottom;
        bottom = right;
        right = temp;
    } 
    public void right(){
        int temp = top;
        top = right;
        right = bottom;
        bottom = left;
        left = temp;
    } 
    public void cw(){//
        int temp = front;
        front = right;
        right = back;
        back = left;
        left = temp;
    } 
    public void ccw(){//
        int temp = front;
        front = left;
        left = back;
        back = right;
        right = temp;
    } 
    /// to string
    public String toString(){
        String str = "\n             ______________" +
                     "\n            /             /|" +
                     "\n           /             / |back = " + back +
                     "\n          /___top = " + top + "__ /  |" +
                     "\n         |             |   |" +
                     "\n         |             | right = " + right +
                     "\nleft = " + left + " |  front = " + front + "  |  /" +
                     "\n         |             | /" +
                     "\n         |_____________|/" +
                     "\n            bottom = " + bottom
        ;
        
        return str;
    }
}
