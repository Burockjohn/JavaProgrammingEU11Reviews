package week_07;

public class Task3 {

    public static void main(String[] args) {

        String names[] = {"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet", "Asya"};

        int counter = 0;

        for (String name : names) {
            String firstChar = name.charAt(0) + "",
                    lastChar = name.charAt(name.length() - 1) + "";

            if (firstChar.equalsIgnoreCase(lastChar)) counter++;

        }

        System.out.println(counter);


    }
}


/*

Task 3 : Write a program that accepts String array.Count how many names have the same first and last letter

                Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"

                Output : 4

 */