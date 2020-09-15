Python 3.8.5 (tags/v3.8.5:580fbb0, Jul 20 2020, 15:57:54) [MSC v.1924 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> x1 = 1.456
>>> x2 = 3.678
>>> x3 = 7.5
>>> 
>>> round(x1, none)
Traceback (most recent call last):
  File "<pyshell#4>", line 1, in <module>
    round(x1, none)
NameError: name 'none' is not defined
>>> round(x1,)
1
>>> round(x2,)
4
>>> round(x3,)
8
>>> round(x3)
8
>>> 