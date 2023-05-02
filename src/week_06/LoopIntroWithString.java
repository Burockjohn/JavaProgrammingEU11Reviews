package week_06;

public class LoopIntroWithString {
    public static void main(String[] args) {

        String name = "Ramazan";
   /*     System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));


    */


        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        //print your name with reverse style

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.println(name.charAt(i));
        }


    }
}