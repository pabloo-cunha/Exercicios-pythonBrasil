def imprimirNumeros(n):
    linha = 1
    for numeros in range(1, n):
        numeros += linha
        linha += 1
        
    return numeros
        
        

print(imprimirNumeros(5))