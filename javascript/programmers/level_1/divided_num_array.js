/*
  나누어 떨어지는 숫자 배열

  array의 각 element 중 divisors로 나누엊 떨어지는 값을 오름차순으로 정렬한 배열을 반환
  divisors로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환

  제한사항
  arr는 자연수를 담은 배열
  정수 i,j 에 대해 i != j이면 arr[i] != arr[j]
  divisor는 자연수
  array는 길이 1이상인 배열
*/

function compute() {
  let name = '나누어 떨어지는 숫자 배열';

  let arr = [5, 9, 7, 10];
  let divisor = 5;

  let sol1 = solution(arr, divisor);

  arr = [2, 36, 1, 3];
  divisor = 1;

  let sol2 = solution(arr, divisor);

  arr = [3, 2, 6];
  divisor = 10;

  let sol3 = solution(arr, divisor);

  let td = `
    <td> ${name} </td>
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}

function solution(arr, divisor) {
  let answer = [];

  // arr = arr.sort((a, b) => a - b);
  //
  // for (let ele of arr) {
  //   if (ele % divisor === 0) {
  //     answer.push(ele);
  //   }
  // }
  //
  // if (answer.length === 0)
  //   answer.push(-1);

  answer = arr.filter(ele => ele%divisor === 0);
  answer = answer.length === 0 ? [-1] : answer.sort((a,b) => a-b);

  return answer;
}
