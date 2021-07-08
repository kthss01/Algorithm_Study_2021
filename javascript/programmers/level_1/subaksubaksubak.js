/*
  수박수박수박수박수박수?

  길아 n이고 수박수박수박수... 와 같은 패턴을 유지하는 문자열을 리턴하는 함수

  n 4 이면 수박수박 3이면 수박수 리턴

  제한 조건
  n <= 10,000 자연수
*/

function solution(n) {
    let answer = '';

    // let word = '수박';
    //
    // for (let i = 0; i < n; i++) {
    //     answer += word[i%2];
    // }

    answer = '수박'.repeat(n/2) + (n%2 === 1 ? '수' : '');

    return answer;
}
