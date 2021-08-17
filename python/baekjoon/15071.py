# The Key to Cryptography
'''
    ciper (글로 쓰인) 암호
    
    메시지가 주어지고
    key가 주어지면 ACM
    key + 메시지 한 문자열 (뒤에 key만큼 짤림) 을 기준으로 암호화를 함
    
    SENDMOREMONKEYS message
    ACMSENDMOREMONK key
    이거에 맞춰서 A=0 B=1 C=2 ... 에 맞게 바꿔주는거
    SGZVQBUQAFRWSLC ciphertext
    이런식으로 암호화된거
    
    암호화된거와 key 주어질 때 
    message 출력하기
'''
import sys
cipher = sys.stdin.readline().strip('\n')
key = sys.stdin.readline().strip('\n')
msg = ''

for i in range(len(cipher)):
    # print(f'{cipher[i]} {key[i]}')
    if i >= 0 and i < len(key):
        temp = ord(cipher[i]) - (ord(key[i]) - 65)
        # temp = temp - 65 if temp > 90 else temp
        if temp < 65:
            temp += 26
        elif temp > 90:
            temp -= 26
        # print(temp)
        msg += chr(temp)
    else:
        # print(f'{cipher[i]} {msg[i-3]}')
        temp = ord(cipher[i]) - (ord(msg[i - len(key)]) - 65)
        # temp = temp - 65 if temp < 90 else temp
        if temp < 65:
            temp += 26
        if temp > 90:
            temp -= 26
        # print(temp)
        msg += chr(temp)

print(msg)