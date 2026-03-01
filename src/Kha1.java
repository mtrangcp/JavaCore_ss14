import java.util.LinkedHashSet;
import java.util.Set;

public class Kha1 {
    public static void main(String[] args) {
        String[] input = {
                "Nguyễn Văn A – Yên Bái",
                "Trần Thị B – Thái Bình",
                "Nguyễn Văn A – Yên Bái",
                "Lê Văn C – Hưng Yên"
        };
        Set<String> setList = new LinkedHashSet<>();

        for(String patient: input){
            setList.add(patient);
        }

        System.out.println("Danh sách: ");
        for(String patient: setList){
            System.out.println(patient);
        }
    }
}
