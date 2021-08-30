const name = '다음 큰 숫자';

const category = '연습문제';

const content = `
자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의

- 조건 1. n의 다음 큰 숫자는 n보다 큰 자연수
- 조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같음
- 조건 3. n의 다음 큰 숫자는 조건1, 2를 만족하는 수 중 가장 작은 수

ex) 78 (100011110) 의 다음 큰 숫자 83 (1010011)

자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자 return하는 함수 구현
`;

const limit = `
n은 1,000,000 이하의 자연수
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
                78
            ],
            // 예제2
            [
                15
            ]
        ], 
        answer : [
            // 각 예제에 대한 정답 ,로 구분
            83,23
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

const link = 'https://programmers.co.kr/learn/courses/30/lessons/12911';

const reference = `

`;

///////////////////////////////////////////////////////////////////


function solution(n) {
    let answer = 0;

    // for (let i = n + 1; ; i++) {
    //     const nCnt = n.toString(2).split('').filter(ele => ele === '1').length;

    //     const iCnt = i.toString(2).split('').filter(ele => ele === '1').length;

    //     if (nCnt === iCnt) {
    //         answer = i;
    //         break;
    //     }
    // }

    const nCnt = n.toString(2).match(/1/g).length;

    for (let i = n + 1; ; i++) {
        if (nCnt === i.toString(2).match(/1/g).length) {
            answer = i;
            break;
        }
    }

    return answer;
}

export { name, category, content, limit, example, link, reference, check, solution }