package dev.lpa;

import dev.lpa.consumer.specific.ChildClass;

public class Main {
    public static void main(String[] args) {
        BaseClass parent = new BaseClass();
        ChildClass child = new ChildClass();
        BaseClass childReferredToAsBase = new ChildClass();

        parent.recommendedMethod();
        System.out.println("----------------------");
        childReferredToAsBase.recommendedMethod();
        System.out.println("----------------------");
        child.recommendedMethod();

        System.out.println("----------------------");
        parent.recommendedMethod();
        System.out.println("----------------------");
        childReferredToAsBase.recommendedMethod();
        System.out.println("----------------------");
        child.recommendedMethod();

        System.out.println("----------------------");
        BaseClass.recommendedStatic();
        ChildClass.recommendedStatic();

        String xArgument = "This is all I've got to say about Section ";
        StringBuffer zArgument = new StringBuffer("Only saying this: Section ");
        doXYZ(xArgument, 16, zArgument);
        System.out.println("After Method, xArgument: " + xArgument);
        System.out.println("After Method, zArgument: " + zArgument);
    }

    private static void doXYZ(String x, int y, StringBuffer z){
        final String c = x+y;
        System.out.println("c = " + c);
//        x = c;
//        z.append(y);
        z = new StringBuffer("This is a new reference");
    }
}