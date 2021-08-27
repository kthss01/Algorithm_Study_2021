const name = '최대값과 최소값';

const category = '연습문제';

const content = `
문자열 s에 공백으로 구분된 숫자들이 저장되어 있음
str에 나타나는 숫자 중 최소값과 최대값을 찾아 
이를 "(최솟값) (최대값)" 형태의 문자열을 반환하는 함수 완성
ex)
    s "1 2 3 4"
    "1 4" 리턴
`;

const limit = `
s에는 둘 이상의 정수가 공백으로 구분
`;

const example = {
    header : ['s', 'return', 'solution'],
    body : {
        // parameter 여러개인 경우 대비해서 []로 묶은거
        // parameter 한개가 배열인경우 [[[]]] 이렇게 써야함 n_lcm 문제 참ㄱ
        parameter : [
            // 예제1
            [
                // 파라미터 여러개면 ,로 구분
                "1 2 3 4"
            ],
            // 예제2
            [
                "-1 -2 -3 -4"
            ],
            [
                "-1 -1"
            ]
        ], 
        answer : [
            // 각 예제에 대한 정답 ,로 구분
            "1 4","-4 -1", "-1 -1"
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

const link = 'https://programmers.co.kr/learn/courses/30/lessons/12939';

const reference = `

`;

///////////////////////////////////////////////////////////////////


function solution(s) {
    // let answer = '';

    // const temp = s.split(' ').sort((a, b) => Number(a) - Number(b))
    // answer = temp[0] + " " + temp[temp.length-1];

    // return answer;

    const arr = s.split(' ');

    return Math.min(...arr) + ' ' + Math.max(...arr);
}

export { name, category, content, limit, example, link, reference, check, solution }