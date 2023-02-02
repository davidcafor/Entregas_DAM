'''
Exercicio 05
Escribir un programa que garde nunha variable o dicionario {'Euro':'€', 'Dollar':'$', 'Yen':'¥'}
pregunte ao usuario por unha divisa e mostre o seu símbolo ou unha mensaxe de aviso se a divisa non está no dicionario.
'''

monedaMapa = {'Euro':'€', 'Dollar':'$', 'Yen':'¥'}

moneda = input('Indica la moneda\n').capitalize()

simbolo = monedaMapa.get(str(moneda))

if(not simbolo):
    print("La moneda no existe")
else:
    print(simbolo)