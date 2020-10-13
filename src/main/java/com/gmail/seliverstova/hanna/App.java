package com.gmail.seliverstova.hanna;

public class App {
    public static void main( String[] args ) {
        Vector3d vectorA = new Vector3d(15,3,8);
        Vector3d vectorB = new Vector3d(10,7,4);

        Vector3d vectorSum = vectorA.getVectorSum(vectorB);
        Vector3d vectorMult = vectorA.getVectorMultiplication(vectorB);

        System.out.println(vectorA.toString());
        System.out.println(vectorB.toString());

        System.out.println();

        System.out.println("Vector sum: " + vectorSum.toString());
        System.out.println("Vector multiplication: " + vectorMult.toString());
        System.out.println(String.format("Scalar multiplication: %.2f", vectorA.getScalarMultiplication(vectorB)));
    }
}
