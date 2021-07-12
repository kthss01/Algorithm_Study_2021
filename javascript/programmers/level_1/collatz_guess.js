/*
  콜라츠 추측

  1937년 Collatz란 사람에 의해 제기된 이 추측은,
  주어진 수가 1이 될때까지 다음 작업을 반복하면,
  모든 수를 1로 만들 수 잇다는 추측

  1-1. 입력된 수가 짝수라면 2로 나눔
  1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더함
  2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복

  ex) 6
  6->3->10->5->16->8->4->2->1 총 8번에 1이 됨

  위 작업을 몇 번이나 반복해야 하는지 반환하는 함수 구하기
  단, 작업을 500번 반복해도 1이 되지 않는다면 -1 반환

  제한사항
  num 1이상 8000000 미만 정수
*/

// 이런식으로도 가능 참고하자
// html에서는 값이 이상하게 나옴
// 함수 안이라 그런거 같음
// solution 자체가 함수였음
solution = (num) => collatzGuessCount(num, 0);

const collatzGuessCount = (num, acc) =>
  (num === 1) ? ((acc > 500) ? -1 : acc)
    : collatzGuessCount(processCollatz(num), acc + 1);

const processCollatz = (num) => (num % 2 === 0) ? (num / 2) : (num * 3 + 1);

// function solution(num) {
//   let answer = 0;
//
//   // while (num != 1) {
//   //   if (answer >= 500) {
//   //     answer = -1;
//   //     break;
//   //   }
//   //
//   //   if (num % 2 == 0) {
//   //     num /= 2;
//   //   } else {
//   //     num = num * 3 + 1;
//   //   }
//   //
//   //   answer++;
//   // }
//
//   // console.log(answer);
//
//   return answer;
// }
