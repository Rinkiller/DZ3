//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.
import java.util.HashMap;
import java.util.Map;

class DZ1{
    public static void main(String[] args) {
        Map<Integer, String> telephonebook = new HashMap<>();
        telephonebook.put(910678181, "Иванов");
        telephonebook.put(910678182, "Петров");
        telephonebook.put(910678183, "Сидоров");
        telephonebook.put(910678184, "Степанова");
        telephonebook.put(910678185, "Иванов");
        System.out.println(telephonebook);
  
    }
}