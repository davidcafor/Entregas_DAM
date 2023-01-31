'''
Exercicio 07 (funcións)

Escribir unha función que reciba unha mostra de números nunha lista e devolva outra lista cos seus cadrados.
'''

def cuadrados(numeros):

    resultados = []

    for i in numeros:
        resultados.append(i*i)

    return resultados    

numeros = [1,3,6,8,9]

print(cuadrados(numeros))