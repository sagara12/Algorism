/*11. 문자열 압축
        설명

        알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는

        문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.

        단 반복횟수가 1인 경우 생략합니다.


        입력
        첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.


        출력
        첫 줄에 압축된 문자열을 출력한다.


        예시 입력 1

        KKHSSSSSSSE
        예시 출력 1

        K2HS7E
        예시 입력 2

        KSTTTSEEKFKKKDJJGG
        예시 출력 2

        KST3SE2KFK3DJ2G2*/
import java.util.Scanner;

public class Practice1k {
    public String solution(String stringA){
        String answer = "";
        int indexCount = 1;
        char cnt =' ';
        char[] charArray = stringA.toCharArray();
        for (int i =0; i< charArray.length; i++){
            if (i!= charArray.length-1 ){
                char cnt3 = charArray[i];
                char cnt2 = charArray[i+1];
                if (cnt3 == cnt2){
                    indexCount ++;
                }else {
                    if (indexCount>1){
                        answer = answer + cnt3;
                        answer = answer + indexCount;
                        cnt=' ';
                        indexCount = 1;
                    }else {
                        answer = answer + cnt3;
                    }
                }
            }else {
                char cnt2 = charArray[i-1];
                char cnt3 = charArray[i];
                if (cnt3 == cnt2){
                    if (indexCount>1){
                        answer = answer + cnt3;
                        answer = answer + indexCount;
                    }else {
                        answer = answer + cnt3;
                    }
                }else {
                    if (indexCount>1){
                        answer = answer + cnt3;
                        answer = answer + indexCount;
                    }else {
                        answer = answer + cnt3;
                    }
                }
            }

        }
        return answer;
    }


    public static void main(String[] args) {

        Practice1k practice1k= new Practice1k();
        Scanner intput = new Scanner(System.in);
        String string1 = intput.next();
        String anwser = practice1k.solution(string1);
        System.out.println(anwser);
    }
}
