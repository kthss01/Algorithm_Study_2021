const name = '문자열 압축';

const category = '2020 KAKAO BLIND RECRUITMENT';

const content = `
대량의 데이터 처리를 위한 간단한 비손실 압축 방법에 대해 공부
문자열에서 같은 값이 연속해서 나타나는 것을 그 문자의 개수와
반복되는 값으로 표현하여 더 짧은 문자열로 줄여서 표현하는 알고리즘 공부

ex)
"aabbaccc" -> "2a2ba3c" (문자가 반복되지 않아 한번만 나타난 경우 1 생략)

이러한 방식은 반복되는 문자가 적은 경우 압축률이 낮아진다는 단점이 존재

"abcabcdede" 압축 안됨

이러한 단점 해결 위해 문자열을 1개 이상의 단위로 잘라서 압축하여
더 짧은 문자열로 표현할 수 있는지 방법을 찾아보려고 함

ex)
"ababcdcdababcdcd" 문자를 1개 단위로 자르면 압축 x
2개 단위로 압축하면 "2ab2cd2ab2cd"로 압축 가능
다른 방법으로 8개 단위로 잘라서 압축 하면 "2ababcdcd"로 표현 가능

ex)
"abcabcdede" -> 2개 단위 "abcabc2de"
3개 단위 "2abcdede" 3개 단위가 가장 짧은 압축 방법
이 때 3개 단위로 자르고 마지막에 남는 문자열은 그대로 붙여줌

압축할 문자열 s가 매개변수로 주어질 때, 위에 설명한 방법으로
1개 이상 단위로 문자열을 잘라 압축하여 표현한 문자열 중
가장 짧은 것의 길이 return 하는 함수 구현
`;

const limit = `
s의 길이는 1 이상 1,000 이하
s는 알파벳 소문자로만 이루어짐
`;

const example = {
    header : ['s', 'result', 'solution'],
    body : {
        // parameter 여러개인 경우 대비해서 []로 묶은거
        // parameter 한개가 배열인경우 [[[]]] 이렇게 써야함 n_lcm 문제 참ㄱ
        parameter : [
            // 예제1
            [
                // 파라미터 여러개면 ,로 구분
                "aabbaccc"
            ],
            // 예제2
            [
                "ababcdcdababcdcd"
            ],
            [
                "abcabcdede"
            ],
            [
                "abcabcabcabcdededededede"
            ],
            [
                "xababcdcdababcdcd"
            ]
        ], 
        answer : [
            // 각 예제에 대한 정답 ,로 구분
            7, 9, 8, 14, 17
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

const link = 'https://programmers.co.kr/learn/courses/30/lessons/60057';

const reference = `

`;

///////////////////////////////////////////////////////////////////


function solution(s) {
    let answer = s.length;

    let l = s.length;

    for (let i = 1; i <= l; i++) {

        let start = 0;
        let end = i;
        
        let comp = '';
        let cnt = 1;
        
        while (true) {
            const cur = s.substring(start, end);
            let next = '';
            if (end + i <= l) {
                next = s.substring(start + i, end + i);
            } else {
                next = s.substring(start + i, l);
            }

            if (cur === next) {
                cnt++;
            } else {
                if (cnt !== 1) {
                    comp += cnt + cur;
                } else {
                    comp += cur;
                }
                cnt = 1;
            }
            
            if (end === l) {
                break;
            }

            start += i;
            end = end + i <= l ? end + i : l;
        }

        answer = Math.min(answer, comp.length);
    }

    return answer;
}

export { name, category, content, limit, example, link, reference, check, solution }