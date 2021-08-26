const name = '행렬의 곱셈';

const category = '연습문제';

const content = `
2차원 행렬 arr1과 arr2를 입력받아 
arr1에 arr2를 곱한 결과를 반환하는 함수 완성
`;

const limit = `
행렬 arr1, arr2의 행과 열의 길이는 2 이상 100 이하
행렬 arr1, arr2의 원소는 -10 이상 20 이하인 자연수
곱할 수 있는 배열만 주어짐
`;

const example = {
    header : ['arr1', 'arr2', 'return', 'solution'],
    body : {
        // parameter 여러개인 경우 대비해서 []로 묶은거
        // parameter 한개가 배열인경우 [[[]]] 이렇게 써야함 n_lcm 문제 참ㄱ
        parameter : [
            [
                [[1, 4], [3, 2], [4, 1]],
                [[3, 3], [3, 3]], 
            ],
            [
                [[2, 3, 2], [4, 2, 4], [3, 1, 4]],
                [[5, 4, 3], [2, 4, 1], [3, 1, 1]]
            ]
        ], 
        answer : [
            [[15, 15], [15, 15], [15, 15]],
            [[22, 22, 11], [36, 28, 18], [29, 20, 14]]
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

const link = 'https://programmers.co.kr/learn/courses/30/lessons/12949?language=javascript';

const reference = `

`;

///////////////////////////////////////////////////////////////////


function solution(arr1, arr2) {
    let answer = [[]];

    // const row1 = arr1.length;
    // const col1 = arr1[0].length;
    // const col2 = arr2[0].length;
    // const row = row1;
    // const col = col2;

    // answer = new Array(row);

    // for (let i = 0; i < row; i++) {
    //     answer[i] = new Array(col);
    //     for (let j = 0; j < col; j++) {
    //         answer[i][j] = 0;
    //         for (let l = 0; l < col1; l++) {
    //             answer[i][j] += arr1[i][l] * arr2[l][j];
    //         }
    //     }
    // }

    answer = arr1.map(
        (row) => arr2[0].map(
            (aw2, c2) => row.reduce(
                (sum, a1 , c1) => sum + a1 * arr2[c1][c2], 0)));

    return answer;
}

export { name, category, content, limit, example, link, reference, check, solution }