/*
  소수 만들기

  주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 함
  숫자들이 들어있는 배열 nums가 매개변수로 주어질 때,
  nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수 return

  제한사항
    nums에 들어있는 숫자의 개수는 3개 이상 50개 이하
    nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않음
*/

function compute() {
  let name = '소수 만들기';

  let nums = [1,2,3,4];

  let sol1 = solution(nums);

  nums = [1,2,7,6,4];
  let sol2 = solution(nums);

  let sol3;

  let td = `
    <td> ${name} </td>
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}

function solution(nums) {
  nums.sort((a,b) => a -b);

  let maxNum = nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3]

  let erathos = new Array(maxNum).fill(false);

  erathos[0] = true;
  erathos[1] = true;

  for (let i = 2; i < erathos.length; i++) {
    if (erathos[i]) continue;

    for (let j = 2 * i; j <= erathos.length; j += i) {
      erathos[j] = true;
    }
  }

  // console.log(erathos);

  let answer = 0;

  for (let i = 0; i < nums.length - 2; i++) {
    // console.log(nums[i]);
    for (let j = i + 1; j < nums.length - 1; j++) {
      // console.log(nums[j]);
      for (let k = j + 1; k < nums.length; k++) {
        // console.log(nums[k]);
        let num = nums[i] + nums[j] + nums[k];

        // console.log([nums[i], nums[j], nums[k]]);

        if (!erathos[num])
          answer++;
      }
    }
  }

  return answer;
}
