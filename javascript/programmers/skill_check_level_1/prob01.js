const name = '문제1';

const category = '스킬 체크 테스트 Level.1';

const content = `
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야함
18의 자릿수 합 1+8=9
18은 9로 나누어 떨어지므로 18 하샤드 수
자연수 x를 입력받아 x가 하샤드 수인지 검사하는 함수 완성
`;

const limit = `
x는 1 이상, 10000 이하 정수
`;

///////////////////////////////////////////////////////////////////


function solution(x) {
    return x % x.toString().split('')
            .reduce((sum, ele) => sum + Number(ele), 0) === 0;
}
