import java.util.Scanner;  // Import the Scanner class

class Main {
    public static void main(String[] args) {
        //Opgave 1
        System.out.println("-------------OPGAVE 1------------------");
        vote();


        //Opgave 2 METODE getMax/getMin
        System.out.println("-------------OPGAVE 2 GET MAX------------------");
        getMax(5, 4, 7);

        System.out.println("-------------OPGAVE 2 GET MIN------------------");
        getMin(5, 2, 1);


        //OPGAVE 3 METODE isOdd
        System.out.println("-------------OPGAVE 3------------------");
        isOdd();


        //OPGAVE 4 METODE name
        System.out.println("-------------OPGAVE 4------------------");
        name();


        //OPGAVE 5 CAR/DRIVER CLASS
        System.out.println("-------------OPGAVE 5 CAR------------------");
        Car audi = new Car("Audi R8", 2000000, true, false, true);

        System.out.println("-------------OPGAVE 5 DRIVER------------------");
        Driver karl = new Driver("Karl", 81, "Crazy speed demon");


        //OPGAVE 6 EMPLOYEE
        System.out.println("-------------OPGAVE 6------------------");
        Employee jens = new Employee("Jens", "Jensen", 25000f);
        Employee karla = new Employee("Karla", "Karlsen", 50000f);
        jens.salary = jens.salary * 1.1f;
        karla.salary = karla.salary * 1.1f;
        System.out.println(jens.firstName + " just got a 10% raise and is now earning: " + jens.salary);
        System.out.println(karla.firstName + " just got a 10% raise and is now earning: " + karla.salary);


        //OPGAVE 7 BRAIN PUZZLE
        System.out.println("-------------OPGAVE 7------------------");
        PrimitivKodeMenDetVirker();
    }

    //OPGAVE 1 VOTE METODE
    public static void vote(){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter your age");
        int userAge = myObj.nextInt();  // Read user input
        System.out.println("Your age is: " + userAge);  // Output user input
        if (userAge >= 18) {
            System.out.println("You're eligible to vote");
        } else {
            System.out.println("You're not eligible to vote");
        }
    }


    //OPGAVE 2 GET MAX METODE TIL AT LOGGE DET STØRSTE TAL
    public static void getMax(int a, int b, int c) {
        if ((a > b) && (a > c))
            System.out.println(a + " is the biggest number");
        else if ((b > a) && (b > c))
            System.out.println(b + " is the biggest number");
        else
            System.out.println(c + " is the biggest number");
    }


    //OPGAVE 2 GET MIN METODE TIL AT LOGGE DET MINDSTE TAL
    public static void getMin(int a, int b, int c) {
        if ((a < b) && (a < c))
            System.out.println(a + " is the smallest number");
        else if ((b < a) && (b < c))
            System.out.println(b + " is the smallest number");
        else
            System.out.println(c + " is the smallest number");
    }


    //OPGAVE 3 METODE TIL AT FORTÆLLE OM ET TAL ER LIGE ELLER ULIGE
    public static void isOdd() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter a number to find out if it is even or odd");
        int num = myObj.nextInt();  // Read user input
        if (num % 2 == 0)
            System.out.println("Your number is: " + num + " and it is even");
        else
            System.out.println("Your number is: " + num + " and it is odd");
    }


    //OPGAVE 4 METODE TIL AT RETURNERE FORBOGSTAV I FORNAVN & MELLEMNAVN OG FULDE EFTERNAVN
    public static void name(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter your full name. Example: Frederik Vigsø Andersen");
        String name = myObj.nextLine();
        String[] arrary = name.split(" ",3);
        System.out.println(arrary[0].charAt(0)+". "+arrary[1].charAt(0)+". "+arrary[2]);
    }


    //OPGAVE 7
    public static void PrimitivKodeMenDetVirker(){
        Scanner MyObj = new Scanner(System.in);
        System.out.println("Please enter a word IN LOWER CASE to check if it contains letters that comes after eachother in the alphabet");
        String svar = MyObj.nextLine();
        if(svar.contains("ab"))
            System.out.println(svar.contains("ab"));
        else if(svar.contains("bc"))
            System.out.println(svar.contains("bc"));
        else if(svar.contains("cd"))
            System.out.println(svar.contains("cd"));
        else if(svar.contains("de"))
            System.out.println(svar.contains("de"));
        else if(svar.contains("ef"))
            System.out.println(svar.contains("ef"));
        else if(svar.contains("fg"))
            System.out.println(svar.contains("fg"));
        else if(svar.contains("gh"))
            System.out.println(svar.contains("gh"));
        else if(svar.contains("hi"))
            System.out.println(svar.contains("hi"));
        else if(svar.contains("ij"))
            System.out.println(svar.contains("ij"));
        else if(svar.contains("jk"))
            System.out.println(svar.contains("jk"));
        else if(svar.contains("kl"))
            System.out.println(svar.contains("kl"));
        else if(svar.contains("lm"))
            System.out.println(svar.contains("lm"));
        else if(svar.contains("mn"))
            System.out.println(svar.contains("mn"));
        else if(svar.contains("no"))
            System.out.println(svar.contains("no"));
        else if(svar.contains("op"))
            System.out.println(svar.contains("op"));
        else if(svar.contains("pq"))
            System.out.println(svar.contains("pq"));
        else if(svar.contains("qr"))
            System.out.println(svar.contains("qr"));
        else if(svar.contains("rs"))
            System.out.println(svar.contains("rs"));
        else if(svar.contains("st"))
            System.out.println(svar.contains("st"));
        else if(svar.contains("tu"))
            System.out.println(svar.contains("tu"));
        else if(svar.contains("uv"))
            System.out.println(svar.contains("uv"));
        else if(svar.contains("vw"))
            System.out.println(svar.contains("vw"));
        else if(svar.contains("wx"))
            System.out.println(svar.contains("wx"));
        else if(svar.contains("xy"))
            System.out.println(svar.contains("xy"));
        else if(svar.contains("yz"))
            System.out.println(svar.contains("yz"));
        else if(svar.contains("zæ"))
            System.out.println(svar.contains("zæ"));
        else if(svar.contains("æø"))
            System.out.println(svar.contains("æø"));
        else if(svar.contains("øå"))
            System.out.println(svar.contains("øå"));
        else
            System.out.println("false");
    }
}


