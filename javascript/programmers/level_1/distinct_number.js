/*
  같은 숫자는 싫어

  배열 arr
  arr의 각 원소는 0 ~ 9 숫자
  arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 함
  단, 제거된 후 남은 순서들을 반환할 때는 배열  arr의 원소들의 순서를 유지해야함

  ex)
    arr = [1, 1, 3, 3, 0, 1, 1] 이면
    [1, 3, 0, 1] return
    arr = [4, 4, 4, 3, 3] 이면
    [4, 3] return

  제한 사항
  배열 arr의 크기 : 1,000,000 이하의 자연수
  배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
*/

function solution (arr) {
  // let answer = [];
  //
  // for (let num of arr) {
  //   if (answer.length === 0 || answer[answer.length - 1] !== num) {
  //     answer.push(num);
  //   }
  // }
  //
  // return answer;

  return arr.filter((ele, index) => ele != arr[index+1]);
}
