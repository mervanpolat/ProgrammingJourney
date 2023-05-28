package JavaDSABootcamp.SelfStudy.CodeWars;

public class SpinWords {
    public static void main(String[] args) {
        System.out.println("Mervan is a turkish born Austrian, who currently majors in Computer Science!");
        spinText("Mervan is a turkish born Austrian, who currently majors in Computer Science!");
        //Prints !ecneicS retupmoC ni srojam yltnerruc ohw ,nairtsuA nrob hsikrut a si navreM
        spinText("Salam Alaikum");
        String text = "Mervan is a turkish born Austrian, who currently majors in Computer Science!";
    }
    static void spinText(String sentence) {
        //Converts sentence to char array
        char[] textArray = sentence.toCharArray();
        //My start position
        int start = 0;
        //My end position
        int end = sentence.length()-1;

        //If the total length of char is greater than or equal to 5 then execute while-loop
        if (textArray.length >= 5) {
            //Do the following while start <= end
            while (start <= end) {
                //Swap the start and end values of my arr to reverse it
                swap(textArray, start, end);
                //Increment start
                start++;
                //Decrement end
                end--;
            }
            //Output
            System.out.println(textArray);
        }
    }
    //Swap logic
    static void swap(char[]arr, int index1, int index2) {
        char temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
