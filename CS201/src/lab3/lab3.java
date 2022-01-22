package lab3;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class lab3 {
    public static void main(String[] args) {
        try {
            FileWriter myLog = new FileWriter("log_file.txt"); //log file
            //#1. declare a 2d array of ShoppingCart objects,
            // there are 6 checkout lines, each line has at most 10 shoppers
            ShoppingCart[][] scs = new ShoppingCart[6][10];
            Random rand = new Random();
            //#2. loop to play the game
            int turns = 0;
            boolean stop = false;
            int[] dq_shoppers = new int[6];
            do {
                turns++;
                int enqueue_shppers = 0;
                int dequeue_shoppers = 0;
                //#3. Instantiate a random number of shoppers (between 0 and 6)
                int shopperNums = rand.nextInt(7);
                for (int i = 0; i < shopperNums; i++) {
                    ShoppingCart shoper = new ShoppingCart();
                    if(enqueueShopper(scs, shoper)) {
                        enqueue_shppers++;
                    }
                }

                //#4. Randomly decide whether to de-queue 1 shopper from each line
                boolean dequeue_flag = rand.nextBoolean();
                if (dequeue_flag) {
                    for (int i = 0; i < scs.length; i++) {
                        if(dequeueShopper(scs[i])){
                            dequeue_shoppers++;
                            dq_shoppers[i] += 1;
                        }
                    }
                }

                myLog.write("Turn#" + turns + ":\n\tenqueue " + enqueue_shppers + " shoppers\n\t" +
                        "dequeue " + dequeue_shoppers + " shoppers\n");

                System.out.println("current turn: " + turns);
                if (turns >= 10) {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Do you want to continue? Y/N");
                    String input = reader.readLine();
                    if(input.equals("Y") || input.equals("y")){
                        stop = true;
                    }
                    else {
                        stop = false;
                    }
                }
            } while (turns < 10 || (turns >= 10 && stop == true));

            myLog.write("Final state of each queue:\n");
            for (int i = 0; i < scs.length; i++){
                myLog.write("Queue#" + i + ": the number of shoppers dequeued is " + dq_shoppers[i] +
                        ", the number of shoppers remainning is " + getShopperNums(scs[i]) + "\n");
            }
            myLog.close();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static boolean enqueueShopper(ShoppingCart[][] shoppingCarts, ShoppingCart shopper) {
        int line = getInsertedLineNumber(shoppingCarts);
        int pos = -1;
        for (int i = 0; i < shoppingCarts[line].length; i++){
            if (shoppingCarts[line][i] == null) {
                pos = i;
                break;
            }
        }

        if (pos != -1) {
            shoppingCarts[line][pos] = shopper;
            return true;
        }
        else {
            System.out.println("Line " + line + " is full, enqueue shopper fail.");
            return false;
        }
    }

    public static boolean dequeueShopper(ShoppingCart[] checkout_line) {
        if (checkout_line[0] != null) {
            for (int i = 0; i < checkout_line.length - 1; i++) {
                if (checkout_line[i+1] != null) {
                    checkout_line[i] = checkout_line[i+1];
                }
                else {
                    checkout_line[i] = null;
                    break;
                }
            }

            return true;
        }

        return false;
    }

    public static int getInsertedLineNumber(ShoppingCart[][] shoppingCarts) {
        int line_idx = 0;
        for (int i = 0; i < shoppingCarts.length; i++) {
            if (getShopperNums(shoppingCarts[i]) < getShopperNums(shoppingCarts[line_idx])) {
                line_idx = i;
            }
        }

        return line_idx;
    }

    public static int getShopperNums(ShoppingCart[] checkout_line){
        int shoppers = 0;
        for (int i = 0; i < checkout_line.length; i++) {
            if (checkout_line[i] != null)
                shoppers++;
        }
        return shoppers;
    }
}