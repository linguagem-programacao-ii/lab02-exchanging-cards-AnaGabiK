while True:
    cartasAlice = list()  
    cartasBetty = list() 
    cartasTroca = list()

    quantA, quantB = input().split() 

    if quantA == '0' and quantB == '0': #Inserir quantidade de cartas de Alice e Betty
        break

    for i in input().split(): #Inserir as cartas de Alice
        cartasAlice.append(i)

    for i in input().split(): #Inserir as cartas de Betty
        cartasBetty.append(i)

    cartasAlice2 = set(cartasAlice)
    cartasBetty2 = set(cartasBetty)

    #CartasAlice2 = maior quantidade de cartas e Cartas = menor quantidade de cartas
    cartas = cartasBetty2
    if len(cartasAlice2) < len(cartasBetty2):
        cartas = cartasAlice2
        cartasAlice2 = cartasBetty2

    cartasTroca = [x for x in cartas if x not in cartasAlice2]
    
    print(len(cartasTroca))