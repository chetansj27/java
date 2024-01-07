package java8.lambdas;

import java.util.List;

/**
 * Functional Interface with single abstract method
 */
interface FunctionalInterface {
    boolean isEven(int x);
}

/**
 * Lambda expressions express instances of functional interfaces.
 * Function interface is an interface with a single abstract method.
 * Lambda syntax =  lambda operator -> body
 */
public class LambdaExample {
    public static void main(String[] args) {
        /**
        * Below line will create an anonymous class that implements that functional interface.
         * class AnonymousClass implements FunctionalInterface {
         *      @Override
         *     public boolean isEven(int x) {
         *         return x % 2 == 0;
         *     }
         * }
         */
        FunctionalInterface obj = x -> x % 2 == 0;
        System.out.println(obj.isEven(10));

        // print the elements of list
        printListElementsStructured(SampleData.integerList);
        printListElementsFunctional(SampleData.integerList);
    }

    /**
     * In this method we're using structured way of printing the elements.
     * We're iterating the list using enhanced for loop and printing the elements.
     */
    public static void printListElementsStructured(List<Integer> integerList) {
        for (int number : integerList) {
            System.out.println(number);
        }
    }

    /**
     * In this method we're using functional way of printing the elements.
     * We're iterating the list using forEach method and printing the elements using method reference.
     */
    public static void printListElementsFunctional(List<Integer> integerList) {
        integerList.forEach(System.out::println);
    }

}
