/*** Calling Kotlin from Java ***/
package ch22;

public class MyJava1 {
    public static void main(String[] args){
        int sum =  MyKotlin1Kt.add(5, 2);
        System.out.println("Total "+sum);
    }
}