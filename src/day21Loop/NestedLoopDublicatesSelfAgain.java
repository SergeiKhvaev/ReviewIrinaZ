package day21Loop;

public class NestedLoopDublicatesSelfAgain {
    public static void main(String[] args) {

        String str = "aabbcvvcgkddggf";// напечатать буквы-дубликаты

        String checked = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if(checked.contains("" + str.charAt(i))){
                continue;
            }
for(int j = 0 ; j< str.length(); j++){
    if(str.charAt(i)== str.charAt(j)) {
        count++;
    }
}//inn
            if(count >1){
                System.out.print(str.charAt(i));
            }
            checked+= str.charAt(i);

        }// out


    }
}
