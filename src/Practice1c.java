/*설명

        한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.

        문장속의 각 단어는 공백으로 구분됩니다.


        입력
        첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.


        출력
        첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한*/



import java.util.Scanner;

public class Practice1c {
    public String solution(String stringA){
        String answer = "";
        String cnt = " ";
        int cntLength = 0;
        String[] stringArray = stringA.split(" ");
        for(String x:stringArray){
            int cntLength1 = cnt.length();
            int cntLength2 = x.length();
            if (cntLength2==Math.max(cntLength1,cntLength2)) {
                cnt = x;
            }
            answer = cnt;
        }
        return answer;
    }


    public static void main(String[] args) {

        Practice1c practice1c= new Practice1c();
        Scanner intput = new Scanner(System.in);
        String string1 = intput.nextLine();
        String anwser = practice1c.solution(string1);
        System.out.println(anwser);
    }

}
