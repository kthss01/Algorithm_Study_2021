/*
  폰켓몬

  총 N 마리의 폰켓몬 중 N/2 마리를 가져가도 좋음
  종류에 따라 번호를 붙여 구분
  같은 종류의 폰켓몬 같은 번호

  가질 수 있는 폰켓몬 종류의 최대값이 나오게 됨
  최대한 많은 종류의 폰켓몬을 포함해서 N/2마리를 선택하려 함
  N마리 폰켓몬의 종류 번호가 담긴 배열 nums가 매개변수로 중저ㅣㄹ 때,
  N/2마리의 폰켓몬을 선택하는 방법 중, 가장 많은 종류의 폰켓몬을 선택하는 방법
  찾아 그 때의 폰켓몬 종류의 번호의 개수 return 하기

  제한사항
    nums는 폰켓몬의 종류 번호가 담긴 1차원 배열
    nums의 길이(N)는 1 이상 10,000 이하의 자연수이며, 항상 짝수
    폰켓몬의 종류 번호는 1 이상 200,000 이하의 자연수
    가장 많은 종류의 폰켓몬을 선택하는 방법이 여러 가지인 경우에도,
    선택할 수 있는 폰켓몬 종류 개수의 최대값 하나만 return
*/

function compute() {
  let name = '폰켓몬';

  let nums = [3,1,2,3];

  let sol1 = solution(nums);

  nums = [3,3,3,2,2,4];
  let sol2 = solution(nums);

  nums = [3,3,3,2,2,2];
  let sol3 = solution(nums);

  let td = `
    <td> ${name} </td>
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}

function solution(nums) {
  let answer = 0;

  // let numSet = new Set();
  //
  // nums.forEach((ele) => numSet.add(ele));
  //
  // answer = Math.min(numSet.size, nums.length / 2);

  answer = Math.min([...new Set(nums)].length, nums.length / 2);

  return answer;
}
