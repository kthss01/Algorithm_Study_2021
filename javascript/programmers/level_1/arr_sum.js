/*
  행렬의 덧셈

  행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을
  서로 더한 결과
  2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환

  제한 조건
  행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않음
*/

function solution(arr1, arr2) {
  let answer = [];

  // // console.log(arr1[0]);
  // // console.log(arr1[0][0]);
  //
  // for (let i = 0; i < arr1.length; i++) {
  //   let row = [];
  //   for (let j = 0; j < arr1[i].length; j++) {
  //     // console.log(`i = ${i}, j = ${j}`);
  //     // console.log(arr1[i][j] + " " + arr2[i][j]);
  //     // answer[i][j] = arr1[i][j] + arr2[i][j];
  //     // console.log(answer[i][j]);
  //     // answer[i][j] = i + j;
  //     // console.log(answer[i][j]);
  //     row.push(arr1[i][j] + arr2[i][j]);
  //     // console.log(row);
  //   }
  //   answer.push(row);
  // }
  //
  // // console.log(answer);

  // for (let i = 0; i < arr1.length; i++) {
  //   answer[i] = [];
  //   for (let j = 0; j < arr1[i].length; j++) {
  //     answer[i][j] = arr1[i][j] + arr2[i][j];
  //   }
  // }
  //
  // return answer;

  return arr1.map((a, i) => a.map((b, j) => b + arr2[i][j]));
}
