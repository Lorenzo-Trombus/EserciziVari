-- 1. Quali sono le persone con stipendio di al massimo 40000
-- euro [2 punti]

select pe.id, pe.nome, pe.cognome, pe.stipendio
from persona pe
where pe.stipendio<='40000'

-- 2. Quali sono i ricercatori che lavorano ad almeno un
-- progetto e hanno uno stipendio di al massimo 40000 [2
-- punti]

select distinct pe.nome, pe.cognome
from persona pe, attivitaprogetto ap
where pe.id= ap.persona and pe.stipendio<='40000'

-- 3. Qual è il budget totale dei progetti nel db [2 punti]

select sum(pr.budget) as budget_tot
from progetto pr


-- 4. Qual è il budget totale dei progetti a cui lavora ogni
-- persona. Per ogni persona restituire nome, cognome e
-- budget totale dei progetti nei quali è coinvolto. [3 punti]

select pe.nome, pe.cognome, sum(pr.budget) as budget_tot
from progetto pr, persona pe, attivitaprogetto ap
where ap.persona= pe.id and ap.progetto= pr.id
group by pe.nome, pe.cognome


-- 5. Qual è il numero di progetti a cui partecipa ogni
-- professore ordinario. Per ogni professore ordinario,
-- restituire nome, cognome, numero di progetti nei quali è
-- coinvolto [3 punti]

select pe.nome, pe.cognome, count(distinct ap.progetto)
from persona pe, attivitaprogetto ap
where pe.id= ap.persona
group by pe.nome, pe.cognome

-- 6. Qual è il numero di assenze per malattia di ogni
-- professore associato. Per ogni professore associato,
-- restituire nume, cognome e numero di assenze per
-- malattia [3 punti]

select pe.nome, pe.cognome, count(ass.id) as num_ass
from persona pe, assenza ass
where pe.id= ass.persona 
and pe.posizione='Professore Associato' 
and ass.tipo= 'Malattia'
group by pe.nome, pe.cognome

-- 7. Qual è il numero totale di ore, per ogni persona, dedicate
-- al progetto con id ‘5’. Per ogni persona che lavora al
-- progetto, restituire nome, cognome e numero di ore totali
-- dedicate ad attività progettuali relative al progetto [4
-- punti]

select pe.nome, pe.cognome, sum(ap.oredurata)
from persona pe, attivitaprogetto ap 
where pe.id = ap.persona and ap.progetto= '5'
group by pe.nome, pe.cognome


-- 8. Qual è il numero medio di ore delle attività progettuali
-- svolte da ogni persona. Per ogni persona, restituire nome,
-- cognome e numero medio di ore delle sue attività
-- progettuali (in qualsivoglia progetto) [3 punti]

select pe.nome, pe.cognome, avg(ap.oredurata)
from persona pe, attivitaprogetto ap 
where pe.id= ap.persona
group by pe.nome, pe.cognome

-- 9. Qual è il numero totale di ore, per ogni persona, dedicate
-- alla didattica. Per ogni persona che ha svolto attività
-- didattica, restituire nome, cognome e numero di ore totali
-- dedicate alla didattica [4 punti]

select pe.nome, pe.cognome, sum(anp.oredurata)
from persona pe, attivitanonprogettuale anp
where pe.id= anp.persona and anp.tipo= 'Didattica'
group by pe.nome, pe.cognome

-- 10. Quali sono le persone che hanno svolto attività nel WP
-- di id ‘5’ del progetto con id ‘3’. Per ogni persona, restituire
-- il numero totale di ore svolte in attività progettuali per il
-- WP in questione [4 punti]

select pe.nome, pe.cognome, sum(ap.oredurata)
from persona pe, attivitaprogetto ap,wp
where pe.id= ap.persona
and ap.wp='5' 
and ap.progetto='3'
and wp.id=ap.wp
group by pe.nome,pe.cognome