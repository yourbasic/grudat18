# Övning 1 grudat18
### Deadline: 29/3 kl 15.00

Samtliga uppgifter på kursen ska lämnas in på ditt Githubkonto på KTH.
Gör en katalog <code>grudat18</code> för hela kursen,
och en underkatalog <code>ovn1</code> för den här övningen,
samt (minst) en fil per uppgift.
Utgå från mallarna i [/grudat18/ovn1/](https://github.com/yourbasic/grudat18/tree/master/ovn1).

Du väljer själv vilket av programspråken Python, Go eller Java du vill använda.
**Observera att all kod på den här kursen ska dokumenteras och testas.**

Vid övningen ska du vara beredd att muntliga presentera och diskutera
dina lösningar och din programkod.

## Betyg G

### 1.1 Fakultet

Implementera fakultetsfunktionen för heltal.

### 1.2 Länkade listor

En lista, ett antal element ordnade i en linjär struktur, är
den kanske enklaste och mest grundläggande datastrukturen.
En länkad lista är en sekvens av listelement
förbundna av pekare. En länkad lista med tre heltal
<code>[2,&nbsp;2,&nbsp;1]</code> ser ut så här.


<pre><tt>     ----------        ----------        ------------
    |     |    |      |     |    |      |     |      |
--->|  2  |  -------->|  2  |  -------->|  1  | null |
    |     |    |      |     |    |      |     |      |
     ----------        ----------        ------------
</tt></pre>

Nullpekaren har många namn: <code>None</code>, <code>nil</code> eller <code>null</code>.

Listelementen kan implementeras som objekt med två instansvariabler,
en variabel som innehåller värdet och en variabel som pekar
på nästa element i listan:

<pre><code># A list element that stores a value of type T.
private ListElement:
    data T
    next ListElement
</code></pre>


Implementera en enkellänkad lista med följande funktionalitet i form
av en klass med följande funktioner.
Du får inte ändra klassens gränssnitt, dvs du får inte ändra
de publika metoderna eller lägga till några andra publika metoder.

<pre><code># A singly linked list of elements of type T.
public LinkedList:
    private first ListElement # first element in list
    private last ListElement  # last element in list
    private size int          # number of elements in list
   
    # Create an empty list.
    public new() LinkedList

    # Insert the given element at the beginning of this list.
    public void addFirst(element T)

    # Insert the given element at the end of this list.
    public void addLast(element T)

    # Return the first element of this list.
    # Return null if the list is empty.
    public getFirst() T

    # Return the last element of this list.
    # Return null if the list is empty.
    public getLast() T

    # Return the element at the specified position in this list.
    # Return null if index is out of bounds.
    public get(index int) T

    # Remove and returns the first element from this list.
    # Return null if the list is empty.
    public removeFirst() T

    # Remove all elements from this list.
    public clear()

    # Return the number of elements in this list.
    public size() int

    # Return a string representation of this list.
    # The elements are enclosed in square brackets ("[]").
    # Adjacent elements are separated by ", ".
    public string() string
</code></pre>

Beräkna den asymptotiska värstafallstiden för samtliga publika
metoder i din implementation. Uttryck tiden som en funktion av antalet
element&nbsp;<i>n</i> i listan.

Skriv <b>utförlig testkod</b>. Alla publika metoder ska testas.
Glöm inte att kontrollera att din kod fungerar även för den tomma
listan. Jag rekommenderar att du skriver testkoden först.


## Betyg VG

### 1.3 Mera testning

Det kan vara svårt att testa datastrukturer;
en metod kan returnera rätt svar men ändå göra fel.
Det händer till exempel om den lämnar efter sig instansvariabler
med felaktiga värden. En bra sätt att upptäcka den typen av fel
är att använda en testmetod som undersöker om listan befinner
sig i ett korrekt tillstånd:


<ul>
<li><code>size</code> måste vara lika med antalet <code>ListElement</code>.
</li>
<li>Om listan är tom så ska både <code>first</code> och <code>last</code>
    vara nullpekare, annars ska de peka på listelement.
</li>
<li>Om ett element ligger sist i listan så ska dess <code>next</code>-pekare
    vara null.
</li>
</ul>

Implementera en metod <code>healthy()</code> som kollar detta.
På lämpliga ställen, troligen ganska många, i din testkod ska du sedan
anropa <code>healthy()</code> för att kontrollera att listan inte har
gått sönder.

