import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Gioi1 {
    public static void main(String[] args) {
        Set<String> thanhPhanThuoc = new HashSet<>(Arrays.asList("Aspirin", "Caffeine", "Paracetamol"));
        Set<String> danhSachDiUng = new HashSet<>(Arrays.asList("Penicillin", "Aspirin", "Pollen"));

        Set<String> canhBao = new HashSet<>(thanhPhanThuoc);
        canhBao.retainAll(danhSachDiUng);

        Set<String> anToan = new HashSet<>(thanhPhanThuoc);
        anToan.removeAll(danhSachDiUng);

        System.out.println("Thuốc chứa: " + thanhPhanThuoc);
        System.out.println("Bệnh nhân dị ứng với: " + danhSachDiUng);
        System.out.println("------------------------------------");

        if (!canhBao.isEmpty()) {
            System.out.println("CẢNH BÁO DỊ ỨNG: " + canhBao);
        } else {
            System.out.println("Thuốc hoàn toàn an toàn cho bệnh nhân này.");
        }

        System.out.println("Thành phần an toàn có thể tiếp nhận: " + anToan);


    }
}
