/*
  하샤드 수

  양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 함
  예를 들어 18의 자릿수의 합은 1+8 = 9
  18은 9로 나누어 떨어지므로 18은 하샤드 수

  자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수

  제한 조건
  x는 1 이상, 10000 이하인 정수
*/

function solution(x) {
  let answer = true;
  // console.log(x.toString().split(''));
  let temp = x.toString().split('').reduce((sum, ele) => sum += Number(ele), 0);
  // console.log(temp);
  answer = x % temp === 0;

  return answer;
}
