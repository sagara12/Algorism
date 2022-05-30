/*10. 가장 짧은 문자거리
        설명

        한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.


        입력
        첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.

        문자열의 길이는 100을 넘지 않는다.


        출력
        첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.


        예시 입력 1

        teachermode e
        예시 출력 1

        1 0 1 2 1 0 1 2 2 1 0*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice1j {
    public String solution(String stringA){
        String answer = "";
        String [] stringArrays = stringA.split("\\s");
        char[] charArray = stringArrays[0].toCharArray();
        char cntchar = stringArrays[1].charAt(0);
        List<Integer> indexList  = new ArrayList<>();
        List<Integer> resultList  = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            if (cntchar == charArray[i]){
                indexList.add(i);
            }
       }

        for (int i = 0; i < charArray.length; i++){
            int lenthResult = 0;
            int len = 0;
            int len2 = 0;
            int cnt2 = 10000;
            for (int j = 0; j < indexList.size(); j++){
                if (j!= indexList.size()-1){
                    len = i - indexList.get(j);
                    len  = Math.abs(len);
                    len2 = i - indexList.get(j+1);
                    len2 = Math.abs(len2);
                    int cnt = Math.min(len,len2);
                    if (cnt < cnt2) {
                        cnt2 = cnt;
                    }
                } else {
                    len = i - indexList.get(j);
                    len  = Math.abs(len);
                    len2 = i - indexList.get(j-1);
                    len2 = Math.abs(len2);
                    int cnt = Math.min(len,len2);
                    if (cnt <cnt2) {
                        cnt2 = cnt;
                    }
                }
              }
            lenthResult = Math.min(len,len2);
            resultList.add(cnt2);
        }
        for (int x: resultList){
            String str = String.valueOf(x);
            answer = answer + str;
        }

        return answer;
    }


    public static void main(String[] args) {

        Practice1j practice1j= new Practice1j();
        Scanner intput = new Scanner(System.in);
        String string1 = intput.nextLine();
        String anwser = practice1j.solution(string1);
        System.out.println(anwser);
    }
}
