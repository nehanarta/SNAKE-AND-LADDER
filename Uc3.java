package SnakeandLadder;

public class Uc3 {
     static int ladderMethod(int dicevalue){
         System.out.println("in the ladder method");
         int var=0;
         int var1=var+dicevalue;
         System.out.println(var1);
         return var1;
     }
     static int snakbiteMethod(int dicevalue) {
         System.out.println("in the snake method");
         int var = 0;
         int var2 = var - dicevalue;
         System.out.println(var2);
         return var2;
     }
    public static void main(String[]args){
         int value=0;
         int dicevalue=(int)(Math.random()*10%6+1);
         System.out.println(dicevalue);
        int choice=(int)(Math.random()*10%3);
        System.out.println(choice);
        switch(choice){
            case 0:
                System.out.println("no play");
                break;
            case 1:
                System.out.println("forward");
                ladderMethod(dicevalue);
                break;
            case 2:
                System.out.println("backward");
                snakbiteMethod(dicevalue);
                break;
        }

    }
}
