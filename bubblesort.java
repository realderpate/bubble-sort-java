package calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bubblesort {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int num4 = Integer.parseInt(reader.readLine());
        int num5 = Integer.parseInt(reader.readLine());
        int array[] = new int[5];
        array[0] = num1;
        array[1] = num2;
        array[2] = num3;
        array[3] = num4;
        array[4] = num5;
        int size = 5, t;
        for(int i = 0; i < size - 1; i++)
        {
            for(int j = 1; j < size; j++)
            {
                if(array[j-1] > array[j])
                {
                    t = array[j-1];
                    array[j-1] = array[j];
                    array[j] = t;
                }
            }
        }
        for (int k = 0; k < 5; k++)
            System.out.println(array[k]);
    }
}
