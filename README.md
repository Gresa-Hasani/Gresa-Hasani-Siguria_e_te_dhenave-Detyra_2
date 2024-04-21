# Key Running Cipher dhe Double Transposition

#### Universiteti i Prishtinës - Fakulteti i Inxhinierisë Elektrike dhe Kompjuterike

**Ky është projekti i dytë nga lënda "Siguria e të Dhënave" i caktuar dhe i mentoruar nga asistentja Arbena Musa.**

# Gjuha

Ky projekt është zhvilluar me gjuhën Java duke përdorur IntelliJ IDEA Community.

## Si të ekzekutohet programi

1.	Sigurohuni që të keni Java të instaluar në pajisjen tuaj.
2.	Klononi repositorin ose shkarkoni file-at e projektit Java.
3.	Hapni projektin në IDE-në tuaj Java të preferuar, si IntelliJ IDEA ose Eclipse.
4.	Ekzekutoni klasën Main.java e cila përmban metodën main.
5.	Ndiqni udhëzimet në konsolë për të futur të dhënat hyrëse për kodin e Key Running Cipher, respektivisht kodin e Double Transposition, dhe për të parë rezultatet përkatëse.

## Përshkrimi i algoritmeve të implementuara
### 1.	**Key Running Cipher**
- 	**Algoritmi i enkriptimit:** Algoritmi i enkriptimit fillimisht përdor një plaintext dhe një çelës. Për çdo karakter në plaintext, ai zhvendos karakterin bazuar në vlerën ASCII të tij dhe vlerën ASCII të karakterit të çelësit. Nëse karakteri është një shkronjë, atëherë ai zhvendos bazuar në ASCII të karakterit në alfabet dhe shton këtë karakter të enkriptuar në tekstin e enkriptuar. Në fund, kthen tekstin e enkriptuar.

- **Algoritmi i dekriptimit:** Algoritmi i dekriptimit merr si hyrje tekstin e enkriptuar dhe çelësin. Përdor procesin e kundërt të enkriptimit për të kthyer karakteret në pozicionet e tyre origjinale. Për çdo karakter në tekstin e enkriptuar, nëse karakteri është një shkronjë, përdor çelësin për të llogaritur zhvendosjen e nevojshme për të kthyer karakterin në pozicionin e tij origjinal në ASCII dhe e shton këtë karakter të dekriptuar në tekstin e dekriptuar. Në fund, kthen tekstin e dekriptuar.
    
Këto dy algoritme janë të ndara në dy klasa të veçanta, **Encryption** dhe **Decryption**. Klasa kryesore **Main** përdoret për të marrë hyrjet nga përdoruesi, për të thirrur metodat për e enkriptimit dhe dekriptimit, dhe për të printuar tekstin e enkriptuar dhe tekstin e dekriptuar në konsolë.

### 2.	**Double Transposition**
#### **Row Transposition**
- **Algoritmi i enkriptimit:** Kjo metodë fillimisht ndan plaintext-in në rreshta sipas një çelësi të dhënë (keywordCols) dhe pastaj i rreshton rreshtat sipas një çelësi tjetër të dhënë (keywordRows). Kjo siguron që teksti të shpërndahet në mënyrë të panjohur, përveçse për ata që njohin rendin e rreshtave dhe kolonave. Pas shpërndarjes së tekstit në matricën e përshtatur, karakteret zgjidhen sipas rendit të dhënë nga keywordRows dhe bashkohen në një tekst të enkriptuar.
- **Algoritmi i dekriptimit:** Ky algoritëm bën operacionin e kundërt të algoritmit të enkriptimit. Fillimisht, karakteret e tekstit të enkriptuar ndahen në rreshta sipas rendit të dhënë nga keywordRows, pastaj rreshtat rreshtat renditen sipas rendit origjinal të keywordRows dhe karakteret i bashkohen për të krijuar tekstin e dekriptuar.
###
#### **Column Transposition**
- **Algoritmi i enkriptimit:** Ky algoritëm fillimisht ndan plaintext-in në kolona sipas një çelësi të dhënë, i cili quhet keywordCols. Pas ndarjes së tekstit në kolona, karakteret e secilës kolonë zgjidhen dhe bashkohen në një radhë të caktuar nga keywordCols. Rezultati është teksti i enkriptuar.
- **Algoritmi i dekriptimit:** Ky algoritëm kryen operacionin e kundërt të algoritmit të enkriptimit. Fillimisht, karakteret e tekstit të enkriptuar ndahen në kolona sipas rendit origjinal të keywordCols. Pastaj, kolonat e ndara renditen në përputhje me rendin origjinal të keywordCols. Karakteret e kolonave të renditura pastaj bashkohen për të krijuar tekstin e dekriptuar.

#### **Klasa Main:** 
Fillimisht merr hyrjen nga përdoruesi për plaintext dhe keywordCols. Pas kësaj, kërkon gjatësinë e keywordRows duke llogaritur përafërsisht sa rreshta do të duhen për të ndarë plaintext-in në mënyrë të përshtatshme në matricë. E enkripton plaintext-in duke përdorur Row Transposition. Tekstin e enkriptuar me RowTransposition e enkripton me Column Transposition dhe të dyja transpozicionet i paraqet në konsolë. Më pas tekstin e enkriptuar me Column Transposition e dekripton me po të njëjtin transposition. Përfundimisht, tekstin e dekriptuar me Column Transposition e dekripton me Row Transposition dhe të dyja transpozicionet i paraqet në konsolë.

## Shembuj të ekzekutimit
### 1. **Key Running Cipher**

   ![image](https://github.com/Gresa-Hasani/Siguria_e_te_dhenave-Detyra_2/assets/153296296/ef3a2f78-9bf0-4ab6-aee2-cd977a50d61f)

### 2. **Double Transposition**
   
   ![image](https://github.com/Gresa-Hasani/Siguria_e_te_dhenave-Detyra_2/assets/153296296/607bfae7-9fa2-4050-8ce0-ba6ca2bc2484)

# Punuan

#### - Gresa Halili
#### - Gresa Hasani
#### - Gzon Alaj
#### - Haki Pintolli
