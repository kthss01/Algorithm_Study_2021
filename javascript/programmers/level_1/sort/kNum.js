/*
  k번째 수

  배열 array의 i번째 숫자부터 j번재 숫자까지 자르고 정렬했을 때,
  k번째에 있는 수 구하기

  ex)
    [1, 5, 2, 6, 3, 7, 4]
    i = 2, j = 5, k = 3

    2 ~ 5까지 자르면
    [5, 2, 6, 3]
    정렬
    [2, 3, 5, 6]
    -> 5 3번째 숫자

    배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands 매개변수로 주어질 때
    k번째 수 구하기

    제한 사항
    array의 길이 1 이상 100 이하
    array의 각 원소 1 이상 100 이하
    commands 길이 1 이상 50 이하
    commands 각 원소는 길이 3
*/

function compute() {
  let name = 'k번째 수';

  let array = [1,5,2,6,3,7,4];
  let commands = [[2,5,3], [4,4,1], [1,7,3]];

  let sol1 = solution(array, commands);
  let sol2;
  let sol3;

  let td = `
    <td> ${name} </td>
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}

function solution(array, commands) {
  let answer = [];

  // for (const command of commands) {
  //   // console.log(array.slice(command[0], command[1] + 1));
  //   // console.log(array.slice(command[0]-1, command[1]).sort((a,b) => a-b));
  //   answer.push(
  //     array.slice(command[0]-1, command[1])
  //       .sort((a,b) => a - b)[command[2]-1]);
  // }

  answer = commands.map(command => {
    const [s, e, pos] = command;
    const nerArr = array
      .filter((v, i) => i >= s - 1 && i <= e - 1)
      .sort((a, b) => a - b)

    return nerArr[pos - 1];
  });

  return answer;
}
