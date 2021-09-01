const name = '올바른 괄호';

const category = '연습문제';

const content = `
괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 
반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 

ex)
    "()()" 또는 "(())()"는 올바른 괄호
    ")()(" 또는 "(()("는 올바르지 않은 괄호임

'(' 또는 ')'로만 이루어진 문자열 s가 주어졌을 때,
문자열 s가 올바른 괄호이면 true를 return하고, 
올바르지 않은 괄호이면 false를 return하는 solution 함수 구현
`;

const limit = `
문자열 s의 길이 : 100,000 이하의 자연수
문자열 s는 '(' 또는 ')'로만 이루어져 있음
`;

const example = {
    header : ['s', 'answer', 'solution'],
    body : {
        // parameter 여러개인 경우 대비해서 []로 묶은거
        // parameter 한개가 배열인경우 [[[]]] 이렇게 써야함 n_lcm 문제 참ㄱ
        parameter : [
            // 예제1
            [
                // 파라미터 여러개면 ,로 구분
                "()()"
            ],
            // 예제2
            [
                "(())()"
            ],
            [
                ")()("
            ],
            [
                "(()("
            ],
        ], 
        answer : [
            // 각 예제에 대한 정답 ,로 구분
            true, true, false, false
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

const link = 'https://programmers.co.kr/learn/courses/30/lessons/12909';

const reference = `

`;

///////////////////////////////////////////////////////////////////


function solution(s) {
    let answer = true;

    // 이전 문제는 문자열이 '(' or ')' 로만 이루어진게 아니었나봄
    // 이때는 
    // s = s.match(/(\(|\))/g); // match로 ( ) 이것만 찾은 후에 아래 진행해주면 될 거 가음

    let stack = [];

    s.split('').forEach(ele => {
        if (ele === '(') {
            stack.push(ele);
        } else if (ele === ')') {
            if (stack.length === 0 || stack[stack.length-1] !== '(') {
                answer = false;
                return false;
            } else {
                stack.pop();
            }
        }
    });

    if (stack.length !== 0) {
        answer = false;
    }

    return answer;
}

export { name, category, content, limit, example, link, reference, check, solution }