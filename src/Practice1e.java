/*5. 특정 문자 뒤집기
        설명

        영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

        특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.


        입력
        첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.


        출력
        첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.


        예시 입력 1

        a#b!GE*T@S
예시 출력 1

        S#T!EG*b@a*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice1e {
    public String solution(String str1){
        String answer = "";
        char[] charArray = str1.toCharArray();
        //문자를 담을 리스트 선언
        List<Character> charList = new ArrayList<>();
        //인덱스 번호와 특수문자를 담을 리스트 선언
        List<List<String>> specialList = new ArrayList<>();
        //2개를 합칠 리스트
        List<String> totalList = new ArrayList<>();
        for (int i = 0; i<charArray.length; i++){
            char x = charArray[i];
            if (x >= 97 && x <= 122 || x >= 65 && x <= 90) {
                charList.add(x);
            }else {
                List<String> coupleList = new ArrayList<>();
                int radix = 10;
                //char number = Integer.toString(i).charAt(0);
                String number = String.valueOf(i);
                String value = Character.toString(charArray[i]);
                coupleList.add(number);
                coupleList.add(value);
                specialList.add(coupleList);
            }
        }
        for (int j = charList.size()-1;j >=0;j--){
            String strValue = Character.toString(charList.get(j));
            totalList.add(strValue);
        }

        for (int z = 0; z < specialList.size(); z++){
            List<String>valueList = specialList.get(z);
            int index = Integer.parseInt(valueList.get(0));
            String value = valueList.get(1);
            totalList.add(index,value);
        }

        for (String z: totalList) {
            answer = answer + z;
        }
        return answer;
    }


    public static void main(String[] args) {

        Practice1e practice1e= new Practice1e();
        Scanner intput = new Scanner(System.in);
        String string1 = intput.next();
        String anwser = practice1e.solution(string1);
        System.out.println(anwser);
    }
}
