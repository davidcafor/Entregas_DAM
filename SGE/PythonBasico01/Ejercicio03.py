'''
Exercicio 03 (condicional)
Escribir un programa que almacene a cadea de caracteres "contrasinal" nunha variable,
pregunte ao usuario polo contrasinal e imprima por pantalla se o contrasinal introducido
polo usuario coincide coa gardada na variable sen ter en conta maiúsculas e minúsculas.
'''

contrasenaGuardada = 'abc123.'

contrasena = input('Introduce tu contraseña\n')

if(contrasenaGuardada.lower() == contrasena.lower()):
    print('La contraseña es correcta')
else:
    print('La contraseña es incorrecta')