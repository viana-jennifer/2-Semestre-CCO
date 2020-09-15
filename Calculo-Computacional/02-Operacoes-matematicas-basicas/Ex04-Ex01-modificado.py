Python 3.8.5 (tags/v3.8.5:580fbb0, Jul 20 2020, 15:57:54) [MSC v.1924 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> # Alterando a quantidade de pontos flutuantes do exercício 1
>>> peso=float(input('Quanto você pesa em Kg? (kg) '))
Quanto você pesa em Kg? (kg) 44
>>> altura=float(input('Quanto você mede em altura? (m)'))
Quanto você mede em altura? (m)1.5
>>> IMC = peso/(altura**2)
>>> print('O seu IMC é de {:.2f}'.format(IMC))
O seu IMC é de 19.56
>>> 
>>> # Modificando '{:.1f}' para '{:.2f}'
>>> # aumenta-se o número de casas decimais de '1' para '2'
>>> 