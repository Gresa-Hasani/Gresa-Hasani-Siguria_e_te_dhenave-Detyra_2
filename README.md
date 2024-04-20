# Key Running Cipher dhe Double Transposition

#### Universiteti i Prishtinës - Fakulteti i Inxhinierisë Elektrike dhe Kompjuterike

**Ky është projekti i dytë nga lënda "Siguria e të Dhënave" i caktuar dhe i mentoruar nga asistentja Arbena Musa.**

# Gjuha

Ky projekt është zhvilluat me gjuhën Java duke përdorur IntelliJ IDEA Community.

## Si të ekzekutohet programi

1.	Sigurohuni që të keni Java të instaluar në pajisjen tuaj.
2.	Klononi repositorin ose shkarkoni file-at e projektit Java.
3.	Hapni projektin në IDE-në tuaj Java të preferuar, si IntelliJ IDEA ose Eclipse.
4.	Ekzekutoni klasën Main.java e cila përmban metodën main.
5.	Ndiqni udhëzimet në konsolë për të futur të dhënat hyrëse për kodin e Key Running Cipher, respektivisht kodin e Double Transposition, dhe për të parë rezultatet përkatëse.

## Përshkrimi i algoritmeve të implementuara
1.	**Key Running Cipher**
- 1.1	**Algoritmi i enkriptimit:**
    •	Merr si hyrje një plaintext dhe një çelës.
    •	Përdor karakteret e çelësit për të përcaktuar sa zhvendoset çdo karakter në plaintext.
    •	Për çdo karakter në plaintext:
        o	Nëse karakteri është një shkronjë, atëherë e zhvendos bazuar në vlerën ASCII të tij dhe vlerën ASCII të karakterit të çelësit.
        o	E shton këtë karakter të enkriptuar në tekstin e enkriptuar.
    •	Kthehet teksti i enkriptuar.

- 1.2	**Algoritmi i dekriptimit:**
    •	Merr si hyrje tekstin e enkriptuar dhe çelësin.
    •	Përdor procesin e kundërt të shifrimit për të kthyer karakteret në pozicionet e tyre origjinale.
    •	Për çdo karakter në tekstin e enkriptuar:
        o	Nëse karakteri është një shkronjë, përdor çelësin për të llogaritur zhvendosjen e nevojshme për të kthyer karakterin në pozicionin e tij origjinal në alfabetin ASCII.
        o	E shton këtë karakter të dekriptuar në tekstin e dekriptuar.
    •	Kthehet teksti i dekriptuar.
    
Këto dy algoritme janë të ndara në dy klasa të veçanta, **Encryption** dhe **Decryption**. Klasa kryesore **Main** përdoret për të marrë hyrjet nga përdoruesi, për të thirrur metodat për e enkriptimit dhe dekriptimit, dhe për të printuar tekstin e enkriptuar dhe tekstin e dekriptuar në konsolë.

2.	**Double Transposition**
2.1	**Row Transposition**
a.	**Algoritmi i enkriptimit:**
    •	Fillimisht ndan plaintext-in e dhënë në rreshta sipas një çelësi të dhënë (keywordCols).
    •	I rreshton rreshtat sipas një çelësi tjetër të dhënë (keywordRows).
    •	Shpërndan tekstin në matricë në mënyrë të panjohur përveçse për ata që njohin rendin e rreshtave dhe kolonave.
    •	Zgjedh karakteret sipas rendit të dhënë nga keywordRows.
    •	Kthen tekstin e enkriptuar.
b.	**Algoritmi i dekriptimit:** 
    •	Fillimisht ndan tekstin e enkriptuar në rreshta sipas keywordCols.
    •	I rreshton rreshtat sipas keywordRows.
    •	Rendit rreshtat sipas rendit origjinal të keywordRows. 
    •	Kthen tekstin e dekriptuar.
2.2	**Column Transposition**
a.	**Algoritmi i enkriptimit:**
    •	Fillimisht, ndan plaintext-in në kolona duke u bazuar në një çelës, i cili është keywordCols.
    •	Zgjedh karakteret e secilës kolonë në bazë të rendit alfabetik të çelësit keywordCols.
    •	Kthen tekstin e enkriptuar.
b.	**Algoritmi i sekriptimit:**
    •	Fillimisht, ndan tekstin e enkriptuar në kolona sipas rendit origjinal të keywordCols.
    •	Rendit kolonat në përputhje me rendin origjinal të keywordCols.
    •	Kthen tekstin e dekriptuar
2.3	**Klasa Main:**
    •	Merr hyrjen nga përdoruesi për plaintext dhe keywordCols.
    •	Kërkon gjatësinë e keywordRows duke llogaritur përafërsisht sa rreshta do të duhen për të ndarë plaintext-in në mënyrë të përshtatshme në matricë.
    •	Enkripton plaintext-in duke përdorur Row Transposition dhe e paraqet në konsolë.
    •	Tekstin e enkriptuar me RowTransposition e enkripton me Column Transposition dhe e paraqet në konsolë.
    •	Tekstin e enkriptuar me Column Transposition e dekripton me po të njëjtin transposition dhe e paraqet në konsolë.
    •	Tekstin e dekriptuar me Column Transposition e dekripton me Row Transposition dhe e paraqet në konsolë.



