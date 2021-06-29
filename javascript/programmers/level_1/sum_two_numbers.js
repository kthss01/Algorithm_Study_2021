// 두 정수 사이의 합
/*
  두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합 리턴
  ex)
    a = 3, b = 5 인 경우 3 + 4 + 5 = 12

    a, b 같은 경우 둘 중 아무 수나 리턴
    a와 b는 -10,000,000 이상 10,000,000 이하인 정수
    a와 b의 대소관계는 정해져 있지 않음
*/

function solution(a, b) {
  let answer = 0;

  // swap
  if (a > b) {
    let temp = a;
    a = b;
    b = temp;
  }

  for (let i = a; i <= b; i++) {
    answer += i;
  }

  return answer;
}
