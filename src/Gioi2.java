import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Gioi2 {
    public static void main(String[] args) {
        List<String> danhSachCaBenh = Arrays.asList(
                "Cúm A", "Sốt xuất huyết", "Cúm A", "Covid-19", "Cúm A", "Sốt xuất huyết"
        );

        Map<String, Integer> listReport = new TreeMap<>();

        for (String tenBenh : danhSachCaBenh) {
            if (listReport.containsKey(tenBenh)) {
                listReport.put(tenBenh, listReport.get(tenBenh) + 1);
            } else {
                listReport.put(tenBenh, 1);
            }
        }

        System.out.println("BÁO CÁO: ");
        for (Map.Entry<String, Integer> entry : listReport.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }

    }
}
