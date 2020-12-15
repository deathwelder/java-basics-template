package com.epam.izh.rd.online;

public class JavaBasics {
    public static void main(String[] args) {
        int[] values = new int[]{-1, -3, 4, 8, 5, 22, 17};
        int count = 0;
        int count2 = 0;

        for (int i: values) {
            if (i % 2 == 0) {
                count++;
            }
        }
        int[] resultValues = new int[count];

        for (int i: values) {
            if (i % 2 == 0) {
                for (int j = count2; j < resultValues.length; j++) {
                    resultValues[j] = i;

                }
                count2++;
            }
        }

        for (int i: resultValues) {
            System.out.println(i);
        }



 /**       for (int i = 0; i < values.length ; i++) {
            if (values[i] % 2 == 0) {
                count++;
               // System.out.print(values[i] + " ");
            }
        }
           int[] resultValues = new int[count];
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                for (int j = count2; j < resultValues.length; j++) {
                    resultValues[j] = values[i];

                }
                count2++;
            }
        }

        for (int i = 0; i < resultValues.length; i++) {
            System.out.println(resultValues[i]);
        }


    }  **/
}
}
