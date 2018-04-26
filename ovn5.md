# Övning 5 grudat18 (ej klar)
### Deadline: 4/5 kl 10.00

Samtliga uppgifter på kursen ska lämnas in på ditt [Githubkonto på KTH](https://gits-15.sys.kth.se/grudat18).
Gör (minst) en fil per uppgift och lägg filerna i katalogen /grudat18/ovn5.

Vid övningen ska du vara beredd att muntligt presentera och diskutera
dina lösningar och din programkod.

## Betyg G

### 1. Rita grafer

- Rita alla enkla sammanhängande grafer med hörnen 1, 2, 3, 4, där samliga hörn har gradtal 1.
- Rita alla enkla sammanhängande grafer med hörnen 1, 2, 3, 4, där samliga hörn har gradtal 2.
- Rita alla enkla sammanhängande grafer med hörnen 1, 2, 3, 4, där samliga hörn har gradtal 3.

### 2. Räkna kanter

- Hur många kanter kan det som mest finnas i en graf med n stycken hörn?
- Hur många kanter kan det som mest finnas i en enkel graf med n stycken hörn?
- Hur många kanter kan det som mest finnas i ett träd med n stycken hörn?

Motivera dina svar.

### 3. DFS och BFS

![Connected graph with 6 nodes](http://yourbasic.org/algorithms/graph2.png)

Besök noderna i den här grafen i DFS- och BFS-ordning.
I vilken ordning besöks noderna i de två fallen?
Du kan anta att grannarna till en nod besöks i nummerordning.

Tidskomplexiteten för DFS blir i vissa fall mycket bättre om man använder närhetslistor i stället för en närhetsmatris.
Varför då? För vilken typ av grafer blir den asymptotiska tidskomplexiteten för DFS den samma för båda datastrukturerna?

## Betyg VG

### 4. En noggrann lärare

En plikttrogen lärare vill dela ut uppgifter till sina elever så att inga som känner varandra får samma uppgift.
Läraren är optimist – och dessutom lite lat – så han tror att det räcker med två uppgifter.
Designa en algoritm som testar om det stämmer.

Modellera problemet med en graf där varje hörn motsvarar en elev.
Grafen har kanter mellan de hörn som motsvarar elever som känner varandra.
Algoritmen ska baseras på en metodisk genomgång av grafen med BFS eller DFS.

- Beskriv din algorithm i pseudokod.
- Beräkna också tidskomplexiteten.
