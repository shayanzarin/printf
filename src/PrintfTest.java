import java.util.Scanner;

public class PrintfTest {
    static boolean flag=true;
    public static void main(String[] args) {
        System.out.println("Enter your Input:(String<10 alphabet + 0<Integer<999)");
        System.out.println("Enter 'exit' to exit");
        while (flag){
            printTable();
        }
        System.out.println("good bye");
    }

    private static void printTable() {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        if (str.equals("exit"))
            flag=false;
        else {
            int number=scanner.nextInt();
            System.out.printf("%-15s%03d", str, number);
        }
    }
}
