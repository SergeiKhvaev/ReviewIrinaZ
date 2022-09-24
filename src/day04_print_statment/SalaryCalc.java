package day04_print_statment;

public class SalaryCalc {
    public static void main(String[]args){

        int salary = 150_000;
        double stateTaxRate = 0.8;
        double fedTaxRate = 0.21;

        double amountStateTax = salary * stateTaxRate / 100;
        double amountFedTax = salary * fedTaxRate / 100;

        double totalTax = amountStateTax + amountFedTax;
        double salaryAfterAllTax = salary - (amountStateTax + amountFedTax);

        System.out.println("Amount of state tax is " + amountStateTax);
        System.out.println("Amount of Federal tax is " + amountFedTax);
        System.out.println("Total amount of all taxes is " + totalTax);
        System.out.println("My salary after paying all taxes is " + salaryAfterAllTax);

        System.out.println("--------------------------------------------------------------");

        String salaryInfo = "My salary before tax is $15000. Tax rate: 0.8 for state tax and 0.21 for federal tax. State tax amount is " + amountStateTax + ", federal tax amount is " + amountFedTax + "\n" + ". Total taxes amount is " + totalTax + ". Finally. my salary after all taxes is " + salaryAfterAllTax + ".";

        System.out.println(salaryInfo);

        System.out.println("---------------------------------------------------------------");


        double salary1 = 100_000;
        double stateTaxRate1 = 0.08;
        double fedTaxRate1 = 0.21;
        double stateTax1 = salary * stateTaxRate1;
        double federalTax1 = salary * fedTaxRate1;
        double totalTax1 = stateTax1 + federalTax1;
        double salaryAfterTax = salary1 - totalTax1;

        System.out.println(stateTax1);
        System.out.println(federalTax1);
        System.out.println(totalTax1);
        System.out.println(salaryAfterTax);

System.out.println("-------------------------------------------------------------------------");

long num = 100;
int mpa = (int) num;
System.out.println(num);
System.out.println(mpa);

System.out.println("-------------------------------------------------------------------------");

float bv = 14.5f;
int vb = (int) bv;
System.out.println(vb);
        System.out.println("-------------------------------------------------------------------------");


float vf = 14.5F;
int cv = (int)vf;
double df = cv;
System.out.println(vf);



int g = 5;
g ++;
System.out.println(g);

System.out.println("-----------------------------------------------------------");

int h = 0;
++h;
System.out.println(h);

System.out.println("-----------------------------------------------------------");

int j = 0;
System.out.println(j++);
System.out.println(j);
//++j;
//System.out.println(j--);

System.out.println("----------------------------------");
int x = 4;
int y = x;
int z = ++x;
System.out.println(x);

System.out.println("------------------------------------------------");

char letter = 'A';
System.out.println(letter++);
System.out.println(letter);

System.out.println("---------------------------------------------");

char digits = '9';
System.out.println(digits--);
System.out.println(digits--);



System.out.println("------------------------------------------------------------------");
int java1 = 8;
int testing1 = --java1;
System.out.println(testing1);//7
System.out.println(java1);//7

        System.out.println("------------------------------------------------------------------");

int java = 8;
int testing = java--;
System.out.println(testing);//8
System.out.println(java);//7

        System.out.println("------------------------------------------------------------------");

char digit = 'R';
System.out.println(digit--);//R
System.out.println(digit);//Q

        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(3>2);
        System.out.println(10<20);

        System.out.println(10==10);

        boolean isEqual = 10 == 5;
        System.out.println(isEqual);

        System.out.println(4!=20);
        System.out.println(10!=10);

        System.out.println("-----------------------------------------------------");


        int age = 12;
        boolean isChild = age <=13;
        boolean isSenior = age >= 65;

        System.out.println("Chiled " + isChild);
        System.out.println("Sineor " + isSenior);

        System.out.println("-----------------------------------------------------");

        int currentSpeed = 65;
        int speedLimit = 50;
        boolean speeding = currentSpeed > speedLimit;

        System.out.println("Am I speeding when 65 mph " + speeding);

        System.out.println("-----------------------------------------------------");

int b = 5;
boolean isPositive = b > 0;
boolean isNegative = b < 0;
boolean isZero = b == 0;
System.out.println(isPositive);
System.out.println(isNegative);
System.out.println(isZero);
        System.out.println("-----------------------------------------------------");

int n = 6;
boolean isEven = n % 2 == 0;
boolean isOdd = n % 2 == 1;
System.out.println("6 is even - " + isEven);
System.out.println("6 is Odd - " + isOdd);

        System.out.println("-----------------------------------------------------");

        int t = -12;
        if (t > 0){
            System.out.println("Positive");}
        else if (t < 0) {
            System.out.println("Negative");}
            else {
                System.out.println("Zero");}

        System.out.println("-----------------------------------------------------");

boolean isWeekend = true;
boolean isGoodTemp = false;
boolean doBbq = isWeekend && isGoodTemp;
System.out.println(doBbq);

System.out.println("I will" + "\""+ "sdsdsd" + "\"" + "kjkjkj");

    }
        }









