const name = 'JadenCase 문자열 만들기';

const category = '연습문제';

const content = `
JadenCase란 모든 단어의 첫 문자가 대문자이고,
그 외의 알파벳은 소문자인 문자열
문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수
`;

const limit = `
s는 길이 1이상인 문자열
s는 알파벳과 공백문자("")로 이루어짐
첫 문자가 영문이 아닐때에는 이어지는 영문은 소문자로 씀
`;

const example = {
    header : ['s', 'return', 'solution'],
    body : {
        // parameter 여러개인 경우 대비해서 []로 묶은거
        // parameter 한개가 배열인경우 [[[]]] 이렇게 써야함 n_lcm 문제 참ㄱ
        parameter : [
            ["3people unFollowed me"],
            ["for the last week"]
        ], 
        answer : ["3people Unfollowed Me","For The Last Week"]
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

const link = 'https://programmers.co.kr/learn/courses/30/lessons/12951';

const reference = `

`;

///////////////////////////////////////////////////////////////////


function solution(s) {
    let answer = '';

    answer = s.toLowerCase().replace(/(^|\s)\S/g, L => L.toUpperCase());
    // answer = s.toLowerCase().split(" ").map(e => e.charAt(0).toUpperCase() + e.substring(1)).join(" ");

    return answer;
}

export { name, category, content, limit, example, link, reference, check, solution }