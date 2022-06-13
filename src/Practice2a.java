/*1. 1. 큰 수 출력하기
설명

N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.

(첫 번째 수는 무조건 출력한다)


입력
첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.


출력
자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.


예시 입력 1

6
7 3 9 5 6 12
예시 출력 1

7 9 6 12
        */

import java.util.Scanner;

public class Practice2a {
    public String solution(String[] stringArrays){
        String answer = "";
        int cnt = 0;
        for (int i = 0 ; i < stringArrays.length ; i++) {

            if (i == 0) {
                String strValue = String.valueOf(stringArrays[i]);
                answer += strValue;
                answer += " ";
                cnt = Integer.parseInt(stringArrays[i]);
            }else{
                int IntValue = Integer.parseInt(stringArrays[i]);
                if (cnt < IntValue) {
                    String strValue = String.valueOf(IntValue);
                    answer += strValue;
                    answer += " ";
                }
                cnt = Integer.parseInt(stringArrays[i]);
            }

        }
        return answer;
    }


    public static void main(String[] args) {
        String anwser = "";
        Practice2a practice2a= new Practice2a();
        Scanner intput = new Scanner(System.in);
        String string1 = intput.nextLine();
        int insertSize = Integer.parseInt(string1);
        String string2 = intput.nextLine();
        String [] strArray = string2.split(" ");
        if (strArray.length == insertSize ){
            anwser = practice2a.solution(strArray);
        }else {
            System.out.println("입력된 숫자가 다릅니다");
        }
        System.out.println(anwser);
    }
}
