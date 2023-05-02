package week_06;

public class Task5 {
    /*
    Task 5: Given a sentence which is ended with "." included letters, numbers, special characters and then find hidden sentence.
input:
        String sentence = "Y*78*8*o770987987u a869869=r????23425235e t54898)!'^h^^&%e b+%^^e%&+s%&t g+%&%+u/%y&/s.&6756/D4o n556576ot5675 c657467a7657r7657e a6575b6575o5675u567t i5467t&";

output:
You are the best guys
     */

    public static void main(String[] args) {

        String sentence = "Y*78*8*o770987987u a869869=r????23425235e t54898)!'^h^^&%e b+%^^e%&+s%&t g+%&%+u/%y&/s.&6756/D4o n556576ot5675 c657467a7657r7657e a6575b6575o5675u567t i5467t&";
        sentence = sentence.replace("^", "");
        String temp = "";
        for (int i = 0; i < sentence.length(); i++) {
            //I need to get each char
            char each = sentence.charAt(i);
            //I need to check the char if it is letter or not if letter I will put inside the dummy variable
            // if ((each>='a' && each<='z') || (each>='A' && each<='Z') || each==' ')
            if ((each >= 'A' && each <= 'z') || each == ' ')
                temp += each;
            //if my char is . I will break the loop
            if (each == '.')
                break;
        }
        System.out.println(temp);


    }
}