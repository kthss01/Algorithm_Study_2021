const name = '기능개발';

const category = '스택/큐';

const content = `
기능 개선 작업을 수행 중
각 기능은 진도가 100%일 때 서비스에 반영할 수 있음

또, 각 기능의 개발 속도는 모두 다르기 때문에 
뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고,
이 때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됨

먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와
각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 
각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 하는 함수 완성
`;

const limit = `
작업의 개수 (progresses, speeds 배열의 길이)는 100개 이하
작업 진도는 100 미만의 자연수
작업 속도는 100 이하의 자연수
배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정
예를 들어 진도율이 95%인 작업의 개발 속도가 하루에 4%라면 배포는 2일 뒤
`;

const example = {
    header : ['progresses', 'speeds', 'return', 'solution'],
    body : {
        // parameter 여러개인 경우 대비해서 []로 묶은거
        // parameter 한개가 배열인경우 [[[]]] 이렇게 써야함 n_lcm 문제 참ㄱ
        parameter : [
            // 예제1
            [
                // 파라미터 여러개면 ,로 구분
                [93, 30, 55], [1, 30, 5]
            ],
            // 예제2
            [
                [95, 90, 99, 99, 80, 99], [1, 1, 1, 1, 1, 1]
            ]
        ], 
        answer : [
            // 각 예제에 대한 정답 ,로 구분
            [2, 1], [1, 3, 2]
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

const link = 'https://programmers.co.kr/learn/courses/30/lessons/42586';

const reference = `

`;

///////////////////////////////////////////////////////////////////


function solution(progresses, speeds) {
    let answer = [];

    let result = progresses.map(
        (progress, index) => Math.ceil((100 - progress) / speeds[index]));

    // let result = [];

    // for (let i = 0; i < progresses.length; i++) {
    //     let work = Math.ceil((100 - progresses[i]) / speeds[i]);
    //     result.push(work);
    // }

    answer = [0];

    // let cnt = 1;
    // while (result.length) {
    //     let ele = result[0];

    //     while (result.length > 1 && ele >= result[1]) {
    //         result.shift();
    //         cnt++;
    //     }

    //     answer.push(cnt);
    //     cnt = 1;
    //     result.shift();
    // }

    let maxResult = result[0];

    for (let i = 0, j = 0; i < result.length; i++) {
        if (result[i] <= maxResult) {
            answer[j] += 1;
        } else {
            maxResult = result[i];
            answer[++j] = 1;
        }
    }

    // console.log(answer);

    return answer;
}

export { name, category, content, limit, example, link, reference, check, solution }