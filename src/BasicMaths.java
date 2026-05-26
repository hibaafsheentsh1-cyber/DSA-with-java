public class BasicMaths {
    // Print digits of a number.
    static void printDigits(int num){
        while(num!=0){
            int digit=num%10;
            System.out.println(digit);
            num=num/10;
        }
    }
    //Count of total digits
    static int countDigits(int num) {
        int count=0;
        while(num!=0){
            int digit=num%10;
            count++;
            num=num/10;
        }
        return count;
    }
    //Sum of the digits of number
    static int sumDigits(int num) {
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        return sum;
    }

    //Reverse a number
    static int reverseNumber(int num){
        int revNum=0;
        while(num!=0){
            int digit = num % 10;
            revNum=revNum*10 + digit;
            num=num/10;
        }
        return revNum;
    }

    //palindrome number
    static boolean isPalindrome(int num){
        int originalNum=num;
        int reversedNum=reverseNumber(num);
        if(originalNum==reversedNum){
            return true;
        }
        else{
            return false;
        }
    }
// Prime number
static boolean primeNo(int num){
    for (int i=2;i*i<num;i++){
        if(num%i==0){
            return false;
        }
    }
    return true;

}

//GCD of 2 numbers
static int getGCD(int a,int b){
    while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
    }
    int ans=a;
    return ans;
}
//LCM of 2 numbers
static int getLCM(int a, int b){
    int gcd= getGCD(a, b);
    int prod=a*b;
    int lcm= prod/gcd;
    return lcm;
}

//Armstrong
static boolean isArmstrongNum(int num){
    int sum=0;
    int originalNum=num;
    while(num!=0){
        int digit=num%10;
        int cubeOfDigit= digit*digit*digit;
        sum= sum+cubeOfDigit;
        num= num/10;
    }
    if(sum==originalNum){
        return true;
    }
    else{
        return false;
    }
}
//Divisors and check perfect number
static boolean perfectNum(int num){
    //since 1 will be there
    int sum=1;
    for(int i=2;i*i<num;i++){
        int firstNum=i;
        int secondNum=num/i;
        sum= sum + firstNum + secondNum;
    }
    if(sum==num){
        return true;
    }
    else{
        return false;
    }
}

static void printAllPrimeNo(int n){
    for (int num=2;num<=n;num++){
        boolean prime= primeNo(num);
        if(prime==true){
        System.out.println(num);
        }
    }
}
    public static void main(String[] args) 
    {
        int num=153;
        System.out.println("The digits are: ");
        printDigits(num);

        int ans=countDigits(num);
        System.out.println("The total count of digits are: "+ans);

        int sum=sumDigits(num);
        System.out.println("The sum of digits of numbers are: "+ sum);

        int revNum=reverseNumber(num);
        System.out.println("The reverrse number is: "+ revNum);

        boolean palindrome=isPalindrome(num);
        System.out.println("Is the number given is palindrome: " + palindrome);

        boolean prime=primeNo(num);
        System.out.println("Is the given number prime: "+prime);

        System.out.println("Uses 18 and 12 as the number");
        int GCD=getGCD(18,12);
        System.out.println("The GCD is: " + GCD);

        int LCM=getLCM(18,12);
        System.out.println("The LCM is: " + LCM);

        System.out.println("Uses 153 as the number");
        boolean Armstrong=isArmstrongNum(153);
        System.out.println("Is the given number armstrong: " + Armstrong);

        System.out.println("Uses 6 as the number:");
        boolean perfectNumber = perfectNum(6);
        System.out.println("Is the given number a perfect number: " + perfectNumber);

        printAllPrimeNo(100);
    }
}
