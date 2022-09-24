package day29ReturnTypeMEthodPractice;

public class VariableArguments {

    public static void main(String[] args) {
        numInSameLine(1, 2, 3);
        System.out.println();

        numInSameLine("Wooden", "Spoon", "in", "mounth");
    }

    public static void numInSameLine(int... arr) {
        for (int each : arr) {
            System.out.print(each + " ");
        }


    }

    public static void numInSameLine(String... arr) {
        for (String each : arr) {
            System.out.print(each + " ");
        }

    }
}