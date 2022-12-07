import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу, которая найдет и
//  выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
public class DZ2 {
    private static void cutnameluze(List<String> name){
        int count = 1;
        for(int i = 0; i < name.size() - 1; i++){
            if(name.get(i).equals(name.get(i + 1)))count++;
            else{
                System.out.println(name.get(i) + " повторяется:" + count);
                count = 1;
            }
        }

    }
    public static void main(String[] args) {
        
        String[] strarray = "Петров,Иванов,Сидоров,Козлов,Петров,Петров,Сидоров".split(",");
        List<String> name = new ArrayList<>();
        for(int i = 0; i < strarray.length; i++)
            name.add(strarray[i]);
            Collections.sort(name, Collections.reverseOrder());
        System.out.println(name.toString());
        cutnameluze(name);
    
    
    }
}
