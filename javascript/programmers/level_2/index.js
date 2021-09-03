// 피보나치 수 
import * as prob1 from './problem/fibonacci.js'

// N개의 최소공배수
import * as prob2 from './problem/n_lcm.js'

// JadenCase 문자열 만들기
import * as prob3 from './problem/jadenCase_str.js'

// 행렬의 곱셈
import * as prob4 from './problem/matrix_multiplication.js'

// 최솟값 만들기
import * as prob5 from './problem/make_min.js'

// 최대값과 최솟값
import * as prob6 from './problem/min_max.js'

// 숫자의 표현
import * as prob7 from './problem/num_expression.js'

// 땅따먹기
import * as prob8 from './problem/hopscotch.js'

// 모음 사전
import * as prob9 from './problem/vowels_dictionary.js'

// 다음 큰 숫자
import * as prob10 from './problem/next_bigNum.js'

// 올바른 괄호
import * as prob11 from './problem/right_bracket.js'

// 가장 큰 정사각형 찾기
import * as prob12 from './problem/find_biggest_rectangle.js'

// 124 나라의 숫자
import * as prob13 from './problem/124_country_num.js'

// 기능개발
import * as prob14 from './problem/function_development.js'

import compute from './main.js'

compute({...prob1, id: 'prob01'});
compute({...prob2, id: 'prob02'});
compute({...prob3, id: 'prob03'});
compute({...prob4, id: 'prob04'});
compute({...prob5, id: 'prob05'});
compute({...prob6, id: 'prob06'});
compute({...prob7, id: 'prob07'});
compute({...prob8, id: 'prob08'});
compute({...prob9, id: 'prob09'});
compute({...prob10, id: 'prob10'});
compute({...prob11, id: 'prob11'});
compute({...prob12, id: 'prob12'});
compute({...prob13, id: 'prob13'});
compute({...prob14, id: 'prob14'});
