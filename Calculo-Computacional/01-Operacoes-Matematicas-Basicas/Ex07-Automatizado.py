Python 3.8.5 (tags/v3.8.5:580fbb0, Jul 20 2020, 15:57:54) [MSC v.1924 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> # Automação
>>> # Exercício 7) Resolva em Python as expressões a seguir
>>> 
>>> Ex01 = 2**3
>>> Ex02 = (-2)**3
>>> Ex03 = 1**0
>>> Ex04 = (-1)**0
>>> Ex05 = 2**0
>>> Ex06 = (2/5)**3
>>> Ex07 = 3**(-2)
>>> Ex08 = (1/2)**(-3)
>>> Ex09 = ((-1)**3)**4
>>> Ex10 = 0.5**3
>>> Ex11 = (0.25)**4
>>> Ex12 = 0**4
>>> Ex13 = 1 + (0.41)**2
>>> Ex14 = (1/4) + (5**2) - (2**(-4))
>>> Ex15 = (2**(-3)) + ((-4)**(-5))
>>> Ex16 = (((4/5) - (1/2) + 1)**(-2)) + (1 / (1 + (3**2) - ((4-5)**(-2))))
>>> 
>>> Gabarito = [Ex01,
		Ex02,
		Ex03,
		Ex04,
		Ex05,
		Ex06,
		Ex07,
		Ex08,
		Ex09,
		Ex10,
		Ex11,
		Ex12,
		Ex13,
		Ex14,
		Ex15,
		Ex16]
>>> 
>>> i = 1
>>> while (i < 17):
	print("Exercício ", i, " = ", Gabarito[i-1]
	i = i + 1
	      
SyntaxError: invalid syntax
>>> while (i < 17):
	print("Exercício ", i, " = ", Gabarito[i-1])
	i = i + 1

Exercício  1  =  8
Exercício  2  =  -8
Exercício  3  =  1
Exercício  4  =  1
Exercício  5  =  1
Exercício  6  =  0.06400000000000002
Exercício  7  =  0.1111111111111111
Exercício  8  =  8.0
Exercício  9  =  1
Exercício  10  =  0.125
Exercício  11  =  0.00390625
Exercício  12  =  0
Exercício  13  =  1.1681
Exercício  14  =  25.1875
Exercício  15  =  0.1240234375
Exercício  16  =  0.702827087442472
>>> 