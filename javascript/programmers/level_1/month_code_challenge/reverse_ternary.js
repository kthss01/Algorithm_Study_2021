/*
  3진법 뒤집기

  자연수 n이 매개변수
  n을 3진법 상에서 앞뒤로 뒤집은 후
  이를 다시 10진법으로 표현한 수 return

  제한사항
  n은 1이상 100,000,000 이하인 자연수
*/

function compute() {
  let name = '3진법 뒤집기';

  let n = 45;

  let sol1 = solution(n);

  n = 125;

  let sol2 = solution(n);

  let sol3;

  let td = `
    <td> ${name} </td>
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}

function solution(n) {
  let answer = 0;

  // answer = parseInt(n.toString(3).split('').reverse().join(''), 3);
  answer = parseInt([...n.toString(3)].reverse().join(''), 3);

  return answer;
}
