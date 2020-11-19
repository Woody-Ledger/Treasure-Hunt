
package treasure.hunt;

import java.util.Scanner;
import java.util.Random;

public class TreasureHunt {


    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int c = 0;
        int chest = 0;
        int cointotal = 0;
        Scanner input = new Scanner (System.in);
        Random random = new Random();
        int[]tx = new int [3];
        int[]ty = new int [3];
        int size = random.nextInt(90) + 10;
        for(int i = 0; i < 3 ; i++){
            tx[i] = random.nextInt(size);
            ty[i] = random.nextInt(size);
        }
        System.out.println("The size of the grid is " + size);
//        for(int i = 0; i < 3 ; i++){
//        System.out.print(tx[i] + " " + ty[i]);
//        System.out.println();
//        }
        for(c = c ; c < 3 ; c = c){
        System.out.println("Input where you think the treasure is? (x then y)");
        x = input.nextInt();
                y = input.nextInt();
        for(int i = 0; i < 3 ; i++){
                if(x == tx[i]){
                    if(y == ty[i]){
                        c = c + 1;
                        System.out.print("You found some treasure, you got ");
                        chest = random.nextInt(50) + 1;
                        System.out.println(chest + " coins");
                        cointotal = cointotal + chest;
                    } else {
                        System.out.println("You didn't find treasure " + (i + 1) + ".  Try again");
                    }
                } else {
                    System.out.println("You didn't find treasure " + (i + 1) + ".  Try again");
                }
    }
    
}
        System.out.println();
        System.out.println("You found " + cointotal + " coins");
}
}