package day20forlooppractice;

public class SpaceProgramSelf {
    public static void main(String[] args) {
        // ????? ?????? ????? ???????? ??????, ?????? ?????? ???????? '-'.
        // ??????? ??? ????: ?? ???????? ??????? ????? ??????????? ?????????, ?????????????? ?????? ?????, ??? ????? ????????? ????? char(At)
        String str = "I love java";
        String result = " "; // ?????? ?????? ??????, ?.?. ?? ???????? ?????? ????? ??????? ????? ??????

        for(int i = 0; i < str.length(); i++){//???? ????? ?? ???? ?? ????? ???????????? ?????????? ???????? ? ??????, ?.?. ?????????? ???? ?? ??????? ???? ?????? ? ??????????? ??????????, ??? ??? ?????? ??? ????? ? ????????????? ???????? ?????? ?? _ ??? ?????? ??????????? ?????
            char letter = str.charAt(i); // ?????? ????????? ?????????? ??? ?????, ??? ?? ?????? ??  ??????
            if(str.charAt(i) == ' '){
                letter = '_';
                result = result + letter; // ????? ?????? ????? ??????, ???? charAt(i)charAt(i) ????????????? ?????? - ??????????? '_'
            } else {
                result = result + str.charAt(i)+ " ";// ???? charAt(i) ????????????? ?????  ??????????????? charAt(i) ????????? " "

            }

            }
        System.out.println(result);



    }
}
