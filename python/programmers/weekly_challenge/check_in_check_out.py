"""
    입실 퇴실
    
    입실과 퇴실이 동시에 이뤄지는 경우는 없으며,
    입실 시각과 퇴실 시각은 따로 기록하지 않음
    
    오늘 회의실에는 총 n명이 입실 후 퇴실했음
    편의상 사람들 1 ~ n까지 번호
    두 번 이상 회의실에 들어온 사람은 없음
    이 때, 각 사람별로 반드시 만난 사람은 몇 명인지 구하려 함
    
    ex)
    입실 : [1, 3, 2]
    퇴실 : [1, 2, 3]
    
    1번과 2번은 만났는지 알 수 없음
    1번과 3번은 만났는지 알 수 없음
    2번과 3번은 반드시 만남
    
    ex2)
    입실 : [1, 4, 2, 3]
    퇴실 : [2, 1, 3, 4]
    
    1번과 2번은 반드시 만남
    1번과 3번은 만났는지 알 수 없음
    1번과 4번은 반드시 만남
    2번과 3번은 만났는지 알 수 없음
    2번과 4번은 반드시 만남
    3번과 4번은 반드시 만남
    
    회의실에 입실한 순서가 담긴 정수 배열 enter, 
    퇴실한 순서가 담긴 정수 배열 leave가 매개변수로 주어질 때,
    각 사람별로 반드시 만난 사람은 몇 명인지 번호 순서대로 배열에 담아 return
    
    제한 사항
    1 <= enter의 길이 <= 1000
    1 <= enter의 원소 <= enter의 길이
        모든 사람의 번호가 중복없이 하나씩 들어있음
    leave의 길이 = enter의 길이
    1 <= leave의 원소 <= leave의 길이
        모든 사람의 번호가 중복없이 하나씩 들어있음
"""

def solution(enter, leave):
    n = len(enter)
    answer = [0 for _ in range(n)]
    # print(answer)
    
    eIndex = 0
    lIndex = 0    
    room = list()
    
    nextEnter = 1
    nextLeave = 1
    
    while (eIndex < n or lIndex < n):
        if eIndex < n:
            nextEnter = enter[eIndex]
        if lIndex < n:
            nextLeave = leave[lIndex]
        if nextLeave not in room:
            room.append(nextEnter)
            eIndex += 1
        else:
            room.remove(nextLeave)
            if len(room) != 0:
                answer[nextLeave-1] += len(room)
                for item in room:
                    answer[item-1] += 1
            lIndex += 1
     
    return answer

enter = [1,3,2]
leave = [1,2,3]

#print(solution(enter, leave)) # [0, 1, 1]

enter = [1,4,2,3]
leave = [2,1,3,4]

print(solution(enter, leave)) # [2,2,1,3]