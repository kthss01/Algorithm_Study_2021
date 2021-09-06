const name = '다리를 지나는 트럭';

const category = '스택/큐';

const content = `
트럭 여러 대가 강을 가로지르는 일차선 다리를 정해진 순으로 건너려고 함
모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 함
다리에는 트럭이 최대 bridge_length 대 올라갈 수 있으며,
다리는 weight 이하까지의 무게를 견딜 수 있음.
단, 다리에 완전히 오르지 않은 트럭의 무게는 무시함

ex)
트럭 2대가 올라갈 수 있고, 무게를 10kg까지 견디는 다리가 있음
무게가 [7, 4, 5, 6]kg 인 트럭이 순서대로 최단 시간안에 다리를 건너려면
다음고 같이 건너야함

경과시간    다리를 지난 트럭    다리를 건너는 트럭  대기 트럭
0           []                  []              [7,4,5,6]
1~2         []                  [7]             [4,5,6]
3           [7]                 [4]             [5,6]
4           [7]                 [4,5]           [6]
5           [7,4]               [5]             [6]
6~7         [7,4,5]             [6]             []
8           [7,4,5,6]

따라서, 모든 트럭이 다리를 지나려면 최소 8초가 걸림

모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 구하는 함수 구현
`;

const limit = `
bridge_length는 1 이상 10,000 이하
weight는 1 이상 10,000 이하
truck_weights의 길이는 1 이상 10,000 이하
모든 트럭의 무게는 1 이상 weight 이하
`;

const example = {
    header : ['bridge_length', 'weight', 'truck_weights', 'return', 'solution'],
    body : {
        // parameter 여러개인 경우 대비해서 []로 묶은거
        // parameter 한개가 배열인경우 [[[]]] 이렇게 써야함 n_lcm 문제 참ㄱ
        parameter : [
            // 예제1
            [
                // 파라미터 여러개면 ,로 구분
                2, 10, [7,4,5,6]
            ],
            // 예제2
            [
                100, 100, [10]
            ],
            [
                100, 100, [10,10,10,10,10,10,10,10,10,10]
            ]
        ], 
        answer : [
            // 각 예제에 대한 정답 ,로 구분
            8, 101, 110
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

const link = 'https://programmers.co.kr/learn/courses/30/lessons/42583';

const reference = `
<a href="http://icpckorea.org/2016/ONLINE/problem.pdf" target="_blank">출처</a>
`;

///////////////////////////////////////////////////////////////////


function solution(bridge_length, weight, truck_weights) {
    let answer = 0;

    // let bride = new Array(bridge_length).fill(0);
    // let tw = truck_weights.slice();
    // let cur_weight = 0;

    // while (true) {
    //     if (tw.length === 0 && cur_weight === 0) {
    //         break;
    //     }

    //     if (bride.length < bridge_length) {
    //         bride.push(0);
    //     }

    //     let first = bride.shift();
    //     if (first !== 0) {
    //         cur_weight -= first;
    //     }

    //     if (tw.length !== 0 && cur_weight + tw[0] <= weight) {
    //         let truck = tw.shift();
    //         cur_weight += truck;
    //         bride.push(truck);
    //     }

    //     answer++;
    // }

    // 잘한 사람 코드
    // 다리를 모방한 큐 간단한 배열로 정리 [트럭무게, 트럭이 나갈 시간]
    let time = 0;
    let q = [[0, 0]];
    let weightOnBridege = 0;

    // 대기 트럭, 다리를 건너는 트럭이 모두 0일 때 까지 다음 루프 반복
    while (q.length > 0 || truck_weights.length > 0) {
        // 현재 시간이, 큐 맨 앞의 차의 '나갈 시간'과 같다면 내보내주고,
        // 다리 위 트럭 무게 합에서 빼준다.
        if (q[0][1] === time) {
            weightOnBridege -= q.shift()[0];
        }

        if (weightOnBridege + truck_weights[0] <= weight) {
            // 다리 위 트럭 무게 합 + 대기중인 트럭 첫 무게가 감당 무게 이하면
            // 다리 위 트럭 무게 업데이트, 큐 뒤에 [트럭무게, 이 트럭이 나갈 시간] 추가
            weightOnBridege += truck_weights[0];
            q.push([truck_weights.shift(), time + bridge_length]);
        } else {
            // 다음 트럭이 못올라오는 상황이면 큐의
            // 첫번째 트럭이 빠지도록 시간 점프
            // if 밖에서 1 더해서 -1 해줌
            if (q[0]) {
                time = q[0][1] - 1;
            }
        }

        // 시간 업데이트
        time++;
    }

    answer = time;

    return answer;
}

export { name, category, content, limit, example, link, reference, check, solution }