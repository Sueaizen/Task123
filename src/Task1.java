import java.util.*;


public class Task1 {


    public static void main(String[] args) {

        String test1[] = {"m2", "Fb", "asc"};
        String arr[] = {"C", "-", "-", "D", "-", "-", "E", "-", "F", "-", "-", "G", "-", "-", "A", "-", "-", "B", "-",
                "C", "-", "-", "D", "-", "-", "E", "-", "F", "-", "-", "G", "-", "-", "A", "-", "-", "B"};
        String arr1[] = {"C", "D", "E", "F", "G", "A", "B"};
        String arr2[] = {"C", "D", "E", "F", "G", "A", "B", "C", "D", "E", "F", "G", "A", "B"};
        //c c+/D- D

        List<String> list1 = Arrays.asList(arr2);
        List<String> list2 = Arrays.asList(arr);

        Map<String, Integer> map = new HashMap<>();
        map.put("m2", 1);
        map.put("M2", 2);
        map.put("m3", 3);
        map.put("M3", 4);
        map.put("P4", 5);
        map.put("P5", 7);
        map.put("m6", 8);
        map.put("M6", 9);
        map.put("m7", 10);
        map.put("M7", 11);
        map.put("P8", 12);

        String result1;
        char firstElemRef[] = test1[0].toCharArray();
        char secondElemRef[] = test1[1].toCharArray();

        int degree = Character.getNumericValue(firstElemRef[1]);

        int startElemIndex = Arrays.asList(arr1).indexOf(secondElemRef[0] + "");
        //System.out.println(startElemIndex);
        int temp = 0;
        int target = 0;
        int start=0;
        if (test1.length == 3 && test1[2] == "dsc") {
            temp = startElemIndex + arr1.length - (degree - 1);
            if (temp >= arr1.length) {
                target = list2.indexOf(list1.get(temp));
                start = list2.indexOf(secondElemRef[0] + "");

            } else {
                target = list2.indexOf(list1.get(temp));
                start= list2.lastIndexOf(secondElemRef[0] + "");
                System.out.println(start);
            }
            int semitone = Math.abs(target - start) - (degree - 1);
            System.out.println(semitone);
            result1 = list1.get(temp);


            int dif = 0;
            int step = 0;
            if (secondElemRef.length > 1) {
                step = "#".equals(secondElemRef[1] + "") ? -1 : 1;
            }
            dif = map.get(test1[0]) - semitone;
            for (int i = 0; i < Math.abs(dif + step); i++) {
                result1 += dif > 0 ? "b" : "#";
            }
            System.out.println(result1);


        } else {
            temp = startElemIndex + degree - 1;
            if (temp >= arr1.length) {
                target = list2.lastIndexOf(list1.get(temp));
            } else {
                target = list2.indexOf(list1.get(temp));
            }
            start = list2.indexOf(secondElemRef[0] + "");
            int semitone = Math.abs(target - start) - (degree - 1);
            System.out.println(semitone);
            result1 = list1.get(temp);

            int dif = 0;
            int step = 0;
            if (secondElemRef.length > 1) {
                step = "#".equals(secondElemRef[1] + "") ? -1 : 1;
            }
            dif = map.get(test1[0]) - semitone;
            for (int i = 0; i < Math.abs(dif + step); i++) {
                result1 += dif > 0 ? "#" : "b";
            }
            System.out.println(result1);
        }
        //start = list2.indexOf(secondElemRef[0] + "");

        //start = list2.indexOf(secondElemRef[0] + "");

        //System.out.println(start);
//        int semitone = Math.abs(target - start) - (degree - 1);
//
//        System.out.println(semitone);
//        result1 = list1.get(temp);
//
//
//        int dif = 0;
//        int step = 0;
//        if (secondElemRef.length > 1) {
//            step = "#".equals(secondElemRef[1] + "") ? -1 : 1;
//        }
//        dif = map.get(test1[0]) - semitone;
//        for (int i = 0; i < Math.abs(dif + step); i++) {
//            result1 += dif > 0 ? "#" : "b";
//        }
//        System.out.println(result1);



    }
}

class Intervals {


}
