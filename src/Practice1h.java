

/*8. 유효한 팰린드롬
        설명

        앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.

        문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.

        단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.

        알파벳 이외의 문자들의 무시합니다.


        입력
        첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.


        출력
        첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.


        예시 입력 1

        found7, time: study; Yduts; emit, 7Dnuof
        예시 출력 1

        YES*/
import java.util.Scanner;
public class Practice1h {
    public String solution(String stringA){
        String answer = "";
        String cnt = "";
        String cnt2 = "";
        char[] charArray = stringA.toCharArray();
        for (char x : charArray) {
            if (x >= 97 && x <= 122 || x >= 65 && x <= 90) {
                x = Character.toUpperCase(x);
                cnt  = cnt + x;
            }
        }

        for (int i = charArray.length-1; i>=0; i--){
            char charValue = charArray[i];
            if (charValue >= 97 && charValue <= 122 || charValue >= 65 && charValue <= 90) {
                charValue = Character.toUpperCase(charValue);
                cnt2  = cnt2 + charValue;
            }
        }

        if (cnt.equals(cnt2)){
            answer = "YES";
        }else {
            answer = "NO";
        }

        return answer;
    }


    public static void main(String[] args) {

        Practice1h practice1h= new Practice1h();
        Scanner intput = new Scanner(System.in);
        String string1 = intput.nextLine();
        String anwser = practice1h.solution(string1);
        System.out.println(anwser);
    }
}
