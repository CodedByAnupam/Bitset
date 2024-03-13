import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the BitSet followed by the number of operations:");


        int n = scanner.nextInt();
        int m = scanner.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        for(int i = 0; i < m; i++){
            System.out.println("Enter operation no." + (i + 1) + ":");
            String operation = scanner.next();
            int set = scanner.nextInt();
            int index = scanner.nextInt();
            switch(operation){
                case "AND":
                    if (set == 1)
                    {
                        b1.and(b2);
                    }
                    else
                    {
                        b2.and(b1);
                    }
                    break;
                case "OR":
                    if (set == 1)
                    {
                        b1.or(b2);
                    }
                    else
                    {
                        b2.or(b1);
                    }
                    break;
                case "XOR":
                    if (set == 1)
                    {
                        b1.xor(b2);
                    }
                    else
                    {
                        b2.xor(b1);
                    }
                    break;
                case "FLIP":
                    if ( set == 1)
                    {
                        b1.flip(index);
                    }
                    else
                    {
                        b2.flip(index);
                    }
                    break;
                case "SET":
                    if (set == 1)
                    {
                        b1.set(index);
                    }
                    else
                    {
                        b2.set(index);
                    }
                    break;

            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
        scanner.close();
    }
}