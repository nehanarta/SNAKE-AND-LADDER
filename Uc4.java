package SnakeandLadder;

public class Uc4 {
    static final int WIN_POSITION = 100;
    static int temp = 0;
    static int ladderMethod(int dicevalue){
        temp=temp + dicevalue;
        System.out.println(temp);
        return temp;
    }
    static int snakeMethod(int dicevalue) {
        temp = temp - dicevalue;
        System.out.println(temp);
        if (temp < 0) ;
        {
            temp = 0;
        }
        System.out.println(temp);
        return temp;
    }

public static void main(String[] args){
        int value=0;
        int dicevalue=(int)(Math.random()*10%6+1);
        System.out.println(dicevalue);
        int choice=(int)(Math.random()*10%3);
        System.out.println(choice);
        int res=0;
        while(res<WIN_POSITION)
            switch(choice){
            case 0:
                System.out.println("no play");
                break;
            case 1:
                System.out.println("forward");
               res= ladderMethod(dicevalue);
                break;
            case 2:
                System.out.println("backward");
                res=snakeMethod(dicevalue);
                break;
        }

    }
}





