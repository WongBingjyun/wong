print('欢迎使用凯撒密码加密/解密系统')
print('请选择序号')
print('''1:加密
2:解密
3:退出''')
while True:
    a=input()
    i=int(a)
    if i==1:
        txt=input('请输入需要加密的内容:')
        num=int(input('请输入偏移量(默认为3):') or 3)
        for word in txt:
            if 'a'<=word<='z':
                print(chr(ord('a')+(ord(word)-ord('a')+num)%26),end="")
            elif 'A'<=word<='Z':
                print(chr(ord('A')+(ord(word)-ord('A')+num)%26),end="")
            elif '0'<=word<='9':
                print(chr(ord("0")+(ord(word)-ord("0")+num)%10),end="")
            else:
                print(word,end="")
    elif i==2:
        txt=input('请输入需要解密的内容:' )
        num=int(input('请输入偏移量(默认为3):') or 3)
        for word in txt:
            if 'a'<=word<='z':
                print(chr(ord('a')+(ord(word)-ord('a')-num)%26),end="")
            elif 'A'<=word<='Z':
                print(chr(ord('A')+(ord(word)-ord('A')-num)%26),end="")
            elif '0'<=word<='9':
                print(chr(ord("0")+(ord(word)-ord("0")-num)%10),end="")
            else:
                print(word,end="")
    elif i==3:
        break
    else:
        print('您的输入有误',end='')
    print()
    print('请继续选择')
    print('''1:加密
2:解密
3:退出''')
