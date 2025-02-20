Funzione Inizio
    Dichiara N, G, i: Intero

    Assegna G = 0
    Fai...mentre
        Scrivi "Inserire quanti animali arriveranno al lago: "
        Leggi N
        Se N <= 0
            Scrivi "Inserire un valore valido"
        Fine
    Ciclo N <= 0
    Dichiara animali[N * 10]: Vettore Intero

    Assegna G = Inserisci(animali, G, 0)
    Per i = 1 a N - 1
        Assegna G = Inserisci(animali, G, i)
        Chiama Visualizza(animali, G)
        Se animali[i] > animali[i-1]
            Assegna G = Rimuovi(animali, G, i-1)
        Fine
    Fine
    Assegna G = RimuoviDuplicati(animali, G)
    Chiama Visualizza(animali,G)
Fine

Funzione Inserisci (V: Vettore Intero, N: Intero, ie: Intero)
    Dichiara N2: Intero
    Dichiara elemento, i: Intero

    Assegna elemento = (random(7) + 3) * 10
    Assegna N2 = N + 1
    Per i = N  a ie + 1 decrescente
        Assegna V[i] = V[i-1]
    Fine
    Assegna V[ie] = elemento
    Restituisci N2: Intero
Fine

Funzione Rimuovi (V: Vettore Intero, N: Intero, ie: Intero)
    Dichiara N2: Intero
    Dichiara i: Intero

    Assegna N2 = N - 1
    Per i = ie a N2 - 1
        Assegna V[i] = V[i + 1]
    Fine
    Restituisci N2: Intero
Fine

Funzione RimuoviDuplicati (V: Vettore Intero, N: Intero)
    Dichiara i, j: Intero

    Assegna i = 0
    Mentre i < N - 1
        Assegna j = i + 1
        Mentre j < N
            Se V[i] == V[j]
                Assegna N = Rimuovi(V,N,j)
            Altro
                Assegna j = j + 1
            Fine
        Fine
        Assegna i = i + 1
    Fine
    Restituisci N: Intero
Fine

Funzione Visualizza (V: Vettore Intero, N: Intero)
    Dichiara i: Intero

    Scrivi "[ "
    Per i = 0 a N - 1
        Scrivi " " & i + 1 & "° Animale: " & V[i]
    Fine
    Scrivi " ]"
Fine


//LEGGERE LE ISTRUZIONI NEL FILE README.md