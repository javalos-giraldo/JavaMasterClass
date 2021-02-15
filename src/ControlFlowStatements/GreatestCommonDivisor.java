package ControlFlowStatements;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }

        int divisor = 1;
        int gcd = -1;
        int minNum = first < second ? first : second;
        while(divisor <= minNum){
            if(first%divisor == 0 && second%divisor ==0){
                gcd = divisor;
            }
            divisor++;
        }

        return gcd;
    }

}
