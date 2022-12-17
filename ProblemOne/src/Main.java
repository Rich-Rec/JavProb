public class Main {
    public static void main(String[] args) {
        System.out.println(calculation(3,4));
    }
    static public int calculation(int firstNumber, int secondNumber)
    {
        return ((firstNumber*secondNumber/2)%7);
    }
}