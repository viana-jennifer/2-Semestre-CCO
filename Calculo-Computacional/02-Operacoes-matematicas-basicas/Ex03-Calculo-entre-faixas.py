Python 3.8.5 (tags/v3.8.5:580fbb0, Jul 20 2020, 15:57:54) [MSC v.1924 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> peso=float(input('Quanto você pesa em Kg? (kg) '))
Quanto você pesa em Kg? (kg) 44
>>> altura=float(input('Quanto você mede em altura? (m)'))
Quanto você mede em altura? (m)1.5
>>> IMC = peso/(altura**2)
>>> print('O seu IMC é de {:.1f}'.format(IMC))
O seu IMC é de 19.6
>>> if IMC < 18.5:
	 print('Diagnóstico: Abaixo do peso normal')
elif 18.5 <= IMC <25:
	print('Diagnóstico: peso normal')
elif 25 <= IMC <30:
	print('Diagnóstico: sobrepeso')
elif 30 <= IMC <40:
	print('Diagnóstico: obeso')
elif IMC >=40:
	print('Diagnóstico: obesidade mórbida')

	
Diagnóstico: peso normal
>>> 