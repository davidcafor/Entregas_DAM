'''
Exercicio 02 (bucle for)
Escribir un programa que mostre por pantalla as táboas do 1 ao 10
'''

for num1 in range(1,11):
    print(f'Tabla del {num1}:\n')
    for num2 in range(1,11):
        multiplicacion = num1 * num2 
        print(f'{num1} x {num2} = {multiplicacion}')
    print('\n')