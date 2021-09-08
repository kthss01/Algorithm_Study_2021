const name = '메뉴 리뉴얼';

const category = '2021 KAKAO BLIND RECRUITMENT';

const content = `
메뉴를 새로 구성하려고 함
기존에는 단품으로만 제공하던 메뉴를 조합해서 코스요리 혀앹로 재구성해서
새로운 메뉴를 제공하기로 결정했음
이전에 각 손님들이 주문할 때 가장 많이 함께 주문한 단품메뉴들을
코스요리 메뉴로 구성하기로 했음
단, 코스요리 메뉴는 최소 2가지 이상의 단품메뉴로 구성하려고 함
또한, 최소 2명 이상의 손님으로부터 주문된 단품메뉴 조합에 대해서만
코스요리 메뉴 후보에 포함하기로 했음

ex)
손님 6명이 주문한 단품메뉴들의 조합이 다음과 같다면,
(각 손님은 단품메뉴를 2개 이상 주문해야하며, 
각 단품메뉴는 A ~ Z의 알파벳 대문자로 표기)
손님번호    주문한 단품메뉴 조합
1           A, B, C, F, G
2           A, C
3           C, D, E
4           A, C, D, E
5           B, C, F, G
6           A, C, D, E, H

코스요리 메뉴 구성 후보
요리 2개 코스   A, C        : 1,2,4,6으로부터 총 4번 주문
요리 3개 코스   C, D, E     : 3,4,6으로부터 총 3번 주문
요리 4개 코스   B,C,F,G     : 1,5으로부터 총 2번 주문
요리 4개 코스   A,C,D,E     : 4,6으로부터 총 2번 주문

문제]
각 손님들이 주무난 단품메뉴들이 문자열 형식으로 담긴 배열 orders,
추가하고 싶어하는 코스요리를 구성하는 단품메뉴들의 갯수가 담긴 배열 course
가 매개변수로 주어질 때, 새로 추가하게 될 코스요리의 메뉴 구성을
문자열 형태로 배열에 담아 return 하도록 함수 구현
`;

const limit = `
orders 배열의 크기는 2 이상 20 이하
orders 배열의 각 원소는 크기 2 이상 10 이하인 문자열
    각 문자열은 알파벳 대문자로만 이루어져 있음
    각 문자열에는 같은 알파벳이 중복해서 들어있지 않음
course 배열의 크기는 1 이상 10 이하
    course 배열의 각 원소는 2 이상 10 이하인 자연수가 오름차순으로 정렬
    course 배열에는 같은 값이 중복해서 들어있지 않음
정답은 각 코스요리 메뉴의 구성을 문자열 형식으로 배열에 담아 
사전순으로 오름차순 정렬해서 return 해야함
    배열의 각 원소에 저장된 문자열 또한 알파벳 오름차순으로 정렬되어야 함
    만약 가장 많이 함께 주문된 메뉴 구성이 여러 개면, 모두 배열에 담아 return
    orders와 course 매개변수는 return 하는 배열의 길이가 1 이상이 되도록 주어짐
`;

const example = {
    header : ['orders', 'course', 'result', 'solution'],
    body : {
        // parameter 여러개인 경우 대비해서 []로 묶은거
        // parameter 한개가 배열인경우 [[[]]] 이렇게 써야함 n_lcm 문제 참ㄱ
        parameter : [
            // 예제1
            [
                // 파라미터 여러개면 ,로 구분
                ["ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"],
                [2,3,4]
            ],
            // 예제2
            [
                ["ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"],
                [2,3,5]
            ],
            [
                ["XYZ", "XWY", "WXA"],
                [2,3,4]
            ]
        ], 
        answer : [
            // 각 예제에 대한 정답 ,로 구분
            ["AC", "ACDE", "BCFG", "CDE"],
            ["ACD", "AD", "ADE", "CD", "XYZ"],
            ["WX", "XY"]
        ]
    }
};

const {parameter, answer} = example.body;

const check = parameter.every((param, index) => {
    const sol = solution(...param);
    const ans = answer[index];

    // answer가 array인 경우 일일히 비교해야함
    if (Array.isArray(ans)) {
        return ans.every((ele, index) => {
            // 2차원 배열인 경우 처리
            if (Array.isArray(ele)) {
                return ele.every((ele2, index2) => {
                    return ele2 === sol[index][index2];
                })
            }
            return ele === sol[index];
        });
    } 

    // answer가 값인 경우 그냥 answer와 비교
    return ans === sol;
})

const link = 'https://programmers.co.kr/learn/courses/30/lessons/72411';

const reference = `

`;

///////////////////////////////////////////////////////////////////


function solution(orders, course) {
    let answer = [];

    let menuCnt = {};
    orders.forEach((order) => {
        order.split('').forEach((e) => {
            if (menuCnt.hasOwnProperty(e)) {
                menuCnt[e] += 1;
            } else {
                menuCnt[e] = 1;
            }
        });
    });

    //console.log(menuCnt);
    console.log(Object.keys(menuCnt).sort((a, b) => {
        return menuCnt[b] - menuCnt[a];
    }));

    return answer;
}

export { name, category, content, limit, example, link, reference, check, solution }