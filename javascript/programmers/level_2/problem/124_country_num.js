const name = '124 나라의 숫자';

const category = '연습문제';

const content = `
124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현

124 나라에는 자연수만 존재
모든 수를 표현할 때 1, 2, 4 만 사용

10진법 124나라  3진법 
1       1       0       
2       2       1       
3       4       2      
4       11      10      
5       12      11      
6       14      12      
7       21      20      
8       22      21        
9       24      22     
10      41      100     

자연수 n이 매개변수로 주어질 때, 
n을 124 나라에서 사용하는 숫자로 바꾼 값 return 하는 함수 완성
`;

const limit = `
n은 500,000,000 이하의 자연수
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
                1
            ],
            // 예제2
            [
                2
            ],
            [
                3
            ],
            [
                4
            ],
        ], 
        answer : [
            // 각 예제에 대한 정답 ,로 구분
            '1', '2', '4', '11'
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

const link = 'https://programmers.co.kr/learn/courses/30/lessons/12899';

const reference = `
<a href='https://velog.io/@juni416/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-124%EB%82%98%EB%9D%BC%EC%9D%98-%EC%88%AB%EC%9E%90' target="_blank">풀이</a>

3진법과 124나라의 공통점과 차이점

공통점 : 3가지 수를 사용
    3진법 -> 1,2,0
    124나라 -> 1,2,4

차이점 :
    3진법은 3을 표현하기 위해서 0 사용
    124나라는 4를 사용
    3진법은 3을 표현할 시 0 혼자 등장하지 못함
    앞에 1이 들어가서 10 으로 표기되어야함

`;

///////////////////////////////////////////////////////////////////

function change124(n) {
    // 나머지가 1이나 2일 때 n-1로 해도 결과 차이가 없어서 한 코드로 통일한 거
    return n === 0 ? '' : change124(parseInt((n - 1) / 3)) + [1, 2, 4][(n - 1) % 3];
}

function solution(n) {
    // let answer = [];

    // let tmp = n;

    // while (tmp !== 0) {

    //     if (tmp % 3 === 0) {
    //         answer.unshift("4");
    //         tmp--;
    //     } else {
    //         answer.unshift((tmp%3).toString());
    //     }

    //     tmp = Math.floor(tmp / 3);
    // }

    // return answer.join('');

    return change124(n);
}

export { name, category, content, limit, example, link, reference, check, solution }