'''
Exercicio 01 (bucle for)
Escribir un programa que pida ao usuario un número enteiro positivo e mostre por pantalla a conta atrás desde ese número ata cero separados por comas.
'''

num = int(input('Indica un numero positivo para iniciar la cuenta atras \n'))
primera = True


if(num<0):
    print('El número debe ser positivo')

'''if isinstance(num, float):
    print('El número debe ser entero')'''

for i in range(num, -1, -1):
    if(primera):
        print(i , end='')
        primera = False
    else:
        print(', ' , i , end='')
        
    
    
    