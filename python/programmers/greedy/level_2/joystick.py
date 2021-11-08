# 조이스틱 
'''
조이스틱으로 알파벳 이름 완성

위 - 다음 알파벳
아래 - 이전 알파벳 (A에서 아래쪽으로 이동하면 Z로)
왼쪽 - 커서를 왼쪽으로 이동 (첫 번째 위치에서 왼쪽으로 이동하면 마지막 위치)
오른쪽 - 커서를 오른쪽으로 이동

만들고자하는 이름이 name 매개변수로 주어질 대
이름에 대해 조이스틱 조작 횟수의 최솟값 return 하도록 solution 함수 만들기

제한 사항
  name 알파벳 대문자로만
  name의 길이 1 ~ 20
  
JEROEN 56
JAN 23
'''

def solution(name):
    answer = 0
    p = 0
    name_list = list(name)
  
    while True: 
    
        if ord(name_list[p]) - ord('A') < ord('Z') - ord(name_list[p]) + 1:
            answer += ord(name_list[p]) - ord('A')
            name_list[p] = 'A'
        else:
            answer += ord('Z') - ord(name_list[p]) + 1
            name_list[p] = 'A'
    
        isFind = False
        for i in range(1, len(name_list)):
            next = (p + i) % len(name_list)
            prev = (p - i) % len(name_list)
            if name_list[next] != 'A' or name_list[prev] != 'A':
                isFind = True
                answer += i
                if name_list[next] != 'A':
                    p = next
                else:
                    p = prev
                break   
    
        if isFind == False:
            break
  
    # print(answer)
  
    return answer

print(solution('JAZ') == 11)
print(solution('JEROEN') == 56)
print(solution('JAN') == 23)