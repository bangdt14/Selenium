import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {
    public static void main(String args[]) {


        int[] arr2 = {1,2,4,5,6,7,8,9,10,122};

        //2,4,6,8,10,122
        for(int i = 0; i < arr2.length; i++) {
            if(arr2[i] % 2 == 0) {
                System.out.println(arr2[i]);
                break; //check if array has even number
            }
            else {
                System.out.println(arr2[i]+ " is not a multiple of 2");
            }
        }

        ArrayList<String> a = new ArrayList<String>();
        a.add("rahul");
        a.add("shetty");
        a.add("academy");
        a.add("selenium");
        System.out.println(a.get(2));

        for(int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        System.out.println("**********");
        for(String val: a) {
            System.out.println(val);
        }

        System.out.println(a.contains("selenium"));

        //Convert array to ArrayList
        String[] name = {"rahul","shetty","selenium"};
        List<String> nameArrayList = Arrays.asList(name);
        nameArrayList.contains("selenium");
    }
}
