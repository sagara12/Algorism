/*
6. 중복문자제거
        설명

        소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.

        중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.


        입력
        첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.


        출력
        첫 줄에 중복문자가 제거된 문자열을 출력합니다.


        예시 입력 1

        ksekkset
        예시 출력 1

        kset
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Practice1f {
    public String solution(String stringA){
        String answer = "";
        String cnt = " ";
        char[] strArr = stringA.toCharArray();
        List<String>strList = new ArrayList<>();
        for (char x : strArr){
            String str = String.valueOf(x);
            strList.add(str);
        }
        for (int i = 0; i<strList.size(); i++){
            String str1 = strList.get(i);
            int flag = 0;
            for (int j = i+1; j<strList.size(); j++){
                String str2 = strList.get(j);
                if (str2.equals(str1)){
                    strList.set(j,"0");
                }
            }
        }
        for (String x : strList){
            if (x.equals("0")){
                continue;
            }else {
                answer =  answer + x;
            }
        }
        return answer;
    }


    public static void main(String[] args) {

        Practice1f practice1f= new Practice1f();
        Scanner intput = new Scanner(System.in);
        String string1 = intput.next();
        String anwser = practice1f.solution(string1);
        System.out.println(anwser);
    }
}
