//Arrays
/** An array is a collection of elements of the same datatype stored in a single variable
 *  Array is an object and length started from one , index strated from zero
 * 
 * Types:
 *  1.Single dimensional array:
 *    A single dimensional array Stores elements in a single row
 * 
 *  2.Multi dimensional array
 *   A Multi dimensional array Stores elements in rows and columns
 * 
 *  Ways:
 *  1.litral:
 *   A litral is created by assigning values directly using curly braces{}
 *   1.Single dimensional array = int[] numbers = {}
 *   2.Multi dimensional array = int[] numbers = {
 * {},{}}
 * 
 *  2.Non litral:
 *  A Non litral is created using the new keyword and values are assigned later
 *   1.Single dimensional array = int[] numbers = new int[array length]
 *   2.Multi dimensional array = int[] numbers = new int[ row array length] [column array length]
 * 
 */

public class Arrays {
    public static void main(String[] args) {
        //Single dimensional array litral
        int[] numbers ={1,2,3,4,5};
        System.out.println(numbers[0]);

        //Single dimensional array non litral
        int[] numbers1 = new int[5];
        numbers1[0]=1;
        numbers1[1]=2;
        numbers1[2]=3;
        numbers1[3]=4;
        numbers1[4]=5;
        System.out.println(numbers1[3]);

        //Multi dimensional array litral
        int[][] numbers2= {
            {1,2,3,4,5},
            {1,2,3,4,5}
        };
        System.out.println(numbers2[1][2]);

        //Multi dimensional array non litral
        int[][] numbers3 = new int[3][4];
        numbers3[0][0] = 1;
        numbers3[0][1] = 2;
        numbers3[0][2] = 3;
        numbers3[0][3] = 4;
        numbers3[1][0] = 5;
        numbers3[1][1] = 6;
        numbers3[1][2] = 7;
        numbers3[1][3] = 8;
        numbers3[2][0] = 9;
        numbers3[2][1] = 10;
        numbers3[2][2] = 11;
        numbers3[2][3] = 12;
     System.out.println(numbers3[2][2]);
    }
}
