# Lények versenye  

Egy többnapos versenyen lények vesznek részt. A versenyt az a lény nyeri, aki
életben marad, és a legnagyobb távolságot teszi meg. Kezdetben minden lény
valamennyi vízzel rendelkezik, és a megtett távolság 0. A verseny során háromféle
nap lehetséges: napos, felhős és esős. Ezekre a különböző fajtájú lények eltérő
módon reagálnak vízfogyasztás és haladás szempontjából. Minden lény először a
rendelkezésére álló víz mennyiségét változtatja meg, ezután ha tud, mozog. Bármely 
lény elpusztul, ha a vize elfogy (0 lesz az érték), ezután értelemszerűen semmilyen
tevékenységre sem képes.  

Minden lény jellemzői: az egyedi neve, a rendelkezésre álló víz mennyisége, a
maximálisan tárolható víz mennyisége, hogy él-e, illetve az eddig megtett távolság. A
versenyen részt vevő lények fajtái a következők: homokjáró, szivacs, lépegető.
A következő táblázat tartalmazza az egyes fajták jellemzőit.  

| Fajta     |       | Víz változás |      |       | Távolság |      | Max.víz |
|:-----------:|:-------:|:--------------:|:------:|:-------:|:----------:|:------:|:---------:|
|           | napos | felhős       | esős | napos | felhős   | esős |         |
| homokjáró | -1    | 0            | 3    | 3     | 1        | 0    | 8       |
| szivacs   | -4    | -1           | 6    | 0     | 1        | 3    | 20      |
| lépegető  | -2    | -1           | 3    | 1     | 2        | 1    | 12      |



Az egyes lények a vízkészlet megváltoztatása során nem léphetik túl a fajtára
jellemző maximális értéket, legfeljebb azt érhetik el.  

Valósítsuk meg a versenyt megnyerő lényt megadó programot. A program egy
szövegfájlból olvassa be a verseny adatait. Az első sorban napok jelei következnek
egymás után. Az egyes jelek értelmezése: n – napos, f – felhős, e – esős. A következő
sorok tartalmazzák a lények adatait, úgymint a nevét, a fajtáját és a kezdetben
rendelkezésére álló víz mennyiségét. A fajtát egy karakter azonosít: h – homokjáró, s
– szivacs, l – lépegető.  

A program kérje be a fájl nevét, majd jelenítse meg a nyertes nevét. Ehhez valósítsuk
meg a lényeket reprezentáló osztályokat, amelyek egy absztrakt lény osztály
leszármazottai. A lényekhez szükséges 3 művelet a különböző napoknak, valamint 3
tulajdonság: név, él-e a lény, a név illetve a megtett távolság lekérdezése.
Egy lehetséges bemenet:  

- nffeeennf  
- Vandor h 4  
- Seta l 7  
- Csuszo s 12  
- Siklo s 10  