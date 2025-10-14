package JavaInterviewPrep.collections;

import java.util.*;

public class CollectionsConvertion {
    public static void main(String[] args) {
        /*
        List to Set Conversion manually
         */
        List<String> list= Arrays.asList("java","python","javascript","ruby","bash","shell");
        Set<String> set=new HashSet<>();
        for(String s: list)
        {
            set.add(s);
        }
        System.out.println("Set Manuall Addition: " +set);
        /*
        Built in
         */
        Set<String> set1=new HashSet<>(list);
        System.out.println(set1);
        /*
        Set to List conversion
         */
        List<String> list1=new ArrayList<>(set1);
        System.out.println(list1);

        /*
        List to Map Conversion
         */
        List<String> list2= Arrays.asList("java","python","javascript","ruby","bash","shell");
        Map<Integer,String> list2Map=new LinkedHashMap<>();
        for(int i=0;i<list2.size();i++)
        {
            list2Map.put(i,list2.get(i));
        }
        System.out.println("List to Map: " +list2Map);

        /*
        Sorting a map by keys
         */
        Map<String,String> map=new HashMap<>();
        map.put("name","Kesav");
        map.put("rollno","123");
        map.put("salary","1234");
        map.put("country","india");

        Map<String,String> sortedKeyMap=new TreeMap<>(map);
        System.out.println("Sorted Map on Key Basis: " +map);

        /*
        Sort Map by Values
         */
        Map<String,Integer> map1= new LinkedHashMap<>();
        map1.put("java",3);
        map1.put("python",5);
        map1.put("c++",2);

        //Covert map to list
        List<Map.Entry<String,Integer>> mapList=new ArrayList<>(map1.entrySet());
        Collections.sort(mapList,
                (e1,e2) -> e1.getValue().compareTo(e2.getValue()));
        Map<String,Integer> sortedValue=new LinkedHashMap<>();
        for(Map.Entry<String,Integer> entry:mapList)
        {
            sortedValue.put(entry.getKey(), entry.getValue());
        }
        System.out.println("Sorted Map on Value basis: " +sortedValue);

        /*
        Arrays to List Conversion
         */
        String[] s={"java","python","c","ruby"};
        List<String> list3=new ArrayList<>();
        for(int i=0;i<s.length;i++)
        {
            list3.add(s[i]);
        }
        System.out.println("Arrays to List: " +list3);
        String[] s1=list3.toArray(new String[list3.size()]);
        System.out.println("List to Array: "+Arrays.toString(s1));

    }
}
