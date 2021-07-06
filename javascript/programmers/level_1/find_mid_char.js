/*
  가운데 글자 가져오기

  단어 s의 가운데 글자를 반환하는 함수
  단어의 길이가 짝수라면 가운데 두 글자를 반환

  제한사항
  s는 길이 1이상, 100이하인 스트링
*/

function solution(s) {
  let answer = '';

  answer = s.length % 2 == 0 ? s.substr(s.length / 2 - 1, 2) : s.substr(s.length / 2, 1)

  return answer;
}
