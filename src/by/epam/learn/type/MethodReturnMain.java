package by.epam.learn.type;

public class MethodReturnMain {
    public static void main(String[] args){
        MethodAction method = new MethodAction();
        int num = 739_015_428;
        int[] result = new int[10];
        int length = method.numberParser(num, result);
        System.out.println(length);
        for (int j=0; j<length; j++){
            System.out.printf("%d, ", result[j]);
        }
    }
}
