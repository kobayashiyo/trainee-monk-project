package no03.after;

public class AfterMain {
    public static void main(String args[]) {

        System.out.println("this is AfterMain");

        no03.after.Runtime runtimeA = Runtime.getRuntime();
        no03.after.Runtime runtimeB = Runtime.getRuntime();
        String isSameRuntimeObject = Boolean.valueOf(runtimeA == runtimeB).toString();
        System.out.println(String.format("two Runtime objects are same object : %s", isSameRuntimeObject));

        no03.after.Runtime.Version versionA = Runtime.version();
        no03.after.Runtime.Version versionB = Runtime.version();
        String isSameVersionObject = Boolean.valueOf(versionA == versionB).toString();
        System.out.println(String.format("two Version objects are same object : %s", isSameVersionObject));
    }
}
