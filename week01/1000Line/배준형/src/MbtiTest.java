import java.util.Scanner;

public class MbtiTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("--------------MBTI TEST--------------");
        System.out.println("");
        System.out.println("1. 검사 시작하기");
        System.out.println("2. mbti의 원리 알아보기");
        System.out.println("3. mbti 유형 알아보기");
        System.out.println("4. 주의 사항");
        System.out.println("5. 종료하기");
        System.out.println("");
        System.out.println("원하는 메뉴의 번호를 입력해주세요");

        int option = scanner.nextInt();

        if (option == 2) {
            System.out.println("");
            System.out.println("mbt1의 원리");
            System.out.println("");
            System.out.println("MBTI의 이론적 배경인 C.G.융의 성격 유형이론은 인간의 행동이 겉으론 예측하기 힘들어 보이지만 사실은 질서정연하고" +
                    " 일관적인 면이 있다는 점에 근거하고 있습니다.");
            System.out.println("여러 사람이 같은 외부 정보를 수집하고, 같은 정보에 근거해 판단을 하더라도, " +
                    "사람마다 그 결정과 행동이 다른 이유는 각 개인이 선호하는 방식이 근본적으로, 그리고 선천적으로 다르기 때문이라는 것이죠.");
            System.out.println("");
            System.out.println("MBTI는 각 개인이 선호하는 방식을 구분하는데 주목합니다. ");
            System.out.println("예를 들어, 한 사람은 쾌활하고 적극적인 행동 방식을 선호하는 반면, 다른 사람은 조용하고 조심스러운 행동 방식을 " +
                    "선호할 수 있습니다. ");
            System.out.println(" 이런 극단적인 성격 이분법을 만들어 놓고, '어느 편인가'를 구분하는 방식이죠.");
            System.out.println("");
            System.out.println("1. 검사 시작하기 ");
            System.out.println("2. 종료하기");

            int option1 = scanner.nextInt();

            if (option1 == 2) {
                System.out.println("검사를 종료합니다.");
                return;
            }
        }
        if (option == 3) {
            System.out.println("");
            System.out.println("mbti 유형");
            System.out.println("");
            System.out.println("- 외향-내향(E-I) 정신적 에너지의 방향성");
            System.out.println("외향형은 외부 세계에 더 주의를 기울이며, 사교적이고 활동적이다. 외부의 자극을 통해 배우는 방식을 추구한다.");
            System.out.println("그 반면 내향형은 자신의 내면에 더 집중하며 생각하고 이해를 온전히 한 후에 행동하는 경향이 있다.");
            System.out.println("");
            System.out.println("예: 나는 사람들과 함께 있으면 피곤해진다(내향 I) vs 나는 사람들과 함께 있어야 힘이 난다(외향 E)");
            System.out.println("");
            System.out.println("- 감각-직관(S-N) 정보 수집을 포함한 인식의 성향");
            System.out.println("감각형은 현재를 중심으로 감각적 경험을 통해 일어나는 것에 관심이 있다면, 직관형은 감각적인 정보를 넘어 주어진 ");
            System.out.println("정보들의 연결성에 따라 분류한 다음 새로운 의미를 부여해 자신이 경험하는 것을 재해석한다. ");
            System.out.println("");
            System.out.println("예: 만난 사람의 인상과 옷차림을 주로 기억한다(감각 S) vs 만난 사람의 성격과 취향을 주로 기억한다(직관 N)");
            System.out.println("");
            System.out.println("- 사고-감정(T-F) 수집한 정보를 토대로 판단하고 결정 내리는 성향");
            System.out.println("사고형인 사람들은 객관적인 사실에 주목해 분석적으로 판단하며, 원칙과 규범을 중시한다.");
            System.out.println("반면 감정형인 사람들은 인간적인 관계나 상황적인 특성을 고려해 판단하고 결정한다. ");
            System.out.println("");
            System.out.println("예: 옳고 그른 것을 먼저 따진다(사고 T) vs 좋고 싫은 것을 먼저 따진다(감정 F)");
            System.out.println("");
            System.out.println("- 판단-인식(J-P) 인식과 판단 기능을 바탕으로 실생활에 대처하는 방식");
            System.out.println("판단형은 빠르고 합리적이며 목적의식이 뚜렷한 데다 조직적이고 체계를 중요하게 여긴다. ");
            System.out.println("인식형의 사람들은 모험이나 변화를 선호하며, 사전에 계획을 세웠더라도 상황에 따라 유연하게 행동하는 경향이 있다.");
            System.out.println("");
            System.out.println("예: 언제나 계획을 먼저 세우는 편이다(판단 J) vs 언제나 계획 없이 하는 편이다(인식 P)");
            System.out.println("");
            System.out.println("1. 검사 시작하기 ");
            System.out.println("2. 종료하기");

            int option1 = scanner.nextInt();

            if (option1 == 2) {
                System.out.println("검사를 종료합니다.");
                return;
            }
        }

        if (option == 4) {
            System.out.println("");
            System.out.println("MBTI 테스트는 검사 자체에 여러 한계점이 있다. ");
            System.out.println("검사 결과를 보고 성격 유형을 구분하고 상대방의 성격을 단정 지어선 안 된다.");
            System.out.println("MBTI는 성격적인 특성을 이해하고 다른 사람과 소통하기 위한 도구로서 가볍게 활용할 수 있다는 점이 장점이다. ");
            System.out.println(" 하지만 일란성 쌍둥이조차 완전히 똑같이 생긴 사람은 없는 것처럼 개인의 성격은 모두 다르다. ");
            System.out.println("결과를 너무 맹신해 상대방에 대한 선입견을 갖거나 쉽게 판단하는 것은 바람직하지 못하다.");
            System.out.println("");
            System.out.println("1. 검사 시작하기 ");
            System.out.println("2. 종료하기");

            int option1 = scanner.nextInt();

            if (option1 == 2) {
                System.out.println("검사를 종료합니다.");
                return;
            }
        }
        if (option == 5) {
            System.out.println("검사를 종료합니다.");
            return;
        }

        System.out.println("");
        System.out.println("이 검사는 총 60개의 문항으로 구성되어 있습니다.");
        System.out.println("각 문항은 a.b의 두 가지 보기로 이루어져 있습니다.");
        System.out.println("너무 깊이 생각하거나 망설이지 말고 마음이 이끌리는 대로 체크해 나가면 됩니다.");
        System.out.println("보기가 두 가지 밖에 없으므로 당신에게 맞는 답이 둘 다 아닐 수도 있습니다.");
        System.out.println("그럴경우, 보다 가까운 쪽을 선택하면 됩니다.");
        System.out.println("");
        System.out.println("다음 문항을 읽고 당신에게 더 가깝게 느껴지는 것을 선택하세요.");
        System.out.println("**첫 번째라면 1번, 두 번째라면 2번 입력**");
        System.out.println("");

        // mbti 유형
        int e = 0;
        int i = 0;
        int s = 0;
        int n = 0;
        int t = 0;
        int f = 0;
        int j = 0;
        int p = 0;

        System.out.println("1. 내가 좋아하는 것은,");
        System.out.println("많은 사람들과의 넓은 사귐.");
        System.out.println("적은 친구들과의 깊은 사귐.");

        int input = scanner.nextInt();

        if (input == 1) {
            e += 1;
        }

        if (input == 2) {
            i += 1;
        }

        System.out.println("2. 내가 좋아하는 사람은,");
        System.out.println("성격이 활달하고 쉽게 접근할 수 있는 사람.");
        System.out.println("성격이 치밀하고 차분한 사람.");

        int input2 = scanner.nextInt();

        if (input2 == 1) {
            e += 1;
        }

        if (input2 == 2) {
            i += 1;
        }

        System.out.println("3. 나는 처음 만나는 사람을 대할 때,");
        System.out.println("먼저 말을 거는 편이다.");
        System.out.println("상대가 먼저 말을 걸어오는 편이다.");

        int input3 = scanner.nextInt();

        if (input3 == 1) {
            e += 1;
        }

        if (input3 == 2) {
            i += 1;
        }

        System.out.println("4. 전화가 울리면 나는,");
        System.out.println("내가 먼저 받는다.");
        System.out.println("다른 사람이 받기를 기대한다.");

        int input4 = scanner.nextInt();

        if (input4 == 1) {
            e += 1;
        }

        if (input4 == 2) {
            i += 1;
        }

        System.out.println("5. 나는 어떤 모임에 참석했을 때,");
        System.out.println("처음 만나는 사람에게 호기심이 있다.");
        System.out.println("이미 알고 있는 사람들과 어울린다.");

        int input5 = scanner.nextInt();

        if (input5 == 1) {
            e += 1;
        }

        if (input5 == 2) {
            i += 1;
        }

        System.out.println("6. 남들이 나를 생각할 때,");
        System.out.println("목소리가 크고 활달한 사람으로 알고 있다.");
        System.out.println("차분하고 절제하는 사람으로 알고 있다.");

        int input6 = scanner.nextInt();

        if (input6 == 1) {
            e += 1;
        }

        if (input6 == 2) {
            i += 1;
        }

        System.out.println("7. 나는 대게 남 앞에서,");
        System.out.println("말을 많이 하는 편이다.");
        System.out.println("필요한 말만 하는 편이다.");

        int input7 = scanner.nextInt();

        if (input7 == 1) {
            e += 1;
        }

        if (input7 == 2) {
            i += 1;
        }

        System.out.println("8. 나는 모임에 참석하여 주로,");
        System.out.println("점점 신이 나서 거의 끝까지 남는 편이다.");
        System.out.println("적당한 시간이 지나면 그만 끝냈으면 한다.");

        int input8 = scanner.nextInt();

        if (input8 == 1) {
            e += 1;
        }

        if (input8 == 2) {
            i += 1;
        }

        System.out.println("9. 나는 직장이나 단체에서,");
        System.out.println("대화를 주도한다.");
        System.out.println("남이 먼저 말을 하기를 기다린다.");

        int input9 = scanner.nextInt();

        if (input9 == 1) {
            e += 1;
        }

        if (input9 == 2) {
            i += 1;
        }

        System.out.println("10. 나는 주로,");
        System.out.println("말하면서 생각한다.");
        System.out.println("생각하고 나서 말한다.");

        int input10 = scanner.nextInt();

        if (input10 == 1) {
            e += 1;
        }

        if (input10 == 2) {
            i += 1;
        }

        System.out.println("11. 나는 대부분의 경우,");
        System.out.println("신중하기보다 활기에 넘친다.");
        System.out.println("활기에 넘치기 보다 신중하다.");

        int input11 = scanner.nextInt();

        if (input11 == 1) {
            e += 1;
        }

        if (input11 == 2) {
            i += 1;
        }

        System.out.println("12. 나는 남들과 연극을 함께 만든다면,");
        System.out.println("주인공이 되고 싶다.");
        System.out.println("연극을 위해 무대장치나 대본을 다듬는 일을 하고 싶다.");

        int input12 = scanner.nextInt();

        if (input12 == 1) {
            e += 1;
        }

        if (input12 == 2) {
            i += 1;
        }

        System.out.println("13. 나는 스트레스를 받았을 때,");
        System.out.println("친한 사람들과 만나 떠들며 놀고 싶어한다.");
        System.out.println("혼자서 좋아하는 것에 몰입한다.");

        int input13 = scanner.nextInt();

        if (input13 == 1) {
            e += 1;
        }

        if (input13 == 2) {
            i += 1;
        }

        System.out.println("14. 나는 남들과 대화할 때,");
        System.out.println("화제를 이것저것 바꾸며 말한다");
        System.out.println("한 번에 한 가지 주제로 말한다.");

        int input14 = scanner.nextInt();

        if (input14 == 1) {
            e += 1;
        }

        if (input14 == 2) {
            i += 1;
        }

        System.out.println("15. 내가 좋아하는 직업들은,");
        System.out.println("배우, 사회운동가, 대중연설가, 영업사원, 기업가, 경영자.");
        System.out.println("교육자, 건축가, 엔지니어, 예술가, 회계사, 연구원.");

        int input15 = scanner.nextInt();

        if (input15 == 1) {
            e += 1;
        }

        if (input15 == 2) {
            i += 1;
        }

        System.out.println("16. 나는 대개의 경우,");
        System.out.println("사색적이기보다 현실적이다.");
        System.out.println("현실적이기 보다는 사색적이다.");

        int input16 = scanner.nextInt();

        if (input16 == 1) {
            s += 1;
        }

        if (input16 == 2) {
            n += 1;
        }

        System.out.println("17. 내가 주로 좋아하는 사람은,");
        System.out.println("분별력이 있는 사람.");
        System.out.println("상상력이 풍부한 사람.");

        int input17 = scanner.nextInt();

        if (input17 == 1) {
            s += 1;
        }

        if (input17 == 2) {
            n += 1;
        }

        System.out.println("18. 나는 일상적인 일을 할 때,");
        System.out.println("일반적인 상식을 따른다.");
        System.out.println("나 자신의 방식대로 한다.");

        int input18 = scanner.nextInt();

        if (input18 == 1) {
            s += 1;
        }

        if (input18 == 2) {
            n += 1;
        }

        System.out.println("19. 나는 말할 때 주로,");
        System.out.println("눈에 보이는 대로 말한다.");
        System.out.println("머릿속에 연상되는 것을 말한다.");

        int input19 = scanner.nextInt();

        if (input19 == 1) {
            s += 1;
        }

        if (input19 == 2) {
            n += 1;
        }

        System.out.println("20. 일반적인 상식에 대해,");
        System.out.println("거의 의문을 갖지 않는다.");
        System.out.println("가끔 의문을 갖는다.");

        int input20 = scanner.nextInt();

        if (input20 == 1) {
            s += 1;
        }

        if (input20 == 2) {
            n += 1;
        }

        System.out.println("21. 나는 남을 볼 때,");
        System.out.println("그 사람의 유능한 점을 본다.");
        System.out.println("그 사람이 사물을 어떻게 보는가를 본다.");

        int input21 = scanner.nextInt();

        if (input21 == 1) {
            s += 1;
        }

        if (input21 == 2) {
            n += 1;
        }

        System.out.println("22. 나는 무엇을 결정할 때,");
        System.out.println("사실에 의해 판단한다.");
        System.out.println("원칙에 근거하여 판단한다.");

        int input22 = scanner.nextInt();

        if (input22 == 1) {
            s += 1;
        }

        if (input22 == 2) {
            n += 1;
        }

        System.out.println("23. 내가 좋아하는 것은,");
        System.out.println("독창적인 것보다 현실적인 것.");
        System.out.println("현실적인 것보다 독창적인 것.");

        int input23 = scanner.nextInt();

        if (input23 == 1) {
            s += 1;
        }

        if (input23 == 2) {
            n += 1;
        }

        System.out.println("24. 내가 좋아하는 글은,");
        System.out.println("전기나 다큐멘터리, 신문기사, 성공담.");
        System.out.println("소설이나 시, 수필");

        int input24 = scanner.nextInt();

        if (input24 == 1) {
            s += 1;
        }

        if (input24 == 2) {
            n += 1;
        }

        System.out.println("25. 나는 지금 이 시점에서,");
        System.out.println("과거의 일을 잘 떠올린다.");
        System.out.println("미래를 자주 생각한다.");

        int input25 = scanner.nextInt();

        if (input25 == 1) {
            s += 1;
        }

        if (input25 == 2) {
            n += 1;
        }

        System.out.println("26. 내가 사용하는 말은,");
        System.out.println("내 생각을 상대에게 전하기 위한 도구이다.");
        System.out.println("아름다움을 표현하기 위한 수단이다.");

        int input26 = scanner.nextInt();

        if (input26 == 1) {
            s += 1;
        }

        if (input26 == 2) {
            n += 1;
        }

        System.out.println("27. 탐스러운 귤을 바라볼때 먼저 떠오르는 생각은,");
        System.out.println("비타민이 많아 건강에 유익하고 맛있는 과일이다.");
        System.out.println("귤을 좋아하던 사람이나 처음 먹었을 떄를 떠올린다.");
        int input27 = scanner.nextInt();

        if (input27 == 1) {
            s += 1;
        }

        if (input27 == 2) {
            n += 1;
        }

        System.out.println("28. 나는 사람을 대할 때 주로,");
        System.out.println("그 사람의 외모나 말씨 등을 자세하게 본다.");
        System.out.println("그 사람이 가지고 있는 어떤 분위기나 특징을 본다.");

        int input28 = scanner.nextInt();

        if (input28 == 1) {
            s += 1;
        }

        if (input28 == 2) {
            n += 1;
        }

        System.out.println("29. 나 자신이 가치 있다고 느낄 때는,");
        System.out.println("현실에 대한 판단력과 감각이 뛰어난 것을 확인할 때");
        System.out.println("생생한 상상력과 감수성이 뛰어난 것을 확인할 때");

        int input29 = scanner.nextInt();

        if (input29 == 1) {
            s += 1;
        }

        if (input29 == 2) {
            n += 1;
        }

        System.out.println("30. 내가 주로 좋아하는 직업군은,");
        System.out.println("경영자, 은행가, 경찰, 행정가, 군인, 교사, 무역상");
        System.out.println("언론인, 디자이너, 학자, 철학자나 심리학자, 성직자.");

        int input30 = scanner.nextInt();

        if (input30 == 1) {
            s += 1;
        }

        if (input30 == 2) {
            n += 1;
        }

        System.out.println("31. 나는 어느 쪽에 더 영향을 받는가?");
        System.out.println("원칙, 법칙 등 정해진 규칙.");
        System.out.println("감정, 나의 판단과 느낌.");

        int input31 = scanner.nextInt();

        if (input31 == 1) {
            t += 1;
        }

        if (input31 == 2) {
            f += 1;
        }

        System.out.println("32. 남을 평가 하려면");
        System.out.println("많은 사람의 의견을 종합하는 것이 중요하다.");
        System.out.println("사람 보는 눈을 가진 몇몇 사람의 분석이 중요하다.");

        int input32 = scanner.nextInt();

        if (input32 == 1) {
            t += 1;
        }

        if (input32 == 2) {
            f += 1;
        }

        System.out.println("33. 나의 모습에 가까운 쪽은,");
        System.out.println("분석적인 머리의 소유자.");
        System.out.println("따뜻한 가슴의 소유자.");

        int input33 = scanner.nextInt();

        if (input33 == 1) {
            t += 1;
        }

        if (input33 == 2) {
            f += 1;
        }

        System.out.println("34. 어떤 결정을 내릴 때 대게 나는,");
        System.out.println("정해진 기준에 따른다.");
        System.out.println("나의 느낌과 판단에 따른다.");

        int input34 = scanner.nextInt();

        if (input34 == 1) {
            t += 1;
        }

        if (input34 == 2) {
            f += 1;
        }

        System.out.println("35. 나는 남을 많이 칭찬하는 편이다.");
        System.out.println("그렇지 않다.");
        System.out.println("그렇다.");

        int input35 = scanner.nextInt();

        if (input35 == 1) {
            t += 1;
        }

        if (input35 == 2) {
            f += 1;
        }

        System.out.println("36. 내가 더 좋아하는 TV프로는,");
        System.out.println("집, 토론, 논술 강의, 뉴스");
        System.out.println("영화, 자연의 신비를 다룬 기획물, 드라마.");

        int input36 = scanner.nextInt();

        if (input36 == 1) {
            t += 1;
        }

        if (input36 == 2) {
            f += 1;
        }

        System.out.println("37. 남들이 나를 보면,");
        System.out.println("관공서 등에 근무하는 사람으로 짐작한다");
        System.out.println("자유업에 종사하는 사람으로 짐작한다.");

        int input37 = scanner.nextInt();

        if (input37 == 1) {
            t += 1;
        }

        if (input37 == 2) {
            f += 1;
        }

        System.out.println("38. 내가 말하는 태도는 주로,");
        System.out.println("단정적으로 말한다.");
        System.out.println("결론을 쉽게 내리지 않는다.");

        int input38 = scanner.nextInt();

        if (input38 == 1) {
            t += 1;
        }

        if (input38 == 2) {
            f += 1;
        }

        System.out.println("39. 내가 생각하는 나의 첫인상은?");
        System.out.println("차가운 편이다.");
        System.out.println("따뜻한 편이다.");

        int input39 = scanner.nextInt();

        if (input39 == 1) {
            t += 1;
        }

        if (input39 == 2) {
            f += 1;
        }

        System.out.println("40. 나는 비교적,");
        System.out.println("이성적이다.");
        System.out.println("감성적이다.");

        int input40 = scanner.nextInt();

        if (input40 == 1) {
            t += 1;
        }

        if (input40 == 2) {
            f += 1;
        }

        System.out.println("41. 나는 일벌레처럼 일할 때가,");
        System.out.println("자주 있다.");
        System.out.println("거의 없다.");

        int input41 = scanner.nextInt();

        if (input41 == 1) {
            t += 1;
        }

        if (input41 == 2) {
            f += 1;
        }

        System.out.println("42. 남의 문제를 해결해 줄때, 흥미를 느끼는 쪽은");
        System.out.println("전기료의 부당한 청구를 해결해 줄 때.");
        System.out.println("어떤 선물을 고를까 하는 고민을 해결해 줄 때.");

        int input42 = scanner.nextInt();

        if (input42 == 1) {
            t += 1;
        }

        if (input42 == 2) {
            f += 1;
        }

        System.out.println("43. 영화를 본 후의 평가 방법은,");
        System.out.println("주제나 구성, 배우 등을 따져가며 분석한다.");
        System.out.println("재미있고 없고, 좋고 나쁘다는 식으로 말하다.");

        int input43 = scanner.nextInt();

        if (input43 == 1) {
            t += 1;
        }

        if (input43 == 2) {
            f += 1;
        }

        System.out.println("44. 나는 말을 할 때,");
        System.out.println("낱말의 선택이 중요하다고 생각한다.");
        System.out.println("내 뜻이 전달된다면 낱말은 그다지 중요하지 않다.");

        int input44 = scanner.nextInt();

        if (input44 == 1) {
            t += 1;
        }

        if (input44 == 2) {
            f += 1;
        }

        System.out.println("45. 내가 더 능력을 발휘하는 분위기는,");
        System.out.println("서로 선의의 경쟁을 하는 분위기.");
        System.out.println("서로 협력하여 무엇을 이루어 내려는 분위기.");

        int input45 = scanner.nextInt();

        if (input45 == 1) {
            t += 1;
        }

        if (input45 == 2) {
            f += 1;
        }

        System.out.println("46. 나의 일하는형태는,");
        System.out.println("미리미리 한다.");
        System.out.println("미루었다 마감 전에 한다.");

        int input46 = scanner.nextInt();

        if (input46 == 1) {
            j += 1;
        }

        if (input46 == 2) {
            p += 1;
        }

        System.out.println("47. 나는 비교적,");
        System.out.println("착실한 편이다.");
        System.out.println("여유가 있는 편이다.");

        int input47 = scanner.nextInt();

        if (input47 == 1) {
            j += 1;
        }

        if (input47 == 2) {
            p += 1;
        }

        System.out.println("48. 나의 생활은 주로,");
        System.out.println("일과표에 따라 움직인다.");
        System.out.println("자유롭게 하다가 미루기도 한다.");

        int input48 = scanner.nextInt();

        if (input48 == 1) {
            j += 1;
        }

        if (input48 == 2) {
            p += 1;
        }

        System.out.println("49. 내가 주로 많이 쓰는 단어는,");
        System.out.println("확실해요, 믿어줘요!");
        System.out.println("글쎄요, 좀더 지켜 봅시다.");

        int input49 = scanner.nextInt();

        if (input49 == 1) {
            j += 1;
        }

        if (input49 == 2) {
            p += 1;
        }

        System.out.println("50. 내 책상 주위는,");
        System.out.println("잘 정돈되어 있다.");
        System.out.println("물건들이 쌓여 있다.");

        int input50 = scanner.nextInt();

        if (input50 == 1) {
            j += 1;
        }

        if (input50 == 2) {
            p += 1;
        }

        System.out.println("51. 전통과 관습은,");
        System.out.println("중요하다.");
        System.out.println("벗어나야 한다.");

        int input51 = scanner.nextInt();

        if (input51 == 1) {
            j += 1;
        }

        if (input51 == 2) {
            p += 1;
        }

        System.out.println("나는 걸음걸이가,");
        System.out.println("빠른 편이다.");
        System.out.println("느린 편이다.");

        int input52 = scanner.nextInt();

        if (input52 == 1) {
            j += 1;
        }

        if (input52 == 2) {
            p += 1;
        }

        System.out.println("53. 규칙과 제도는,");
        System.out.println("조직이나 사회 질서를 위해 존중되어야 한다.");
        System.out.println("사람을 억압하고 불편하게 할 때가 많다.");

        int input53 = scanner.nextInt();

        if (input53 == 1) {
            j += 1;
        }

        if (input53 == 2) {
            p += 1;
        }

        System.out.println("54. 내가 좋아하는 옷차림은,");
        System.out.println("단정하고 깔끔한 복장.");
        System.out.println("조금 느슨하며 개성적인 복장");

        int input54 = scanner.nextInt();

        if (input54 == 1) {
            j += 1;
        }

        if (input54 == 2) {
            p += 1;
        }

        System.out.println("나는 대개,");
        System.out.println("진지하다.");
        System.out.println("쾌활하다.");

        int input55 = scanner.nextInt();

        if (input55 == 1) {
            j += 1;
        }

        if (input55 == 2) {
            p += 1;
        }

        System.out.println("56. 나는 일을 할 때,");
        System.out.println("목록을 작성하며 체크한다.");
        System.out.println("체크는 하지만 자유롭게 한다.");

        int input56 = scanner.nextInt();

        if (input56 == 1) {
            j += 1;
        }

        if (input56 == 2) {
            p += 1;
        }

        System.out.println("57. 티셔츠의 가장 윗단추는,");
        System.out.println("채우면 단정해서 좋다.");
        System.out.println("갑갑하게 느껴진다.");

        int input57 = scanner.nextInt();

        if (input57 == 1) {
            j += 1;
        }

        if (input57 == 2) {
            p += 1;
        }

        System.out.println("58. 정리가 안 된 방을 보면,");
        System.out.println("짜증날 때가 많다.");
        System.out.println("편하게 느껴질 때가 많다.");

        int input58 = scanner.nextInt();

        if (input58 == 1) {
            j += 1;
        }

        if (input58 == 2) {
            p += 1;
        }

        System.out.println("59. 나에게 어울리는 표현은,");
        System.out.println("전통주의자.");
        System.out.println("자유주의자.");

        int input59 = scanner.nextInt();

        if (input59 == 1) {
            j += 1;
        }

        if (input59 == 2) {
            p += 1;
        }

        System.out.println("60. 나는 주로,");
        System.out.println("책임을 맡아 관리하며 판단을 잘 내린다.");
        System.out.println("적응력은 있으나 우유부단한 편이다.");

        int input60 = scanner.nextInt();

        if (input60 == 1) {
            j += 1;
        }

        if (input60 == 2) {
            p += 1;
        }

        System.out.println("검사 결과: ");
        System.out.print("당신의 MBTI는 ");

        if (e < i) {
            System.out.print("I");
        }

        if (e > i) {
            System.out.print("E");
        }

        if (n < s) {
            System.out.print("S");
        }

        if (n > s) {
            System.out.print("N");
        }

        if (t < f) {
            System.out.print("F");
        }

        if (t > f) {
            System.out.print("T");
        }

        if (j < p) {
            System.out.print("P");
        }

        if (j > p) {
            System.out.print("J");
        }

        System.out.println("입니다.");
    }
}
