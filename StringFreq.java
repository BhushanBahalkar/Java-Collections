package Collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringFreq{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your String");
        String str = br.readLine();
        System.out.println("Input String is " + str);

        int tempA = 0;
        int tempB = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch == 'A') {
//                tempA++;
//            } else if (ch == 'I') {
//               tempB++;
//            }
//        }


        System.out.println("Frequency of 'A': " + tempA);
        System.out.println("Frequency of 'I': " + tempB);
    }
}
