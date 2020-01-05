package OfficeHours;

public class SplitArray {
    public static void main(String[] args) {
        String sentence = "My name is Muharrem";
        String[] words = sentence.split(" ");
        for ( String word : words) {
            System.out.println(word);
        }
        System.out.println("-------------------------------------");

        String link = "https://www.etsy.com/listing/667586980/embroidered-teady-bear-newborn-gift-with?ga_order=most_" +
                "relevant&ga_search_type=all&ga_view_type=gallery&ga_search_query=teady+bear&ref=sr_gallery-1-6&organic" +
                "_search_click=1";
        String[] parts = link.split("/");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
