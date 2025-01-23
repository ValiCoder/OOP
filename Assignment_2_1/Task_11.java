//In the main(String[]) method, display all the numbers in the multiArray three-dimensional array.
//Requirements:
//        • The Solution class must have a public static variable multiArray of type
//int[][][][].
//        • In the main(String[]) method, display all numbers from multiArray.

package Assignment_2_1;

public class Task_11 {
            public static int[][][][] multiArray = new int[][][][]{
                    {{{4, 8, 15}, {16}},
                            {{23, 42}, {}},
                            {{1}, {2}, {3}, {4, 5}}}
            };

            public static void main(String[] args) {
                for (int i = 0; i < multiArray.length; i++) {
                    for (int j = 0; j < multiArray[i].length; j++) {
                        for (int k = 0; k < multiArray[i][j].length; k++) {
                            for (int l = 0; l < multiArray[i][j][k].length; l++) {
                                System.out.print(multiArray[i][j][k][l] + " ");
                            }
                            System.out.println();
                        }
                    }
                }
            }
        }