public class NumCompare {
    public static void main(String[] args){
        int userInputOne = 0;
        int userInputTwo = 0;

        System.out.println("Please enter first Integer Number to be compared:");
        System.out.println("9");

        userInputOne = 9;

        System.out.println("Please enter second Integer Number to be compered:");

        System.out.println("10");

        userInputTwo =10 ;

        if(userInputOne == userInputTwo){
            System.out.println("Both the integer numbers are the same.");
        }else if(userInputOne > userInputTwo){
            System.out.println("Input one greater than input two.");
        }else if(userInputOne < userInputTwo){
            System.out.println("Input two greater than input one.");
        }else {
            System.out.println("You must enter a number. Please try again.");
        }
    }
}
