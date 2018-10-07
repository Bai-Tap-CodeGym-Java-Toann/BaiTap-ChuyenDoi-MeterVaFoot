import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (1 > 0) {
            menu();
            int option = sc.nextInt();
            while (!((option > 0) && (option < 4))) {
                System.out.println("không hợp lệ, vui lòng thử lại \n \n");
                menu();
                option = sc.nextInt();
            }
            switch (option) {
                case 1:
                    System.out.print("nhập giá trị: ");
                    System.out.println(footToMeter(sc.nextDouble()) + " m \n \n");
                    break;
                case 2:
                    System.out.print("nhập giá trị: ");
                    System.out.println(meterToFoot(sc.nextDouble()) + " foot \n \n");
                    break;
                case 3:
                    System.exit(0);
            }

        }
    }

    static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    static double footToMeter(double foot) {
        return 0.305 * foot;

    }

    static void menu() {
        System.out.println("menu: ");
        System.out.println("1: foot to metter");
        System.out.println("2: metter to foot");
        System.out.println("3: exit");
        System.out.print("please select an option: ");
    }
}
