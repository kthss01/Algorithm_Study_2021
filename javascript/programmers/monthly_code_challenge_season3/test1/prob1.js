/*

0부터 9까지의 숫자 중 
일부가 들어있는 배열 numbers가 매개변수로 주어집니다. 
numbers에서 찾을 수 없는 0부터 9까지의 
숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ numbers의 길이 ≤ 9
0 ≤ numbers의 모든 수 ≤ 9
numbers의 모든 수는 서로 다릅니다.

contain 이런 함수 있는지 나중에 체크

*/

function solution(numbers) {
    var answer = 0;

    for (let i = 0; i <= 9; i++) {
        if (!numbers.some(ele => ele === i)) {
            answer += i;
        }
    }
    
    return answer;
}