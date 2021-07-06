/*
  문자열을 정수로 바꾸기

  문자열 s를 숫자로 변환한 결과를 반환하는 함수 완성

  제한 조건
  s의 길이 1 ~ 5
  s의 맨 앞에는 부호(+,-)가 올 수 있음
  s는 부호와 숫자로만 이루어져있음
  s는 "0"으로 시작하지 않음

  ex)
  str "1234" 1234 "-1234" -1234 반환
*/

function solution(s) {
  let answer = 0;

  // answer = Number(s);
  // answer = parseInt(s);
  answer = s / 1; // 사칙연산되면 자도응로 파싱된다고 함

  return answer;
}
