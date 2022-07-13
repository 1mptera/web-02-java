import java.util.Scanner;

public class MegapteraGuide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------메가테라 가이드-------------");
        System.out.println("메가테라 학습 시 필요한 내용과 가이드를 확인하세요.\n");
        System.out.println("목차");
        System.out.println("1. 메가테라 이용 가이드");
        System.out.println("2. 학습 가이드");

        int option = scanner.nextInt();

        //메가테라 이용가이드
        if (option == 1) {

            System.out.println("\n1. 메가테라 규칙");
            System.out.println("2. 메가테라 사용설명서");
            System.out.println("3. 메가테라 주간 시간표");
            System.out.println("4. 메가테라 주차별 계획표");

            int option1 = scanner.nextInt();

            //메가테라 이용가이드/메가테라 규칙
            if (option1 == 1) {

                System.out.println("\n1. 교육규칙");
                System.out.println("2. Code Of Conduct");

                int option2 = scanner.nextInt();

                //메가테라 이용가이드/메가테라 규칙/교육규칙
                if (option2 == 1) {

                    System.out.println("\n1. 지각");
                    System.out.println("2. 결석");
                    System.out.println("3. 과제");

                    int option3 = scanner.nextInt();

                    //메가테라 이용가이드/메가테라 규칙/교육규칙/지각
                    if (option3 == 1) {

                        System.out.println("\n1. 정규 프로그램 시작 시간(09:00AM) 이후 10분을 기준으로 확인합니다.");
                        System.out.println("\n2. 지각이 3번 누적될 시, 과제 제출 및 성실도를 종합적으로 고려하여 " +
                                "\n1:1 상담을 진행할 수 있고, 코스 이월 여부를 논의하게 됩니다.");
                        System.out.println("\n3. 출석 누락 또한 지각으로 처리됩니다.");
                    }

                    //메가테라 이용가이드/메가테라 규칙/교육규칙/결석
                    if (option3 == 2) {

                        System.out.println("\n- 시작 전, 수강에 제한이 되는 개인 사정이 없는지에 대해 확인 및 동의를 받습니다. ");
                        System.out.println("  - 수강 제한 사유란 코스 일정을 불참할 수 밖에 없는 부득이한 사유 입니다. 가족 여행 등은 부득이한 사유로 인정되지 않습니다.");
                        System.out.println("  - 수강 제한 사유를 입증 할 수 있는 진단서 및 확인 자료의 제출을 요구 받을 수 있습니다.");
                        System.out.println("- 정당한 결석사유를 미리 공유한 경우, 별도의 패널티는 없습니다. ");
                        System.out.println("- 불참 사유를 전달하는 경우 불참하는 시간과 복귀하는 시간을 디스코드 출석체크 채널에 명확하게 설명해야 합니다. ");
                        System.out.println("- 결석으로 학습 세션을 참여하지 못 한 경우에 녹화 영상은 별도로 제공되지 않습니다.");
                        System.out.println("- 본 과정은 하루에도 소화하는 자료가 많기 때문에 하루 이상 결석이나 지각이라도 참여자의 성취도에 큰 타격이 될 수 있습니다.");
                        System.out.println("- 3일 이상 결석 시, 과정에의 참여가 배제될 수 있습니다. ");

                        System.out.println("***");
                        System.out.println("무단 결석이 발생한 경우, 그 코스 하차를 고려하는 1:1 상담을 진행합니다.");
                        System.out.println("무단 결석 이후 연락 두절시, 하차 절차를 진행합니다.");
                        System.out.println("긴급한 상황으로 인해 사전에 전달할 수 없었던 상황이 공유되면, 내부적으로 검토 후 정상참작 될 수 있습니다.");

                    }

                    //메가테라 이용가이드/메가테라 규칙/교육규칙/과제
                    if (option3 == 3) {

                        System.out.println("\n- 한 달 내 기준 과제의 미제출이 발생한 경우, 다음 코스로 넘어갈 수 없고 코스 이월 여부를 논의하게 됩니다.");
                        System.out.println("  - 횟수와 코드를 고려하여 불성실한 제출은 제출 누락으로 간주합니다 ");
                        System.out.println("- 모든 과제는 매일 정해진 분량을 당일 자정 12시까지 제출하는 일정이 기준입니다. ");
                        System.out.println("완료하지 못한 과제의 경우 정규시간 이후의 시간과 주말을 이용해서 과제의 부족한 부분을 완성해서 추가적으로 제출해야 합니다.");
                        System.out.println("- 본 과정 중 코딩도장은 주기적으로 푸는 알고리즘 문제로, 취업 준비 시 빠질 수 없는 매우 중요한 연습입니다.");
                        System.out.println("‘과정'의 각 섹션 동안 계획된 코딩도장 문제 답안을 5회 이상 제출하지 않는 경우 상담을 통해 코스 이월 여부가 결정됩니다.");
                    }

                }

                //메가테라 이용가이드/메가테라 규칙/Code Of Conduct
                if (option2 == 2) {

                    System.out.println("\n***");
                    System.out.println("권리 침해 없는 행사를 위하여 타인에게 불쾌감을 줄 수 있는 성 정체성, 성적 취향,");
                    System.out.println(" 장애, 외모, 민족, 국적, 인종, 나이, 정치, 종교 등에 대한 발언은 금지합니다.");
                    System.out.println("행동강령은 메가테라 트레이닝 프로그램에 참여하는 모든 개인에게 해당하며 위반 시 퇴장 등의 제재를 받을 수 있습니다.");
                    System.out.println("행동강령 위반 사례에 대한 내용은 공개될 수 있습니다.");
                    System.out.println("***");

                    System.out.println("1. 사려 깊게 행동해주세요. 우리는 모두 같은 공동체의 구성원입니다. ");
                    System.out.println(" 그러므로 다른 사람들에게 친절하게 그리고 따뜻하게 맞이하는 좋은 사람이 되어주세요. ");
                    System.out.println(" 다른 사람이 함께하고 싶어 하는 사람이 되어주세요.");

                    System.out.println("2. 서로를 존중해 주세요. 활발한 토론은 건강한 커뮤니티 생태계에 도움이 되지만, 비판이 아닌 비난은 해가 됩니다.");
                    System.out.println(" 의견을 공감하려 노력하고, 갈등을 녹여가며 함께해주세요. 서로를 이해하기 위해 노력해주세요.");

                    System.out.println("3. 말과 행동에 책임감을 보여주세요. 우리는 공동체의 구성원으로서 하는 말과 행동에 대해 책임이 있습니다. ");
                    System.out.println(" 그로 인해 문제가 발생한다면 바로잡아야 합니다. 어떠한 경우라도 말과 행동으로 인해 타인이 불쾌감을 느꼈다면 문제에 해당됩니다.");

                    System.out.println("4. 적극적으로 참여해주세요. 적극적인 참여는 서로의 거리를 줄이고 보다 큰 가치를 만들어 냅니다.");
                    System.out.println(" 적극적으로 참여하며 조화롭게 어울려주세요.");

                    System.out.println("5. 자유롭게 도움을 구하세요. 곤란한 상황을 마주쳤다면 주위에 도움을 요청하세요.");
                    System.out.println(" 그리고 도움을 요청받았다면 주저하지 말고 도와주세요.");

                    System.out.println("\n건강한 공동체를 위해 구성원들은 위 행동강령을 준수하고, 주의 받은 구성원은 즉시 행동강령을 준수할 것을 요구합니다. ");
                    System.out.println("모든 구성원은 자신이나 다른 사람이 불편을 느끼게 하는 행동을 보았을 때 운영진을 찾거나 운영진의 DM으로 보내서 알려야 합니다. ");
                    System.out.println("운영진은 이를 인지했을 때 즉시 행동을 취해야 합니다.");
                    System.out.println("운영진은 참가자에게 흔쾌히 도움을 주어야 하며 참가자의 안전을 지키기 위한 노력을 해야합니다. ");
                    System.out.println("그 노력에는 참가자 보호, 경찰/사법기관으로의 연락을 포함합니다.");

                }
            }
            //메가테라 이용가이드/메가테라 사용설명서
            if (option1 == 2) {

                System.out.println("\n1. ZEP");
                System.out.println("2. 디스코드");

                int option2 = scanner.nextInt();

                //메가테라 이용가이드/메가테라 사용설명서/ZEP
                if (option2 == 1) {

                    System.out.println("\n메가테라는 한국인 맞춤 메타버스 플랫폼인 Zep을 통해 폭풍 몰입과 밀착 케어를 진행합니다.");

                    System.out.println("\n1. ZEP 사용규칙");

                    int option3 = scanner.nextInt();

                    //메가테라 이용가이드/메가테라 사용설명서/ZEP/사용규칙
                    if (option3 == 1){

                        System.out.println("\nZEP 사용자명은  이름 형식을 지켜주세요. ");
                    }

                }
                //메가테라 이용가이드/메가테라 사용설명서/디스코드
            }
            //메가테라 이용가이드/메가테라 주간 시간표
            //메가테라 이용가이드/메가테라 주차별 계획표

        }

        //학습 가이드
        if (option == 2) {

            System.out.println("\n1. 주말 학습 가이드");
            System.out.println("2. 주간 학습 가이드");
            System.out.println("3. 과제 제출 가이드");
            System.out.println("4. TIL 가이드");
            System.out.println("5. 짝 프로그래밍가이드");
            System.out.println("6. 코드 작성 체크리스트");

            int option1 = scanner.nextInt();

            //학습 가이드/주말

            if (option1 == 1){

                System.out.println("\n주말 학습은 아래와 같은 네가지 순서로 진행해야 합니다.\n");

                System.out.println("1. 강의 시청 & 강의 정리");
                System.out.println("2. 코드작성");
                System.out.println("3. 개념노트 작성");
                System.out.println("4. TIL 작성");

                int option2 = scanner.nextInt();

                //학습 가이드/주말/강의 시청

                //학습 가이드/주말/코드 작성

                //학습 가이드/주말/개념노트 작성

                //학습 가이드/주말/TIL 작성

            }
            //학습 가이드/주간

            if (option1 == 2){

                System.out.println("1. 코딩 도장");
                System.out.println("2. 반복 과제 -인출 학습");
                System.out.println("3. 퀘스트");
                System.out.println("4. TIL");
                System.out.println("5. 주간 회고글 작성");

                int option2 = scanner.nextInt();

                //학습 가이드/주간/코딩도장

                //학습 가이드/주간/반복 과제

                //학습 가이드/주간/퀘스트

                //학습 가이드/주간/TIL

                //학습 가이드/주간/주간 회고글 작성

            }

        }

    }
}
