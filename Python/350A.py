# http://codeforces.com/problemset/problem/350/A

x = input()
a = input()
b = input()
correctAnswers = a.split()
wrongAnswers = b.split()
# print(correctAnswers)
# print(wrongAnswers)
correctAnswers = list(map(int,correctAnswers))
wrongAnswers = list(map(int,wrongAnswers))
# print(correctAnswers)
# print(wrongAnswers)
a = min(correctAnswers)
b = max(correctAnswers)
c = min(wrongAnswers)
# print(a,b,c)
v = max(2*a,b)
if(v<c):
    print(v)
else:
    print(-1)