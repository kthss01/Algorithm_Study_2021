/*
  완주하지 못한 선수

  단 한 명 선수 완주 못함

  참가 배열과 완주자 배열이 주어질 때 완주 못한 선수 찾기

  제한사항
  마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하
  completion의 길이는 participant의 길이보다 1 작음
  참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자
  참가자 중에는 동명이인이 있을 수 있음
*/

function compute() {
  let name = '완주하지 못한 선수';

  let participant = ["leo", "kiki", "eden"];
  let completion = ["eden", "kiki"];

  let sol1 = solution(participant, completion);

  participant = ["marina", "josipa", "nikola", "vinko", "filipa"];
  completion = ["josipa", "filipa", "marina", "nikola"];

  let sol2 = solution(participant, completion);

  participant = ["mislav", "stanko", "mislav", "ana"];
  completion = ["stanko", "ana", "mislav"];

  let sol3 = solution(participant, completion);

  let td = `
    <td> ${name} </td>
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}

function solution(participant, completion) {
  let answer = '';

  // 너무 느린 방법
  // participant.sort();
  // completion.sort();
  //
  // for (let i = 0; i < completion.length; i++) {
  //   if (participant[i] != completion[i]) {
  //     // console.log(participant[i], completion[i]);
  //     answer = participant[i];
  //     break;
  //   }
  // }
  //
  // if (answer === "")
  //   answer = participant[participant.length-1];

  // 한결 나음
  // let obj = {};
  // participant.forEach((ele) => obj[ele] === undefined ? obj[ele] = 1 : obj[ele] = obj[ele] + 1);
  //
  // // console.log(obj);
  //
  // completion.forEach(ele => {
  //   obj[ele] = obj[ele] - 1;
  //   if (obj[ele] === 0) {
  //     // console.log(ele);
  //     delete obj[ele];
  //   }
  // });
  //
  // // console.log(obj);
  //
  // for (let key in obj) {
  //   answer = key;
  // }

  answer = participant.find(
        name => !completion[name]--,
        completion.map(name => completion[name] = (completion[name] | 0) + 1));

  return answer;
}
