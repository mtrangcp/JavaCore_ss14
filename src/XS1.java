import java.util.Comparator;
import java.util.TreeSet;

class Patient {
    String name;
    int severity;    // 1: Nguy kịch, 2: Nặng, 3: Nhẹ
    int arrivalTime; // phut

    public Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return String.format("Bệnh nhân %s (Mức %d, đến lúc %d)", name, severity, arrivalTime);
    }
}

public class XS1 {
    public static void main(String[] args) {
        Comparator<Patient> priorityComparator = (p1, p2) -> {
            if (p1.severity != p2.severity) {
                return p1.severity - p2.severity;
            }
            return p1.arrivalTime - p2.arrivalTime;
        };

        TreeSet<Patient> emergencyRoom = new TreeSet<>(priorityComparator);

        emergencyRoom.add(new Patient("A", 3, 480));
        emergencyRoom.add(new Patient("B", 1, 495));
        emergencyRoom.add(new Patient("C", 1, 485));

        System.out.println("--- THỨ TỰ XỬ LÝ CẤP CỨU ---");
        for (Patient p : emergencyRoom) {
            System.out.println(p);
        }
    }
}
