import java.util.Scanner;

/*대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.


        입력
        첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.

        문자열은 영어 알파벳으로만 구성되어 있습니다.


        출력
        첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.



        예시 입력 1

        StuDY
        예시 출력 1

        sTUdy*/
public class Practice1b {
    public String solution(String stringA){
        String answer = "";
        String stringArray = "";
        char[] charArr = stringA.toCharArray();
        int charArrSize = charArr.length;
        char[] answerArr = new char[charArrSize];

        for (int i =0; i <charArrSize; i++) {
            if (charArr[i] == Character.toUpperCase(charArr[i])){
                char big = Character.toLowerCase(charArr[i]);
                answerArr[i] = big;
            } else {
                char small = Character.toUpperCase(charArr[i]);
                answerArr[i] = small;
            }
            answer = String.copyValueOf(answerArr);
        }
        return answer;
    }


    public static void main(String[] args) {

        Practice1b practice1b= new Practice1b();
        Scanner intput = new Scanner(System.in);
        String string1 = intput.next();
        String anwser = practice1b.solution(string1);
        System.out.println(anwser);
    }

}
