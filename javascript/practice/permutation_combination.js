/*
    조합
    서로 다른 n개의 물건에서 순서를 생각하지 않고 r개를 택할 때,
    이것은 n개에서 r개를 택하는 조합이라 하고,
    이 조합의 수를 기호로 nCr와 같이 나타낸다.

    Input : [1, 2, 3, 4]
    Output : [[1,2,3], [1,2,4], [1,3,4], [2,3,4]]

    재귀함수를 활용!
*/

const getCombinations = function(arr, selectNumber) {
    const results = [];

    // n개 중에서 1개 선택할 때 (nC1), 바로 모든 배열의 원소 return
    if (selectNumber === 1) {
        return arr.map((el) => [el]);
    }

    arr.forEach((fixed, index, origin) => {
        // 해당하는 fixed를 제외한 나머지 뒤
        const rest = origin.slice(index + 1);
        
        // 나머지에 대해서 조합을 구한다.
        const combinations = getCombinations(rest, selectNumber - 1);

        // 돌아온 조합에 떼 놓은(fixed) 값 붙이기
        const attached = combinations.map((el) => [fixed, ...el]);

        // 배열 spread syntax로 모두 push
        results.push(...attached);
    });

    return results; // 결과 담긴 results return
}

console.log('조합', getCombinations([1,2,3,4], 3));

/*
    순열
    서로 다른 n개의 물건 중에서 r개를 택하여 한 줄로 배열하는 것을
    n개의 물건에서 r개 택하는 순열이라 하고, 이 순열의 수를 기호로
    nPr와 같이 나타낸다. 조합은 순서에 상관없이 선택한 것이라면,
    순열은 순서가 중요하다. 실제로 순열을 구하는 공식도
    조합으로부터 도출 가능하다.

    Input: [1, 2, 3, 4] 
    Output: [
        [ 1, 2, 3 ], [ 1, 2, 4 ],
        [ 1, 3, 2 ], [ 1, 3, 4 ],
        [ 1, 4, 2 ], [ 1, 4, 3 ],
        [ 2, 1, 3 ], [ 2, 1, 4 ],
        [ 2, 3, 1 ], [ 2, 3, 4 ],
        [ 2, 4, 1 ], [ 2, 4, 3 ],
        [ 3, 1, 2 ], [ 3, 1, 4 ],
        [ 3, 2, 1 ], [ 3, 2, 4 ],
        [ 3, 4, 1 ], [ 3, 4, 2 ],
        [ 4, 1, 2 ], [ 4, 1, 3 ],
        [ 4, 2, 1 ], [ 4, 2, 3 ],
        [ 4, 3, 1 ], [ 4, 3, 2 ] 
    ]
*/

const getPermutations = function(arr, selectNumber) {
    const results = [];

    if (selectNumber === 1) {
        return arr.map((el) => [el]);
    }

    arr.forEach((fixed, index, origin) => {
        // 해당하는 fixed를 제외한 나머지 배열
        const rest = [...origin.slice(0, index), ...origin.slice(index+1)];

        const permutations = getPermutations(rest, selectNumber - 1);

        const attached = permutations.map((el) => [fixed, ...el]);

        results.push(...attached);
    })

    return results;
}

console.log('순열', getPermutations([1,2,3,4], 3));