const name = '';

const category = '';

const content = `
`;

const limit = `

`;

const example = {
    header : ['', '', 'solution'],
    body : {
        // parameter 여러개인 경우 대비해서 []로 묶은거
        // parameter 한개가 배열인경우 [[[]]] 이렇게 써야함 n_lcm 문제 참ㄱ
        parameter : [
            // 예제1
            [
                // 파라미터 여러개면 ,로 구분
            ],
            // 예제2
            [

            ]
        ], 
        answer : [
            // 각 예제에 대한 정답 ,로 구분
            ,
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

const link = '';

const reference = `

`;

///////////////////////////////////////////////////////////////////


function solution(n) {
    let answer = 0;

    return answer;
}

export { name, category, content, limit, example, link, reference, check, solution }