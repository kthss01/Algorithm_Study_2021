const name = '피보나치 수';

const category = '연습문제';

const content = `
피보나치 수는 F(0) = 0, F(1) = 1일 때,
1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2)가 적용되는 수임

ex)
    F(2) = F(0) + F(1) = 0 + 1 = 1
    F(3) = F(1) + F(2) = 1 + 1 = 2
    F(4) = F(2) + F(3) = 1 + 2 = 3
    ...

2 이상의 n이 입력되었을 때, 
n번째 피보나치수를 1234567으로 나눈 나머지를 리턴하는 함수 완성하기
`;

const limit = `
n은 1이상, 100000이하인 자연수
`;

const example = {
    header : ['n', 'return', 'solution'],
    body : {
        parameter : [[3],[5]],
        answer : [2,5]
    }
};

const {parameter, answer} = example.body;

const check = parameter.every((param, index) => {
    const sol = solution(...param);
    const ans = answer[index];

    // answer가 array인 경우 일일히 비교해야함
    if (typeof ans === Array) {
        return ans.every((ele, index) => {
            return ele === sol[index];
        });
    } 

    // answer가 값인 경우 그냥 answer와 비교
    return ans === sol;
})

const link = 'https://programmers.co.kr/learn/courses/30/lessons/12945';

const reference = `

`;

/////////////////////////////////////////////////////////////////////////

function solution(n) {
    let answer = 0;

    let fibo = [0,1,1];
    
    for (let i = 3; i <= n; i++) {
        fibo[i] = fibo[i-1] + fibo[i-2];
        fibo[i] %= 1234567;
    }

    answer = fibo[n];

    return answer;
}

export { name, category, content, limit, example, link, reference, check, solution }