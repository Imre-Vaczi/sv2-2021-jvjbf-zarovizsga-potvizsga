package numbers;

public class ArmstrongNumbers {

    public boolean isArmstrongNumber(long number) {

        validateInput(number);

        String line = String.valueOf(number);
        long length = line.length();
        long total = 0;

        total = calculateTotal(line, length, total);

        return total == number;

    }

    private long calculateTotal(String line, long length, long total) {
        for (Character letter : line.toCharArray()) {
            long temp = Long.parseLong(String.valueOf(letter));
            System.out.println(temp);
            total += Math.pow(temp, length);
        }
        return total;
    }

    private void validateInput(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number can't be negative: " + number);
        }
    }

}
