/*
  핸드폰 번호 가리기

  전화번호 문자열 phone_number로 주어졌을 때,
  전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열 리턴

  제한 조건
  s는 길이 4 이상, 20이하인 문자열
*/

function solution(phone_number) {
  let answer = '';

  answer = '*'.repeat(phone_number.length - 4);
  // answer += phone_number.substr(phone_number.length-4, 4);
  answer += phone_number.slice(-4);

  return answer;
}
