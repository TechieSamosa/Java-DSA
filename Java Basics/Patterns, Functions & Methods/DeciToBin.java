public class DeciToBin {
    public static void DecToBin(int n){
        int num = n;
        int pow = 0;
        int deciNum = 0;
        while(n>0){int lastDigit = n % 10;
            deciNum = deciNum + (lastDigit*(int)Math.pow(2,pow));
            n = n/10;
            pow = pow + 1;
    }
            
        System.out.println("The Decimal of the given Binary" + num + "is"+ deciNum);
    }
    public static void main(String args[]){
        DecToBin(101);
    }
    
}