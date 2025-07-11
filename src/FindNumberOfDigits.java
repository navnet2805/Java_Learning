public class FindNumberOfDigits {
    public static void main(String[] args) {
        int num = 03445;
        int count =0;
        while(num!=0){
            num = num/10; // I am dividing the number by 10 and assiging the result to the same 'num' so that it will decrease the count of digits by 1.
            count++; //
        }
        System.out.println("The number of digits in the number is "+count);
    }
}
