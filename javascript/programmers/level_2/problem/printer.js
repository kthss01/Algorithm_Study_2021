const name = '프린터';

const category = '스택/큐';

const content = `
일반적인 프린터는 인쇄 요청이 들어온 순서대로 인쇄함
그렇기 때문에 중요한 문서가 나중에 인쇄될 수 있음
이런 문제를 보완하기 위해 중요도가 높은 문서를 먼저 인쇄하도록 개발

아래와 같은 방식으로 인쇄 작업을 수행
    1. 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냄
    2. 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 
        한 개라도 존재하면 J를 대기목록의 가장 마지막에 넣음 
    3. 그렇지 않으면 J를 인쇄함

ex) 4개의 문서 (A, B, C, D)가 순서대로 인쇄 대기목록에 있고
중요도가 2 1 3 2 라면 C D A B 순으로 인쇄

내가 인쇄한 요청한 문서가 몇 번째로 인쇄되는지 알고 시픙ㅁ
위의 예에서 C는 1번째, A는 3번째로 인쇄

현재 대기목록에 있는 문서의 중요도가 순서대로 담긴 배열 priorities와
내가 인쇄를 요청한 문서가 현재 대기목록의 어떤 위치인지 알려주는 location이
매개변수로 주어질 때, 몇 번째로 인쇄되는지 return하는 함수 구현
`;

const limit = `
현재 대기목록에는 1개 이상 100개 이하의 문서가 있음
인쇄 작업의 중요도는 1 ~ 9 로 표현하며 숫자가 클수록 중요하다는 뜻
location은 0 이상 (현재 대기목록에 있는 작업의 수 - 1) 이하의 값을 가지며
대기목록의 가장 앞에 있으면 0, 두 번째에 있으면 1로 표현
`;

const example = {
    header : ['priorities', 'location', 'return', 'solution'],
    body : {
        // parameter 여러개인 경우 대비해서 []로 묶은거
        // parameter 한개가 배열인경우 [[[]]] 이렇게 써야함 n_lcm 문제 참ㄱ
        parameter : [
            // 예제1
            [
                // 파라미터 여러개면 ,로 구분
                [2, 1, 3, 2], 2
            ],
            // 예제2
            [
                [1, 1, 9, 1, 1, 1], 0
            ]
        ], 
        answer : [
            // 각 예제에 대한 정답 ,로 구분
            1, 5
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

const link = 'https://programmers.co.kr/learn/courses/30/lessons/42587';

const reference = `
<a href="https://www.csc.kth.se/contest/nwerc/2006/problems/nwerc06.pdf" target="_blank">출처</a>
`;

///////////////////////////////////////////////////////////////////


function solution(priorities, location) {
    let answer = 0;

    // let number = priorities.map((ele, index) => index + 1);

    // let myPaper = number[location];
    
    // while (true) {
    //     let first = number[0];
    //     number.shift();
    //     let priority = priorities[0];
    //     priorities.shift();

    //     // some : 하나라도 true 면 true return
    //     if (priorities.some((ele) => ele > priority)) {
    //         number.push(first);
    //         priorities.push(priority);
    //     } else {
    //         answer++;
    //         if (myPaper === first) {
    //             break;
    //         }
    //     }
    // }

    let list = priorities.map((ele, index) => ({
        my : index === location,
        val : ele
    }));

    while (true) {
        let cur = list.shift();
        if (list.some(ele => ele.val > cur.val)) {
            list.push(cur);
        } else {
            answer++;
            if (cur.my) {
                break;
            }
        }
    }

    return answer;
}

export { name, category, content, limit, example, link, reference, check, solution }