const name = '숫자의 표현';

const category = '연습문제';

const content = `
자연수 n을 연속한 자연수들로 표현하는 방법은 여러 개

ex) 15
1 + 2 + 3 + 4 + 5 = 15
4 + 5 + 6 = 15
7 + 8 = 15
15 = 15

자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 
n을 표현하는 방법의 수 return
`;

const limit = `
n은 10,000 이하의 자연수
`;

const example = {
    header : ['n', 'result', 'solution'],
    body : {
        // parameter 여러개인 경우 대비해서 []로 묶은거
        // parameter 한개가 배열인경우 [[[]]] 이렇게 써야함 n_lcm 문제 참ㄱ
        parameter : [
            // 예제1
            [
                // 파라미터 여러개면 ,로 구분
                15
            ],
        ], 
        answer : [
            // 각 예제에 대한 정답 ,로 구분
            4
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

const link = 'https://programmers.co.kr/learn/courses/30/lessons/12924';

const reference = `
홀수인 약수의 개수를 구하면됨
홀수 -> 약수는 홀수만 나옴 
ex) 15 1,3,5,15
    3 중간값 1 + 2 + 3 + 4 + 5
    5 중간값 4 + 5 + 6
    15 연속된수 (7,8)  7 + 8
    1 하나 15
이게 짝수일땐 연장한거랑 같음
ex) 30 약수 1,2,3,5,6,10,15,30
30 = (4 + 5 + 6 + 7 + 8) (중간값 3의 연장)
30 = (9 + 10 + 11) (중간값 5의 연장)
30 = (6 + 7 + 8 + 9) (연속된 두 수의 연장)
30 = 30 

결과적으로 n의 홀수 약수 개수만 구해도 답이 나옴
`;

///////////////////////////////////////////////////////////////////

// 규칙
// 1 2 3 5 7 9 순으로 연속이 됨
// 가운데 숫자 기준으로 - + 형식으로 생김
// 짝수는 무조건 1임 -> 아님 10 : 1 2 3 4
// 일단 풀었는데 해답이 조금 헷갈림
/*
    홀수인 약수의 개수를 구하면됨
    홀수 -> 약수는 홀수만 나옴 
    ex) 15 1,3,5,15
        3 중간값 1 + 2 + 3 + 4 + 5
        5 중간값 4 + 5 + 6
        15 연속된수 (7,8)  7 + 8
        1 하나 15
    이게 짝수일땐 연장한거랑 같음
    ex) 30 약수 1,2,3,5,6,10,15,30
    30 = (4 + 5 + 6 + 7 + 8) (중간값 3의 연장)
    30 = (9 + 10 + 11) (중간값 5의 연장)
    30 = (6 + 7 + 8 + 9) (연속된 두 수의 연장)
    30 = 30 

    결과적으로 n의 홀수 약수 개수만 구해도 답이 나옴
*/

function solution(n) {
    let answer = 0;

    // for (let i = 1; i <= n / 2; i++) {
    //     let temp = 0;
    //     for (let j = i; j <= n; j++) {
    //         temp += j;
    //         if (temp == n) {
    //             answer++;
    //             break;
    //         } else if (temp > n) {
    //             break;
    //         }
    //     }
    // }

    for (let i = 1; i <= n; i++) {
        if (n % i === 0 && i % 2 === 1) {
            answer++;
        }
    }

    return answer;
}

export { name, category, content, limit, example, link, reference, check, solution }