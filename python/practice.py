print('hello python')

# 일단 여기는 오랜만에 파이썬 하는 만큼 헷갈리고 있는거나 그런거 정리해두자
# 한줄 주석은 # 이거
"""
    여러 줄 주석
"""
'''
    여러 줄 주석 2
'''

# 알고리즘 풀 때 입력 받는거 
# input().split() 이런식으로 받는거 같음
# 그리고 그거 바로 int로 바꾸는 방법
# map(int, input().split()) 이거 임 참고하자
'''
    input 
        입력된 값에 형식에 맞게 자동으로 타입을 변환
    raw_input
        모든 입력값을 문자열 타입으로 받음 -> 파이썬 3에서 삭제됨
    알고리즘 문제 같이 빠르게 입력 받아야하면
    import sys
    sys.stdin.readline() 사용
'''

# 파이썬 코드 작성에서 중요한 건 들여쓰기임 이거 조심

# range 
'''
    range(5) 0 1 2 3 4
    range(1, 5) 1 2 3 4 (마지막 안들어감)
'''

# 문자열 포맷
print('{} {}'.format('1','2'))
# f-string
month = 2
print(f'2020년 {month}월')