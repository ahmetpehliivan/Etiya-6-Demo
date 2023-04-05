public class JavaLesson23 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int numberToCall = 8;
        boolean isNumber = false;

        for (int number : numbers) {
            if (number == numberToCall) {
                isNumber = true;
                break;
            }
        }
        if (isNumber) {
            System.out.println("Sayi mevcuttur : " + numberToCall);
        } else {
            System.out.println("Sayi mevcut değildir : " + numberToCall);
        }
    }
}

