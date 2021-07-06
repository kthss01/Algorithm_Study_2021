/*
  모의고사

  수포자 1번 문제부터 마지막 문제까지 다음과 같이 찍음

  1번 : 1,2,3,4,5, 1,2,3,4,5, ...
  2번 : 2,1,2,3,2,4,2,5, 2,1,2,3,2,4,2,5, ...
  3번 : 3,3,1,1,2,2,4,4,5,5, 3,3,1,1,2,2,4,4,5,5, ...

  1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때
  가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수 작성

  제한조건
    시험은 최대 10,000 문제로 구성
    문제의 정답은 1,2,3,4,5 중 하나
    가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순으로 정렬

  ex)
    answers       return
    [1,2,3,4,5]   [1]
    [1,3,2,4,2]   [1,2,3]
*/

function solution(answers) {
  let answer = [];

  // 패턴
  let n1 = [1,2,3,4,5];
  let n2 = [2,1,2,3,2,4,2,5];
  let n3 = [3,3,1,1,2,2,4,4,5,5];

  // 점수
  let s1 = 0;
  let s2 = 0;
  let s3 = 0;

  for (let i = 0; i < answers.length; i++) {
    if (n1[i % n1.length] === answers[i]) s1++;
    if (n2[i % n2.length] === answers[i]) s2++;
    if (n3[i % n3.length] === answers[i]) s3++;
  }

  let maxN = Math.max(s1, s2, s3);

  if (s1 === maxN) answer.push(1);
  if (s2 === maxN) answer.push(2);
  if (s3 === maxN) answer.push(3);

  return answer;
}
