/*
  비밀지도

  비밀지도가 숫자로 암호화되어 있어 위치를 확인하기 위해서는
  암호를 해독해야 함

  1. 지도는 한 변의 길이가 n인 정사각형 배열 형태로,
  각 칸은 "공백"("") 또는 "벽"("#") 두 종류로 이루어져 있다.
  2. 전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다.
  각각 "지도 1"과 "지도 2"라고 하자.
  지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다.
  지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
  3. "지도 1"과 "지도 2"는 각각 정수 배열로 암호하되어 있다.
  4. 암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로
  부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.

  입력 형식
  입력으로 지도의 한 변 크기 n과 2개의 정수 배열 arr1, arr2가 들어온다.
  1 <= n <= 16
  arr1, arr2는 길이 n인 정수 배열로 주어짐
  정수 배열의 각 원소 x를 이진수로 변환했을 때의 길이는 n이하이다.
  즉, 0 <= x <= 2^n-1을 만족

  출력 형식
  원래의 비밀지도를 해독하여 '#', 공백으로 구성된 문자열 배열로 출력
*/

function compute() {
  let name = '비밀지도';

  let n = 5;
  let arr1 = [9, 20, 28, 18, 11];
  let arr2 = [30, 1, 21, 17, 28];

  let sol1 = solution(n, arr1, arr2);

  n = 6;
  arr1 = [46, 33, 33, 22, 31, 50];
  arr2 = [27, 56, 9, 14, 14, 10];

  let sol2 = solution(n, arr1, arr2);

  let sol3;

  let td = `
    <td> ${name} </td>
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}

function solution(n, arr1, arr2) {
  let answer = [];

  for (let i = 0; i < n; i++) {
    let temp = (arr1[i] | arr2[i]).toString(2);
    temp = temp.split('').map(ele => ele === '1' ? '#' : ' ').join('');

    temp = temp.length < n ? ' '.repeat(n - temp.length) + temp : temp
    // console.log(temp);

    answer.push(temp);
  }

  // console.log('');

  return answer;
}
