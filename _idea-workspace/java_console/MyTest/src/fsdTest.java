import java.util.Scanner;

public class fsdTest {

        public static void main(String[] args) {
            //testFirstHighSecondHigh();
            //testBalance();
            //testPerfectNumber();
            //testCharAt("Welcome To Java");
            //testCharInt("zhujiachenmotong");
            //testExceptionHandling();

            testSubstring();
            //testCompareTo();
            //testArrayToList();
            //testMainNull();
        }

    private static void testSubstring() {
        System.out.println("0123456789ABCDEF".substring(2));
        System.out.println("0123456789".substring(2,10));
    }

    private static void testExceptionHandling() {
            try{
                double x = 100/0;
                System.out.println(x);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }finally {
                System.out.println("message from finally");
            }
    }

    private static void testCharInt(String input) {
            System.out.println("0-9 ====" + (int)'0' + "-" + (int)'9');
            System.out.println("A-Z ====" + (int)'A' + "-" + (int)'Z');
            System.out.println("a-z ====" + (int)'a' + "-" + (int)'z');


            System.out.println('a'+0);
            System.out.println('z'-'a');
            System.out.println((char)('a'+'z'-'y'));
            System.out.println((char)('a'+1));
            String output1 = "";
            for(int i=0;i<input.length();i++){
                output1 += (char)((int)input.charAt(i) + 'A' - 'a');
            }
            System.out.println(output1);

            String output2 = "";
            for(int i=0;i<input.length();i++){
                //output2 += (char)((int)input.charAt(i) - 32);
                output2 += (char)(     input.charAt(i) - 32);
            }
            System.out.println(output2);

            for(char i='a';i<='z';i++){
                System.out.print(i);
                //System.out.println((char)i);
                //System.out.println((int)i);
            }
            System.out.println("\n");
            for(int i='a';i<='z';i++){
                System.out.print((char)i);
            }
            System.out.println("\n");
            for(int i='a';i<='z';i=i+1){
                System.out.print((char)i);
            }
            System.out.println("\n");

            for(char i=' ';i<='~';i++){
                System.out.print(i);
            }
            System.out.println("\n");
            char charX = 'z';
            for(int i='a';i<='z';i++){
                System.out.print(charX);
                charX--;
            }
        }

        private static void testCharAt(String input) {
            String output = "";
            System.out.println(input);
            for(int i=0;i<input.length();i++){
                if(i%2 ==1 ){
                    output += "&";
                }else{
                    output += input.charAt(i);
                }
            }
            System.out.println(output);
        }

        private static void testFirstHighSecondHigh() {
            Scanner inputNum = new Scanner(System.in);
            Scanner inputName = new Scanner(System.in);
            Scanner inputScore = new Scanner(System.in);
            System.out.println("Enter number of Students");
            int numOfStudents = inputNum.nextInt();

            String student1 = "";
            int score1 = 0;
            String student2 = "";
            int score2= 0;
            String student="";
            int score=0;

            for(int i=1;i<=numOfStudents;i++){
                System.out.println("Enter name of student - #" + i);
                student = inputName.nextLine();
                System.out.println("Enter score of student - #" + i);
                score = inputScore.nextInt();

                if(score>=score1){
                    student2 = student1;
                    score2 = score1;
                    student1 = student;
                    score1 = score;
                }else if(score<score1 && score>=score2){
                    student2 = student;
                    score2 = score;
                }
            }
            System.out.println("First Highest: Name - " + student1 + " Score - " + score1);
            System.out.println("Second Highest: Name - " + student2 + " Score - " + score2);

        }

        private static void testBalance() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter amount of deposit (float number)");
            float deposit = input.nextFloat();
            System.out.println("Enter annual interest % (float number)");
            float interestRate = input.nextFloat();
            System.out.println("Enter month number (integer number)");
            int month = input.nextInt();
            float balance = 0;
            for(int i=0;i<month;i++){
                balance = (deposit+balance) * (1+interestRate/12/100);
            }
            System.out.println("Your initial deposit is: " + deposit);
            System.out.println("Annual interest rate is: " + interestRate + "%");
            System.out.println("Your balance @ month " + month + " is: " + balance);

        }

        private static void testPerfectNumber() {

            for(int number=1;number<=10000;number++){
                int calculateAddition = 0;

                for(int i=1;i<=number-1;i++){
                    if(number%i==0){
                        calculateAddition += i;
                    }
                }
                if(number == calculateAddition) System.out.println(number);
            }
        }
    }
