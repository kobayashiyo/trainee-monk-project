package no03.before;

public class BeforeMain {
    public static void main(String args[]) {

        System.out.println("this is BeforeMain");

        no03.before.Runtime runtimeA = new Runtime();
        no03.before.Runtime runtimeB = new Runtime();
        String isSameRuntimeObject = Boolean.valueOf(runtimeA == runtimeB).toString();
        System.out.println(String.format("two Runtime objects are same object : %s", isSameRuntimeObject));

        no03.before.Runtime.Version versionA = new Runtime.Version();
        no03.before.Runtime.Version versionB = new Runtime.Version();
        String isSameVersionObject = Boolean.valueOf(versionA == versionB).toString();
        System.out.println(String.format("two Version objects are same object : %s", isSameVersionObject));
    }
}
