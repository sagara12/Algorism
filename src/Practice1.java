
       /* 설명
        한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.

        대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.


        입력
        첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.*/


       import java.util.Scanner;
       public class Practice1 {

        public int  solution(String stringA, char char1){
        int answer = 0;
        String stringArray = "";
        char bigChar = ' ';
        char smallChar = ' ';
        char[] charArr = stringA.toCharArray();

        bigChar = Character.toUpperCase(char1);
        smallChar = Character.toLowerCase(char1);


        int charArrsize = charArr.length;

        for (int i = 0; i < charArrsize; i++) {
            if (charArr[i] == bigChar || charArr[i] == smallChar) {
                answer++;
            }
        }
        return answer;
        }


        public static void main(String[] args) {

            Practice1 practice1 = new Practice1();
            System.out.println("문자열을 입력해 주세요");
            Scanner intput = new Scanner(System.in);
            String string1 = intput.next();
            System.out.println("문자를 입력해 주세요");
            //String string2 = intput.next();
            char char1 = intput.next().charAt(0);
            int anwser = practice1.solution(string1,char1);
            System.out.println("문자열에 있는 문자는 총 " + anwser+" 개 입니다");
        }
       }

