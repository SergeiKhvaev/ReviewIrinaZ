package adamofficehours.day3;

public class ArrayMuktibleWords {
    public static void main(String[] args) {


        String str = "Wooden spoon, plates, apple, trash can, dish washer"; // ���������� ��������������
       String [] arr = str.split(",");// ������� ������
        for(String eachElement : arr){
            if(eachElement.contains(" ")){
                System.out.println(eachElement);
            }
        }

    }
}
