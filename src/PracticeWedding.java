/*3. 결혼식
        설명

        현수는 다음 달에 결혼을 합니다.

        현수는 결혼식 피로연을 장소를 빌려 3일간 쉬지 않고 하려고 합니다.

        피로연에 참석하는 친구들 N명의 참석하는 시간정보를 현수는 친구들에게 미리 요구했습니다.

        각 친구들은 자신이 몇 시에 도착해서 몇 시에 떠날 것인지 현수에게 알려주었습니다.

        현수는 이 정보를 바탕으로 피로연 장소에 동시에 존재하는 최대 인원수를 구하여 그 인원을 수용할 수 있는 장소를 빌리려고 합니다. 여러분이 현수를 도와주세요.

        만약 한 친구가 오는 시간 13, 가는시간 15라면 이 친구는 13시 정각에 피로연 장에 존재하는 것이고 15시 정각에는 존재하지 않는다고 가정합니다.


        입력
        첫째 줄에 피로연에 참석할 인원수 N(5<=N<=100,000)이 주어집니다.

        두 번째 줄부터 N줄에 걸쳐 각 인원의 오는 시간과 가는 시간이 주어집니다.

        시간은 첫날 0시를 0으로 해서 마지막날 밤 12시를 72로 하는 타임라인으로 오는 시간과 가는 시간이 음이 아닌 정수로 표현됩니다.


        출력

        5
        14 18
        12 15
        15 20
        20 30
        5 14

        결과
        2*/

import java.util.*;

public class PracticeWedding {
    public int  solution(int number, List<List<String>> time){
        int answer = Integer.MIN_VALUE;

        for (int i =0 ; i < time.size()-1; i++){

            for (int j = 0 ; j < time.size()-1-i; j++){
                List<String> schdule = time.get(j);
                //시간 가져오기
                String strTime = schdule.get(0);
                //변환
                int intTime = Integer.parseInt(strTime);
                //state 가져오기
                String state = schdule.get(1);
                List<String> schdule2 = time.get(j+1);
                //시간 가져오기
                String strTime2 = schdule2.get(0);
                //변환
                int intTime2 = Integer.parseInt(strTime2);
                //state 가져오기
                String state2 = schdule2.get(1);
                if (intTime > intTime2){
                    List<String>temp = new ArrayList<>();
                    temp = time.get(j);
                    time.set(j,time.get(j+1));
                    time.set(j+1,temp);

                }else if (intTime == intTime2){

                    if (state.equals("s")&&state2.equals("e")){
                        List<String>temp2 = new ArrayList<>();
                        temp2 = time.get(j+1);
                        time.set(j+1,time.get(j));
                        time.set(j,temp2);
                    }

                }else{
                    continue;
                }
            }

        }

        //e와 s 판별
        for (int z=0; z<number; z++){
            int cnt = 0;
            List<String> schdule = time.get(z);
            String state = schdule.get(1);
            if (state.equals("s")){
                cnt++;

            }else {
                cnt--;
            }
            answer = Math.max(answer,cnt);
        }
        return answer;

    }


    public static void main(String[] args) {

        PracticeWedding practice1 = new PracticeWedding();
        System.out.println("결혼식에 참석할 인원 수를 입력해주세요");
        Scanner intput = new Scanner(System.in);
        String peoplNumber = intput.next();
        List<List<String>>totalTimeArray = new ArrayList<>();
        int number = Integer.parseInt(peoplNumber);
        for (int i = 0; i < number; i++ ){

            System.out.println(i+"번째 돌아가는 친구의 시간을 입력하시오");
            Scanner scanner = new Scanner(System.in);
            String totalTime = scanner.nextLine();
            String[] array = totalTime.split(" ");
            String startTime = array[0];
            String endTime = array[1];
            List<String> manScheduleS = new ArrayList<>();
            manScheduleS.add(startTime);
            manScheduleS.add("s");
            totalTimeArray.add(manScheduleS);
            List<String> manScheduleE = new ArrayList<>();
            manScheduleE.add(endTime);
            manScheduleE.add("e");
            totalTimeArray.add(manScheduleE);
        }
        int Number = practice1.solution(number,totalTimeArray);
        System.out.println("Number = " + Number);
    }

}
