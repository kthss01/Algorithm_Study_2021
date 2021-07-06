/*
  문자열 다루기 기본

  문자열 s의 길이가 4 or 6이고, 숫자로만 구성되어있는지 확인

  ex)
  s "a234" False "1234" True

  제한 사항
  s는 길이 1이상, 8이하인 문자열
*/

function solution(s) {
  let answer = false;

  // 소수도 해결해야 하는 듯
  // 정확히는 지수형태가 안되는거였음
  if (s.length === 4 || s.length === 6) {
    answer = s.split('').reduce( (s, e) => s && !isNaN(e), true);
    // answer = s.split('').reduce( function(s, e) {
    //   console.log(s);
    //   console.log(e + " " + isNaN(e));
    //   return s && !isNaN(e);
    // } , true);
    // console.log(answer);
  }

  // 정규식으로 풀 수도 있다고 함
  // 참고만 하자
  // var regex = /^\d{6}$|^\d{4}$/;
  // return regex.test(s);

  return answer;
}
