const name = '모음 사전';

const category = '위클리 챌린지';

const content = `
사전에 알파벳 모음 'A', 'E', 'I', 'O', 'U'만을 사용하여 만들 수 있는,
길이 5 이하의 모든 단어가 수록 되어 있음
사전에서 첫 번째 단어는 "A"이고,
그 다음은 "AA"이며, 마지막 단어는 "UUUUU"임

단어 하나 word가 매개변수로 주어질 때,
이 단어가 사전에서 몇 번째 단어인지 return 하는 함수 구현
`;

const limit = `
word의 길이 1이상 5이하
word는 알파벳 대문자 'A','E','I','O','U'로만 이루어져 있음
`;

const example = {
    header : ['word', 'result', 'solution'],
    body : {
        // parameter 여러개인 경우 대비해서 []로 묶은거
        // parameter 한개가 배열인경우 [[[]]] 이렇게 써야함 n_lcm 문제 참ㄱ
        parameter : [
            // 예제1
            [
                // 파라미터 여러개면 ,로 구분
                "AAAAE"
            ],
            // 예제2
            [  
                "AAAE"
            ],
            [  
                "I"
            ],
            [  
                "EIO"
            ],
        ], 
        answer : [
            // 각 예제에 대한 정답 ,로 구분
            6, 10, 1563, 1189
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

const link = 'https://programmers.co.kr/learn/courses/30/lessons/84512';

const reference = `
<a href="https://mathbang.net/612" target="_blank">등비수열의 합 공식</a>
`;

///////////////////////////////////////////////////////////////////

function carry(w, isCarry) {
    const vowel = ['A','E','I','O','U'];

    if (isCarry) {
        w.pop();
    }

    if (w[w.length-1] === 'U') {
        w = carry(w, true);
    } else {
        w[w.length-1] = vowel[vowel.indexOf(w[w.length-1]) + 1];
    }

    return w;
}

function solution(word) {
    // let answer = 0;

    // const vowel = ['A','E','I','O','U'];

    // let cnt = 1;
    // let w = ['A'];

    // while (w.join('') !== word) {
    //     if (w.length < 5) {
    //         w.push('A');
    //     } else {
    //         let lastW = w[w.length-1];
            
    //         if (lastW !== 'U') {
    //             w[w.length-1] = vowel[vowel.indexOf(lastW)+1];
    //         } else {
    //             w = carry(w, true);
    //         }
    //     }

    //     // console.log(w);
    //     cnt++;
    // }

    // answer = cnt;

    // return answer;

    // 등비수열의 합을 이용할 수도 있다고함
    return word.split('')
                .reduce((sum, ele, i) => sum + ('AEIOU'.indexOf(ele)) * (5**(5-i) - 1) / 4 + 1, 0);
}

export { name, category, content, limit, example, link, reference, check, solution }