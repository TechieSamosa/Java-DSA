public class AllPatterns {
    public static void HollowRect(int a, int b){
        //outerloop
        for(int i=1; i<=b; i++){
            for(int j=1; j<=a;j++){
                if(i==1 || i==b || j==1 || j==a){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    }
    public static void InvertedPyramid(int a){
        //Outer Loop
        for(int i=1; i<=a; i++){
            //Spaces
            for(int j=1; j<=(a-i); j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
        System.out.println();
            
        }
    }

    public static void InvertedNum(int a){
        //outerloop
        for(int i=1; i<=a; i++){
            for(int j=1; j<=(a-i); j++){
                System.out.print(j+" ");
            }
        System.out.println();
        }
    }
    public static void main(String args[]){
        InvertedPyramid(7);
        InvertedNum(7);
        HollowRect(7, 7);
    }
}
