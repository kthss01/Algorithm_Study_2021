const name = '최소값 만들기';

const category = '연습문제';

const content = `
길이가 같은 배열 A, B 두 개가 있음, 각 배열은 자연수로 이루어져 있음
배열 A, B에서 각각 한 개의 숫자를 뽑아 두 수를 곱함
이러한 과정을 배열의 길이만큼 반복하며, 두 수를 곱한 값을 누적하여 더함
이때 최종적으로 누적된 값이 최소가 되도록 만드는 것이 목표
(단, 각 배열에서 k번째 숫자를 뽑았다면 다음에 k번째 숫자는 다시 뽑을 수 없음)

ex) A = [1, 4, 2], B = [5, 4, 4]
    A 1 B 5 -> 0 + 5(1x5) = 5
    A 4 B 4 -> 5 + 16(4x4) = 21
    A 2 B 4 -> 21 + 8(2x4) = 29
이 경우가 최소가 되므로 29 return

배열 A, B가 주어질 때 최종적으로 누적된 최솟값 return하는 solution 함수
`;

const limit = `
배열 A, B의 크기 : 1,000 이하의 자연수
배열 A, B의 원소의 크기: 1,000이하의 자연수
`;

const example = {
    header : ['A', 'B', 'answer', 'solution'],
    body : {
        // parameter 여러개인 경우 대비해서 []로 묶은거
        // parameter 한개가 배열인경우 [[[]]] 이렇게 써야함 n_lcm 문제 참ㄱ
        parameter : [
            // 예제1
            [
                // 파라미터 여러개면 ,로 구분
                [1, 4, 2], [5, 4, 4]
            ],
            // 예제2
            [
                [1,2], [3,4]
            ]
        ], 
        answer : [
            // 각 예제에 대한 정답 ,로 구분
            29, 10
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

const link = 'https://programmers.co.kr/learn/courses/30/lessons/12941';

const reference = `

`;

///////////////////////////////////////////////////////////////////


function solution(A, B) {
    let answer = 0;

    A.sort((a, b) => a - b);
    B.sort((a, b) => b - a);

    answer = A.reduce((sum, ele, index) => sum + ele * B[index], 0);

    return answer;
}

export { name, category, content, limit, example, link, reference, check, solution }