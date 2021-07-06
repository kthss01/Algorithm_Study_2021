/*
  제일 작은 수 제거하기

  정수를 저장한 배열, arr에서 가장 작은 수를 제거한 배열 리턴

  단 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1 채워 리턴

  ex)
  [4,3,2,1] -> [4,3,2] 리턴
  [10] -> [-1]

  제한 조건
  arr는 길이 1 이상인 배열
  인덱스 i,j에 대해 i!=j 이면 arr[i] != arr[j] 입니다.
*/

function solution(arr) {
  // let answer = [];
  //
  // // console.log(arr);
  //
  // let minN = Math.min.apply(null, arr); // Function.prototype.apply()
  //
  // // console.log(minN);
  //
  // while (arr.indexOf(minN) !== -1) {
  //   // console.log(arr);
  //   arr.splice(arr.indexOf(minN), 1);
  // }
  //
  // // arr.splice(arr.indexOf(Math.min(arr)), 1);
  //
  // answer = arr.length === 0 ? [-1] : arr;
  //
  // return answer;

  // spread 연산자 사용
  // arr.splice(arr.indexOf(Math.min(...arr)),1);
  // if (arr.length<1) return[-1];
  // return arr;

  // reduce 사용
  let min = Math.min(...arr);
  let answer = arr.filter(ele => ele != min);
  answer = answer.length === 0 ? [-1] : answer;
  return answer;
}
