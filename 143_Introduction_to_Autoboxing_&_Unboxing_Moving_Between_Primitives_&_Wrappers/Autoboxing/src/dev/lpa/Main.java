package dev.lpa;

public class Main {
    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15); // Preferred but uncesssary
        Integer deprecatedBoxing = new Integer(15); // deprecrated since JDK 9
        int unboxedInt = boxedInt.intValue(); // unnecessary

        /// Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnBoxed = getDoubleObject();
    }

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {
        return 100.0;
    }
}
