'''
Exercicio 04 (condicional)

Os alumnos dun curso dividíronse en dous grupos A e B de acordo ao sexo e o nome.
O grupo A esta formado polas mulleres cun nome anterior á M e os homes cun nome
posterior á N e o grupo B polo resto. Escribir un programa que pregunte ao usuario
o seu nome e sexo, e mostre por pantalla o grupo que lle corresponde.
'''

nombre = input('Introduce tu nombre\n')
sexo = input('Indica tu sexo\n')

if((nombre.upper() < 'M' and sexo == 'm') or (nombre.upper() > 'N' and sexo == 'h')):
    print('Perteneces al grupo A')

    print(str(sexo.lower().startswith))
else:
    print('Perteneces al grupo B')