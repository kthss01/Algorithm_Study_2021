const name = '가장 큰 정사각형 찾기';

const category = '연습문제';

const content = `
1과 0으로 채워진 표(board)가 있음.
표 1칸은 1x1의 정사각형으로 이루어짐
표에서 1로 이루어진 가장 큰 정사각형을 찾아 넓이를 return 하는 함수 완성
(단, 정사각형이란 축에 평행한 정사각형을 말함)
`;

const limit = `
표(board)는 2차원 배열로 주어짐
표(board)는 행(row)의 크기 : 1,000 이하의 자연수
표(board)는 열(column)의 크기 : 1,000 이하의 자연수
표(board)의 값은 1 또는 0으로만 이루어져 있음
`;

const example = {
    header : ['board', 'answer', 'solution'],
    body : {
        // parameter 여러개인 경우 대비해서 []로 묶은거
        // parameter 한개가 배열인경우 [[[]]] 이렇게 써야함 n_lcm 문제 참ㄱ
        parameter : [
            // 예제1
            [
                // 파라미터 여러개면 ,로 구분
                [[0,1,1,1],[1,1,1,1],[1,1,1,1],[0,0,1,0]]
            ],
            // 예제2
            [
                [[0,0,1,1],[1,1,1,1]]
            ]
        ], 
        answer : [
            // 각 예제에 대한 정답 ,로 구분
            9, 4
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

const link = 'https://programmers.co.kr/learn/courses/30/lessons/12905';

const reference = `

`;

///////////////////////////////////////////////////////////////////

function solution(board) {
    let answer = board[0][0];

    let b = board.map((row) => row.map((ele) => ele));

    for (let i = 1; i < b.length; i++) {
        for (let j = 1; j < b[i].length; j++) {
            if (b[i][j] === 1) {
                const left = b[i][j-1];
                const top = b[i-1][j];
                const leftTop = b[i-1][j-1];
                const min = Math.min(left, top, leftTop);
                b[i][j] = min + 1;
                answer = Math.max(answer, b[i][j] ** 2);
            }            
        }
    }

    return answer;
}

export { name, category, content, limit, example, link, reference, check, solution }