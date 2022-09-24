package day24Arrays;

import java.util.Arrays;

public class ArraysPracticeMoreThenOneWords {
    public static void main(String[] args) {
        /*

Multiple Words

	Given a String of words that are separate by comma and spaces. Find and print any words that have more than one word

	Example

		Input:
			knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer
		Output:
			wooden spoons
			trash can
			dish washer

                 */

        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] arrayWords = words.split(", ");
        System.out.println(Arrays.toString(arrayWords));

        for (String each : arrayWords) {
            if (each.lastIndexOf(" ") > 0) {
                System.out.println(each);
                }

            }


        }

    }
