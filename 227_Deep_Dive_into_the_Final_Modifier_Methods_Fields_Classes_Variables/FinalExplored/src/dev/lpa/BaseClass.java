package dev.lpa;

public class BaseClass {
    public  void recommendedMethod(){
        System.out.println("[BaseClass.recommendedMethod]: Best Way to Do it");
        optionalMethod();
        mandatoryMethod();
    }

    protected void optionalMethod(){
        System.out.println("[BaseClass.optionalMethod]: Customize Optional Method");
    }

    private void mandatoryMethod(){
        System.out.println("[BaseClass.mandatoryMethod]: NON_NEGOTIABLE!");
    }

    public static void recommendedStatic(){
        System.out.println("[BaseClass.recommendedStatic] BEST Way to Do it");
        optionalStatic();
        mandatoryStatic();
    }

    protected static void optionalStatic(){
        System.out.println("[BaseClass.optionalStatic]: Optional");
    }

    protected static void mandatoryStatic(){
        System.out.println("[BaseClass.mandatoryStatic]: MANDATORY");
    }
}
