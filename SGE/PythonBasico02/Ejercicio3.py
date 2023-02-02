'''
Exercicio 03 (listas)
Escribir un programa que almacene as materias dun curso
(por exemplo Matemáticas, Física, Química, Historia e Lingua)
nunha lista, pregunte ao usuario a nota que sacou en cada materia
e elimine da lista as materias aprobadas. Ao final o programa
debe mostrar por pantalla as materias que o usuario ten que repetir.
'''

asignaturas = ["Matemáticas", "Física", "Química", "Historia", "Lingua"]
notas = []
contador = int(0)
'''
for asign in asignaturas:
    notas.append(float(input("Indica tu nota en " + asign + "\n")))

print("Asignaturas originales\n")   
print(asignaturas)
print(notas)
    
for nota in notas:
    print(contador)
    if(nota>=5):
        #asignaturas.remove(contador)
        del asignaturas[contador]
        contador-=1
    contador+=1

print("Asignaturas pendientes de recuperar")
print(asignaturas)

'''
'''
for i in range(len(asignaturas)-1, -1, -1):
    notas = float(input("Indica tu nota en " + asignaturas[i] + "\n"))
    if(notas>=5):
        asignaturas.pop(i)

print(asignaturas)
'''

for i in range(len(asignaturas)-1):
    notas = float(input("Indica tu nota en " + asignaturas[i] + "\n"))
    print('I antes... '+str(i))
    if(notas>=5):
        asignaturas.pop(i)
        i-=1
        print('Ibucle... '+str(i))
print(asignaturas)