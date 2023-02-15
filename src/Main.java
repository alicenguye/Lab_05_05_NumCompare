public class Main {
    public static void main(String[] args)
    {
        //Initialize Variables
        int firstNum = 0;
        int secondNum = 0;

        //comparing first and second number
        if (firstNum == secondNum){
            System.out.println(" The first number and the second number is equally");
        }

        if(firstNum < secondNum){
            System.out.println("The first number is less than the second number");
        }
        if (firstNum > secondNum){
            System.out.println("The second number is less than the first number");
        }
        else{
            System.out.println("You must enter number. Please try again");
        }
    }
}