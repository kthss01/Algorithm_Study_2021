const name = '문제2';

const category = '스킬 체크 테스트 Level.1';

const content = `
자연수 n이 매개변수로 주어짐
n을 3진버 상에서 앞뒤로 뒤집은 후,
이를 다시 10진법으로 표현하는 수 return하는 함수 완성
`;

const limit = `
n은 1 이상 100,000,000 이하인 자연수
`;

///////////////////////////////////////////////////////////////////


function solution(n) {
    return parseInt(n.toString(3).split('').reverse().join(''),3);
}
