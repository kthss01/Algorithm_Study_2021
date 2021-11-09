# 큰 수 만들기
'''
어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자 구하기

1924, 2개 제거 -> 94

문자열 형식으로 숫자 number와 제거할 수의 개수 k가 
solution 함수의 매개변수로 주어짐
가장 큰 숫자를 문자열 형태로 return

제한 조건
    number 1자리 이상, 1,000,000자리 이하 숫자
    k는 1 이상 number의 자릿수 미만인 자연수
    
1924 2 94
1231234 2 3234
4177252841 4 775841

해설봄
https://velog.io/@soo5717/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%ED%81%B0-%EC%88%98-%EB%A7%8C%EB%93%A4%EA%B8%B0-%ED%8C%8C%EC%9D%B4%EC%8D%AC
힌트 스택에 top이 넣을 값보다 작으면 크거나 같을때 까지 pop 하고 넣기
'''

from collections import deque

def solution(number, k):
    answer = deque()
    
    for num in number:
        while k > 0 and answer and answer[-1] < num:
            answer.pop()
            k -= 1
        answer.append(num)

    return ''.join(list(answer)[:len(answer) - k])

print(solution("999", 2)) # 9
print(solution("1924", 2)) # 94
print(solution("1231234", 3)) # 3234
print(solution("4177252841", 4)) # 775841
