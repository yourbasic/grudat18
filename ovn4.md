# Övning 4 grudat18
### Deadline: 27/4 kl 8.00

Samtliga uppgifter på kursen ska lämnas in på ditt [Githubkonto på KTH](https://gits-15.sys.kth.se/grudat18).
Gör (minst) en fil per uppgift och lägg filerna i katalogen /grudat18/ovn4.

Vid övningen ska du vara beredd att muntligt presentera och diskutera
dina lösningar och din programkod.

## Betyg G

### 1 Tidskomplexitet för rekursiva funktioner

#### Teori

Beräkna **tidskomplexiteten** för funktionerna <code>pow</code>, <code>sum1</code> och <code>sum2</code>.

<pre><code>def pow(n):
	"""Return 2**n, where n is a nonnegative integer."""
	if n == 0:
		return 1
	x = pow(n//2)
	if n%2 == 0:
		return x*x
	return 2*x*x
</code></pre>

<pre><code>def sum1(a):
	"""Return the sum of the elements in the list a."""
	n = len(a)
	if n == 0:
		return 0
	if n == 1:
		return a[0]
	return sum1(a[:n//2]) + sum1(a[n//2:])
</code></pre>

<pre><code>def sum2(a):
	"""Return the sum of the elements in the list a."""
	return _sum(a, 0, len(a)-1)

def _sum(a, i, j):
	"""Return the sum of the elements from a[i] to a[j]."""
	if i > j:
		return 0
	if i == j:
		return a[i]
	mid = (i+j)//2
	return _sum(a, i, mid) + _sum(a, mid+1, j)
</code></pre>

#### Praktik

Gör en **benchmark** där du mäter tiden för att exekvera de här funktionerna.
Uppgiften ska göras i **Python** och du ska mäta tiden med funktionen <code>time.time</code>:

<pre><code>start = time.time()
pow(n)
print(n, time.time() - start) # elapsed time
</code></pre>

Testa för n = 10, 100, 1,000, 10,000, 100,000 och 1,000,000.
Presentera resultaten av tidmätningarna i en **tabell** eller i ett **diagram**.

#### Diskussion

Skriv en **diskussionsdel** där du försöker förstå och förklara eventuella skillnader mellan teori och praktik.


### 2 Linjärtidssortering av små tal

**Implementera**, **dokumentera** och **testa** en algoritm som sorterar heltalen x<sub>1</sub>, x<sub>2</sub>, ..., x<sub>n</sub>.
För samtliga tal x<sub>i</sub> gäller att 0 &le; x<sub>i</sub> &le; k.

Din algoritm ska ha värstafallstidskomplexitet O(n+k).
För vilka värden på k blir algoritmen linjär?

<b>Tips:</b> räkna hur många element det finns av varje sort.

## Betyg VG

### 3 Linjärtidssortering när det finns många dubbletter

Designa en algoritm som som sorterar n stycken heltal där det förekommer dubbletter.
Det totala antalet olika tal är k. Beskriv algoritmen i **pseudokod**.

Din algoritm ska ha tidskomplexitet O(n + klog(k)). Förväntad tid räcker.
För vilka värden på k blir algoritmen linjär?

### 4 Linjärtidssortering av ganska stora tal

Designa en algoritm som sorterar heltalen x<sub>1</sub>, x<sub>2</sub>, ..., x<sub>n</sub>.
För samtliga tal x<sub>i</sub> gäller att 0 &le; x<sub>i</sub> &le; n<sup>k</sup>.
Beskriv algoritmen i **pseudokod**.

Din algoritm ska ha **värstafallstidskomplexitet** O(kn).
För vilka värden på k blir algoritmen linjär?

<b>Tips:</b> Använd [radixsortering](radix-sort.pdf) med lagom många pass.
Du kan anta att talen representeras binärt.
Hur många bitar finns det i talet n<sup>k</sup>?
