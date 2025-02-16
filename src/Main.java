//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int result1 = Math.round(1.1F);
        System.out.println(result1);

        int result2 = (int)Math.ceil(1.1F);
        System.out.println("The ceil of 1.1 is: " +(result2));

        int result3 = (int)Math.ceil(2.6F);
        System.out.println("The ceil of 2.6 is: " +(result3));

        int result4 = (int)Math.ceil(-2.6F);
        System.out.println("The ceil of -2.6 is: " +(result4));

        int result5 = (int)Math.floor(1.5F);
        System.out.println(result5);


        int result6 = (int)Math.floor(2.7F);
        System.out.println(result6);

        int result7 = Math.max(3,6);
        System.out.println(result7);

        int result8 = Math.min(4,1);
        System.out.println(result8);

        double result9 = Math.random();
        System.out.println(result9);

        double result10 = Math.random() * 100;
        System.out.println(result10);

        double result11 = (Math.round(Math.random() * 100));
        System.out.println(result11);

        int result12 = (int)(Math.round(Math.random() * 100));
        System.out.println(result12);
        }
    }
