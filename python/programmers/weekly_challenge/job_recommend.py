# 직업군 추천하기
'''
    개발자가 사용하는 언어와 언어 선호도를 입려갛면
    그에 맞는 직업군을 추천해주는 알고리즘 개발
    
    점수	SI	CONTENTS	HARDWARE	PORTAL	GAME
    5	JAVA	JAVASCRIPT	C	JAVA	C++
    4	JAVASCRIPT	JAVA	C++	JAVASCRIPT	C#
    3	SQL	PYTHON	PYTHON	PYTHON	JAVASCRIPT
    2	PYTHON	SQL	JAVA	KOTLIN	C
    1	C#	C++	JAVASCRIPT	PHP	JAVA
    
    직업군 언어 점수를 정리한 문자열 배열 table,
    개발자가 사용하는 언어를 담은 문자열 배열 languages,
    언어 선호도를 담은 정수 배열 preference 매개변수
    
    언어 선호도 x 직업군 언어 점수의 총합이 가장 높은 직업군 return
    
    제한사항
    table의 길이 = 5
        table의 원소는 직업군 5점언어 4점언어 3점언어 2점언어 1점언어 형식의 문자열
        직업군, 5점언어, 4점언어, 3점언어, 2점언어, 1점언어 하나의 공백으로 구분
        table은 모든 테스트케이스에서 동일
        
    1 <= languages의 길이 <= 9
        languages의 원소 JAVA JAVASCRIPT C C++ C# SQL PYTHON KOTLIN PHP
        중 한 개 이상
        languages 원소 중복 x
    
    preference의 길이 = languages의 길이
        1 <= preference의 원소 <= 10
    
    preference의 i번째 원소 langguages의 i번째 원소의 언어 선호도
    
    return 할 문자열은 SI CONTENTS HARDWARE PORTAL GAME 중 하나
'''

def solution(table, languages, preference):
    # answer = ''
    # maxscore = 0
    
    # for job in table:
    #     part = job.split(' ')
    #     score = 0
    #     name = part[0]
    #     for i in range(len(languages)):
    #         if languages[i] in part:
    #             part_score = 6 - part.index(languages[i])
    #             score += part_score * preference[i]
        
    #     if maxscore < score:
    #         answer = name
    #         maxscore = score
    #     elif maxscore == score and answer > name:
    #             answer = name
        
    # return answer
    
    score = {}
    for t in table:
        for lang, pref in zip(languages, preference):
            if lang in t.split():
                score[t.split()[0]] = score.get(t.split()[0], 0) + (6 - t.split().index(lang)) * pref
    return sorted(score.items(), key = lambda item: (-item[1], item[0]))[0][0]

table = ["SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"]

languages = ["PYTHON", "C++", "SQL"]
preference = [7, 5, 5]
result = "HARDWARE"

print (result == solution(table, languages, preference))

languages = ["JAVA", "JAVASCRIPT"]
preference = [7, 5]
result = "PORTAL"

print (result == solution(table, languages, preference))