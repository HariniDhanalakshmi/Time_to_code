package Patterns;
public class New {

    public int findKey(int input1, int input2, int input3) {
        int thousandsDigit = input1 / 1000;
        int hundredsDigit = (input2 / 100) % 10;

        int temp = input3;
        int maxDigit = 0;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            temp /= 10;
        }
        return (thousandsDigit * hundredsDigit) - maxDigit;
    }
}