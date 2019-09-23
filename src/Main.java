import navinInterfaces.Car;
import navinInterfaces.Mercedes;
import navinInterfaces.Mustang;
import navinInterfaces.Person;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.IntStream;


public class Main {


    static Scanner sc = new Scanner(System.in);

    public enum Day {Monday, Tuesday, Wednesday}

    final double SHORTPI = 3.14159;

 private static void yo(int... arr){
    for (int x :
            arr) {
        System.out.println(x);
    }}
    public static void main(String[] args) {

     try {
         int x = 0;
         int y = 5/x;
     } catch (ArithmeticException  e){
         System.out.println("sup");
     }



     Day favDay = Day.Tuesday;

yo(10,15);
        System.out.println("Hello world");


        long longg=2147486470L;
        int intt=(int) longg;
        System.out.println(intt);

        int i = 0;
        System.out.println(i++);
        System.out.println(++i);


        int min=2;
        int max =10;

        int random = 2+(int)(Math.random()*(max-min)+1);
        System.out.println(random);

        String name = "vlad";
        String wName = name + "Barbarii";
        wName += " is my name";

        System.out.println(name.charAt(0));
        System.out.println("dog".equalsIgnoreCase("Cat"));
        System.out.println(wName.replace("vlad", "Bob"));
        for (String x : wName.split(" ")) {
            System.out.println(x);
        }
        wName.trim();
        StringBuilder sb = new StringBuilder("s");
        System.out.println(sb.capacity());
        sb.append(2);
        int[] a1 = new int[10];
        a1[0]=1;
        Arrays.fill(a1,5);
        Arrays.fill(a1,6);
        System.out.println(a1[2]);
        String[] a2= {"one", "two"};
        int[] oneToTen = IntStream.rangeClosed(1,10).toArray();
        for (int x :
                oneToTen) {
            System.out.println(x);
        }
        System.out.println("----------------------");
        System.out.println(Arrays.binarySearch(oneToTen, 9));
        System.out.println(Arrays.asList(oneToTen).contains(9)); //only if Integer
        String[][][] a5 = {{{"000"}, {"100"}, {"200"}, {"300"}},
                {{"010"}, {"110"}, {"210"}, {"310"}},
                {{"020"}, {"120"}, {"220"}, {"320"}}};
        System.out.println(a5[2][3][0]);

        int a6[] = {1,2,3};
        int a7[] =  Arrays.copyOf(a6, 3);
        Arrays.sort(a6);
        System.out.println("test");

        ArrayList<String> aL=new ArrayList<>(5);
        System.out.println(aL.size());
        aL.add("Lion");
        aL.add("Tiger");
        aL.add("Cat");
        aL.add("Dog");
        aL.add(2, "HEY");
        System.out.println(aL.get(0));
        for (String element:
             aL) {
            System.out.println(element);
        }

        Iterator it = aL.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        LinkedList lN = new LinkedList<Integer>();

        String lang = "France";
        switch (lang){
            case "Chile":
                System.out.println("hola");
                break;
            case "France":
                System.out.println("bfgfbgbgb");
                break;
            default:
                System.out.println("REGdhfdh");
                break;
        }


    }
}
