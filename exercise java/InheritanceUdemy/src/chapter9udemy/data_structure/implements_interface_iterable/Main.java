package chapter9udemy.data_structure.implements_interface_iterable;

public class Main {
    public static void main(String[] args) {

        UrlLibrary urlLibrary = new UrlLibrary();

//        for (String url: urlLibrary){
//            System.out.println(url);
//        }

        for(String html: urlLibrary){
            System.out.println(html.length());
        }

    }
}
