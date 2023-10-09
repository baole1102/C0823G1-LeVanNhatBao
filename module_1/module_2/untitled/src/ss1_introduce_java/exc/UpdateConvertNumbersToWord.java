package ss1_introduce_java.exc;

import java.util.Scanner;

public class UpdateConvertNumbersToWord {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Input number");
        int number = Integer.parseInt(scanner.nextLine());
        String result = docSoThanhChu(number);
        System.out.println(result);
    }

    public static String docSoThanhChu(int number){
        String [] oneArr = {"One","Two","Three","Four","Three","Five","Six","Seven","Eight","Nine","Ten"};
        String [] upTo20Arr = {"","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eightteen","Nineteen"};
        String [] tensArr = {"", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        if (number <= 10){
            return oneArr[number];
        }else if (number < 20){
            return  upTo20Arr[number-10];
        } else if (number< 100) {
            return tensArr[number/10]+oneArr[number%10];
        } else if (number<1000) {
            String hundreds = oneArr[number/100];
            String tensAndOnes = docSoThanhChu(number%100);
            if (!tensAndOnes.isEmpty()){
                return hundreds + "Hundreds and"+ tensAndOnes;
            }else {
                return hundreds +"Hundreds";
            }
        }
        return "";
    }
}
