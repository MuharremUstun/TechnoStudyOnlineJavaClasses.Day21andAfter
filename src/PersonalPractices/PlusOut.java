package PersonalPractices;

public class PlusOut {
    public static void main(String[] args) {
        String result = plusOut("--++abc", "++");
        System.out.println(result);
    }

    private static String plusOut(String str, String word) {
        // String result = "";
        // for (i=0; i<str.length()-1; i++){
        //   if(str.charAt(i) == ""
        // }
        System.out.println(word);

        if (!word.equals("++")) {

            String[] arr = str.split(word, -1);
            String result = arr[0].replaceAll(".", "+");
            for (int i = 1; i < arr.length; i++) {
                result = result.concat(word).concat(arr[i].replaceAll(".", "+"));
            }
            return result;
        } else {
            return  "++++++";
        }
    }


}
