Python 3.8.5 (tags/v3.8.5:580fbb0, Jul 20 2020, 15:57:54) [MSC v.1924 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> int(floor(1.456))
Traceback (most recent call last):
  File "<pyshell#0>", line 1, in <module>
    int(floor(1.456))
NameError: name 'floor' is not defined
>>> from math import floor
>>> int(floor(1.456))
1
>>> a = floor(1.456)
>>> b = int(floor(1.456))
>>> type(a)
<class 'int'>
>>> type(b)
<class 'int'>
>>> 