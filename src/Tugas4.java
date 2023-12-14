import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner inputUser;
        float a,b,hasil;
        String operator;

        inputUser = new Scanner(System.in);

        System.out.println("nilai a =");
        a = inputUser.nextFloat();
        System.out.println("operator = ");
        operator = inputUser.next();
        System.out.println("nilai b =");
        b = inputUser.nextFloat();

        switch (operator){
            case "+":
                hasil = a+b;
                System.out.println("Hasil ="+ hasil);
                break;
            case "-":
                hasil = a-b;
                System.out.println("Hasil ="+ hasil);
                break;
            case "*":
                hasil = a*b;
                System.out.println("Hasil ="+ hasil);
                break;
            case "/":
                hasil = a/b;
                System.out.println("Hasil ="+ hasil);
                break;
            default:
                System.out.println("operator" + operator + "tidak ditemukan");
        }

    }
}
