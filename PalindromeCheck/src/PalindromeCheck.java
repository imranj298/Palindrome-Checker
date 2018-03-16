public class PalindromeCheck {
    public static void main(String[] args){
        System.out.println("This works");
        System.out.println(theCheck("zacecar"));
    }
    private static boolean theCheck(char[] inputArray) {
        double half = inputArray.length / 2;
        half=Math.floor(half);
        for (int i = 0; i <= half; i++) {
            if(inputArray[i] != inputArray[(inputArray.length-1 - i)]) {
                return false;
            }
        }
        return true;
    }
    private static boolean theCheck(String input){
        return theCheck(input.toCharArray());
    }
}