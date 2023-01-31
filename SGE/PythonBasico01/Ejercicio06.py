'''
Exercicio 06 (funcións)

Escribir unha función que reciba un número enteiro positivo e devolva o seu factorial.
'''


def factorial(numero):

    fact = 1
        
    for i in range(1, numero, 1):
        fact = fact*i

    return fact

numero = int(input("Indica un numero entero positivo \n"))

if(numero>0):
    print(f'El factorial de {numero} es {factorial(numero)}')