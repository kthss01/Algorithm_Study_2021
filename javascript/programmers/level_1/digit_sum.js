/*
  자릿수 더하기

  자연수 N이 주어지면,
  N의 각 자릿수의 합을 구해서 return 하는 solution 함수 만들기
  ex)
  N = 123
  1 + 2 + 3 = 6

  제한사항
  N의 범위 : 100,000,000 이하의 자연수
*/

function solution(n) {
  // let answer = 0;
  //
  // for (let c of String(n)) {
  //   answer += Number(c);
  // }
  //
  // return answer;

  // console.log(String(n).split("")); // 배열이 됨

  return String(n).split("").reduce((acc, cur) => acc + Number(cur), 0);
}
