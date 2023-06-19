import java.util.HashMap;
import java.util.Map;

public class Singleton {
    public static int run(int[] student_list) {
        int single_student_number = 0;



        Map<Integer,Integer> countMap = new HashMap<>();

        for(int i=0; i< student_list.length;i++){
            if(countMap.containsKey(student_list[i])){
                countMap.put(student_list[i],countMap.get(student_list[i])+1);
            } else {
                countMap.put(student_list[i],1);
            }
        }

        for(Map.Entry entry : countMap.entrySet()){
            if((int)entry.getValue() == 1){
                single_student_number = (int)entry.getKey();
            }
        }
        System.out.println(single_student_number);

        return single_student_number;
    }

    public static void main(String[] args) {
        int[] student_list= {5,3,2,2,3,5,4,6,9,6,4,12,8,9,12};
        Singleton.run(student_list);
    }
}
