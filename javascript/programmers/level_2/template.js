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
        parameter : [[],[]], 
        answer : [,]
    }
};

const {parameter, answer} = example.body;

const check = parameter.every((param, index) => {
    const sol = solution(...param);
    const ans = answer[index];

    // answer가 array인 경우 일일히 비교해야함
    if (typeof ans === Array) {
        return ans.every((ele, index) => {
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