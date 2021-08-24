const name = 'N개의 최소공배수';

const category = '연습문제';

const content = `
두 수의 최소공배수 (Least Common Multiple)란
입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미함
ea)
2, 7 최소공배수 14

n개의 수의 최소공배수는 
n개의 수들의 배수 중 공통이 되는 가장 작은 숫자

n개의 숫자를 담은 배열 arr이 입력 되었을 때
이 수들의 최소공배수를 반환하는 함수, solution 완성
`;

const limit = `
arr은 길이 1이상, 15이하인 배열
arr의 원소는 100 이하인 자연수
`;

const example = {
    header : ['arr', 'result', 'solution'],
    body : {
        parameter : [
            [[2,6,8,14]],[[1,2,3]]
        ],
        answer : [168,6]
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

const link = 'https://programmers.co.kr/learn/courses/30/lessons/12953?language=javascript';

const reference = `

`;

///////////////////////////////////////////////////////////////////////////////////////

// function gcd(a, b) {
//     if (a < b) {
//         [a, b] = [b, a]; // 구조 분해 이용 swap 
//     }

//     while (b != 0) {
//         const temp = a % b;
//         a = b
//         b = temp;
//     }

//     return a;
// }

function gcd(a, b) {
    return a % b ? gcd(b, a%b) : b;
}

function lcm(a, b) {
    return (a * b) / gcd(a, b);
}

function solution(arr) {
    let answer = arr.reduce((sum, ele) => lcm(sum, ele));

    return answer;
}

export { name, category, content, limit, example, link, reference, check, solution }