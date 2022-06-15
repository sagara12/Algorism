/*
2. 보이는 학생
        설명

        선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는

        선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)


        입력
        첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.


        출력
        선생님이 볼 수 있는 최대학생수를 출력한다.


        예시 입력 1

        8
        130 135 148 140 145 150 150 153
        예시 출력 1

        5
*/

import java.util.Scanner;

public class Practice2b {
    public String solution(String[] stringArrays){
        String answer = "";
        int cnt = Integer.parseInt(stringArrays[0]);
        int count = 1;
        for (int i = 1 ; i< stringArrays.length ; i++){
            String value = stringArrays[i];
            int intValue = Integer.parseInt(value);
            if (cnt < intValue){
                count++;
                cnt = intValue;
            }

        }
        answer = String.valueOf(count);
        return answer;
    }


    public static void main(String[] args) {
        String anwser = "";
        Practice2b practice2b= new Practice2b();
        Scanner intput = new Scanner(System.in);
        String string1 = intput.nextLine();
        int insertSize = Integer.parseInt(string1);
        String string2 = intput.nextLine();
        String [] strArray = string2.split(" ");
        if (strArray.length == insertSize ){
            anwser = practice2b.solution(strArray);
        }else {
            System.out.println("입력된 숫자가 다릅니다");
        }
        System.out.println(anwser);
    }
}
