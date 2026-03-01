import java.util.*;

class Patient1 {
    String name;
    int age;
    String department;

    public Patient1(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return name + " (" + age + " tuổi)";
    }
}

public class XS2 {
    public static void main(String[] args) {
        List<Patient1> inputList = Arrays.asList(
                new Patient1("Lan", 45, "Tim mạch"),
                new Patient1("Hùng", 30, "Nội tiết"),
                new Patient1("Mai", 50, "Tim mạch"),
                new Patient1("Nam", 22, "Nhi")
        );

        Map<String, List<Patient1>> departmentMap = new HashMap<>();

        for (Patient1 p : inputList) {
            String dept = p.department;

            if (!departmentMap.containsKey(dept)) {
                departmentMap.put(dept, new ArrayList<>());
            }
            departmentMap.get(dept).add(p);
        }

        System.out.println("--- DANH SÁCH BỆNH NHÂN THEO KHOA ---");
        departmentMap.forEach((dept, list) -> {
            System.out.println("Khoa " + dept + ": " + list);
        });

        String maxDept = "";
        int maxCount = -1;

        for (Map.Entry<String, List<Patient1>> entry : departmentMap.entrySet()) {
            if (entry.getValue().size() > maxCount) {
                maxCount = entry.getValue().size();
                maxDept = entry.getKey();
            }
        }

        System.out.println("\n--- PHÂN TÍCH HỆ THỐNG ---");
        System.out.println("Khoa " + maxDept + " đang đông nhất (" + maxCount + " bệnh nhân).");
    }
}
