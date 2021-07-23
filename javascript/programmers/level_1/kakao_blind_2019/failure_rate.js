/*
  실패율

  스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수

  전체 스테이지의 개수 N,
  게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가
  매개변수로 주어질 때,
  실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있느 배열을 return하도록
  solution 함수 완성

  제한사항
  스테이지의 개수 N은 1 이상 500 이하의 자연수
  stages의 길이는 1 이상 200,000 이하
  stages에는 1 이상 N + 1 이하의 자연수
    각 자연수는 사용자가 현재 도전 중인 스테이지의 번호를 나타냄
    단, N + 1은 마지막 스테이지 (N번째 스테이지)까지 클리어 한 사용자를 나타냄
  만약 실패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록 하면 된다
  스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0으로 정의
*/

function compute() {
  let name = '실패율';

  let n = 5;
  let stages = [2, 1, 2, 6, 2, 4, 3, 3];

  let sol1 = solution(n, stages);

  n = 4;
  stages = [4, 4, 4, 4, 4];

  let sol2 = solution(n, stages);

  let sol3;

  let td = `
    <td> ${name} </td>
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}

function solution(n, stages) {
  let answer = [];

  // let arr = Array(n + 2).fill(0);
  // for (let stage of stages) {
  //   arr[Number(stage)]++;
  // }
  //
  // // console.log(arr);
  //
  // let cumSum = Array(n + 2).fill(0);
  // for (let i = 1; i <= n + 1; i++) {
  //   cumSum[i] = cumSum[i - 1] + arr[i];
  // }
  //
  // // console.log(cumSum);
  //
  // let rates = []
  //
  // for (let i = 1; i <= n; i++) {
  //   rates[i] = {}
  //   rates[i].key = i;
  //   // console.log(`${arr[i]} / ${stages.length - cumSum[i - 1]}`);
  //   rates[i].value = arr[i] / (stages.length - cumSum[i - 1]);
  // }
  //
  // rates.sort((a, b) => a.value === b.value ? a.key - b.key : b.value - a.value);
  //
  // rates.pop(); // null 제거
  //
  // // console.log(rates);
  //
  // answer = rates.map(ele => ele.key);

  let stageCount = new Array(n).fill(0);
  let failPer = [];

  let usersNum = stages.length;
  for (let stage of stages) {
    stageCount[stage - 1]++;
  }

  for (let i = 0; i < n; i++) {
    if (usersNum === 0) {
      failPer.push({failPer: 0, stageNum: i + 1});
    } else {
      failPer.push({failPer: stageCount[i] / usersNum, stageNum: i+1});
    }
    usersNum -= stageCount[i];
  }

  failPer.sort(
    (a, b) =>
      a.failPer === b.failPer ? a.stageNum - b.stageNum : b.failPer - a.failPer);

  answer = failPer.map(ele => ele.stageNum);

  return answer;
}
