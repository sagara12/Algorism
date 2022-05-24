/*4. 단어 뒤집기
        설명

        N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.


        입력
        첫 줄에 자연수 N(3<=N<=20)이 주어집니다.

        두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.


        출력
        N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.


        예시 입력 1

        3
        good
        Time
        Big
        예시 출력 1

        doog
        emiT
        giB
        */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice1d {
    public List<String> solution(List<String> stringList){
        String answer = "";
        String cnt = " ";
        String anwer = " ";
        int cntLength = 0;
        List<String>answerList = new ArrayList<>();
        for (int i=0; i <stringList.size();i++){
            String word = stringList.get(i);
            char[] stringArray = word.toCharArray();
            char[] newstringArray = new char[stringArray.length];
            for (int j=stringArray.length; j>0; j-- ){
                int newnumber = stringArray.length - j;
                newstringArray[stringArray.length - j] = stringArray[j-1];
                anwer = String.valueOf(newstringArray);
            }
            answerList.add(anwer);
        }
        return answerList;
    }


    public static void main(String[] args) {

        Practice1d practice1d= new Practice1d();
        Scanner intput = new Scanner(System.in);
        String string1 = intput.next();
        int Number = Integer.parseInt(string1);
        List<String> stringList = new ArrayList<>();
        for (int i =0; i < Number; i++){
            String string2 = intput.next();
            stringList.add(string2);
        }
        List<String> anwserList = practice1d.solution(stringList);
        for (String x:anwserList ){
            System.out.println(x);
        }
    }
}
