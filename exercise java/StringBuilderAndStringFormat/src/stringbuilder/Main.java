package stringbuilder;

public class Main {
    public static void main(String[] args) {


        //inefficient way:

        //in this case we create many String objects and assign new references to object named info

        String info = "";
        info += "My name is Natalia.";
        info +=" ";
        info += "This is simply String.";
        System.out.println(info);

        //use StringBuilder class:

        //this way is more efficient cause we create and modify only one StringBuilder object

        StringBuilder builder = new StringBuilder();

        //function append() == add, concatenation,
        builder.append("My name is Roman.");
        builder.append(" ");
        builder.append("I am StringBuilder object");
        System.out.println(builder);
        System.out.println(builder.toString());

        //StringBuilder has fluent API:

        StringBuilder builderFluent = new StringBuilder();
        builderFluent.append("My name is Sam.")
                .append(" ")
                .append("I am StrinBuilder object with fluid API");

        System.out.println(builderFluent.toString());

        //STRING FORMATTING

        System.out.print("I am simply text. \tI am text after tabulator.\nI am text in new line.");

        //format print out String with '%' and function .printf:
        System.out.printf("Price is %d zł, total cost is %d zł.\n", 9, 1000);
        //put number after '%' to format field width e.g. %3d means that field is 3 characters width:
        System.out.printf("(Fields width 10 characters)\nPrice is %10d zł, total cost is %-10d zł.\n", 10, 1200);

        for (int i = 0; i <20 ; i++) {
            System.out.printf("%2d. Some text in loop. %s\n", i, "Extra string");

        }

        //%d is for integers, %s is for string, %f is for floating point values:

        System.out.printf("Total cost is %.2f\n", 9.9);
        //we declare number of decimal places after '.' e.g. %.4f
        System.out.printf("Total weight  is %.4f g.\n", 12.16);
        //when we write more decimal point places than we declare, program will round the value:
        System.out.printf("Total weight  is %.4f g.\n", 12.1687632);


        //.toString() method with different format:


        // .toString(); with StringBuilder
        Frog frog = new Frog("Pan żabka", 123);
        Frog frog2 = new Frog("Pani żabkowa", 111);
        System.out.println(frog);
        System.out.println(frog2);

        //.toString(); with String.format:
        Bird bird = new Bird("Kajtek", 13);
        Bird bird1 = new Bird("Kajtusia", 14);
        System.out.println(bird);
        System.out.println(bird1);


    }
}
