import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Kha2 {
    public static void main(String[] args) {
        Map<String, String> mapList = new HashMap<>();

        mapList.put("T01", "Paracetamol");
        mapList.put("T02", "Ibuprofen");
        mapList.put("T03", "Aspirin");
        mapList.put("T04", "Amoxicillin");
        mapList.put("T05", "Vitamin C");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã thuốc cần tra cứu: ");
        String maNhap = scanner.nextLine().trim().toUpperCase();

        if (mapList.containsKey(maNhap)) {
            String tenThuoc = mapList.get(maNhap);
            System.out.println("Tên thuốc: " + tenThuoc);
        } else {
            System.out.println("Thuốc không có trong danh mục BHYT.");
        }

        scanner.close();

    }
}
