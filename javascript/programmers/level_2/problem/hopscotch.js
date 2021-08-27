const name = '땅따먹기';

// hopscotch - 땅따먹기

const category = '연습문제';

const content = `
땅따먹기는 총 N행 4열로 이루어져 있고, 모든 칸에는 점수가 쓰여 있음
1행부터 땅을 밟으며 한 행씩 내려올 때,
각 행의 4칸 중 한 칸만 밟으면서 내려와야 함
단, 땅따먹기 게임에는 한 행씩 내려올 때,
같은 열을 연속해서 밟을 수 없는 특수 규칙

마지막 행까지 모두 내려왔을 때, 얻을 수 있는 점수의 최대값 리턴

ex)
    1   2   3   5
    5   6   7   8
    4   3   2   1

    5 - 7 - 4 => 16이 최고점
`;

const limit = `
행의 개수 : 100,000 이하의 자연수
열의 개수 4개, 땅(land)은 2차원 배열로 주어짐
점수 : 100 이하의 자연수
`;

const example = {
    header : ['land', 'answer', 'solution'],
    body : {
        // parameter 여러개인 경우 대비해서 []로 묶은거
        // parameter 한개가 배열인경우 [[[]]] 이렇게 써야함 n_lcm 문제 참ㄱ
        parameter : [
            // 예제1
            [
                // 파라미터 여러개면 ,로 구분
                [[1,2,3,5],[5,6,7,8],[4,3,2,1]]
            ],
        ], 
        answer : [
            // 각 예제에 대한 정답 ,로 구분
            16
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

const link = 'https://programmers.co.kr/learn/courses/30/lessons/12913';

const reference = `
다이나믹 프로그래밍 dp 문제
<a href="https://blog.naver.com/ndb796/221233570962" target="_blank">다이나믹 프로그래밍</a>
<a href="https://shanepark.tistory.com/183" target="_blank">다이나믹 프로그래밍</a>
`;

///////////////////////////////////////////////////////////////////

/*
    d[n] 현재 행에서 각열이 가질 수 있는 최고합
*/

function solution(land) {
    let answer = 0;

    let dp = [];

    // 꽤나 느림 답은 맞음 효율성 쪽도
    // land.forEach((ele, ind) => {
    //     if (ind === 0) {
    //         dp[ind] = ele;
    //     } else {
    //         dp[ind] = ele.map((ele2, ind2) => {
    //             return Math.max(...dp[ind-1].filter((ele3, ind3) => ind2 !== ind3)) + ele2
    //         });
    //     }
    // });

    for (let i = 0; i < land.length; i++) {
        if (i == 0) {
            dp[i] = land[i];
            continue;
        } 

        let row = []
        row[0] = Math.max(dp[i-1][1], dp[i-1][2], dp[i-1][3]) + land[i][0];
        row[1] = Math.max(dp[i-1][0], dp[i-1][2], dp[i-1][3]) + land[i][1];
        row[2] = Math.max(dp[i-1][1], dp[i-1][0], dp[i-1][3]) + land[i][2];
        row[3] = Math.max(dp[i-1][1], dp[i-1][2], dp[i-1][0]) + land[i][3];

        dp[i] = row;
    }

    
    answer = Math.max(...dp[dp.length-1]);

    return answer;
}

export { name, category, content, limit, example, link, reference, check, solution }