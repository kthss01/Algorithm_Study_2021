/*
  직사각형 별찍기

  n, m 두 개의 정수
  별(*) 문자를 이용하여 가로 길이 n 세로 길이 m인 직사각형 형태 출력

  제한 조건
  n, m은 각각 1000 이하인 자연수
*/

function solution(n, m) {
  // let temp = "";

  // for (let i = 0; i < m; i++) {
  //   for (let j = 0; j < n; j++) {
  //     temp += "*";
  //   }
  //   temp += "\n";
  // }

  // return temp;

  const row = '*'.repeat(n);
  return (row + "\n").repeat(m);
}
